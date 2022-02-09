package virtual_pet;

public abstract class OrganicPet extends VirtualPet{

    protected int hungerLevel;
    protected int thirstLevel;
    protected int sleep;
    protected int boredomLevel;

    public OrganicPet(String name, int age) {
        super(name, age);
        this.hungerLevel=45;
        this.thirstLevel=45;
        this.sleep=45;
        this.boredomLevel=45;
    }


    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

//    public void giveWater(){
//          thirstLevel=thirstLevel-3;
//        if (thirstLevel >= 50) {
//            System.out.println("I am not thirsty!");
//        }
//    }
//
//    public void giveFood(){
//          hungerLevel= hungerLevel-5;
//          if (hungerLevel>=50){
//              System.out.println("I am not hungery!");
//          }
//
//    }

    @Override
    public void tick() {
            hungerLevel++;
            thirstLevel++;
            boredomLevel++;
    }

    @Override
    public String currentStatus() {
        return hungerLevel+"\n|Hunger level: " + thirstLevel+ "|\t thrist lever: " + boredomLevel+ "|\t boredom lever: " + sleep+ "|\t sleep lever: ";


    }
}
