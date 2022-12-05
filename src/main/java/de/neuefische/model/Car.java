package de.neuefische.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String manufacturer;

    private int tires;

    private boolean hasTuev;
}