/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemples;

/**
 *
 * @author khali
 */
public class Tableaux {
 
    public static void main(String args[])
    {
       String[] noms = null;
    int[] notes={12,14,22};
    String[] voitures={"citroen","BMW","Audi"};
    //noms[0]="test";
        //System.out.println(noms[2]); // nullpointerFound
      try
      {
        System.out.println(voitures[5]);
        
//ArrayOutOfBound
      }
      catch(Exception ex)
      {
          //System.out.println("la voiture n'existe pas");
      
      }
        
        
   // System.out.println(notes[2]);
   //methode 1 boucle et initialisation
   for(int i=0;i<notes.length;i++)
   {
       System.out.println(notes[i]);
   }
   //methode 2 foreach
   for(String car:voitures)
   {
       System.out.println(car);
   
   }
//       int i=8;
// MemoryOutOfBound
//    boolean x=true;
//    while(x==true)
//    {
//    i++;
//    
//    }
    
    }
    
}
