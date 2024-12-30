package ru.job4j.condition;


public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += symbol + Integer.toString(counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result += symbol + Integer.toString(counter);
        return result;
    }
}
