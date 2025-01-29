package back;

public class App {
    public static void response(int option) {
        if (option != 1){
            System.out.println("404.- Recurso no encontrado");
        }
        if (option == 1){
            back.controller.CustomerController.findAll();
        }
    }
}