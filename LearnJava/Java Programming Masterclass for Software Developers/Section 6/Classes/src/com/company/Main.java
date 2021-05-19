package com.company;

public class Main {

    public static void main(String[] args) {

        Car porche = new Car();
        Car holden = new Car();

        System.out.println("Model is " + porche.getModel());
        porche.setModel("Carrera");
        System.out.println("Model is " + porche.getModel());

    }
}
