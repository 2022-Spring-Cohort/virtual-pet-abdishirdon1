package virtual_pet;

public class RobaticCat extends RobaticPet{


    public RobaticCat(String name, int age) {
        super(name, age);
    }

    public void walk(){
        maintenanceLevel-=10;
        batteryLevel-=10;
        oilLevel-=25;

    }
    public void play(){
        batteryLevel-=10;
        oilLevel-=10;
        maintenanceLevel-=25;

    }
}
