package Exercises.POOIV;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product cloth1 = new Clothes(1, 14.99f, "T-shirt", "M", "Blue");
        Product cloth2 = new Clothes(2, 13f, "Sweeter", "S", "Red");
        Product book1 = new Books(3, 28.99f, "Kafka", "Metamorphosis");
        Product book2 = new Books(4, 2f, "Cantajuegos", "La vaca lola");

        List<Product> productList;
        productList = new ArrayList();

        showProducts(cloth1, productList);
        showProducts(cloth2, productList);
        showProducts(book1, productList);
        showProducts(book2, productList);
    }

    public static void showProducts(Product product, List<Product> productList) {
        System.out.println(product);
        productList.add(product);
    }
}
