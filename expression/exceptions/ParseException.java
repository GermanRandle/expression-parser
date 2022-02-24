package expression.exceptions;

public class ParseException extends RuntimeException {
    public ParseException(int position, String message, String remain) {
        super("Parsing error on position " + position + ": " + message +
                ". Remaining input (not more than 10 symbols: " + remain + ")");
    }
}
