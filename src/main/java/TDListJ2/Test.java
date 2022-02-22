/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TDListJ2;

/**
 *
 * @author khali
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enfant e1=new Enfant("test1","teste1", 10);
        Enfant e2=new Enfant("test2","teste2", 13);
        Enfant e3=new Enfant("test3","teste3", 8);
        Enfant e4=new Enfant("test4","teste4", 12);
        Groupe g1=new Groupe();
        Groupe g2=new Groupe();
        g1.setTitre("groupe 1");
        g1.addEnfant(e1);
        g1.addEnfant(e2);
        g2.setTitre("groupe 2");
        g2.addEnfant(e3);
        g2.addEnfant(e4);
        System.out.println("liste des enfants du groupe "+g1.getTitre());
        g1.lister();
        System.out.println("liste des enfants du groupe "+g2.getTitre());
        g2.lister();
        
        
        
        
        
    }
    
}
