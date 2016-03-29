package com.sapient.ai.media.planner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping(value="/ping", method=RequestMethod.GET)
	@ResponseBody public String ping() {
		return "ping successfull";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	 public String homePage() {
		return "/templates/index.html";
	}
	
	@RequestMapping(value="/d3", method=RequestMethod.GET)
	 public String d3Learning() {
		return "/templates/d3.html";
	}
	
	@RequestMapping(value="/error",method=RequestMethod.GET)
	@ResponseBody public String error() {
		return "Error occured";
	}

}
