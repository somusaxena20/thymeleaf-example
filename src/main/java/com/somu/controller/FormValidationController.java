package com.somu.controller;

import com.somu.entity.LoginData;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/valid")
public class FormValidationController {

    @GetMapping("/form")
    public String form(Model m)
    {
        m.addAttribute("data", new LoginData());
        return "form";
    }

    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData data, BindingResult rs)
    {

        if (rs.hasErrors())
        {
            System.out.println(rs);
            return "form";
        }

        System.out.println(data);

        return "success";
    }
}
