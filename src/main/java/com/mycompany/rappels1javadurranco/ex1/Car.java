/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rappels1javadurranco.ex1;

/**
 *
 * @author khali
 */
public class Car extends Vehicule {
    private int noOfPassenger,NoOfDoors;

    public int getNoOfPassenger() {
        return noOfPassenger;
    }

    public void setNoOfPassenger(int noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }

    public int getNoOfDoors() {
        return NoOfDoors;
    }

    public void setNoOfDoors(int NoOfDoors) {
        this.NoOfDoors = NoOfDoors;
    }

    public Car(int noOfPassenger, int NoOfDoors, int id_vehicule, String type, String manufacturer) {
        super(id_vehicule, type, manufacturer);
        this.noOfPassenger = noOfPassenger;
        this.NoOfDoors = NoOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" + "noOfPassenger=" + noOfPassenger + ", NoOfDoors=" + NoOfDoors + '}'+super.toString();
    }
    
    
    
    
    
}
