package avlyakulov.timur.book.chapter_3.user.db;

import avlyakulov.timur.book.chapter_3.user.entity.User;

import java.util.Objects;
import java.util.UUID;

public class UserDB {
    private User[] users;
    private static UserDB instance;
    private int current = 0;

    private UserDB() {
        users = new User[10];
    }

    public static UserDB getInstance() {
        if (instance == null) {
            instance = new UserDB();
        }
        return instance;
    }

    public void creatUser(User user) {
        user.setId(generateId());
        if (current == users.length) {
            User[] user1 = new User[users.length + 1];
            System.arraycopy(users, 0, user1, 0, users.length);
            users = user1;
        }
        users[current] = user;
        current++;
    }

    public void updateUser(User user) {
        User current = findById(user.getId());
        current.setAge(user.getAge());
        current.setName(user.getName());
    }

    public void delete(String id) {
        int current = 0;
        for (int i = 0; i < users.length; ++i)
            if (Objects.equals(users[i].getId(), id))
                current = i;

        users[current] = null;
        User[] temp = new User[users.length - 1];
        for (int i =0 ; i < users.length - 1; ++i)
            if (users[i] != null)
                temp[i] = users[i];
        for (int i = 0; i < users.length - 1; ++i)
            users[i] = temp[i];
        --this.current;
    }
    public User findById (String id) {
        int current = 0;
        for (int i = 0; i < users.length; ++i)
            if (Objects.equals(users[i].getId(), id))
                current = i;
        return users[current];
    }
    public User[] findAll () {
        return users;
    }
    public String generateId () {
        return UUID.randomUUID().toString();
    }
}