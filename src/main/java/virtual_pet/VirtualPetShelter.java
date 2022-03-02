package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
   // private ArrayList<VirtualPet> shelter;
    private String byName;
    ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        this.shelter = new ArrayList<>();
        shelter.add(new OrganicCat("jeff",2));
        shelter.add(new OrganicDog("sam",3));
        shelter.add(new RobaticDog("Lio",4));
        shelter.add(new RobaticCat("Rammi", 8));

    }
    public void addPet(VirtualPet pet){
        shelter.add(pet);
    }
    public void feedPet(VirtualPet feed){
        shelter.add(feed);
    }
    public void hyderatePet(VirtualPet hydrate) {
        shelter.add(hydrate);
    }
    public void playWithAll() {
        for (VirtualPet shelter : shelter) {
            shelter.play();
        }
    }
    public void adoptAPet(String adoptPet){
        shelter.remove(findByName(adoptPet));
    }
    public void walkAllPets(){
        for(VirtualPet shelter: shelter){
            shelter.walk();
        }
    }


    private VirtualPet findByName(String name) {
        VirtualPet byName = null;
        for (VirtualPet shelter : shelter) {
            if (shelter.getName().equalsIgnoreCase(name)) {
                byName = shelter;
            }
        }
        return byName;
    }
    public String showAllPets(){
        return shelter.toString();
    }
    public String showHealth(){
        String health="";
        for (VirtualPet shelter: shelter){
            health+= shelter.stats()+"\n";
        }
        return health;
    }
    public void tickPets() {
        for (VirtualPet shelter : shelter) {
            shelter.tick();
        }
    }
        public void cleanAllPets(){
            for (VirtualPet shelter: shelter){
                if (shelter instanceof OrganicPet){
                    ((OrganicPet)shelter).clean();
                }
            }
        }

        public void oilAllPets(){
            for (VirtualPet shelter: shelter){
                if (shelter instanceof RobaticPet){
                    ((RobaticPet)shelter).oil();
                }
            }
        }
        public void maintenanceAllPets(){
            for (VirtualPet shelter: shelter){
                if (shelter instanceof RobaticPet){
                    ((RobaticPet)shelter).maintenance();
                }
            }
        }
    }







