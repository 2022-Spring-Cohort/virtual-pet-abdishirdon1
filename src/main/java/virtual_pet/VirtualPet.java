package virtual_pet;


public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private  int age;
    private  String breed;


    public VirtualPet(String name, int hungerLevel, int thirstLevel, int boredomLevel, int age, String breed) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

  public void play(){
        boredomLevel = boredomLevel - 5;

  }
  public void giveWater(){
        thirstLevel=thirstLevel-3;
  }
  public void giveFood(){
        hungerLevel= hungerLevel-5;
  }

    public void tick(){

       hungerLevel++;
        thirstLevel++;
         boredomLevel++;


    }
}

