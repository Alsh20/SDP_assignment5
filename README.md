# Assignment 5 - Alisher Ospanov - SE-2526 - Option B

## Pattern roles

- `CalculationStrategy` declares the common calculation contract
- `AddStrategy`, `SubtractStrategy`, and `MultiplyStrategy` implement different arithmetic operations
- `Calculator` is the Context. It stores a `CalculationStrategy` and delegates the calculation through the interface
- `CalculatorDemo` is the Client. It selects each concrete strategy and switches the Context at runtime
- `Calculator` contains no conditional check for concrete strategy types

## How to add a new strategy

1. Create a class that implements `CalculationStrategy`, e.g. `DivideStrategy`.
2. Implement the interface methods (`name()`, `symbol()`, `calculate(left, right)`)
   with the logic of the new operation only
3. In the client (`CalculatorDemo`), create the new strategy and pass it
   to `calculator.setStrategy(new DivideStrategy())`
4. Build and run. `Calculator` and the existing strategies are not modified

## Run with java

From PowerShell in the project folder:

~~~cmd
New-Item -ItemType Directory -Force out | Out-Null
$javaSources = Get-ChildItem -Recurse src/main/java -Filter *.java | ForEach-Object FullName
javac -d out $javaSources
java -cp out CalculatorDemo
~~~