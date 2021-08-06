package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUserList();

    void add(User user);

    void delete(int id);

    void update(User user);

    User getUserById(int id);

    User getUserByName(String name);
}
