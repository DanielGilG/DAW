package front;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        Menu.show();
        int option = lec.nextInt();

        while (option != 0) {
            if (option != 0){
                request(option);
            }
            Menu.show();
            option = lec.nextInt();
        }
    }

    public static void request(int option){
        System.out.println("haciendo peticion al servidor");
        back.App.response(option);
    }
}