import java.util.*;

public class pra02 {
    public static void main(String[] args) {
        String menu1 = "1.- Películas%n2.- Configuración usuario%n0.- Salir%n-------------------------%nOpción: ";
        String menu2 = "1.- Casablanca%n2.- El padrino%n0.- Volver%n-------------------------%nOpción: ";
        String menu3 = "1.- Cambiar nombre usuario%n2.- Cambiar password%n0.- Volver%n-------------------------%nOpción: ";
        String menu4 = "1.- Administrar películas%n2.- Administrar usuarios%n0.- Salir%n-------------------------%nOpción: ";
        String menu5 = "1.- Añadir película%n2.- Modificar película%n3.- Borrar película%n0.- Volver%n-------------------------%nOpción: ";
        String menu6 = "1.- Añadir usuario%n2.- Borrar usuario%n0.- Volver%n-------------------------%nOpción: ";

        Scanner lec = new Scanner(System.in);

        boolean stop = false;
        int menus = 1;
        int respuesta;
        String nombre = "x";
        String password = null;
        String correctPassword = "admin";
        byte intentos = 1;

        while (stop == false && intentos < 3) { //Bucle de menús 
            if (menus == 1) {  //-----------------MENU 1-----------------
                System.out.printf("%n%n%n");
                System.out.printf(menu1);
                respuesta = lec.nextInt();

                switch (respuesta) {
                    case 0:
                        System.out.println("¡¡Hasta luego!!");
                        stop = true;
                        break;
                    case 1:
                        menus = 2;
                        break;
                    case 2:
                        menus = 3;
                        break;
                }
            }else if (menus == 2) { //-----------------MENU 2-----------------
                System.out.printf("%n%n%n");
                System.out.printf(menu2);
                respuesta = lec.nextInt();
                switch (respuesta) {
                    case 0:
                        menus = 1;
                        break;
                
                    default:
                        break;
                }
                
            }else if (menus == 3) { //-----------------MENU 3-----------------1: cambiar nombre | 2: cambiar password
                System.out.printf("%n%n%n");
                System.out.printf(menu3);
                respuesta = lec.nextInt();
                
                switch (respuesta) {
                    case 0:
                        menus = 1;
                        break;
                    case 1:
                        nombre = lec.next();
                        System.out.println("NOMBRE CAMBIADO");
                        respuesta = 2;
                    case 2:
                        password = lec.next();
                        while (!password.equals(correctPassword) && intentos < 3) {
                            System.out.println("Contraseña incorrecta, pruebe de nuevo.");
                            password = lec.next();
                            intentos++;
                        }
                        menus = 4;
                        System.out.println("CONTRASEÑA CAMBIADA");
                        break;
                }

                if (nombre.equals("admin")) {
                    menus = 4;
                } else{
                    menus = 1;
                }

            }else if (menus == 4) { //-----------------MENU 4-----------------
                System.out.printf("%n%n%n");
                System.out.printf(menu4);
                respuesta = lec.nextInt();

                switch (respuesta) {
                    case 0:
                        stop = true;
                        System.out.println("¡¡Hasta luego!!");
                        break;
                
                    case 1:
                        menus = 5;
                        break;
                    case 2:
                        menus = 6;
                        break;
                }
                
            }else if (menus == 5) { //-----------------MENU 5-----------------
                System.out.printf("%n%n%n");
                System.out.printf(menu5);
                respuesta = lec.nextInt();

                switch (respuesta) {
                    case 0:
                        menus = 4;
                        break;
                
                    default:
                        break;
                }

            }else if (menus == 6) { //-----------------MENU 6-----------------
                System.out.printf("%n%n%n");
                System.out.printf(menu6);
                respuesta = lec.nextInt();
                
                switch (respuesta) {
                    case 0:
                        menus = 4;
                        break;
                
                    default:
                        break;
                }
            }
            
            if (intentos >= 3) {
                System.out.println("------ERROR_101------");
                System.out.println("intentos: " + intentos);
            }
        }
    }

    public int checkUser(String user, String password){

        if (user.equals("daniel") && password.equals("daniel")) {
            return 0; //Credenciales correctas y usuaio = USER
        }
        if (user.equals("admin") && password.equals("admnin")) {
            return 1; //Credenciales correctas y rol de ADMIN
        }
        else{
            return -1;
        }


    }

    public void buildMainMenu(String ususario, String password){
        //Menu 3
    }

    public void buildUserMenu(int nivel, int eleccion){
        //Menu 1
        //Menu 2
    }

    public void buildAdminMenu(int nivel, int eleccion){
        //Menu 4
        //Menu 5
        //Menu 6
    }
}