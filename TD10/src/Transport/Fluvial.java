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
public class Fluvial extends Cargaison
{
    
    public Fluvial(int distance)
    {
        super(distance, 0);
    }
    
    @Override
    protected int calculEncombrement(Marchandise m) throws EncombrementLimiteAtteinteException
    {
        int totalEncombrement = 0;
        encombrementLimite = 300000;
        
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
}
