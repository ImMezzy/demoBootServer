package ru.rutmiit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping(value = "/", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String home() {
        return "Система управления компаниями. Откройте /companies";
    }
}
