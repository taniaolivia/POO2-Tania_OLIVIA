/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP9;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
/**
 *
 * @author taniaolivia
 */
public class testPersonne 
{
    Personne passager1;
    Personne passager2;
    Personne passager3;
    
    public testPersonne() 
    {
        
    }
    
    @Before
    public void setUp() 
    {
        passager1 = new Personne("OLIVIAN", "Matthew", 173, 71);
        passager2 = new Personne("OLIVIA", "Tania", 163, 56);
        passager3 = new Personne("OLIVIA", "Michelle", 152, 51);
    }
    
    @After
    public void tearDown() 
    {
        passager1 = null;
        passager2 = null;
        passager3 = null;
    }

    @Test
    public void equalsTest() 
    {
        System.out.println("Equals");
        
        passager1.equals(passager1);
        assertEquals(passager1, passager1);
        
        passager2.equals(passager2);
        assertEquals(passager2, passager2);
        
        passager3.equals(passager3);
        assertEquals(passager3, passager3);
    }

    @Test
    public void getNomTest() 
    {
        System.out.println("getNom");
        
        assertEquals("OLIVIAN", passager1.getNom());
        assertEquals("OLIVIA", passager2.getNom());
        assertEquals("OLIVIA", passager3.getNom());
    }

    @Test
    public void getPrenomTest() 
    {
        System.out.println("getPrenom");
        
        assertEquals("Matthew", passager1.getPrenom());
        assertEquals("Tania", passager2.getPrenom());
        assertEquals("Michelle", passager3.getPrenom());
    }

    @Test
    public void getTailleTest() 
    {
        System.out.println("getTaille");
        
        assertEquals(173, passager1.getTaille());
        assertEquals(163, passager2.getTaille());
        assertEquals(152, passager3.getTaille());
    }

    @Test
    public void getPoids() 
    {
        System.out.println("getPoids");
        
        assertEquals(71, passager1.getPoids(), 0.0);
        assertEquals(56, passager2.getPoids(), 0.0);
        assertEquals(51, passager3.getPoids(), 0.0);
    }  
}
