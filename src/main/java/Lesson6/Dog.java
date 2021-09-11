package Lesson6;

public class Dog extends Animal {


    public  Dog(String name) {
        this.name = name;

    }
    @Override
    public void swimAnimals (int distance) {
        if (distance < 10) {
            System.out.println(name + " проплыл" + " " + distance);
        } else {

            System.out.println(name + " может плыть максимум 10 метров");
    }
}
    }