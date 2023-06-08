package HW2;

public class Plate {
    protected static int food;

    public void addFood(int food){
        Plate.food = Plate.food + food;
    }


    public void food(int food){
        Plate.food = food;
    }
    public int getFood() {
        return Plate.food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

}
