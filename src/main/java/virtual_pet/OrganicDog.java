package virtual_pet;

public class OrganicDog extends OrganicPet {


    public OrganicDog(String name, int age) {
        super(name, age);
    }

    public void walk(){
        boredomLevel-=20;
        thirstLevel+=40;
        hungerLevel+=30;

    }
    public void play(){
        boredomLevel-=10;
        thirstLevel+=10;
        hungerLevel+=25;

    }
}
