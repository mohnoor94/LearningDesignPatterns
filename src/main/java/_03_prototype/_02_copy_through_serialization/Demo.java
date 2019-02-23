package _03_prototype._02_copy_through_serialization;

import org.apache.commons.lang3.SerializationUtils;

public class Demo {

    public static void main(String[] args) {
        Foo foo1 = new Foo(50, "something");

        // Performs a serialization roundtrip. Serializes and deserializes the given object
        Foo foo2 = SerializationUtils.roundtrip(foo1);
        foo2.setWhatever("something else");

        System.out.println(foo1);
        System.out.println(foo2);
    }
}
