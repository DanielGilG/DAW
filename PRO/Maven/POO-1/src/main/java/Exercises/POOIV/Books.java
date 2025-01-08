package Exercises.POOIV;

public class Books extends Product{
    private String author;
    private String title;
    private final float discount = 0.8f;

    //Constructor
    public Books(int id, float price, String author, String title) {
        super(id, price);
    }

    //Method
    public float getPrice(Product product){
        float price = product.price * discount;
        return price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}