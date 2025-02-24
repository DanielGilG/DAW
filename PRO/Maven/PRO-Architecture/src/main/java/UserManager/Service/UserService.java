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

    public void updateUser(User user){
        if (userDAO.searchById(user.getId()) == null){
            throw new RuntimeException("User does no exist");
        }
        userDAO.update(user);
    }

    public void deleteUser(int id){
        userDAO.delete(id);
    }

    public List<User> getAll(){
        return userDAO.getAll();
    }

    public User searchById(int id){
        return userDAO.searchById(id);
    }
}
