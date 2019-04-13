package _08_decorator._04_adapter_decorator;

public class Demo {

    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();

        String string = builder.append("hello")
                .appendLine(" world!")
                .concat("concat meeee")
                .toString();

        System.out.println(string);
    }
}
