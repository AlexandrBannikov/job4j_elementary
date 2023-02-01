package ru.job4j.array;

import java.util.Arrays;

public class RollBackArray {
    public static int[] rollBack(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = rollBack(array);
        System.out.println(Arrays.toString(result));
    }
}
