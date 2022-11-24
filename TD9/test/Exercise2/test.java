/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import Exercise1.DecouvertNonAutoriseException;
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
    Connexion connexion;
    Utilisateur utilisateur;

    @Before
    public void setUp() 
    {
        connexion = new Connexion();
        utilisateur = new Utilisateur("Matthew", "Ukiyo");
    }
    
    @After
    public void tearDown() 
    {
        connexion = null;
        utilisateur = null;
    }
    

    @Test
    public void connecterTest() throws Exception{
        System.out.println("Le test du connexion (login et mot de passe sont corrects)");
        String login = "Matthew";
        String motDePasse = "Ukiyo";
        
        assertEquals(connexion.connecter(login, motDePasse), connexion.connecter(utilisateur.getLogin(), utilisateur.getMotDePasse()));
    }
    

    @Test(expected = MauvaisLoginException.class)
    public void testConnecterMauvaisLogin() throws Exception{
        System.out.println("Le test du connexion (login n'est pas bon)");
        String login = "Michelle";
        String motDePasse = "Ukiyo";
        
        assertEquals(connexion.connecter(login, motDePasse), connexion.connecter(utilisateur.getLogin(), utilisateur.getMotDePasse()));
    }
    

    @Test(expected = MauvaisMdPException.class)
    public void testConnecterMauvaisMdp() throws Exception{
        System.out.println("Le test du connexion (mot de pass n'est pas bon)");
        String login = "Matthew";
        String motDePasse = "Blackyo";
        
        assertEquals(connexion.connecter(login, motDePasse), connexion.connecter(utilisateur.getLogin(), utilisateur.getMotDePasse()));
    }
    

    @Test
    public void getNbEssaiTest(){
        System.out.println("Le test de getNbEssai");
        int nbEssai = 5;
        assertEquals(nbEssai, connexion.getNbEssai(),5);
    }
}
