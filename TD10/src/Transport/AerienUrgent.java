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
public class AerienUrgent extends Aerien
{
    public AerienUrgent(int distance)
    {
        super(distance);
    }
    
    @Override
    public int calculCout()
    {
        return 2 * 10 * distance * encombrementCourant;
    }
}
