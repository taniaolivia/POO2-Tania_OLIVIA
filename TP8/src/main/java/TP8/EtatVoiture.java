/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP8;

/**
 *
 * @author taniaolivia
 */
public enum EtatVoiture 
{
    DEMARREE("DEMARREE"), ARRETEE("ARRETEE");
    
    private String etat;
    
    private EtatVoiture(String etat)
    {
        this.etat = etat;
    } 
    
    public String getEtat()
    {
        return this.etat;
    }
            
}
