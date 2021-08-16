package Lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 1};
        printArray(arr);
        int[] arr2 = new int[100];
        printArray2(arr2);
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray3(arr3);
        int[][] arr4 = new int[5][5];
        printArray4(arr4);
        int[] arr5 = new int[3];
        printArray5(3, 2);

    }


    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void printArray2(int[] arr2) {
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = i;
        System.out.println(Arrays.toString(arr2));
    }

    public static void printArray3(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            } else {
                arr3[i] = arr3[i];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void printArray4(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[0].length; j++) {
                if (i == j || i + j == (arr4.length) - 1) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] printArray5(int len, int intialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < len; i++) {
            arr5[i] = intialValue;
        }
        System.out.println(Arrays.toString(arr5));
        return (arr5);
    }


}


















