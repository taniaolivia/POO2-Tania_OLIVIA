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
public class Compte 
{
    private final int numero;
    private float solde;
    private float creditAutorise;
    private Devise devise;
    
    public Compte(int numero, Devise devise)
    {
        this.numero = numero;
        this.devise = devise;
    }
    
    public void deposer(float montant)
    {
        solde += montant;
    }
    
    public void retirer(float montant) throws DecouvertNonAutoriseException
    {
        if(montant >= this.creditAutorise)
        {
            throw new DecouvertNonAutoriseException("Decouvert non autorisé");
        }
        else
        {
            this.solde -= montant;
        }
    }
    
    @Override
    public String toString()
    {
        return "   Numéro du compte : " + this.numero 
        + '\n' + "   Solde : " + getSolde() + " " + this.devise
        + '\n' + "   Crédit Autorisé : " + getCreditAutorise() + " " + this.devise ;
    }
    
    public float getSolde()
    {
       return this.solde;
    }
    
    public float getCreditAutorise()
    {
        return this.creditAutorise;
    }
    
    public void setCreditAutorise(float creditAutorise){
        
        this.creditAutorise = creditAutorise;
    }
}
