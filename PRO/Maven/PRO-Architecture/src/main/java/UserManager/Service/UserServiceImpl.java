package UserManager.Service;

import UserManager.DAO.UserDAO;

public class UserServiceImpl{
    private UserDAO userDAO;
    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }
}
