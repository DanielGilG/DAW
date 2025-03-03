package UserManager.DAO;

import UserManager.Model.User;

import java.util.List;

public interface UserDAO {
    abstract void create (User user);
    abstract List<User> getAll ();
    abstract User searchById (int id);
}