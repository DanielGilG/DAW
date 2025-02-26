package UserManager;

import UserManager.DAO.UserDAO;
import UserManager.DAO.UserDAOImpl;
import UserManager.Model.User;
import UserManager.Service.UserService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();
        UserService userService = new UserService(userDAO);

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("=====Gestion de Usuario====");
            System.out.println("1. Crear usuarios");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Actualizar usuarios");
            System.out.println("4. Eliminar usuarios");
            System.out.println("5. Buscar usuarios");
            System.out.println("6. Salir");
            System.out.println("Introduce una opción: ");
            option = Integer.parseInt((scanner.nextLine()));
        }while (option != 6);{
            switch (option){
                case 1:
                    System.out.println("Intrudice un ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Intrudice un Nombre: ");
                    String name = scanner.nextLine();
                    System.out.println("Intrudice un Email: ");
                    String email = scanner.nextLine();

                    User newUser = new User(id, name, email);
                    userService.createUser(newUser);
                    System.out.println("Usuario creado");
                    break;
                case 2:
                    List<User> userList = userService.getAll();
                    userList.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Introduce el ID del ususario a actualizar: ");
                    int idUpdate = scanner.nextInt();
                    System.out.println("Nuevo nombre: ");
                    String newname = scanner.nextLine();
                    System.out.println("Nuevo email: ");
                    String newemail = scanner.nextLine();
                    User user = new User(idUpdate,newname,newemail);
                    userService.updateUser(user);
                    System.out.println("Ususario Actualizado");
                    break;
                case 4:
                    System.out.println("Introduce el ID del usuario a eliminar: ");
                    int idDelete = scanner.nextInt();
                    userService.deleteUser(idDelete);
                    System.out.println("Usuario eliminado");
                    break;
                case 5:
                    System.out.println("Indtroduce el ID del usuario a buscar: ");
                    int idSearch = scanner.nextInt();
                    System.out.println(userService.searchById(idSearch));
            }
        }
    }
}
