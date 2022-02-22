/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khali
 */
public class ListsAndArrayLists {
    public static void main(String args[])
    {
    List<String> noms = new ArrayList<String>(); // intialisation new ArrayList<String>()
    noms.add("test1"); //nom de liste.add(valeur)
    noms.add("teste2");
    noms.set(0, "personalisé");
    for(String element:noms)
    {
        System.out.println(element);
    }
    
    
    
    }
}
