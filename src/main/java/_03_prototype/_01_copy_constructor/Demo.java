package _03_prototype._01_copy_constructor;

public class Demo {

    public static void main(String[] args) {
        Employee john = new Employee("John",
                new Address("123 London Road", "London", "UK"));

        Employee chris = new Employee(john);
        chris.setName("Chris");

        System.out.println(john);
        System.out.println(chris);
    }
}
