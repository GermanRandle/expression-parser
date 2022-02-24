package expression.parser;

import expression.exceptions.ParseException;

import static java.lang.Math.min;

public class StringSource implements CharSource {
    private final String data;
    private int pos;

    public StringSource(final String data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return pos < data.length();
    }

    @Override
    public char next() {
        return data.charAt(pos++);
    }

    @Override
    public char stepBack() {
        pos--;
        return data.charAt(pos - 1);
    }

    @Override
    public ParseException error(final String message) {
        return new ParseException(pos, message, data.substring(pos - 1, min(data.length(), pos + 9)));
    }
}