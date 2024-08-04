package com.spring.mvc.controller;

import java.awt.font.ImageGraphicAttribute;
import java.lang.reflect.Method;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.entity.User;
import com.spring.mvc.service.UserService;


@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
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
	public String registerUser(@ModelAttribute User user ,@RequestParam("img") String im, Model m)
	
	{
		 //System.out.println(user);
		user.setImage(im);
		userService.saveUser(user);
		return "success";
	}
 

}
