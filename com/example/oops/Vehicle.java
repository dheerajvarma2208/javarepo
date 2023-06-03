package com.example.oops;

public class Vehicle {
    private String make;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("vehicle started " + make);
        System.out.println("vehicle stopped with changes  ");
    }

    public void stop() {
        System.out.println("vehicle stopped with changes "+model);
    }

}
