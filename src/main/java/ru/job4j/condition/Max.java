package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean max = left > right;
        return max ? left : right;
    }

    public static void main(String[] args) {
        int max = max(3, 5);
        System.out.println(max);
        max = max(5, 3);
        System.out.println(max);
        max = max(5, 5);
        System.out.println(max);
    }
}
