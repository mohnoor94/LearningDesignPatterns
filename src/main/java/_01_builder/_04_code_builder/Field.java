package _01_builder._04_code_builder;

public class Field {

    private String type;
    private String name;

    public Field(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("public %s %s;", type, name);
    }
}