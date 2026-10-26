public final class AddStrategy implements CalculationStrategy {
    @Override
    public String name() {
        return "Addition";
    }

    @Override
    public String symbol() {
        return "+";
    }

    @Override
    public double calculate(double left, double right) {
        return left + right;
    }
}
