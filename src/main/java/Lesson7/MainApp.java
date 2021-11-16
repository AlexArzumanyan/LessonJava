package Lesson7;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(30 );

        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsik", 20, false);
        cat[1] = new Cat("Pushok", 13, false);
        cat[2] = new Cat("Murzik", 17, false);
        for (int i = 0; i < 3; i++) {

            cat[i].eat(plate);// Коту не хватает еды
            plate.IsEmpty();// в тарелке с едой не могло получиться отрицательного количества
            plate.negative(); // Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.


            System.out.println(plate);

        }




    }


}
