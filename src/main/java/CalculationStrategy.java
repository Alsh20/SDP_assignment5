public interface CalculationStrategy {
    String name();
    String symbol();
    double calculate(double left, double right);
}
