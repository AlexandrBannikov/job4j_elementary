package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean b = data[0];
        for (boolean d : data) {
            if (d != b) {
                return false;
            }
        }
        return true;
    }
}
