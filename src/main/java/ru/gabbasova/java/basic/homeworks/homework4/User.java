package ru.gabbasova.java.basic.homeworks.homework4;

public class User {
    private String surname;
    private String name;
    private String lastname;
    private short yearOfBirth;
    private String email;

    //Constructor
    public User(String surname, String name, String lastname, short yearOfBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void info() {
        System.out.println(String.format("ФИО: %s %s %s\n Год рождения: %d \n e-mail: %s", surname, name, lastname, yearOfBirth, email));
    }

}
