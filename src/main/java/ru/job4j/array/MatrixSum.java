package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int sum = 0;
        for (int[] i : array) {
            for (int anInt : i) {
                sum += anInt;
            }
        }
        return sum;
    }
}
