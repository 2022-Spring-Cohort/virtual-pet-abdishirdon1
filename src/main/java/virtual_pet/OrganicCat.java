package virtual_pet;

public class OrganicCat extends OrganicPet {


    public OrganicCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println("Cats cant walk");
    }
    public void play(){
        boredomLevel-=10;
        thirstLevel+=10;
        hungerLevel+=25;

    }
}
