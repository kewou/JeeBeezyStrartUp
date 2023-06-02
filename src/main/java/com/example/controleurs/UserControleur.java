package com.example.controleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.services.UserService;

@RestController
@RequestMapping("/users")
public class UserControleur {
	
	private UserService userService;
	
    @Autowired
    public UserControleur(UserService userService) {
        this.userService = userService;
    }

	@GetMapping("/justOne")
	public ModelAndView  getOneUser() {
		ModelAndView modelAndView = new ModelAndView("user");				
		return modelAndView;
	}
	
	@GetMapping
	public ModelAndView  getAllUser() {
		ModelAndView modelAndView = new ModelAndView("users");
		// Ajoutez des objets à transmettre à la vue si nécessaire
		
		modelAndView.addObject("userList", userService.getAllUsers());
		return modelAndView;
	}

}
