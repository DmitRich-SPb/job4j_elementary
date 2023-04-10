package ru.job4j.condition;

public class More {

    public static void moreNum(int a, int b, int c) {
       if (a > b) {
            if (a > c) {
            System.out.println("Напечатать А");
            } else {
                System.out.println("Напечатать С");
            }
       } else if (b < c) {
           System.out.println("Напечатать C");
            } else {
                System.out.println("Напечатать B");
            }
    }

    public static void main(String[] args) {
        More.moreNum(10, 5, 15);
    }
}
