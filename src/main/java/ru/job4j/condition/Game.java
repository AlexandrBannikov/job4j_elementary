package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name)) { /* Сравнить переменную name с "tanks" */
            System.out.println("Start - tanks");
        }
        if ("tetris".equals(name)) { /* Сравнить переменную name с "tetris" */
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        menu("tanks");
    }
}