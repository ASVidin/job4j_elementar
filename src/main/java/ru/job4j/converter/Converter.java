package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(300);
        System.out.println("300 rubles are " + dollar + " dollar.");

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float inForDollar = 300;
        float expectedForDollar = 5;
        float outForDollar = rubleToDollar(inForDollar);
        boolean passedForDollar = expectedForDollar == outForDollar;
        System.out.println("300 rubles are 5. Test result : " + passedForDollar);

    }
}
