package _07_composite._03_excercise_general_sum;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList<ValueContainer> {

    // please leave this constructor as-is
    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }

    public int sum() {
        int sum = 0;
        for (ValueContainer integers : this) {
            for (Integer val : integers) {
                sum += val;
            }
        }

        return sum;
    }
}