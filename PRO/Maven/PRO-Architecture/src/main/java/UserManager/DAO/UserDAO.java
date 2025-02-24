package UserManager.DAO;

import UserManager.Model.User;

import java.util.List;

public interface UserDAO {
    abstract void create (User user);
    abstract void update (User user);
    abstract void delete (int id);
    abstract List<User> getAll ();
    abstract User searchById (int id);
}
