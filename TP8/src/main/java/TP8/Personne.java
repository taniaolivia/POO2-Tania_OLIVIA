/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP8;
import java.util.Objects;
/**
 *
 * @author taniaolivia
 */
public class Personne 
{
    private String nom;
    private String prenom;
    private int taille;
    private double poids;
    
    public Personne(String nom, String prenom, int taille, double poids)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
        this.poids = poids;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nom);
        hash = 13 * hash + Objects.hashCode(this.prenom);
        hash = 13 * hash + this.taille;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.poids) ^ (Double.doubleToLongBits(this.poids) >>> 32));
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        if(obj == null)
        {
            return false;
        }
        
        if (!(obj instanceof Personne))
        {
            return false;
        }
        
        Personne personne = (Personne) obj;
        
        return this.nom.equals(personne.nom) && (this.prenom == personne.prenom);
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public String getPrenom()
    {
        return this.prenom;
    }
    
    public int getTaille()
    {
        return this.taille;
    }
    
    public double getPoids()
    {
        return this.poids;
    } 
}
