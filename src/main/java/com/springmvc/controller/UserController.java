package com.springmvc.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class UserController {
 
 private Map<Long, User> users = new ConcurrentHashMap<Long, User>();
 
 @RequestMapping(method = RequestMethod.GET)
 public String toRegister(Model model){
 model.addAttribute(new User());
 return "user_register";
 }
 
 @RequestMapping(value="register",method = RequestMethod.POST)
 public String register(Model model,@Valid User user,BindingResult result){
 if (result.hasErrors()) {
 return "user_register";
 }
 this.users.put(user.assignId(), user);
 return "redirect:/user/"+user.getId();
 }
 
 @RequestMapping(value="{id}", method=RequestMethod.GET)
 public String getView(@PathVariable Long id, Model model) {
 User user = this.users.get(id);
 if (user == null) {
 //@TODO
 }
 model.addAttribute(user);
 return "user_view";
 }
}