/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercise1;

/**
 *
 * @author taniaolivia
 */
public class main 
{
    public static void main(String[] args) 
    {
        System.out.println("________________________________");
        System.out.println("        Liste des animaux       ");
        System.out.println("________________________________");
        System.out.println("                                 ");
        System.out.println("o Cheval");
        System.out.println("                                 ");
        System.out.println("    +Appaloosa");
        System.out.println("                                 ");
        Appaloosa cheval = new Appaloosa("Messie") ;
        cheval.vieillir();
        cheval.afficher();
        cheval.crier();
        
        System.out.println("                                 ");
        System.out.println("                                  ");
        System.out.println("o Chien");
        System.out.println("                                 ");
        System.out.println("    +Berger Allemand");
        System.out.println("                                 ");
        BergerAllemand chien1 = new BergerAllemand("Cookie");
        chien1.vieillir();
        chien1.afficher();
        chien1.crier();
        
        
        System.out.println("                                 ");
        System.out.println("    +Terrier");
        System.out.println("                                 ");
        Terrier chien2 = new Terrier("Chocolat");
        chien2.vieillir();
        chien2.afficher();
        chien2.crier();
        
    }
}

