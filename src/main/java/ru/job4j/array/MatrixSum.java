package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] innerArray : array) {
            for (int el : innerArray) {
                rsl += el;
            }
        }
        return rsl;
    }
}
