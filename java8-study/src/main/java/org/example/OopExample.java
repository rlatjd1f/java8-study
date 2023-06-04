package org.example;

public class OopExample {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();

        final int sum = calculatorService.calculate('+', 2, 2);
        System.out.println("sum = " + sum);
        final int subtract = calculatorService.calculate('-', 4, 2);
        System.out.println("subtract = " + subtract);
        final int multiple = calculatorService.calculate('*', 2, 2);
        System.out.println("multiple = " + multiple);
        final int divide = calculatorService.calculate('/', 4, 2);
        System.out.println("divide = " + divide);
    }
}

class CalculatorService {
    public int calculate(char calculation, int num1, int num2) {
        if (calculation == '+') {
            return num1 + num2;
        } else if (calculation == '-') {
            return num1 - num2;
        } else if (calculation == '*') {
            return num1 * num2;
        } else if (calculation == '/') {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Unknown calculation: " + calculation);
        }
    }
}

