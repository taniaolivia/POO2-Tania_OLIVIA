/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transport;
import java.util.ArrayList;
/**
 *
 * @author taniaolivia
 */
public abstract class Cargaison 
{
    protected static int distance;
    protected int encombrementCourant;
    protected static int encombrementLimite;
    private ArrayList<Marchandise> listeMarchandise;
    
    public Cargaison(int dist, int limite)
    {
        this.distance = dist;
        this.encombrementLimite = limite;
        this.encombrementCourant = 50;
        this.listeMarchandise = new ArrayList<>();
    }
    
    public void ajouter(Marchandise m)
    {
        if(this instanceof Fluvial)
        {
            if((this.encombrementCourant + m.getPoids()) >= 500000)
            {
                System.out.println("Poids insuffisant!");
            }
            else
            {
                this.listeMarchandise.add(m);
            }
        }
               
        else if (this instanceof Routier) 
        {
            if((this.encombrementCourant + m.getPoids()) >= 38000)
            {
                System.out.println("Poids insuffisant!");
            }
            else
            {
                this.listeMarchandise.add(m);
            }
        } 
        
        else 
        {
            if((this.encombrementCourant + m.getVolume()) >= 80000)
            {
                System.out.println("Volume insuffisant!");
            }
            else
            {
                this.listeMarchandise.add(m);
            }
        }
    }
    
     /** 
     * @param m
     * @return 
     * @throws Transport.EncombrementLimiteAtteinteException 
     */
    protected abstract int calculEncombrement(Marchandise m) throws EncombrementLimiteAtteinteException;
    
    /**
    * @return 
    */
    
    public int calculCout()
    {
        return distance * encombrementCourant;
    }
    
}
