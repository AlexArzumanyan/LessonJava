package Lesson5;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Белый", 2);

        Cat cat2 = new Cat("Мурзик", "Белый", 2);


        cat.info();
        ;
        cat2.info();
        cat.jump();
        cat2.jump();
        cat.sleep();
        cat2.sleep();
    }
}
