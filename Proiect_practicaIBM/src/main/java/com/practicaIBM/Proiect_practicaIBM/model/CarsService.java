package com.practicaIBM.Proiect_practicaIBM.model;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarsService {

    private  CarsRepository carsRepository;

    public CarsService(CarsRepository carsRepository) {

        this.carsRepository = carsRepository;
    }

    public List<Cars> findAll(){

        return carsRepository.findAll();
    }

    public Optional<Cars> findById(String regnumber) {

        return carsRepository.findById(regnumber);
    }

    public void save(Cars car) {
        carsRepository.save(car);

    }

    public void addcars(Cars car){
        carsRepository.addCar(car);
    }

}
