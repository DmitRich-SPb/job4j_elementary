package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double w = k * h;
        double s = w * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        double result3 = SqArea.square(8, 4);
        System.out.println(" p = 8, k = 4, s = 2.56, real = " + result3);
        double result4 = SqArea.square(10, 6);
        System.out.println(" p = 10, k = 6, s = 3.06, real = " + result4);
    }
}