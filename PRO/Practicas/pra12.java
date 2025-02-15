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
        int level = 0; // level of menu depth
        byte intentos = 0; // trials
        boolean logged = false; // if the user is logged in

        // -------- FIRST LOGIN WINDOW --------
        System.out.print("Ingrese su usuaruio y contraseña: ");
        enteredName = lec.next();
        enteredPasword = lec.next();
        intentos++;

        // --------- LOOP ON LOGIN IF UNKNOWN USER ---------
        while (checkUser(enteredName, enteredPasword) == -1 && intentos < 3) {
            System.out.println("Usuario deconocido. Por favor, pruebe de nuevo.");
            System.out.println("Tiene " + intentos + "/3 intentos");
            intentos++;
            enteredName = lec.next();
            enteredPasword = lec.next();
        }

        // ---------- SET THE LOGGED STATUS ----------
        if (checkUser(enteredName, enteredPasword) == 0 || checkUser(enteredName, enteredPasword) == 1) {
            logged = true;
            buildMainMenu(checkUser(enteredName, enteredPasword)); // Print just the menu needed ONCE
        } else {
            logged = false;
        }

        level = 1;

        // ---------- MENUS LOOP ----------
        while (logged && stop == false) {
            option = lec.nextInt();

            switch (checkUser(enteredName, enteredPasword)) {
                // Demasiadas cosas al añadir "level"

                case 0: // caso de USER

                    if (level == 1) {
                        if (option == 1){
                            level = 2;
                        }else if (option == 2){
                            level = 2;
                        }else if (option == 0){
                            logged = false;
                            stop = true;
                        }
                    }else if (level == 2){
                        if (option == 0){
                            level = 1;
                        }
                    }
                    
                    if (logged) {
                        buildUserMenu(level, option);
                        System.out.printf("%n%nlevel=%d", level);
                    }

                    break;

                case 1: // caso de ADMIN

                   //someting

                    if (logged) {
                        buildAdminMenu(level, option);
                        System.out.printf("%n%nlevel=%d", level);
                    }

                    break;
            }
        }
    }

    // ------------------------------- METHODS -------------------------------
    public static int checkUser(String inuser, String inpassword) {
        // returns: 0 if user. 1 if admin. -1 if incorrect

        if (inuser.equals(user) && inpassword.equals(user)) {
            return 0;
        } else if (inuser.equals(admin) && inpassword.equals(admin)) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void buildMainMenu(int rol) { // JUST PRINT IT, DON'T TOUCH IT!!
        if (rol == 0) {
            System.out.printf(menu1);
        } else if (rol == 1) {
            System.out.printf(menu4);
        } else {
            System.out.println("Error:Cannot buil menu");
        }
    }

    public static void buildUserMenu(int nivel, int opcion) { // JUST PRINT IT, DON'T TOUCH IT!!
        if (nivel == 1) {
            System.out.printf(menu1);
        } 
        if (nivel == 2) {
            if (opcion == 1) {
                System.out.printf(menu2);
            } else if (opcion == 2) {
                System.out.printf(menu3);
            }
        }
    }

    public static void buildAdminMenu(int nivel, int opcion) { // JUST PRINT IT, DON'T TOUCH IT!!
        if (nivel == 1) {
            System.out.printf(menu4);
        } 
        if (nivel == 2) {
            if (opcion == 1) {
                System.out.printf(menu5);
            } else if (opcion == 2) {
                System.out.printf(menu6);
            }
        }
    }
}