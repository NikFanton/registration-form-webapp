package ua.training.model.dao.impl.mysql;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.UserDAO;

public class MySqlFactory extends DAOFactory {
    @Override
    public UserDAO getUserDAO() {
        return new MySqlUserDAOImpl();
    }
}
