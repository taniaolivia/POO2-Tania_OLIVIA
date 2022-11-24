/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Objects;
/**
 *
 * @author taniaolivia
 */
public abstract class Article 
{
    protected double prixAchat;
    protected double prixVente;
    private String nom;
    private String fournisseur;
    protected double beneficeUnite;
    
    public Article(double prixAchat, double prixVente, String nom, String fournisseur, double beneficeUnite)
    {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.nom = nom;
        this.fournisseur = fournisseur;
        this.beneficeUnite = beneficeUnite;
    }
    
    public abstract double benefice();
    
    @Override
    public abstract String toString();

    
    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.prixAchat) ^ (Double.doubleToLongBits(this.prixAchat) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.prixVente) ^ (Double.doubleToLongBits(this.prixVente) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.nom);
        hash = 47 * hash + Objects.hashCode(this.fournisseur);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.beneficeUnite) ^ (Double.doubleToLongBits(this.beneficeUnite) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if(obj == null)
        {
            return false;
        }
        
        if (!(obj instanceof Article))
        {
            return false;
        }
        
        Article article = (Article) obj;
                
        return this.getNom().equals(article.getNom()) && (this.fournisseur == article.getFournisseur());
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public String getFournisseur()
    {
        return this.fournisseur;
    }
    
}
