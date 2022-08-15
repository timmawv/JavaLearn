package avlyakulov.timur.epam.chapter_3.user.dao;

import avlyakulov.timur.epam.chapter_3.user.db.UserDB;
import avlyakulov.timur.epam.chapter_3.user.entity.User;

public class UserDao {
    public void create(User user) {
        UserDB.getInstance().creatUser(user);
    }

    public void delete(String id) {
        UserDB.getInstance().delete(id);
    }

    public void update(User user) {
        UserDB.getInstance().updateUser(user);
    }

    public User findById(String id) {
        return UserDB.getInstance().findById(id);
    }

    public User[] findAll() {
        return UserDB.getInstance().findAll();
    }
}
