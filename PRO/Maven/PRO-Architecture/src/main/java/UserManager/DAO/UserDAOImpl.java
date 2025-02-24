package UserManager.DAO;

import UserManager.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    ArrayList<User> userList = new ArrayList<>();

    public UserDAOImpl(ArrayList<User> userList) {
        this.userList = userList;

        userList.add(new User(1, "Max", "maxmueller@example.com"));
        userList.add(new User(2, "Hans", "hansxmueller@example.com"));
        userList.add(new User(3, "Erika", "erikamueller@example.com"));
        userList.add(new User(4, "Veronika", "vermueller@example.com"));
    }

    @Override
    public void create(User user) {
        userList.add(user);
    }

    @Override
    public void update(User user) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == user.getId()){
                userList.set(i, user);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.remove(id);
                return;
            }
        }
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
