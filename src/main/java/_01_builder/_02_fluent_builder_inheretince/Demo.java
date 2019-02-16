package _01_builder._02_fluent_builder_inheretince;

public class Demo {

    public static void main(String[] args) {
        EmployeeBuilder pb = new EmployeeBuilder();

        pb.withName("Mohammad")
                .worksAt("Software Engineer");

        System.out.println(pb.build());
    }
}
