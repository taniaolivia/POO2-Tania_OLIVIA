/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;
import java.time.LocalDate;
import java.util.Objects;
/**
 *
 * @author taniaolivia
 */
public abstract class Vehicule 
{
    private final String marque;
    private final int puissance;
    private final String modele;
    private final LocalDate datePremierCirc;
    private final String immatriculation;
    
    public Vehicule(String marque, int puissance, String modele, LocalDate datePremierCirc, String immatriculation)
    {
        this.marque = marque;
        this.puissance = puissance;
        this.modele = modele;
        this.datePremierCirc = datePremierCirc;
        this.immatriculation = immatriculation;
    }
    
    public LocalDate getDatePremierCirculation()
    {
        return this.datePremierCirc;
    }
    
    @Override
    public abstract String toString();

    @Override
    public int hashCode() 
    {
        int hash = 7;
        
        hash = 83 * hash + Objects.hashCode(this.marque);
        hash = 83 * hash + this.puissance;
        hash = 83 * hash + Objects.hashCode(this.modele);
        hash = 83 * hash + Objects.hashCode(this.datePremierCirc);
        hash = 83 * hash + Objects.hashCode(this.immatriculation);
        
        return hash;
    }
    
    @Override
    public boolean equals( Object obj)
    {
        if(obj == null)
        {
            return false;
        }
         
        if (!(obj instanceof Vehicule))
        {
            return false;
        }
        
        Vehicule vehicule = (Vehicule) obj;
        
        return this.getMarque().equals(vehicule.getMarque()) && (this.immatriculation == vehicule.getImmatriculation());
    }
    
    public abstract String getDescriptionCourte();
    
    public int getPuissance()
    {
        return this.puissance;
    }
    
    public String getMarque()
    {
        return this.marque;
    }
    
    public String getModele()
    {
        return this.modele;
    }
    
    public LocalDate getDatePremierCirc()
    {
        return this.datePremierCirc;
    }
    
    public String getImmatriculation()
    {
        return this.immatriculation;
    }
}
