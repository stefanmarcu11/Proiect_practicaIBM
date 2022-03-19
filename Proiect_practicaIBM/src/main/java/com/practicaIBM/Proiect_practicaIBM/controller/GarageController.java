package com.practicaIBM.Proiect_practicaIBM.controller;

import com.practicaIBM.Proiect_practicaIBM.model.Garage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class GarageController {
    List<Garage> garageList=new ArrayList<>(Arrays.asList(new Garage("Str. Memorandului", "0754286653", 7),
            new Garage("Str. Lunga", "0787554456",7),
            new Garage("Str. A.I.Cuza", "0723454578", 8)));

    @GetMapping(value="/garageshow")
    public String getIndex(Model model){

        model.addAttribute("garageList", garageList);
        return "ListGarages";

    }
    @RequestMapping(value="/addgarage",method = {RequestMethod.POST,RequestMethod.GET})
    public String addGarage(@ModelAttribute("garage")Garage garage, BindingResult result, Model model){
        if(result.hasErrors()){
            return "error";
        }
        model.addAttribute("garage",garage);
        garageList.add(garage);
        return "AddDataGarage";
    }


}
