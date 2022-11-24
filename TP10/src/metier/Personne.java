/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Objects;

/**
 *
 * @author taniaolivia
 */
public class Personne 
{
    private final String nom;
    private final String prenom;
    private int noRue;
    private String nomRue;
    private String codePostal;
    private String ville;
    private String noTel;
    private int id;

    public Personne(int id,String nom, String prenom, int noRue, String nomRue, String codePostal, String ville, String noTel) 
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.noRue = noRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.noTel = noTel;
    }


    
    @Override
    public String toString()
    {
        return "   ID : " + this.id
        + '\n' + "   Nom : " + this.nom 
        + '\n' + "   Prenom : " + this.prenom
        + '\n' + "   Numéro de Rue : " + this.noRue
        + '\n' + "   Nom de Rue : " + this.nomRue      
        + '\n' + "   Code Postal : " + this.codePostal       
        + '\n' + "   Ville : " + this.ville       
        + '\n' + "   Numéro de téléphone : " + this.noTel;
    }
    
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 13 * hash + this.id;
        hash = 13 * hash + Objects.hashCode(this.nom);
        hash = 13 * hash + Objects.hashCode(this.prenom);
        hash = 13 * hash + this.noRue;
        hash = 13 * hash + Objects.hashCode(this.nomRue);
        hash = 13 * hash + Objects.hashCode(this.codePostal);
        hash = 13 * hash + Objects.hashCode(this.ville);
        hash = 13 * hash + Objects.hashCode(this.noTel);
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
    
    public int getID()
    {
       return this.id;
    }
     
    public String getNom()
    {
       return this.nom;
    }
    
    public String getPrenom()
    {
       return this.prenom;
    }
        
    public int getNoRue()
    {
       return this.noRue;
    }

    public String getNomRue()
    {
       return this.nomRue;
    }
    
    public String getCodePostal()
    {
       return this.codePostal;
    }
         
    public String getVille()
    {
       return this.ville;
    }
        
    public String getNoTel()
    {
       return this.noTel;
    }

    public void setNoRue(int noRue) 
    {
        this.noRue = noRue;
    }

    public void setNomRue(String nomRue) 
    {
        this.nomRue = nomRue;
    }

    public void setCodePostal(String codePostal) 
    {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) 
    {
        this.ville = ville;
    }

    public void setNoTel(String noTel) {
        
        this.noTel = noTel;
    }
    
    public void setID(int id) 
    {
        this.id = id;
    }
}
