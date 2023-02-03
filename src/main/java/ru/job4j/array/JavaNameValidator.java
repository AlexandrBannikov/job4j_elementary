package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        if (name.isBlank() || Character.isUpperCase(name.charAt(0)) || isDigit(name.charAt(0))) {
            return false;
        }

        for (char c : name.toCharArray()) {
            if (!isSpecialSymbol(c) && !isUpperLatinLetter(c) && !isLowerLatinLetter(c) && !isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return 65 <= code && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return 97 <= code && code <= 122;
    }
}
