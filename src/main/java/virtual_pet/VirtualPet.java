package virtual_pet;


public abstract class VirtualPet {
    protected String name;
    protected int age;


    public VirtualPet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
    public abstract void tick();
    public abstract String currentStatus();
    public abstract void play();


}

