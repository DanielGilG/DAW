import java.util.*;

public class pra11 {

    static String menu1 = "1.- Películas%n2.- Configuración usuario%n0.- Salir%n-------------------------%nOpción: ";
    static String menu2 = "1.- Casablanca%n2.- El padrino%n0.- Volver%n-------------------------%nOpción: ";
    static String menu3 = "1.- Cambiar nombre usuario%n2.- Cambiar password%n0.- Volver%n-------------------------%nOpción: ";
    static String menu4 = "1.- Administrar películas%n2.- Administrar usuarios%n0.- Salir%n-------------------------%nOpción: ";
    static String menu5 = "1.- Añadir película%n2.- Modificar película%n3.- Borrar película%n0.- Volver%n-------------------------%nOpción: ";
    static String menu6 = "1.- Añadir usuario%n2.- Borrar usuario%n0.- Volver%n-------------------------%nOpción: ";

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        boolean stop = false;
        int menus = 0;

        String admin = "admin"; // correct string
        String user = "user"; // correct string
        String enteredName; // what the user enters
        String enteredPasword; // what the user enters
        int option; // the option the user enters in a menu
        byte intentos = 0; // trials
        boolean crecentials = false; // if its admin or user. [true=admin] [false=user]
        boolean logged = false; // if the user is logged in

        // -------- FIRST LOGIN WINDOW --------
        while (logged == false && intentos < 3) {
            System.out.printf("Ingrese su usuario y contraseña: ");
            enteredName = lec.next();
            enteredPasword = lec.next();
            if (enteredName.equals(admin) && enteredPasword.equals(admin)) { // person is ADMIN
                crecentials = true;
                logged = true;
                menus = 4;
            } else if (enteredName.equals(user) && enteredPasword.equals(user)) { // person is USER
                crecentials = false;
                logged = true;
                menus = 1;
            } else {
                intentos++;
                System.out.println("Usuario desconocido. Por favor, pruebe de nuevo.");
                System.out.println("Tiene " + intentos + "/3 intentos");
            }
        }

        // -------- ADMIN MENU LOOP WINDOWS --------
        while (stop == false && crecentials == true) {
            getMenu(menus);
            option = lec.nextInt();

            if (menus == 4) {
                switch (option) {
                    case 0:
                        stop = true;
                        break;
                    case 1:
                        menus = 5;
                        break;
                    case 2:
                        menus = 6;
                        break;
                }
            } else if (menus == 6 || menus == 5) {
                if (option == 0) {
                    menus = 4;
                }
            }
        }

        // -------- USER MENU LOOP WINDOWS --------
        while (stop == false && crecentials == false) {
            getMenu(menus);
            option = lec.nextInt();

            if (menus == 1) {
                switch (option) {
                    case 0:
                        stop = true;
                        break;
                    case 1:
                        menus = 2;
                        break;
                    case 2:
                        menus = 3;
                        break;
                }
            }

            if (menus == 2) {
                switch (option) {
                    case 0:
                        menus = 1;
                        break;
                }
            }
        }

        if (intentos == 3) {
            System.out.println("-------- ERROR:Login_cancelled--------");
        }
    }

    public static void getMenu(int menu) { //Method for printing the derired menu
        switch (menu) {
            case 1:
                System.out.printf(menu1);
                break;
            case 2:
                System.out.printf(menu2);
                break;
            case 3:
                System.out.printf(menu3);
                break;
            case 4:
                System.out.printf(menu4);
                break;
            case 5:
                System.out.printf(menu5);
                break;
            case 6:
                System.out.printf(menu6);
                break;
        }
    }
}
