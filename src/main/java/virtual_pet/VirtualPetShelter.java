package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
   // private ArrayList<VirtualPet> shelter;

    ArrayList<VirtualPet> shelter;

    public VirtualPetShelter(){
        this.shelter=new ArrayList<>();
        shelter.add(new OrganicDog("", 45));
        shelter.add(new OrganicCat("", 45) {



            public void addPet(VirtualPet pet){
        shelter.add(pet);
    }
    public void feedPet(VirtualPet feed){
        shelter.add(feed);
    }
    public void hyderatePet(VirtualPet hydrate) {
        shelter.add(hydrate);
    }
    public void playWithPet(VirtualPet play){
        shelter.add(play);
    }

    }
    }