package org.mfon;

import java.util.Date;

public class Vehicle {


    public String brand;
    public String model;
    public Colour color;
    public double price;

    private String ownerOfTheCar;

    public int numberOfSeats;

    public String numberOfDoors;

    public String transmission;

    public Date registrationYear;

    public Vehicle(String brand, String model, Colour color, double price, String ownerOfTheCar, int numberOfSeats, String numberOfDoors, String transmission, Date registrationYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.ownerOfTheCar = ownerOfTheCar;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.transmission = transmission;
        this.registrationYear = registrationYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Colour getColor() {
        return color;
    }

    public void setColor(Colour color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwnerOfTheCar() {
        return ownerOfTheCar;
    }

    public void setOwnerOfTheCar(String ownerOfTheCar) {
        this.ownerOfTheCar = ownerOfTheCar;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Date getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(Date registrationYear) {
        this.registrationYear = registrationYear;
    }
}
