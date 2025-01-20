package Exercises.POOIV;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product cloth1 = new Clothes(1, 14.99f, "T-shirt", "M", "Blue");
        Product cloth2 = new Clothes(2, 13f, "Sweeter", "S", "Red");
        Product book1 = new Books(3, 28.99f, "Kafka", "Metamorphosis");
        Product book2 = new Books(4, 2f, "Orwell", "La vaca lola");
        Product computer1  = new Computer(5,100f);
        Product computer2  = new Computer(5,100f);
        int eleccion = 3;

        List<Product> productList;
        productList = new ArrayList();

        productList.add(cloth1);
        productList.add(cloth2);
        productList.add(book1);
        productList.add(book2);
        productList.add(computer1);
        productList.add(computer2);


        switch (eleccion){
            case 0:
                for (Product prod : productList){
                    System.out.println(prod);
                }
                break;
            case 1:
                for (Product prod : productList){
                    if (prod instanceof Clothes)
                        System.out.println(prod);
                }
                break;
            case 2:
                for (Product prod : productList){
                    if (prod instanceof Books)
                        System.out.println(prod);
                }
                break;
            case 3:
                for (Product prod : productList){
                    if (prod instanceof Computer)
                        System.out.println(prod);
                }
                break;
            default:
                break;
        }
    }
}