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
public class Moto extends Vehicule 
{
    private final int cylindree;
    
    public Moto(int cylindree, String marque, int puissance, String modele, LocalDate datePremierCirc, String immatriculation)
    {
        super(marque, puissance, modele, datePremierCirc, immatriculation);
        this.cylindree = cylindree;
    }
    
    @Override
    public String toString()
    {
        return "Cylindrée : "+ this.cylindree 
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
