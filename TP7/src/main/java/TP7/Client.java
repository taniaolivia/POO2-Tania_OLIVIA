/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;
import java.util.Objects;

/**
 *
 * @author taniaolivia
 */
public class Client 
{
    private String nom;
    private String prenom;
    private String adresse;
    
    
    public Client(String prenom, String nom, String adresse)
    {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
    }
    
    @Override
    public int hashCode() 
    {
        int hash = 3;
        
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.prenom);
        hash = 97 * hash + Objects.hashCode(this.adresse);
        
        return hash;
    }
   
    @Override
    public boolean equals(Object obj) 
    {
        if(obj == null)
        {
            return false;
        }
        
        if (!(obj instanceof Client))
        {
            return false;
        }
        
        Client client = (Client) obj;
        
        return this.getNom().equals(client.getNom()) && (this.prenom == client.getPrenom());
    }
    
    @Override
    public String toString()
    {
        return  " Nom : " + this.getPrenom() + this.getNom() + 
                '\n' + " Adresse : " + this.getAdresse();
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    public String getPrenom()
    {
        return this.prenom;
    }
    
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
    
    public String getAdresse()
    {
        return this.adresse;
    }
    
    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }
}
