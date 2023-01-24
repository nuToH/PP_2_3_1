package web.dao;


import web.model.User;

import java.util.List;

public interface UserDAO {


    void add(User user);
    List<User> getList();
    User getUser(long id);
    void deleteUser(long id);
    void editUser(User user);
}
