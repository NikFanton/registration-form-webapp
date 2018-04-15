package ua.training.model.dao.impl;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.UserDAO;
import ua.training.model.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcDAOFactory extends DAOFactory {
    @Override
    public UserDAO getUserDAO() {
        return new JdbcUserDAOImpl();
    }

    public static Connection getConnection() throws SQLException {
            return ConnectionUtil.getConnection();
    }
}
