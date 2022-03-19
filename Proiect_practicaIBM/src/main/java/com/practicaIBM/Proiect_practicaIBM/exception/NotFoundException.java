package com.practicaIBM.Proiect_practicaIBM.exception;

import com.practicaIBM.Proiect_practicaIBM.model.Cars;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Requested item not found")
public class NotFoundException extends RuntimeException {

    private String objIdentifier;

    public <T> NotFoundException(Class<T> cls, String regnumber) {
        super(cls.getSimpleName() + " with id: " + regnumber+ " does not exist!");
    }

    public String getObjIdentifier() {

        return objIdentifier;
    }

}
