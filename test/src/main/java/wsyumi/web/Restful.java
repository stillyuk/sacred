package wsyumi.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import wsyumi.domain.User;
import wsyumi.service.UserService;

@Controller
@RequestMapping("rest")
public class Restful {

	Logger logger = LogManager.getLogger();

	@Autowired
	private UserService userServiceTransaction;

	/**
	 * 
	 */
	@RequestMapping
	public void index() {
		logger.info("index");
	}

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ModelAndView restful(@PathVariable String id) {
		User user = new User();
		userServiceTransaction.login(user);
		throw new RuntimeException("spring mail exception");
	}
}
