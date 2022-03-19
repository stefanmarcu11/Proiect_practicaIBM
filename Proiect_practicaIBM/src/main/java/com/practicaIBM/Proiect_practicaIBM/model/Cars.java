package com.practicaIBM.Proiect_practicaIBM.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cars {

    private String regnumber;
    private String marca;
    private String model;
    private int power;
    private String type;
    private int an;
    private double consum;

    public Cars(String regnumber,String marca, String model, int power, String type, int an, double consum) {
        this.regnumber=regnumber;
        this.marca = marca;
        this.model = model;
        this.power = power;
        this.type = type;
        this.an = an;
        this.consum = consum;
    }

    public Cars() {
    }
}
