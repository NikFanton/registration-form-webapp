package ua.training.model.dao.impl.h2;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.UserDAO;
import ua.training.model.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class H2Factory extends DAOFactory {
    @Override
    public UserDAO getUserDAO() {
        return new H2UserDAOImpl();
    }

    public static Connection getConnection() throws SQLException {
            return ConnectionUtil.getConnection();
    }
}
