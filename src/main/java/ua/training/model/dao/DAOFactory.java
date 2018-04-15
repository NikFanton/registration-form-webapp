package ua.training.model.dao;

import ua.training.model.dao.impl.JdbcDAOFactory;

public abstract class DAOFactory  {
    private static DAOFactory daoFactory = null;

    public abstract UserDAO getUserDAO();

    public static DAOFactory getDaoFactory() {
        if (daoFactory == null) {
            synchronized (DAOFactory.class) {
                if (daoFactory == null) {
                    daoFactory = new JdbcDAOFactory();
                }
            }
        }
        return daoFactory;
    }
}
