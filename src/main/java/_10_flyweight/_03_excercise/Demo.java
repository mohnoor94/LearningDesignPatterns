package _10_flyweight._03_excercise;

public class Demo {

    public static void main(String[] args) {
        var sentence = new Sentence("hello world");
        sentence.getWord(1).setCapitalize(true);
        System.out.println(sentence);
    }
}
