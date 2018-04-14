package ua.training.controller.command;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.UserDAO;
import ua.training.model.entity.User;

import javax.servlet.http.HttpServletRequest;

public class Login implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("pass");
        DAOFactory daoFactory = DAOFactory.getDaoFactory(DAOFactory.H2);
        UserDAO dao = daoFactory.getUserDAO();
        User user = dao.getByLogin(login);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println(user);
        } else {
            return "redirect:api/";
        }
        return "/user-page.jsp";
    }
}
