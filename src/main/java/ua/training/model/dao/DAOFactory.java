package ua.training.model.dao;

import ua.training.model.dao.impl.h2.H2Factory;
import ua.training.model.dao.impl.mysql.MySqlFactory;

public abstract class DAOFactory  {
    public static final int MYSQL = 1;
    public static final int H2 = 2;

    public static DAOFactory daoFactory = null;
    public abstract UserDAO getUserDAO();

    public static DAOFactory getDaoFactory(int factoryName) {
        if (factoryName == MYSQL) {
            return new MySqlFactory();
        } else if (factoryName == H2) {
            return new H2Factory();
        } else {
            throw new RuntimeException("Factory with name " + factoryName + " does not exist");
        }
    }
}
