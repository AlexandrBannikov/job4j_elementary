package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        String temp = array[index];
                        array[index] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] output = compress(input);
        for (String s : output) {
            System.out.print(s + " ");
        }
    }
}
