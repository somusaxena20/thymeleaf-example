package com.somu.controller;

import com.somu.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/about")
    public String about(Model m)
    {

//        PUTTING ALL INFORMATION IN MODEL
        m.addAttribute("Name", "SOMU SAXENA");
        m.addAttribute("LeetCode", "https://www.leetcode.com/somusaxena20");
        return "about";
    }

    @GetMapping("/iterate")
    public String iterateHandler(Model m)
    {

        List<String> l = List.of("Ankit", "Laxmi", "Karan", "Jhon");

        m.addAttribute("name", l);


        return "iterate";
    }


    @GetMapping("/condition")
    public String condition(Model m)
    {

        List<String> l = List.of("Ankit", "Laxmi", "Karan", "Jhon");

        m.addAttribute("name", l);
        m.addAttribute("g", "f");

        return "condition";
    }

    @GetMapping("/footer")
    public String footer(Model m)
    {
        m.addAttribute("name" , "SOMU SAXENA");
        m.addAttribute("branch" , "INFORMATION TECHNOLOGY");
        m.addAttribute("location" , "JABALPUR MADHYA PRADESH");

        return "footer";
    }

    @GetMapping("/service")
    public String service(Model m)
    {
        m.addAttribute("name" , "SOMU SAXENA");
        m.addAttribute("branch" , "INFORMATION TECHNOLOGY");
        m.addAttribute("location" , "JABALPUR MADHYA PRADESH");

        return "service";
    }

    @GetMapping("/newabout")
    public String newAbout()
    {
        return "aboutNew";
    }

}
