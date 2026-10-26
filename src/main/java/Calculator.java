import java.util.Objects;

public final class Calculator {
    private CalculationStrategy strategy;

    public Calculator(CalculationStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "strategy");
    }

    public double calculate(double left, double right) {
        return strategy.calculate(left, right);
    }
}
