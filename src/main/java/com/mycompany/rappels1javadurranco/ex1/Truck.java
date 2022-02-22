/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rappels1javadurranco.ex1;

/**
 *
 * @author khali
 */
public class Truck extends Vehicule {
  private int loadcapacity,noOfContainers;

    public int getLoadcapacity() {
        return loadcapacity;
    }

    public void setLoadcapacity(int loadcapacity) {
        this.loadcapacity = loadcapacity;
    }

    public int getNoOfContainers() {
        return noOfContainers;
    }

    public void setNoOfContainers(int noOfContainers) {
        this.noOfContainers = noOfContainers;
    }

 

    public Truck(int loadcapacity, int noOfContainers, int id_vehicule, String type, String manufacturer) {
        super(id_vehicule, type, manufacturer);
        this.loadcapacity = loadcapacity;
        this.noOfContainers = noOfContainers;
    }

    @Override
    public String toString() {
        return "Truck{" + "loadcapacity=" + loadcapacity + ", noOfContainers=" + noOfContainers +'}'+super.toString();
    }





}
