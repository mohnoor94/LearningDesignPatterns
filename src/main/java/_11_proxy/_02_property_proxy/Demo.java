package _11_proxy._02_property_proxy;

public class Demo {

    public static void main(String[] args) {
        Creature creature = new Creature(10);
        System.out.println(creature.getAgility());
        creature.setAgility(20);
        System.out.println(creature.getAgility());
    }
}
