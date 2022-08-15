package avlyakulov.timur.epam.chapter_3.user.service;

import avlyakulov.timur.epam.chapter_3.user.dao.UserDao;
import avlyakulov.timur.epam.chapter_3.user.entity.User;

public class UserService {
    private final UserDao userDao = new UserDao();

    public void create(User user) {
        userDao.create(user);
    }

    public void delete(String id) {
        userDao.delete(id);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public User findById(String id) {
        return userDao.findById(id);
    }

    public User[] findAll() {
        return userDao.findAll();
    }
}