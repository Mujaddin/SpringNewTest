package com.mitrais.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class Ask2 {
	@RequestMapping(value = "/hello",method=RequestMethod.POST)
	  @ResponseBody
	  
	  public String hello(@RequestBody String message) {
		    return "Your message from body: " + message;
		}
	
}
