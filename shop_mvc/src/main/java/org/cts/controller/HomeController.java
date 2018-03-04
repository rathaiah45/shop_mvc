package org.cts.controller;

import java.security.Principal;

import org.cts.domain.CustomUser;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String helloWorld(ModelMap model) {
		model.addAttribute("message", "Welcome to the Hello World page");
		return "helloworld";

	}

	@RequestMapping(value = "/regi", method = RequestMethod.GET)
	public String helloWorld1(ModelMap model) {
		model.addAttribute("message", "Welcome to the Hello World page");
		return "registration";

	}

	@RequestMapping(value = "/secured/home", method = RequestMethod.GET)
	public String securedHome(ModelMap model,Principal principal) {
		//Object principal = SecurityContextHolder.getContext()
				//.getAuthentication().getPrincipal();
		CustomUser user = null;
		if (principal instanceof CustomUser) {
			user = ((CustomUser) principal);
		}

		String name = user.getUsername();
		model.addAttribute("username", name);
		model.addAttribute("message", "Welcome to the secured page");
		return "home";

	}
}
