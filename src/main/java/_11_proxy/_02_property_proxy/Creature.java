package _11_proxy._02_property_proxy;

public class Creature {
    private Property<Integer> agility = new Property<>();

    public Creature(int agility) {
        this.agility.set(agility);
    }

    public int getAgility() {
        return agility.get();
    }

    public void setAgility(int agility) {
        this.agility.set(agility);
    }
}
