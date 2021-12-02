package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double currentAmount = amount + amount * percent / 100;
        while (currentAmount > salary) {
            currentAmount -= salary;
            currentAmount += currentAmount * percent / 100;
            year++;
        }
        return year;
    }
}
