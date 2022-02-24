package expression.parser;

import expression.exceptions.ParseException;

public interface CharSource {
    boolean hasNext();
    char next();
    char stepBack();
    ParseException error(final String message);
}