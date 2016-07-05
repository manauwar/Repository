package com.manauwar.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.manauwar.springmvc.form.Contact;


@Controller
@SessionAttributes
public class MainController {

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public ModelAndView addContact(@ModelAttribute("contact")Contact contact, BindingResult result) {
		
		System.out.print("First Name:" + contact.getFirstname() + "Last Name:" + contact.getLastname());
		System.out.println("Email:" + contact.getEmail() + "Telepohone:" + contact.getTelephone());
		
//		return "redirect:contacts.html";
		String message = "First Name:" + contact.getFirstname() + "\n Last Name:" + contact.getLastname()+
				"\nEmail:" + contact.getEmail() + "\nTelepohone:" + contact.getTelephone();
		return new ModelAndView("hello", "message",message);
	}
	
	
	
	@RequestMapping("/contacts")
	public ModelAndView showContacts() {
		
		return new ModelAndView("contact", "command", new Contact());
	}
	
	@RequestMapping("/main")
	public String goToMain() {
		
		return "main";
	}
	
	@RequestMapping(value = "/login")
    public String login(ModelMap model) {
		System.out.println("Inside login controller");
        return "login";
    }
	
	 @RequestMapping(value = "/logout", method = RequestMethod.GET)
	    public String logout() {
		 System.out.println("Inside logout controller");
	        return "logout";
	    }
	 
	 @RequestMapping(value = "/secured/normalUser", method= RequestMethod.GET)  
		public String NormalUser() {  

		 System.out.println("Inside NormalUser controller");
			return "/secured/normalUser";
		}
	 
	 @RequestMapping(value = "/supersecured/superUser", method= RequestMethod.GET)  
		public String SuperUser() {  
		 System.out.println("Inside SuperUser controller");

			return "/supersecured/superUser";
		}
	 
}