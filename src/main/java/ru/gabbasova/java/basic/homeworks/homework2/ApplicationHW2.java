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
        int[] mas = new int[10];
        randomArray(mas);
        sumOfArrayElements(mas);

        //3
        int[] ar1 = new int[105];
        int numb = -3;
        fillArray(numb, ar1);

        //4
        increaseArray(11, mas);

        //5
        compareInArray(mas);

        //*1
        int[] ar2 = {1, 3, 2}; // кол-во эл-ов = кол-во массивов, знач-е эл-та = кол-во эл-ов в каждом из массивов
        sumAllArray(ar2);

        //*2
        int[] mas3 = { 1, 1, 1, 1, 1, 5 };
        pointInArray(mas3);

        //*3
        int[] mas4 = { 1, 5, 7, 11, 11, 12};
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Нажмите 1, если хотите проверить последовательность на возрастание, 2 - на убывание:");
        int check = scan2.nextInt();
        checkSortArray(check, mas4);

        //*4
        int[] mas5 = { 3, 8, 10, 105, -1};
        transpositionArray(mas5);

    }

    public static void randomArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
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

    //3
    public static void fillArray(int a, int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = a;
        }
        System.out.println(Arrays.toString(ar));
    }

    //4
    public static void increaseArray(int b, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + b;
        }
        System.out.println(Arrays.toString(arr2));
    }

    //5
    public static void compareInArray(int[] arr3) {
        int len = arr3.length;
        int compare = 0;
        if (len % 2 != 0 ) {
            System.out.println("Число элемнтов массива нечетное");
        } else {
            for (int i = 0; i < len/2; i++) {
                compare += arr3[len - i - 1] - arr3[i];
            }
        }
        if (compare < 0) {
            System.out.println("Сумма первой половины элементов массива больше второй.");
        } else if (compare == 0) {
            System.out.println("Сумма первой половины элементов массива равна второй.");
        } else if (compare > 0) {
            System.out.println("Сумма первой половины элементов массива меньше второй.");
        }

    }

    //*1
    public static void sumAllArray(int... arr4) {
        int maxLim = 0;
        for(int i = 0; i < arr4.length; i++) {
            if ( arr4[i] > maxLim) {
                maxLim = arr4[i];
            }
        }
        int[] arrayZero = new int[maxLim];
        // кол-во массивов
        for(int i = 0; i < arr4.length; i++){
            int[] arraySum = new int[arr4[i]];
            for(int j = 0; j < Math.min(arrayZero.length, arraySum.length); j++) {
                arraySum[j] = (int)(Math.random() * 10);
                arrayZero[j] += arraySum[j];
            }
            System.out.println(Arrays.toString(arraySum));
        }
        System.out.println("Сумма элементов всех массивов: \n" + Arrays.toString(arrayZero));
    }

    //*2
    public static void pointInArray(int[] arr5) {
        int sumAll = 0;
        int sum1 = 0;
        for (int i = 0; i < arr5.length; i++) {
            sumAll += arr5[i];
        }
        int sum2 = sumAll;
        for (int i = 0; i < arr5.length; i++) {
            sum1 += arr5[i];
            sum2 -= arr5[i];

            if (sum1 == sum2) {
                System.out.print("Точка находится между " + i + " и ");
                System.out.println(i + 1 + " элементами массива");
                break;
            }
        }
    }

    //*3
    public static void checkSortArray(int a1, int... arr6) {
        int counter = 0;
        if( a1 == 1 ) {
            for(int i = 0; i < arr6.length - 1; i++) {
                if (arr6[i] <= arr6[i+1]) {
                    counter ++;
                }
                if (counter != (i + 1)) {
                    break;
                }
            }
        }

        if( a1 == 2 ) {
            for(int i = 0; i < arr6.length - 1; i++) {
                if (arr6[i] >= arr6[i+1]) {
                    counter ++;
                }
                if (counter != (i + 1)) {
                    break;
                }
            }
        }

        if(counter == (arr6.length - 1)) {
            System.out.println("Проверка пройдена успешно");
        } else System.out.println("Проверка не пройдена");
    }

    //*4
    public static void transpositionArray(int... arr7) {
        int interim;
        int lim = arr7.length;
        for(int i = 0; i < lim/2; i++ ) {
            interim = arr7[i];
            arr7[i] = arr7[lim - i - 1];
            arr7[lim - i - 1] = interim;
        }
        System.out.println(Arrays.toString(arr7));
    }

}

