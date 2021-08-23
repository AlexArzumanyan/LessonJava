package Lesson5;

public class Cat {
    public String name;
    public String color;
    public int age;

    public Cat(String _name, String _color, int _age) {
        name = _name;
        color = _color;
        if(_age >=0) {
            age = _age;
        } else {
            age = 0;
        }
    }


    public void jump() {

        System.out.println(name + " подпрыгнул");
    }


    public void info() {

        System.out.println(name + " " + color + " " + age);
    }

    public void sleep() {
        System.out.println(name + " уснул");
    }
}
