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
public class Marchandise 
{
    private int poids;
    private int volume;
    
    public Marchandise(int poids, int volume)
    {
        this.poids = poids;
        this.volume = volume;
    }
    
    public int getPoids()
    {
        return poids;
    }
    
    public int getVolume()
    {
        return volume;
    }


}
