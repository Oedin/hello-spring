package org.launchocode.controllers;

import javax.servlet.http.HttpServletRequest;

import org.launchocode.models.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloForm(){
		return "helloform";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello(HttpServletRequest request, Model model){
		
		// get name name parameter from request will be null if there is no parameter
		String name = request.getParameter("name");
		if(name==null || name==""){
			name = "world";
		}
		model.addAttribute("name", name);
		return "hello";
	}
}
