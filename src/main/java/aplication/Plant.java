package aplication;

public class Plant {
    private final PotColor potColor;
    private int waterLevel;

    public Plant(PotColor potColor, int waterLevel) {
        this.potColor = potColor;
        this.waterLevel = waterLevel;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void grow() {
        System.out.println("Я расту ");
    }

    public void drinkWater() {
        System.out.println("Я больше не пью ");
    }

}
