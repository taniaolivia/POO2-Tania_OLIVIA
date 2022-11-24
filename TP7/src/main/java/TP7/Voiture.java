/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;
import java.time.LocalDate;
/**
 *
 * @author taniaolivia
 */
public class Voiture extends Vehicule
{
    private final int nbPlace;
    
    public Voiture(int nbPlace, String marque, int puissance, String modele, LocalDate datePremierCirc, String immatriculation)
    {
        super(marque, puissance, modele, datePremierCirc, immatriculation);
        this.nbPlace = nbPlace;
    }
    
    @Override
    public String toString()
    {
        return "Nombre de place : " + this.nbPlace
                + '\n' + "Marque : " +  this.getMarque() 
                + '\n' + "Puissance : " + this.getPuissance() 
                + '\n' + "Modèle : " + this.getModele() 
                + '\n' + "Date de prémier circulation : " + this.getDatePremierCirculation() 
                + '\n' + "Immatriculation : " + this.getImmatriculation();
    }
    
    @Override
    public String getDescriptionCourte()
    {
        return  "Marque : " + this.getMarque() 
                + '\n' + "Modele : " + this.getModele();
    }
}
