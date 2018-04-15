package ua.training.model.service;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.impl.JdbcDAOFactory;
import ua.training.model.entity.User;

import java.util.List;

public class UserService {
    private DAOFactory daoFactory = new JdbcDAOFactory();

    public boolean isLoginExist (String login) {
        return daoFactory.getUserDAO().getByLogin(login) != null;
    }

    public void addUser(String login, String password) {
        daoFactory.getUserDAO().add(new User(login, password));
    }

    public List<String> getAllLogins() {
        return daoFactory.getUserDAO().getAllLogin();
    }

    public List<User> getAllUsers () {
        return daoFactory.getUserDAO().getAll();
    }
}
