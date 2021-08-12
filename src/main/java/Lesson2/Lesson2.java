package Lesson2;

import java.sql.SQLOutput;

public class Lesson2 {
    public static void main(String[] args) {
        Part1(10, 5, true);
        Part2(10);
        Part3(-854);
        Part4("Hello HoweWork2 Part 4");


    }

    public static boolean Part1(int a, int b, boolean sum) {
        if (a+b >= 10 && a+b <= 20) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void Part2(int n) {
        if (n >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }


    }

    public static boolean Part3(int n) {
        if (n >= 0 ) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void Part4(String word) {
        for (int i = 0; i < 7; i++) {
            System.out.println(word);
        }
    }

}