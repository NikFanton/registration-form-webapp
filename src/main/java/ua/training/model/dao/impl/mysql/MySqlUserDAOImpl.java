package ua.training.model.dao.impl.mysql;

import ua.training.model.dao.UserDAO;
import ua.training.model.entity.User;

import java.util.List;

public class MySqlUserDAOImpl implements UserDAO {
    @Override
    public void add(User user) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public User getByLogin(String login) {
        return null;
    }
}
