import java.util.*;

public class pra12 {

    static String menu1 = "1.- Películas%n2.- Configuración usuario%n0.- Salir%n-------------------------%nOpción: ";
    static String menu2 = "1.- Casablanca%n2.- El padrino%n0.- Volver%n-------------------------%nOpción: ";
    static String menu3 = "1.- Cambiar nombre usuario%n2.- Cambiar password%n0.- Volver%n-------------------------%nOpción: ";
    static String menu4 = "1.- Administrar películas%n2.- Administrar usuarios%n0.- Salir%n-------------------------%nOpción: ";
    static String menu5 = "1.- Añadir película%n2.- Modificar película%n3.- Borrar película%n0.- Volver%n-------------------------%nOpción: ";
    static String menu6 = "1.- Añadir usuario%n2.- Borrar usuario%n0.- Volver%n-------------------------%nOpción: ";

    final static String admin = "admin"; // correct string
    final static String user = "user"; // correct string

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        boolean stop = false;

        String enteredName; // what the user enters
        String enteredPasword; // what the user enters
        int option; // the option the user enters in a menu
        byte intentos = 0; // trials
        boolean logged = false; // if the user is logged in

        // -------- FIRST LOGIN WINDOW --------
        System.out.print("Ingrese su usuaruio y contraseña: ");
        enteredName = lec.next();
        enteredPasword = lec.next();
        intentos++;

        while (checkUser(enteredName, enteredPasword) == -1) {
            System.out.println("Usuario deconocido. Por favor, pruebe de nuevo.");
            System.out.println("Tiene " + intentos + "/3 intentos");
        }

    }

    public static int checkUser(String user, String password) {
        // returns: 0 if user. 1 if admin. -1 if incorrect

        if (user.equals(user) && password.equals(user)) {
            return 0;
        }else if (user.equals(admin) && password.equals(admin)) {
            return 1;
        }else{
            return -1;
        }
    }

    public static void buildMainMenu(int nivel, int opcion){
        
    }
}