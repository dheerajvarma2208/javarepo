package com.example.oops;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.start();
        car.stop();
    }

    private void start() {
        System.out.println("vehicle started ");
        System.out.println("vehicle stopped with changes  ");
    }

    private void stop() {
        System.out.println("vehicle stopped with changes ");
    }
}
