package web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SystemController extends MultiActionController {
	
	public ModelAndView registe(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("index");
	}

	public ModelAndView login() {
		System.out.println("testController");
		return new ModelAndView("login");
	}
}
