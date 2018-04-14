package ua.training.model.dao;

import ua.training.model.entity.User;

public interface UserDAO extends GenericDAO<User, Long> {
    User getByLogin(String login);
}
