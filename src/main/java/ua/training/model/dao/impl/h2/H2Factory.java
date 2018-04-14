package ua.training.model.dao.impl.h2;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.UserDAO;
import ua.training.model.util.ConnectionUtil;

import java.sql.SQLException;

public class H2Factory extends DAOFactory {
    @Override
    public UserDAO getUserDAO() {
        try {
            return new H2UserDAOImpl(ConnectionUtil.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
