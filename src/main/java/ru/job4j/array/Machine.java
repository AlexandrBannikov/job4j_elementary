package ru.job4j.array;

import java.util.Arrays;
/*
 1) найти размер сдачи
 2) Проийти по массиву монет
 3) В цикле while проверить условия отбора монет автоматом(начиная с самой крупной). Если условие выполняется в теле
 цикла делаем следующее:
  - отнимаем от сдачи номинал очередной монеты
  - кладем монету в массив
  - увеличиваем размер массива
  // money купюра из кармана
  // price цена покупки
 */
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int i : coins) {
            while (change >= i) {
                change -= i;
                rsl[size] = i;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] rsl = change(50, 32);
        for (int i : rsl) {
            System.out.print(i + " ");
        }
    }
}
