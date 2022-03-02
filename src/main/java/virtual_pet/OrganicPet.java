package virtual_pet;

public abstract class OrganicPet extends VirtualPet{

    protected int hungerLevel;
    protected int thirstLevel;
    protected int cleanLevel;
    protected int boredomLevel;

    public OrganicPet(String name, int age) {
        super(name,age);
        this.hungerLevel=55;
        this.thirstLevel=65;
        this.boredomLevel=45;
        this.cleanLevel=28;
    }



    public int getHunger() {
        return hungerLevel;
    }

    public int getThirst() {
        return thirstLevel;
    }

    public int getBoredom() {
        return boredomLevel;
    }

    public void play() {
        boredomLevel = Math.max(0,boredomLevel-10);
        thirstLevel = Math.min(100,thirstLevel + 10);
        hungerLevel = Math.min(100,hungerLevel + 10);
    }

//    @Override
//    public void tick() {
//
//        boredomLevel++;
//        thirstLevel++;
//        hungerLevel++;
//
//    }

    @Override
    public void tick() {
        boredomLevel++;
        thirstLevel++;
        hungerLevel++;
    }

    @Override
    public String stats(){

        return name+":\n|Hunger: "+hungerLevel+"| \t|Boredom: "+boredomLevel+"| \t|Thirst: "+thirstLevel+"| \t|Clean: "+ cleanLevel+"|";
    }


    public void hunger() {

        hungerLevel += 50;
    }

    public void  water(){

        thirstLevel += 30;
    }

    public void feed(){

        hungerLevel += 40;
    }
    public void clean(){
        cleanLevel+=20;
    }


}