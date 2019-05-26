package _10_flyweight._02_text_formatting;

public class Demo {

    public static void main(String[] args) {
        BadTextFormatter badTextFormatter = new BadTextFormatter("This is a brave new world");
        badTextFormatter.capitalize(10, 15);
        System.out.println(badTextFormatter);

        GoodTextFormatter goodTextFormatter = new GoodTextFormatter("Make America Great Again");
        goodTextFormatter.getRange(13, 18).setCapitalize(true);
        System.out.println(goodTextFormatter);
    }
}
