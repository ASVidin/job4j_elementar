package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfP = (a + b + c) / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
