package ru.gabbasova.java.basic.homeworks.homework1;
import java.util.Scanner;
public class ApplicationHW1 {

    public static void main(String[] args) {
        //1
        ApplicationHW1.greetings();
        //2
        ApplicationHW1.checkSign(-5, 3, 1);
        //3
        ApplicationHW1.selectColor();
        //4
        compareNumbers();
        //5
        addOrSubtractAndPrint(101, 3, true);
        //*
        enteringNumberExecuteMethod();

    }

    //1
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    //2
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //3
    public static void selectColor() {
        int data;
        data = 15;
        if (data <= 10) {
            System.out.println("Красный");
        } else {
            if (data > 10 && data <= 20) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
    }

    //4
    public static void compareNumbers() {
        int a, b;
        a = 35;
        b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else{
            System.out.println("a < b");
        }
    }

    //5
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    //*
    public static void enteringNumberExecuteMethod () {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5 включительно");
        int res = scanner1.nextInt();

        switch (res) {
            case 1:
                greetings();
                break;
            case 2:
                int a = (int) (Math.random() * -10);
                int b = (int) (Math.random() * 5);
                int c = (int) (Math.random() * 3) + 1;
                checkSign(a, b, c);
                break;
            case 3:
                selectColor();
                break;
            case 4:
                compareNumbers();
                break;
            case 5:
                int a2 = (int) (Math.random() * -10);
                int b2 = (int) (Math.random() * 5);
                int c2 = (int) (Math.random() * 2);
                boolean c3;
                if (c2 == 1) {
                    c3 = true;
                } else {
                    c3 = false;
                }
                addOrSubtractAndPrint(a2, b2, c3);
                break;
        }

    }


}
