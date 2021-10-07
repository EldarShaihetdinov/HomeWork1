package aplication;

public class Client {
    public static void main(String[] args) {
    Flower flower0 = new Flower(PotColor.BLUE,"Кактус", 3);
    Plant flower1 = new Flower(PotColor.WHITE,"Ромашка",10);
    Flower flower2 = new Flower(PotColor.YELLOW,"Подсолнух",2);
    flower0.grow();
    flower0.drinkWater();
    flower0.grow();
    flower0.drinkWater();





    }

}
