package aplication;

public class Flower extends Plant {
    private String typeFlower;

    public String getTypeFlower() {
        return typeFlower;
    }

    public void setTypeFlower(String typeFlower) {
        this.typeFlower = typeFlower;
    }

    public Flower(PotColor potColor, String typeFlower, int WaterLevel) {
        super(potColor, WaterLevel);
        this.typeFlower = typeFlower;
    }

    @Override
    public void grow() {
        if (typeFlower.equals("Кактус"))
            System.out.println("Я кактус и я долго расту...");
        if (typeFlower.equals("Ромашка"))
            System.out.println("Я ромашка");
        if(getWaterLevel()<=(0))
            System.out.println("Я больше не расту");
        if(getWaterLevel()>(0))
           super.grow();

    }
    //@Override
    //public void drinkWater(){
    //    if(typeFlower.equals("Кактус"))
    //        setWaterLevel(getWaterLevel()-1);
    //    if(typeFlower.equals("Ромашка"))
    //        setWaterLevel(getWaterLevel()-3);
    //    if(getWaterLevel()<=(0))
    //        System.out.println("И я высох... ");
    //    if(getWaterLevel()>(0))
    //        super.drinkWater();




    }

