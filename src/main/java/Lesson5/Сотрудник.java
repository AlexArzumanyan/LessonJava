package Lesson5;

import java.util.Arrays;

public class Сотрудник {
    private String name;
    private String position;
    private String email;
    private int number;
    private int salary;
    private int age;


    public Сотрудник(String name, String position, String email, int number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }


    public void info() {
        for (int i = 0; i < 1; i++) {
            if (age >= 40)

                System.out.println("ФИО: " + name + " " +
                        "Должность: " + position + " " +
                        "email: " + email + " " +
                        "телефон: " + number + " " +
                        "зарплата: " + salary + " " +
                        "возраст: " + age);
        }
    }


}

