import java.util.*;

import com.sun.tools.javac.Main;

public class pra02 {
    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);

        int menus = 3; // índice del menú
        String respuestaUsuario; // respuesta del usuario de su nombre
        String respuestaContrasenia; // respuesta del usuarui de su contraseña
        boolean start = false;

        // ---------------------Comienzo del búcle de menús---------------------

        while (stop == false) { // Bucle de menús
            System.out.print("Ingrese nombre + contraseña: ");
            respuestaUsuario = lec.next();
            respuestaContrasenia = lec.next();
            buildMainMenu(checkUser(respuestaUsuario, respuestaContrasenia));

        }
    }

    // ---------------------Métodos---------------------

    public static int checkUser(String user, String password) { // -------------CHEKUSER-------------

        // Usuarios y contraseñas como constantes
        final String usuario = "usuario";
        final String uPassword = "usuario";
        final String admin = "admin";
        final String aPasswod = "admin";

        if (user.equals(admin) && password.equals(aPasswod)) {
            return 1;
        } else if (user.equals(usuario) && password.equals(uPassword)) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void buildMainMenu(int rol) { // -------------MAIN MENU-------------
        String menu3 = "1.- Cambiar nombre usuario%n2.- Cambiar password%n0.- Volver%n-------------------------%nOpción: ";

        // Número de intentos

        if (rol == 0) { // si es user
            buildUserMenu(1, 1);
        } else if (rol == 1) { // si es admin
            buildAdminMenu(1, 1);
        } else {
            intentos++;
            System.out.println("Usuario desconocido, intentalo de nuevo. " + "Intentos:" + intentos);
        }
    }

    public static void buildUserMenu(int nivel, int eleccion) { // -------------USER MENU-------------
        String menu1 = "1.- Películas%n2.- Configuración usuario%n0.- Salir%n-------------------------%nOpción: ";
        String menu2 = "1.- Casablanca%n2.- El padrino%n0.- Volver%n-------------------------%nOpción: ";

        if (nivel == 1) {
            System.out.printf(menu1);
        } else {
            System.out.printf(menu2);
        }
    }

    public static void buildAdminMenu(int nivel, int eleccion) { // -------------ADMIN MENU-------------
        String menu4 = "1.- Administrar películas%n2.- Administrar usuarios%n0.- Salir%n-------------------------%nOpción: ";
        String menu5 = "1.- Añadir película%n2.- Modificar película%n3.- Borrar película%n0.- Volver%n-------------------------%nOpción: ";
        String menu6 = "1.- Añadir usuario%n2.- Borrar usuario%n0.- Volver%n-------------------------%nOpción: ";

        if (nivel == 1) {
            System.out.printf(menu4);
        } else if (nivel == 2) {
            if (eleccion == 1) {
                System.out.printf(menu5);
            } else {
                System.out.printf(menu6);
            }
        }

    }

    public static int intentos = 0; // Número de intentos al login
    public static boolean stop = false; // Fuerza la terminación del programa
    public static int respuesta; // respuesta del usuario de menú

}

//--------------------------PROBLEMS--------------------------
//
// -[y] Problema1: Debo compartir el dato de "int intentos;" entre void main y
// buildMainMenu
//      -> intentos es global
//
//····························································
//
// -[n] Problema2: ¿Cómo hago para usar el Scanner dentro de un método fuera de "void main"?
// El único parámetro que le llega a buildMainMenu es un int. No se puede controlar la navegación
// de los menús de admin y user desde fuera. debe ser desde dentro.
//      -> ¿Crear el objeto dentro del método?
//
//----[y]:solved---[n]:unsolved-------------------------------