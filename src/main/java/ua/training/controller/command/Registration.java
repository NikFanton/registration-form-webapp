package ua.training.controller.command;

import ua.training.model.service.UserService;

import javax.servlet.http.HttpServletRequest;

public class Registration implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        String newLogin = request.getParameter("reg-login");
        String newPassword = request.getParameter("reg-pass");
        UserService userService = new UserService();
        if (userService.isLoginExist(newLogin)) {
            return "redirect:api/";
        } else {
            userService.addUser(newLogin, newPassword);
        }
        userService.getAllUsers().forEach(System.out::println);
        return "/user-page.jsp";
    }
}
