package com.practicaIBM.Proiect_practicaIBM.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HoneController {

    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String home() {
        return "home";
    }

}
