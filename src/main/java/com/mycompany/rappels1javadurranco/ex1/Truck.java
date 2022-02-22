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
private int vehicule_id;

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

    public int getVehicule_id() {
        return vehicule_id;
    }

    public void setVehicule_id(int vehicule_id) {
        this.vehicule_id = vehicule_id;
    }

    public Truck(int loadcapacity, int noOfContainers, int vehicule_id, int id_vehicule, String type, String manufacturer) {
        super(id_vehicule, type, manufacturer);
        this.loadcapacity = loadcapacity;
        this.noOfContainers = noOfContainers;
        this.vehicule_id = vehicule_id;
    }

    @Override
    public String toString() {
        return "Truck{" + "loadcapacity=" + loadcapacity + ", noOfContainers=" + noOfContainers + ", vehicule_id=" + vehicule_id + '}'+super.toString();
    }





}
