package expression;

import java.math.BigDecimal;

public class ShiftLeft extends BinaryOperation {
    public ShiftLeft(UltraExpression first, UltraExpression second) {
        super("<<", 500, false, first, second);
    }

    @Override
    public int doOperation(int x, int y) {
        return x << y;
    }

    @Override
    public BigDecimal doOperation(BigDecimal x, BigDecimal y) {
        throw new UnsupportedOperationException("Can't do left shift in BigDecimal");
    }

    @Override
    protected boolean needBracketsRight() {
        if (!(operands[1] instanceof BinaryOperation)) {
            return false;
        }
        return ((BinaryOperation) operands[1]).priority <= this.priority;
    }
}
