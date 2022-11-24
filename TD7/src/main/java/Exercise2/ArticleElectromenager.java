/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author taniaolivia
 */
public class ArticleElectromenager extends Article implements VendablePiece
{
    private int stockNb;
    private int totalNb;
    private double nombre;
    
    public ArticleElectromenager(double prixAchat, double prixVente, String nom, String fournisseur, double beneficeUnite)
    {
        super(prixAchat, prixVente, nom, fournisseur, beneficeUnite);
        this.stockNb = stockNb;
        this.totalNb = totalNb;
    }
    
    public double remplirStock(double nombre)
    {
        this.nombre = nombre;
        
        for(int leI = 1; leI <= this.nombre; leI++)
        {
            this.stockNb++;
        }
        
        this.totalNb += this.stockNb;
        
        return this.prixAchat * this.stockNb;
    }
    
    @Override
    public double vendre(int nombre)
    {
        this.nombre = nombre;
        
        if(this.stockNb < nombre)
        {
            this.nombre = 0;
            System.out.println(" Stock insuffisant! ");
            System.out.println(" Remplir le stock!");
            System.out.println();
        }
        
        else
        {
            for(int leI = 1; leI <= this.nombre; leI++)
            {
                this.stockNb--;
                nombre--;
            }
        }
        
        return this.nombre * (this.prixVente);
    }
    
    @Override
    public double benefice()
    {
        return this.nombre * (this.prixVente - this.prixAchat);
    }
    
    @Override
    public String toString()
    {
        return  this.getNom() + '\n'
        + '\n' + "  Fournisseur : " +  this.getFournisseur()
        + '\n' + "  Prix d'achat : " + this.prixAchat + " €" 
        + '\n' + "  Prix de la vente : " + this.prixVente + " €"
        + '\n' + "  Benefice par unité : " + this.beneficeUnite + " €" + '\n';
        
    }  
}
