package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import service.UserService;

public class SystemController extends MultiActionController {
	@Autowired
	private UserService userService;
	
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("login");
	}
	
	public ModelAndView registe(HttpServletRequest request, HttpServletResponse response) {
		if (userService.login("admin", "admin"))
			return new ModelAndView("success");
		return new ModelAndView("index");
	}

	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, String username, String password) {
		if (userService.login(username, password))
			return new ModelAndView("success");
		return new ModelAndView("login");
	}
}
