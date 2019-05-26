package _10_flyweight._02_text_formatting;

public class BadTextFormatter {
    private String plainText;
    private boolean[] capitalize; // another array for each format - a lot of space/memory loss!

    public BadTextFormatter(String plainText) {
        this.plainText = plainText;
        capitalize = new boolean[plainText.length()];
    }

    public void capitalize(int start, int end) {
        for (int i = start; i <= end; ++i)
            capitalize[i] = true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < plainText.length(); ++i) {
            char c = plainText.charAt(i);
            sb.append(capitalize[i] ? Character.toUpperCase(c) : c);
        }
        return sb.toString();
    }
}
