package Exercises.POOIV;

public class Product {
    private int id;
    private float price;

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