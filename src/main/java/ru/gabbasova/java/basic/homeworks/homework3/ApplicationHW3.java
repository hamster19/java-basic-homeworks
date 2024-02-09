package ru.gabbasova.java.basic.homeworks.homework3;

import java.util.Arrays;

public class ApplicationHW3 {


    public static void main(String[] args) {
        //1
        int[][] array2 = new int[][] {{-1, 5, 2, 0},{-1, -1, -1, -1},{5, 3, 1}};
        System.out.println(sumOfPositiveElements(array2));

        //2
        int size = 7;
        printSquare(size);

        //3
        float[][] array = new float[5][5];
        resetDiagonals(array);

        //4
        int[][] array3 = new int[][] {{-5, -11, -4},{-5, -11, -4},{1, 2, 105}};
        findMax(array3);

        //5
        int[][] array4 = new int[][] {{1, 5, 11},{}, {1, 5, 6, 7}};
        System.out.println(sumOnSecondLine(array4));
    }

    //1
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                 if (arr[i][j] > 0){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    //2
    public static void printSquare(int side) {
        char[][] square = new char[side][side];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
               square[i][j] = '*';
               System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    //3
    public static void resetDiagonals(float[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if ((i == j) || ((arr.length - 1 - j) == i )) {
                   arr[i][j] = 0;
               } else arr[i][j] = (float) (Math.random() * 7);
               System.out.print(arr[i][j] + "         ");
            }
            System.out.println();
        }

    }

    //4
    public static void findMax(int[][] array) {
        int max = 0;
        for (int[] row: array) {
            for (int col: row) {
                if (col > max ){
                    max = col;
                }
            }
        }
        System.out.println(max);
    }

    //5
    public static int sumOnSecondLine(int[][] arr) {
        int sum = 0;
        if (arr[1].length - 1 >= 1) {
            for (int j = 0; j < arr[1].length; j++) {
                sum += arr[1][j];
            }
            return sum;
        } else return -1;

    }
}
