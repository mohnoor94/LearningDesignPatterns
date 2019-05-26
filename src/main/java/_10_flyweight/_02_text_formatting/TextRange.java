package _10_flyweight._02_text_formatting;

// Fly-weight class
public class TextRange {
    private int start, end;
    private boolean capitalize, bold, italic; // etc...

    TextRange(int start, int end) {
        this.start = start;
        this.end = end;
    }

    boolean covers(int position) {
        return position >= start && position <= end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean isCapitalize() {
        return capitalize;
    }

    public boolean isBold() {
        return bold;
    }

    public boolean isItalic() {
        return italic;
    }

    public void setCapitalize(boolean capitalize) {
        this.capitalize = capitalize;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public void setItalic(boolean italic) {
        this.italic = italic;
    }
}