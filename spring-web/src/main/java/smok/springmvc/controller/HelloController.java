package smok.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("spring", "spring mvc");
		mv.setViewName("hello");
		return mv;
	}

	@RequestMapping("/hello1")
	public ModelAndView hello1() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("spring", "spring mvc");
		mv.setViewName("hello1");
		return mv;
	}

	@RequestMapping("/hello2")
	public ModelAndView hello2() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("spring", "spring mvc");
		mv.setViewName("hello2");
		return mv;
	}

}
