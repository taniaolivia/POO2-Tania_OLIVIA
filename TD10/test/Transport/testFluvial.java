/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transport;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
/**
 *
 * @author taniaolivia
 */
public class testFluvial 
{
    Cargaison cargaison;
    Marchandise petite;
    Marchandise grande;
    
    
    @Before
    public void setUp() 
    {
        cargaison = new Fluvial(100);
        petite = new Marchandise(100, 20000);
        grande = new Marchandise(25000, 500000);
        
    }
    
    @After
    public void tearDown() 
    {
        cargaison = null;
        petite = null;
        grande = null;
    }

    @Test
    public void calculEncombrementPetitTest() throws EncombrementLimiteAtteinteException 
    {
        System.out.println("Le calcul d'encombrement en petite marchandise");
        
        cargaison.calculEncombrement(petite);
        
        assertEquals(100, petite.getPoids());
    }

    @Test(expected = EncombrementLimiteAtteinteException.class)
    public void testCalculEncombrementGrandTest() throws EncombrementLimiteAtteinteException 
    {
        System.out.println("Le calcul d'encombrement en grande marchandise");
        
        cargaison.calculEncombrement(grande);   
        
        assertEquals(25000, grande.getPoids());
    }
}
