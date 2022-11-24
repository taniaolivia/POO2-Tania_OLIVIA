/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;
import static Exercise1.Devise.DOLLAR;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author taniaolivia
 */
public class test 
{
    Compte compte;
    
    @Before
    public void setUp() 
    {
        compte = new Compte(13780972, DOLLAR);
        compte.setCreditAutorise(100);
    }
    
    @After
    public void tearDown() 
    {
        compte = null;
    }
    
    @Test
    public void deposerTest()
    {
        System.out.println("Le test de déposer");
        
        float montant = 500.0F;
        
        compte.deposer(montant);
        assertEquals(500, compte.getSolde(), 0.0);
       
    }
    
    @Test
    public void retirerAutoriseTest() throws Exception 
    {
        System.out.println("Le test de retirer autorisé");
        
        compte.deposer(500);
        compte.retirer(70);
        
        assertEquals(430, compte.getSolde(), 0.0);
    }
    
    @Test(expected = DecouvertNonAutoriseException.class)
    public void retirerNonAutoriseTest() throws Exception 
    {
        System.out.println("Le test de retirer non autorisé");
        
        compte.retirer(300);
    }
    
    @Test
    public void testTostring()
    {
        System.out.println("Le test de toString");
        
        String resultatVoulu;
        String resultat = compte.toString();
        
        resultatVoulu = "   Numéro du compte : 13780972" 
                        + '\n' + "   Solde : " + compte.getSolde()
                        + '\n' + "   Crédit Autorisé : " + compte.getCreditAutorise();
        
        assertEquals(resultatVoulu, resultat);
    }
    
    @Test
    public void getSoldeTest() 
    {
        System.out.println("Le test de getSolde");
        
        compte.deposer(100);
        
        float resultatVoulu = 100.0F;
        float resultat = compte.getSolde();
        
        assertEquals(resultatVoulu, resultat, 0.0);
    }

    @Test
    public void getCreditAutoriseTest() 
    {
        System.out.println("Le test de getCreditAutorise");
        
        float resultatVoulu = 100.0F;
        float resultat = compte.getCreditAutorise();
        
        assertEquals(resultatVoulu, resultat, 0.0);
    }


    @Test
    public void setCreditAutoriseTest() 
    {
        System.out.println("Le test de setCreditAutorise");
        
        compte.setCreditAutorise(100);
        
        assertEquals(100, compte.getCreditAutorise(), 0.0);
    }
}
