package de.neuefische.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

    private String manufacturer;

    private int tires;

    private boolean hasTuev;
}
