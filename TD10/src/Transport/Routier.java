/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transport;

/**
 *
 * @author taniaolivia
 */
public class Routier extends Cargaison
{
    public Routier(int distance)
    {
        super(distance, 0);
    }
    
    @Override
    protected int calculEncombrement(Marchandise m) throws EncombrementLimiteAtteinteException
    {
        int totalEncombrement = 0;
        encombrementLimite = 38000;
        
        if(m.getPoids() <= encombrementLimite)
        {
            
            totalEncombrement += m.getPoids();
        }
        
        else 
        {
            throw new EncombrementLimiteAtteinteException("Encombrement la limite atteinte");
            
        }

        return totalEncombrement;
    }
    
    @Override
    public int calculCout()
    {
        return 10 * distance * encombrementCourant;
    }
}
