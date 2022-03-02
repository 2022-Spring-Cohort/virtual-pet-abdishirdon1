package virtual_pet;

public class RobaticDog extends RobaticPet{

    public RobaticDog(String name, int age) {
        super(name, age);
    }
    public void walk(){
        batteryLevel-=10;
        oilLevel-=10;
        maintenanceLevel-=25;

    }
//    public void play(){
//        batteryLevel-=10;
//        oilLevel-=10;
//        maintenanceLevel-=25;
//
//    }
}
