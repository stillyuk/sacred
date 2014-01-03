package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import service.UserService;

public class SystemController extends CustomMultiActionController {
	@Autowired
	private UserService userService;

	public ModelAndView signUp(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (userService.registe(username, password)) {
			return new ModelAndView("login");
		}
		return new ModelAndView("error");
	}

	public ModelAndView signIn(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (userService.login(username, password)) {
			request.getSession().setAttribute("user", username);
			return new ModelAndView("success");
		}
		return new ModelAndView("error");
	}
}
