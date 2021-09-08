package Lesson6;

public class Cat extends Animal {


    public Cat(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " " + age + " ");
    }
    @Override
    public void voice() {
        System.out.println(name + " мяукает");
    }

}


