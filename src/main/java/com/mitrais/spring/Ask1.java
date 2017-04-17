package com.mitrais.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

@Controller
public class Ask1 {
	
	    @RequestMapping(value="/hello", method=RequestMethod.GET)
	    @ResponseBody

	    public String hello(
	            @RequestParam(value = "message", defaultValue = "Hello Spring")
	            String message
	        ) {
	            return "Your message: " + message;
	    }
	    
}
