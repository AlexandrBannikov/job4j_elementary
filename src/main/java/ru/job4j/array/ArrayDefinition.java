package ru.job4j.array;
public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Alexandr Bannikov";
        names[1] = "Ivan Bannikov";
        names[2] = "Sergei Bannikov";
        names[3] = "Anatoliy Bannikov";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
