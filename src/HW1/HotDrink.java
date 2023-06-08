package HW1;

public class HotDrink extends Drink{
    private final Integer temperature;
    public HotDrink(Integer id, String name, Integer volume,Integer temperature) {
        super(id, name, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() +"HotDrink [temperature -> " + temperature + "]";
    }

    public Integer getTemperature() {
        return temperature;
    }
}
