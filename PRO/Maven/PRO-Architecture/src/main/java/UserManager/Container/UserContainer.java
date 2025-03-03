package UserManager.Container;

import UserManager.DAO.UserDAO;
import UserManager.DAO.UserDAOImpl;
import UserManager.Service.UserService;

public class UserContainer {
    private static UserDAO userDAO;
    private static UserService userService;

    public static UserService getUserService(){
        if (userService == null){
            userService = new UserService(getUserDAO());
        }
       return userService;
    }

    public static UserDAO getUserDAO(){
        if (userDAO == null){
            userDAO = new UserDAOImpl();
        }
       return userDAO;
    }
}
