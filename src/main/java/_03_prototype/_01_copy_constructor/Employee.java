package _03_prototype._01_copy_constructor;

public class Employee {

    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // copy constructor
    public Employee(Employee other) {
        this(other.name, new Address(other.address));

        // or
        // name = other.name;
        // address = new Address(other.address);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
