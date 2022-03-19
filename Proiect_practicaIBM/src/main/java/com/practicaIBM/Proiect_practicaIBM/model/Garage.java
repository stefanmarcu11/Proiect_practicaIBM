package com.practicaIBM.Proiect_practicaIBM.model;


import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Garage {

    private String address;
    @Size(min = 3, max = 10)
    private String phone;
    private int nr_cars;


    public Garage(String address, String phone, int nr_cars) {
        this.address = address;
        this.phone = phone;
        this.nr_cars = nr_cars;
    }

    public Garage() {
    }
}
