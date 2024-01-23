package ru.gabbasova.java.basic.homeworks.homework2;

import java.util.Scanner;
import java.util.Arrays;

public class ApplicationHW2 {
    public static void main(String[] args) {
        //1
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = scanner2.nextLine();

        outputString(number, s);

        //2
        int[] m = new int[10];
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 10);
        }
        sumOfArrayElements(m);


    }

    //1
    public static void outputString(int numb, String s) {
        for (int i = 0; i < numb; i++) {
            System.out.println(s);
        }
    }

    //2
    public static void sumOfArrayElements(int[] arr) {
        int sumAll = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sumAll += arr[i];
            }
        }
        System.out.println("Сумма = " + sumAll);
    }
}

