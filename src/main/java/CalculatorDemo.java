import java.util.List;
import java.util.Locale;

public final class CalculatorDemo {
    private CalculatorDemo() {
    }

    public static void main(String[] args) {
        double left = 12.0;
        double right = 4.0;
        List<CalculationStrategy> strategies = List.of(
                new AddStrategy(),
                new SubtractStrategy(),
                new MultiplyStrategy());
        Calculator calculator = new Calculator(strategies.get(0));

        for (CalculationStrategy strategy : strategies) {
            calculator.setStrategy(strategy);
            double result = calculator.calculate(left, right);
            System.out.printf(Locale.ROOT, "%-15s %.2f %s %.2f = %.2f%n",
                    strategy.name() + ":", left, strategy.symbol(), right, result);
        }
    }
}
