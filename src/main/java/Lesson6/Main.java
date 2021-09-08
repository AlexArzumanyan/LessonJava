package Lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 4);
        cat.jump();
        cat.info();


        Dog dog = new Dog("Bobik", 2);
        dog.jump();
        dog.info();

dog.voice();
cat.voice();
    }
}
