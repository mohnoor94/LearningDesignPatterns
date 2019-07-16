package _11_proxy._04_excercise;

public class Demo {

    public static void main(String[] args) {
        Person p = new Person(10);
        ResponsiblePerson rp = new ResponsiblePerson(p);

        System.out.println(rp.drive());
        System.out.println(rp.drink());
        System.out.println(rp.drinkAndDrive());
        System.out.println("=====");

        rp.setAge(20);

        System.out.println(rp.drive());
        System.out.println(rp.drink());
        System.out.println(rp.drinkAndDrive());
    }
}
