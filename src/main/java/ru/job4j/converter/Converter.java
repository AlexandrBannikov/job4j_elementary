package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars");

        float in = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result: " + passed1);
        float input = 180;
        float expected2 = 3;
        float out2 = Converter.rubleToDollar(input);
        boolean passed2 = expected2 == out2;
        System.out.println("180 dollars are 3. Test result: " + passed2);
    }
}
