package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5, 6, 3, 4, 1, 2};
        int[] rsl = swap(nums, 0, nums.length - 1);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}
