package _08_decorator._01_string_decorator;

public class Demo {

    public static void main(String[] args) {
        MagicString magicString = new MagicString("hello");
        System.out.println(magicString);
        System.out.println(magicString.getNumberOfVowels());
    }
}
