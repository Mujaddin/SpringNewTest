package com.mitrais.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class Ask3 {
	@RequestMapping(value = "/hello/{message}",method=RequestMethod.PUT)
	  @ResponseBody
	public String hello(@PathVariable String message) {
	 
	    return "Your message from path is: " + message;
	}
	
}
