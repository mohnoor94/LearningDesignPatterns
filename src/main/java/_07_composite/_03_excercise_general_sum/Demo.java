package _07_composite._03_excercise_general_sum;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        SingleValue v1 = new SingleValue(3);
        SingleValue v2 = new SingleValue(5);

        ManyValues integers = new ManyValues();
        integers.add(10);
        integers.add(20);
        integers.add(30);

        MyList list = new MyList(List.of(v1, v2, integers));
        System.out.println(list.sum());
    }
}
