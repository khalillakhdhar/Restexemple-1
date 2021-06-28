package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyController {
@GetMapping("/home")
public String hello()
{
return "hello spring";	
}
@GetMapping("")
public ModelAndView homepage()
{
	ModelAndView m=new ModelAndView("home.html");
	return m;
}
}
