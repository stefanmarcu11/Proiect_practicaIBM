package com.practicaIBM.Proiect_practicaIBM.model;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository
public class CarsRepository {

    private Map<String, Cars> cars= new HashMap<>();

    @PostConstruct
    private void init() {

        createCars();
    }
    public void createCars(){

        Cars c1= new Cars("BV076764","BMW","seria7",5500,"Sedan",2011,13.1);
        cars.put(c1.getRegnumber(),c1);
        Cars c2= new Cars("BV076789","BMW","seria7",6000,"Sedan",2019,9.5);
        cars.put(c2.getRegnumber(),c2);
        Cars c3=new Cars("BV076746","BMW","seria7",6000,"Sedan",2020,6.4);
        cars.put(c3.getRegnumber(),c1);

    }
    public List<Cars> findAll() {

        return new ArrayList<>(cars.values());
    }

    public void save(Cars car) {

        cars.compute(car.getRegnumber(), (key, value) -> car);
    }

    public Optional<Cars> findById(String regnumber) {

        return Optional.ofNullable(cars.getOrDefault(regnumber, null));
    }
    public void addCar(Cars car){

        this.cars.put(car.getRegnumber(),car);
    }
}
