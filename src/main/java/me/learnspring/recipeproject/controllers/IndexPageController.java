package me.learnspring.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {

    @RequestMapping({"/","/index"})
    public String getIndexPage() {
        System.out.println("Say bla bla bla bla");
        return "index";
    }
}
