package virtual_pet;

public abstract class OrganicCat extends OrganicPet  {
    private int BatteryLevel;
    private int OilLevel;

//    public OrganicCat(int batteryLevel, int oilLevel) {
//       // super(batteryLevel);
//        BatteryLevel = batteryLevel;
//        OilLevel = oilLevel;
//
//    }

    public OrganicCat(String name, int boredomLevel, int age, String breed) {
        super(name, boredomLevel, age, breed);
    }

}
