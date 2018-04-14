package ua.training.model.dao.impl.h2;

import ua.training.model.dao.UserDAO;
import ua.training.model.entity.User;
import ua.training.model.util.ConnectionConstants;
import ua.training.model.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class H2UserDAOImpl implements UserDAO {
    private static final String SQL_REQUEST_GET_BY_ID = "SELECT * FROM user WHERE id = ";
    private static final String SQL_REQUEST_GET_ALL = "SELECT * FROM user";
    private static final String SQL_REQUEST_GET_BY_LOGIN = "SELECT * FROM USER WHERE USER.LOGIN = ?";

    private Connection connection;

    public H2UserDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        ResultSet rs;
        Statement statement;
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(SQL_REQUEST_GET_ALL);
            while (rs.next()) {
                Long id = rs.getLong("id");
                String login = rs.getString("login");
                String password = rs.getString("password");
                User user = new User(id, login, password);
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void close() throws Exception {
        ConnectionUtil.getConnection().close();
    }

    @Override
    public User getByLogin(String login) {
        try (PreparedStatement ps = connection.prepareStatement(SQL_REQUEST_GET_BY_LOGIN)) {
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            if (rs.first()) {
                Long id = rs.getLong("id");
                String password = rs.getString("password");
                return new User(id, login, password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
