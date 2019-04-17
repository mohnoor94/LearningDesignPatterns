package _10_flyweight._01_repeating_user_names;

public class Demo {

    public static void main(String[] args) {
        // Replicated data stored for data, like 'Smith' here
        // User user1 = new User("John Smith");
        // User user2 = new User("Jane Smith");

        FlyweightUser user1 = new FlyweightUser("John   Smith");
        FlyweightUser user2 = new FlyweightUser("Jane Smith");

        System.out.println(user1);
        System.out.println(user2);
    }
}
