package ru.job4j.loop;

import java.util.Locale;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static String collect(String s) {
        StringBuilder result = new StringBuilder(String.valueOf(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result.append(s.charAt(i + 1));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(collect("qwe garrqw rth").toUpperCase(Locale.ROOT));
    }
}
