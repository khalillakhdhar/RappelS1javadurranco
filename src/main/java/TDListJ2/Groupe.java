/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDListJ2;

import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author khali
 */
public class Groupe {
    private String titre;
List<Enfant> listEnfants=new ArrayList<Enfant>();

    // List<Type> nomVariable= new ArrayList<Type>();

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Enfant> getListEnfants() {
        return listEnfants;
    }

    public void setListEnfants(List<Enfant> listEnfants) {
        this.listEnfants = listEnfants;
    }
    
    public void addEnfant(Enfant en)
    {
    
    listEnfants.add(en); //si le type de l'élement est Object on a besoin d'une instance
    }
    public void lister()
    {
    for(Enfant en : listEnfants)
    {
        System.out.println(en.toString());
    }
    
    }
    
}
