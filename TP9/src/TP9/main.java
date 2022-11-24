/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP9;

/**
 *
 * @author taniaolivia
 */
public class main
{
    public static void main(String[] args) throws EtatIncorrectException, ViolationDeContrainteException
    {
        Voiture voiture = new Voiture("Toyota", "Fortuner TRD Sportivo", "B 1975 UJF", 8, 800, 0, 600, 10000);
        Personne conducteur = new Personne("OLIVIAN", "Matthew", 173, 71);
        Personne passager1 = new Personne("OLIVIAN", "Matthew", 173, 71);
        Personne passager2 = new Personne("OLIVIA", "Tania", 163, 56);
        Personne passager3 = new Personne("OLIVIA", "Michelle", 152, 51);
        
        try
        {
            voiture.demarrer();
            voiture.arreter();
            
            voiture.monterConducteur(conducteur);
            
            voiture.demarrer();
            voiture.rouler(3);
            voiture.accelerer();
            voiture.freiner();
            voiture.arreter();
            
            voiture.monter(passager2);
            voiture.monter(passager3);
            
            voiture.monterConducteur(conducteur);
            
            voiture.demarrer();
            voiture.accelerer();
            voiture.freiner();
            voiture.arreter();
            
            voiture.descendre(passager2);
            voiture.descendre(passager3);
        }
        
        catch(EtatIncorrectException | ViolationDeContrainteException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
