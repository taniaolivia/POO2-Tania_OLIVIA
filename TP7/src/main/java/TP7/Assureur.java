/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author taniaolivia
 */
public class Assureur 
{
    private String nom;
    private HashMap<Client, List<Vehicule>> contrats;
    
    public Assureur(String nom)
    {
        this.nom = nom;
        this.contrats = new HashMap<>();
    }
    
    public void afficherContrats()
    {
        System.out.println(" Contrats : ");
    }
    
    public void afficherContratsClientCourt(Client c){}
    
    public void afficherContratsClient(Client c){}
    
    public void ajouterContrat(Client c, Vehicule v){}
    
}
