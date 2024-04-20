package com.site.learning.controllers;

import com.site.learning.models.UserDtls;
import com.site.learning.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/signin")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/createUser")
    public String createuser(@ModelAttribute UserDtls user, RedirectAttributes redirectAttributes) {

        boolean emailExists = userService.checkEmail(user.getEmail());
        if (emailExists) {
            redirectAttributes.addFlashAttribute("msg", "Email id already exists");
        } else {
            UserDtls userDtls = userService.createUser(user);
            if (userDtls != null) {
                redirectAttributes.addFlashAttribute("msg", "Register Successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Something wrong in server!");
            }
        }

        return "redirect:/register";
    }

}