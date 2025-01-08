package Exercises.POOIV;

public class Product {
    private int id;
    protected float price;

    //Constructor
    public Product(int id, float price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}