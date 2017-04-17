package com.mitrais.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewController {
	
	    @RequestMapping("/newController")
	    @ResponseBody
	    public String hello() {
	        return "Greetings from Spring Boot!";
	    }
	
}
