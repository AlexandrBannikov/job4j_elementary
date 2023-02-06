package ru.job4j.condition;

public class Film {
    /*
    ТИП_ПЕРЕМЕННОЙ ИМЯ_ПЕРЕМЕННОЙ = ЛОГИЧЕСКОЕ_ВЫРАЖЕНИЕ ? ЗНАЧЕНИЕ_1 : ЗНАЧЕНИЕ_2;
     */
    public static String permission(int age) {
        return age >= 18 ? "Please, enjoy it." : "You can't watch it.";
    }

    public static void main(String[] args) {
        String msg = permission(23);
        System.out.println(msg);
    }
}
