package org.launchocode.controllers;

import javax.servlet.http.HttpServletRequest;

import org.launchocode.models.HelloMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello(HttpServletRequest request){
		
		// get name name parameter from request will be null if there is no parameter
		String name = request.getParameter("name");
		if(name==null){
			name = "world";
		}
		return "<h1>" +HelloMessage.getMessage(name)+"</h1>";
	}
}
