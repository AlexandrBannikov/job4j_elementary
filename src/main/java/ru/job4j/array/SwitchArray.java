package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0]; //обнулили индекс, освободили ячейку.temp = 1
        array[0] = array[array.length - 1]; // в array[0] поместили последний индекс = 6
        array[array.length - 1] = temp; // в последний индекс поместили array[0] = 1;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i = 0; i < rsl.length; i++) {
            System.out.print(rsl[i] + " ");
        }
    }
}
