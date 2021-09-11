package Lesson6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Animal[] animals = {
                new Cat("Luntik"),
                new Dog("Bobik"),
                new Cat("Mursik"),
                new Cat("Barsik"),
                new Dog("Bulbazavr")

        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].runAnimals(9);
            animals[i].swimAnimals(18);
        }

    }

}


