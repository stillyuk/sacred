package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("rest")
public class Restful {
	
	/*
	 * 
	 */
	@RequestMapping("/{id}")
	public ModelAndView restful(@PathVariable int id) {
		throw new RuntimeException("runtime");
	}
}
