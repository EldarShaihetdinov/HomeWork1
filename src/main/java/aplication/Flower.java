package aplication;

public class Flower extends Plant {

    private final String name;
    private int waterLevel;


    public Flower(Color Color, String name, int waterLevel) {
        super(Color);
        this.name = name;
        this.waterLevel = waterLevel;
    }

    @Override
    public void grow() {
        if (getName().equals("Ромашка"))
            System.out.println("Ромашка растет быстро");
        if (getName().equals("Роза"))
            System.out.println("Роза растет долго");
        if (getName().equals("Кактус"))
            System.out.println("Кактус растет очень долго");


    }

    @Override
    public void showWaterLevel() {
        System.out.println(getWaterLevel() + "мл. уроень воды.");
    }

    public void drinkWater() {
        if (getName().equals("Ромашка"))
            setWaterLevel(getWaterLevel() - 2);
        if (getName().equals("Роза"))
            setWaterLevel(getWaterLevel() - 3);
        if (getName().equals("Кактус"))
            setWaterLevel(getWaterLevel() - 1);
    }


    public String getName() {
        return name;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }
}



