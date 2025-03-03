package UserManager.Controller;

import UserManager.Service.UserService;

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        // Dependencies Injector
        this.userService = userService;
    }

    public void addUser(int id, String name, String email) {
        //blablablabla
    }

}
