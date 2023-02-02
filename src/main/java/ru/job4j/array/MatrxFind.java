package ru.job4j.array;

public class MatrxFind {
    public static void find(int[][] array, int el) {
        System.out.println("Find el : " + el);
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                if (val <= 0) {
                    System.out.println("row: " + row + ", cell: " + cell);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {-2, 2, 3},
                {3, -1, 1},
                {2, 3, 0},
        };
        find(array, 3);
    }
}
