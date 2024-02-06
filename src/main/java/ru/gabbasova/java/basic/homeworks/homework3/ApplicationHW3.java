package ru.gabbasova.java.basic.homeworks.homework3;

import java.util.Arrays;

public class ApplicationHW3 {


    public static void main(String[] args) {
        //1
        int[][] array2 = new int[][] {{-1, 5, 2, 0},{-1, -1, -1, -1},{5, 3, 1}};
        System.out.println(sumOfPositiveElements(array2));
    }

    //1
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                 if (arr[i][j] > 0){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
