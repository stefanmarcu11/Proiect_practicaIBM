package com.practicaIBM.Proiect_practicaIBM.controller;

import com.practicaIBM.Proiect_practicaIBM.exception.NotFoundException;
import com.practicaIBM.Proiect_practicaIBM.model.Cars;
import com.practicaIBM.Proiect_practicaIBM.model.CarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping(value="/cars/{regnumber}")
@RequiredArgsConstructor
public class SingleCarController {

    private final CarsService carsService;

    @ModelAttribute
    protected Cars modelCar(@PathVariable String regnumber){
        Optional<Cars> carOpt = carsService.findById(regnumber);
        if(carOpt.isPresent()) {
            return carOpt.get();
        } else {
            throw new NotFoundException(Cars.class, regnumber);
        }
    }

    /**
     * Handles requests to show detail about one person.
     */
    @GetMapping
    public String show() {

        return "SingleCarShow";
    }

    @GetMapping("/edit")
    public String edit() {

        return "cars/edit";
    }

}
