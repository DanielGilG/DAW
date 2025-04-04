package UserManager.DAO;

import UserManager.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    ArrayList<User> userList = new ArrayList<>();

    @Override
    public void create(User user) {
        userList.add(user);
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public User searchById(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                return userList.get(id);
            }
        }
        return null;
    }
}
