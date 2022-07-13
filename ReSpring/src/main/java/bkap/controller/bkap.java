package bkap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bkap")
public class bkap {
	
	@RequestMapping(value = {"","/"})
	public String welcome() {
		return "welcome";
	}
}
