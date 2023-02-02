package ru.job4j.array;

public class MatrixLoop {
    public static void main(String[] args) {
        int sum = 0;
        int[][] array = {
                {4, 2, 3},
                {7, 1},
                {3, 5, 6, 4}
        };
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                sum += array[row][cell];
            }
        }
        System.out.print(sum + " ");
    }
}
