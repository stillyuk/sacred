package web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("rest")
public class Restful {
	private static Logger logger = Logger.getLogger(Restful.class);
	
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
		logger.debug("debug");
		throw new RuntimeException("runtime");
	}
}
