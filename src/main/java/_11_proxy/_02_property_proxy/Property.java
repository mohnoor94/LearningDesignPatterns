package _11_proxy._02_property_proxy;

import java.util.Objects;

public class Property<T> {
    private T value;

    public Property() {
    }

    public Property(T value) {
        this.value = value;
    }

    public T get() {
        // add whatever additional logic here!
        // this may be controlled by DI as well!
        return value;
    }

    public void set(T value) {
        // add whatever additional logic here!
        // this may be controlled by DI as well!

        System.out.println(">> Update value from " + this.value + " to " + value);

        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Property<?> property = (Property<?>) o;

        return Objects.equals(value, property.value);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
