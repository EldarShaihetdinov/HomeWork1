package aplication;

public class Client {
    public static void main(String[] args) {
        Flower flower0 = new Flower(Color.WHITE, "Ромашка", 10);
        Flower flower1 = new Flower(Color.BLUE, "Роза", 8);
        Flower flower2 = new Flower(Color.GREEN, "Кактус", 4);

        flower0.grow();
        flower0.showWaterLevel();
        flower0.drinkWater();
        flower0.showWaterLevel();
        flower1.grow();
        flower1.showWaterLevel();
        flower2.grow();
        flower2.showWaterLevel();
        flower2.drinkWater();
        flower2.showWaterLevel();
    }
}
