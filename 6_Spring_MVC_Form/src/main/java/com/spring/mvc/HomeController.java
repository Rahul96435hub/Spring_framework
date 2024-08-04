package com.spring.mvc;

import java.awt.font.ImageGraphicAttribute;
import java.lang.reflect.Method;
import java.nio.file.Path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@RequestMapping(path = "createUser" , method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user ,@RequestParam("img") String im)
	
	{
		System.out.println("Image :" +im);
		System.out.println(user);
		return "register";
	}
 

}
