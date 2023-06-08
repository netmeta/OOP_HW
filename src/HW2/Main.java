package HW2;

public class Main {
    public static void main(String[] args) {
        Plate kittensPlate = new Plate();
        Cat keksCat = new Cat("Keks", 199);
        Cat kotCat = new Cat("kot", 225);

        kittensPlate.addFood(225);
        kittensPlate.addFood(199);
        kittensPlate.info();

        Cat[] cats = new Cat[] { keksCat, kotCat };

        while (kittensPlate.getFood() > 0) {
            for (Cat cat : cats) {
                cat.eat(kittensPlate.getFood());
                cat.info();
            }
            kittensPlate.info();

        }

    }
}