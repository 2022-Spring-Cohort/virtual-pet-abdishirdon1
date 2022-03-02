package virtual_pet;
public  abstract class RobaticPet extends VirtualPet{
    protected int oilLevel;
    protected int maintenanceLevel;
    protected int batteryLevel;

    public RobaticPet(String name, int age) {
        super(name, age);
        this.batteryLevel=60;
        this.oilLevel=70;
        this.maintenanceLevel=80;
    }


    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
    @Override
    public void play(){
        oilLevel = Math.max(0,oilLevel-10);
        batteryLevel = Math.max(0,batteryLevel + 10);
        maintenanceLevel = Math.min(100,maintenanceLevel + 10);
    }

    @Override
    public void tick() {
        batteryLevel++;
        oilLevel++;
        maintenanceLevel++;
    }

    @Override
    public String stats() {
        return name+":\n|oilLevel: "+oilLevel+"| \t|maintenance: "+maintenanceLevel+"| \t|batteryLevel: "+batteryLevel+"|";

    }

    public void oil() {
        oilLevel+=43;
    }
    public void maintenance(){
        maintenanceLevel+=33;
    }
}
