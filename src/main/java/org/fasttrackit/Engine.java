package org.fasttrackit;

import java.time.LocalDate;

public class Engine {

    String manufacturer;
    int capacity;
    LocalDate manufacturerDate = LocalDate.now();


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getManufacturerDate() {
        return manufacturerDate;
    }

    public void setManufacturerDate(LocalDate manufacturerDate) {
        this.manufacturerDate = manufacturerDate;
    }
}
