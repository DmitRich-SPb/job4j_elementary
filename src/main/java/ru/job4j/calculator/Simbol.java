package ru.job4j.calculator;

public class Simbol {
    public static void main(String[] args) {
        char c1 = '\u0035';
        char c2 = '\u004D';
        char c3 = '\u006E';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        int a = 'A';
        int b = 'B';
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("A + B: " + (a + b));
        char c = 'C';
        System.out.println(++c);
        char d = 'D';
        System.out.println(--d);
    }
}
