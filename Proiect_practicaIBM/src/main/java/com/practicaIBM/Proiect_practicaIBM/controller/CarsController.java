package com.practicaIBM.Proiect_practicaIBM.controller;

import com.practicaIBM.Proiect_practicaIBM.model.Cars;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CarsController {

    List<Cars> carsList2=new ArrayList<>();

    @PostConstruct
    public void init(){

        Cars c1= new Cars("BV076764","BMW","seria7",5500,"Sedan",2011,13.1);
        Cars c2= new Cars("BV076764","BMW","seria7",6000,"Sedan",2019,9.5);
        Cars c3=new Cars("BV784754","BMW","seria7",6000,"Sedan",2020,6.4);
        carsList2=new ArrayList<>();
        carsList2.add(c1);
        carsList2.add(c2);
        carsList2.add(c3);

    }

    @GetMapping(value="/cars")
    public String getValue(Model model){
        model.addAttribute("carsList", carsList2);
        return "ListCars";
    }

    //@PostMapping(value="/addcar")
    @RequestMapping(value="/addcars",method = {RequestMethod.POST,RequestMethod.GET})
    public String addCar(@ModelAttribute("cars") Cars car, BindingResult result, Model model){
        if(result.hasErrors()){
            return "error";
        }
        model.addAttribute("cars",car);
        carsList2.add(car);
        return "AddDataCar";

    }




}
