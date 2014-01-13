package web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.UserService;
import domain.User;

@Controller
@RequestMapping("rest")
public class Restful {
	private static Logger logger = Logger.getLogger(Restful.class);

	@Autowired
	private UserService userServiceImpl;

	/*
	 * 
	 */
	@RequestMapping
	public void index() {
		logger.info("index");
	}

	/*
	 * 
	 */
	@RequestMapping(value="/{id}" ,method=RequestMethod.DELETE)
	public ModelAndView restful(@PathVariable String id) {
		User user = new User();
		userServiceImpl.login(user);
		throw new RuntimeException("spring mail exception");
	}
}
