package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return temp > third ? temp : third;
    }

    public static int max(int first, int second, int third, int forth) {
        int temp = max(first, second, third);
        return temp > forth ? temp : forth;
    }
}
