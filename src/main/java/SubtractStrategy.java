public final class SubtractStrategy implements CalculationStrategy {
    @Override
    public String name() {
        return "Subtraction";
    }

    @Override
    public String symbol() {
        return "-";
    }

    @Override
    public double calculate(double left, double right) {
        return left - right;
    }
}
