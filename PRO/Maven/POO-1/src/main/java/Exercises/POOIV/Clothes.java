package Exercises.POOIV;

public class Clothes extends Product{
    private String type;
    private String size;
    private String color;

    public Clothes(int id, float price, String type, String size, String color) {
        super(id, price);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}