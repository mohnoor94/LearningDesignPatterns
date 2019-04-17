package _10_flyweight._01_repeating_user_names;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlyweightUser {
    private static List<String> strings = new ArrayList<>();
    private int[] names;

    public FlyweightUser(String fullName) {
        Function<String, Integer> getOrAdd = (String s) -> {
            int idx = strings.indexOf(s);
            if (idx != -1) return idx;

            strings.add(s);
            return strings.size() - 1;
        };

        names = Arrays.stream(fullName.split("\\s+"))
                .mapToInt(getOrAdd::apply)
                .toArray();
    }

    @Override
    public String toString() {
        return Arrays.stream(names)
                .mapToObj(i -> " " + strings.get(i))
                .collect(Collectors.joining());
    }
}
