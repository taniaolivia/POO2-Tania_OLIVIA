/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transport;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taniaolivia
 */
public class Aerien extends Cargaison
{
    public Aerien(int distance)
    {
        super(distance, 0);
    }
    
    @Override
    protected int calculEncombrement(Marchandise m) throws EncombrementLimiteAtteinteException
    {
        int encombrementTotal = 0;
        encombrementLimite = 80000;
        
        if(m.getVolume() <= encombrementLimite)
        {
            encombrementTotal += m.getVolume();
        }
        
        else 
        {
            throw new EncombrementLimiteAtteinteException("Encombrement la limite atteinte");
        }
        
        return encombrementTotal;
    }
    
    @Override
    public int calculCout()
    {
        return 10 * distance * encombrementCourant;
    }
     
}
