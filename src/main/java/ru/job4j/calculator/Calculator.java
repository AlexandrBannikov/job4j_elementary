package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static int sum(int first) {
        return first + x;
    }

    public int multiply(int first) {
        return first * x;
    }

    public static int minus(int first) {
        return first - x;
    }

    public int divide(int first) {
       return first / x;
    }

    public int sumAllOperation(int first) {
        return sum(first)
                +  multiply(first)
                + minus(first)
                + divide(first);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res = sum(5);
        System.out.println(res);
        res = calculator.multiply(5);
        System.out.println(res);
        res = minus(10);
        System.out.println(res);
        res = calculator.divide(10);
        System.out.println(res);
        res = calculator.sumAllOperation(10);
        System.out.println(res);

    }
}
