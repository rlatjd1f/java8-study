package org.example;

public class OopExample2 {
    public static void main(String[] args) {
        CalculatorService2 addService = new CalculatorService2(new Addition());
        CalculatorService2 subtractService = new CalculatorService2(new Subtract());
        CalculatorService2 multipleService = new CalculatorService2(new Multiple());
        CalculatorService2 divideService = new CalculatorService2(new Divide());

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

interface Calculation {
    int calculate(int num1, int num2);
}

class Addition implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

class Subtract implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}

class Multiple implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}

class Divide implements Calculation {
    @Override
    public int calculate(int num1, int num2) {
        return num1 / num2;
    }
}

class CalculatorService2 {
    private final Calculation calculation;

    public CalculatorService2(Calculation calculation) {
        this.calculation = calculation;
    }

    public int calculate(int num1, int num2) {
        return calculation.calculate(num1, num2);
    }
}