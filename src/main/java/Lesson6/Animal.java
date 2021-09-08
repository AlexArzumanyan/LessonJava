package Lesson6;

public class Animal {
    protected String name;
    protected int age;


    public void jump() {

        System.out.println(name + "___прыгнул");
    }

    public void info() {
        System.out.println(name + " " + age);
    }
    public void voice() {
        System.out.println(name + " издает какой-то звук");
    }

    protected int calculateAge() {
        return age * 1;
    }
}

