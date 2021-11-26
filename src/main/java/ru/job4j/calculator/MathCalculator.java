package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return sum(subtraction(first, second), division(first, second));
    }

    public static double sumMultiplySubtractionDivision(double first, double second) {
        return sum(
                sumAndMultiply(first, second),
                subtractionAndDivision(first, second)
        );
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumMultiplySubtractionDivision(10, 20));
    }
}
