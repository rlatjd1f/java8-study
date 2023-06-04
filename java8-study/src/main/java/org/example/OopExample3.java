package org.example;

public class OopExample3 {
    public static void main(String[] args) {
        CalculatorService3 addService = new CalculatorService3((a, b) -> a + b);
        CalculatorService3 subtractService = new CalculatorService3((a, b) -> a - b);
        CalculatorService3 multipleService = new CalculatorService3((a, b) -> a * b);
        CalculatorService3 divideService = new CalculatorService3((a, b) -> a / b);

        final int sum = addService.calculate(2, 2);
        System.out.println("sum = " + sum);
        final int subtract = subtractService.calculate(2, 2);
        System.out.println("subtract = " + subtract);
        final int multiple = multipleService.calculate(2, 2);
        System.out.println("multiple = " + multiple);
        final int divide = divideService.calculate(2, 2);
        System.out.println("divide = " + divide);
    }
}

@FunctionalInterface
interface FpCalculation {
    int calculate(int num1, int num2);
}

class CalculatorService3 {
    private final FpCalculation FpCalculation;

    public CalculatorService3(FpCalculation FpCalculation) {
        this.FpCalculation = FpCalculation;
    }

    public int calculate(int num1, int num2) {
        return FpCalculation.calculate(num1, num2);
    }
}