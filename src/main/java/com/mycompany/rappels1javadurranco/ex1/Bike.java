/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rappels1javadurranco.ex1;

/**
 *
 * @author khali
 */
public class Bike extends Vehicule{
   private int noOfPassenger,saddleHeight;

    public int getNoOfPassenger() {
        return noOfPassenger;
    }

    public void setNoOfPassenger(int noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }

    public int getSaddleHeight() {
        return saddleHeight;
    }

    public void setSaddleHeight(int saddleHeight) {
        this.saddleHeight = saddleHeight;
    }

    public Bike(int noOfPassenger, int saddleHeight, int id_vehicule, String type, String manufacturer) {
        super(id_vehicule, type, manufacturer);
        this.noOfPassenger = noOfPassenger;
        this.saddleHeight = saddleHeight;
    }

    @Override
    public String toString() {
        return "Bike{" + "noOfPassenger=" + noOfPassenger + ", saddleHeight=" + saddleHeight + '}'+super.toString();
    }
   
   
   
   
   
}
