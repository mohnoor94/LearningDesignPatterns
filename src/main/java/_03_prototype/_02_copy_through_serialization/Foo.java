package _03_prototype._02_copy_through_serialization;

import java.io.Serializable;

public class Foo implements Serializable {

    private int stuff;
    private String whatever;

    public Foo(int stuff, String whatever) {
        this.stuff = stuff;
        this.whatever = whatever;
    }

    public void setWhatever(String whatever) {
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "stuff=" + stuff +
                ", whatever='" + whatever + '\'' +
                '}';
    }
}
