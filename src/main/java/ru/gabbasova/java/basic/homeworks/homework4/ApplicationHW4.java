package ru.gabbasova.java.basic.homeworks.homework4;

import java.time.Year;
import java.util.Arrays;

public class ApplicationHW4 {
    public static void main(String[] args) {
        //1, 2
        User user1 = new User("Ivanov", "Ivan", "Ivanovich",  (short) 1995,
                "Ivanov123@yandex.ru");

        //3
        // вывод в консоль 1
        user1.info();

        // вывод в консоль 2
        System.out.println("ФИО: " + user1.getSurname() + " " + user1.getName() + " "
                + user1.getSurname() + "\n" + "Год рождения: "
                + user1.getYearOfBirth() + "\n" + "e-mail: " + user1.getEmail());

        //4
        User[] users = new User[10];
        // generate data
        String sname1 = "Ivanov";
        String name1 = "Ivan";
        String lname1 = "Ivanovich";
        String year1 = "Ivanov123@yandex.ru";
        System.out.println("Выведите пользователей: " );
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(sname1 + i, name1 + i, lname1 + i,
                    (short) (Math.random() * 74 + 1950), i + year1  );
            users[i].info();
        }
        //result
        System.out.println("Выведите пользователей старше 40: ");
        short yearNow = (short) Year.now().getValue();
        for (int i = 0; i < users.length; i++) {
            if (yearNow - users[i].getYearOfBirth() > 40) {
                users[i].info();
            }
        }

        //5
        Box box1 = new Box(25, 34, 11.5f, "yellow");

        box1.info();
        box1.setSize(22.5f, 15, 15.25f);
        box1.setColor("yellow");
        box1.openBox();
        box1.openBox();
        box1.closeBox();
        box1.putInBox();
        box1.openBox();
        box1.putInBox();
        box1.putInBox();
        box1.closeBox();
        box1.putOutBox();
        box1.openBox();
        box1.putOutBox();


    }

}
