package Lesson6;

public class Cow extends Animal {


    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void voice() {
        System.out.println(name + " мычит");
    }
}