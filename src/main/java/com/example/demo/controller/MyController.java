package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/home")
public String hello()
{
return "hello spring";	
}
@GetMapping("")
public String homepage()
{
return "je suis un controller";	
}
}
