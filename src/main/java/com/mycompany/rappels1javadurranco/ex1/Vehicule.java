/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rappels1javadurranco.ex1;

/**
 *
 * @author khali
 */
public class Vehicule {
    private int id_vehicule;
    private String type,manufacturer;

    public int getId_vehicule() {
        return id_vehicule;
    }

    public void setId_vehicule(int id_vehicule) {
        this.id_vehicule = id_vehicule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Vehicule(int id_vehicule, String type, String manufacturer) {
        this.id_vehicule = id_vehicule;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public Vehicule() {
    }

    @Override
    public String toString() {
        return "Vehicule{" + "id_vehicule=" + id_vehicule + ", type=" + type + ", manufacturer=" + manufacturer + '}';
    }
    
    
    
    
    
    
}
