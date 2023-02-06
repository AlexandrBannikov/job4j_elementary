package ru.job4j;

public class Test {

    public static String abs(int value) {
        final String result;
        if (value > 0) {
            result = "positive";
        } else if (value == 0) {
            result = "zero";
        } else {
            result = "negative";
        }
        return result;
    }

    public static void main(String[] args) {
        boolean toBe = true;
        boolean notToBe = false;
        boolean question = toBe || notToBe;
        System.out.println(2 > 0 && 3 < 5 && !false);

    }
}
