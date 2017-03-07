package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
 
	 @RequestMapping(value="/demo")
	 public String view(){
	 return "demo";
 }
}
