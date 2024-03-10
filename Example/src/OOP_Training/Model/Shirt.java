package OOP_Training.Model;

public class Shirt extends ClothingItem {
    private String pattern;
    public Shirt( String size, double price) {
        super("Shirt", size, price);
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}