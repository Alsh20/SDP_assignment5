public final class MultiplyStrategy implements CalculationStrategy {
    @Override
    public String name() {
        return "Multiplication";
    }

    @Override
    public String symbol() {
        return "*";
    }

    @Override
    public double calculate(double left, double right) {
        return left * right;
    }
}
