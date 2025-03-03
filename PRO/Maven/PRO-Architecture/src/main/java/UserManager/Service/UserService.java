package UserManager.Service;

import UserManager.DAO.UserDAO;
import UserManager.Model.User;

import java.util.List;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO){
       this.userDAO = userDAO;
    }

    public void createUser(User user){
        userDAO.create(user);
    }

    public List<User> getAll(){
        return userDAO.getAll();
    }

    public User searchById(int id){
        return userDAO.searchById(id);
    }
}
