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
import java.util.HashSet;
/**
 *
 * @author taniaolivia
 */
public class testVoiture 
{
    Voiture voiture;
    Personne conducteur;
    Personne passager1;
    Personne passager2;
    Personne passager3;
    boolean bool;
    HashSet<String> listePassager; 
    EtatVoiture etat;
    
    public testVoiture() 
    {
        
    }
    
    @Before
    public void setUp() 
    {
        voiture = new Voiture("Toyota", "Fortuner TRD Sportivo", "B 1975 UJF", 8, 800, 0, 600, 10000);
        conducteur = new Personne("OLIVIAN", "Matthew", 173, 71);
        passager1 = new Personne("OLIVIAN", "Matthew", 173, 71);
        passager2 = new Personne("OLIVIA", "Tania", 163, 56);
        passager3 = new Personne("OLIVIA", "Michelle", 152, 51);
        listePassager = new HashSet<String>();
    }
    
    @After
    public void tearDown() 
    {
        voiture = null;
        conducteur = null;
        passager1 = null;
        passager2 = null;
        passager3 = null;
    }
    
    @Test
    public void getNbPassagersTest()
    {
        System.out.println("getNbPassagers");
        
        int nbPassagers = 3;
        
        assertEquals(nbPassagers, voiture.getNbPassargers(), 3);
    }
    
    @Test(expected = EtatIncorrectException.class)
    public void monterConducteurEtatDemarreeTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("monterConducteurEtatDemarrée");
        
        etat = EtatVoiture.DEMARREE;
        
        voiture.monterConducteur(conducteur);
        
        assertEquals(0, voiture.getPoidsActuel());
    }

    @Test
    public void monterConducteurEtatArreteeTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("monterConducteurEtatArretée");

        etat = EtatVoiture.ARRETEE;
        
        voiture.monterConducteur(conducteur);
        
        assertEquals(730, voiture.getPoidsActuel());
    }
    

    @Test(expected = EtatIncorrectException.class)
    public void demarrerEtatDemarreeTest()throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("demarrerEtatDemarée");
        
        etat = EtatVoiture.DEMARREE; 
        
        voiture.demarrer();
        
        assertEquals(0, voiture.getVitesseActuelle());
    }

    @Test
    public void demarrerEtatArreteeTest() throws EtatIncorrectException, ViolationDeContrainteException 
    {
        System.out.println("demarrerEtatArretée");
        
        try
        {
            voiture.monterConducteur(conducteur);
            
            voiture.demarrer();
        }
        
        catch(NullPointerException exception)
        {
            throw new ViolationDeContrainteException();
        }
    }

    @Test
    public void arreterEtatDemarreeTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        try
        {
            voiture.monterConducteur(conducteur);
            
            voiture.arreter();
        }
        
        catch(NullPointerException exception)
        {
            throw new ViolationDeContrainteException();
        }
    }
    
    @Test(expected = EtatIncorrectException.class)
    public void arreterEtatArreteeTest() throws EtatIncorrectException
    {
        System.out.println("arreterEtatArretée");
        
        etat = EtatVoiture.ARRETEE; 
        
        voiture.arreter();
        
        assertEquals(0, voiture.getVitesseActuelle());
    }
    
    @Test
    public void accelererEtatDemarreeTest() throws EtatIncorrectException, ViolationDeContrainteException 
    {
        System.out.println("accelererEtatDemarrée");
        
        voiture.monterConducteur(conducteur); 
        
        voiture.demarrer(); 
        voiture.accelerer();
        
        assertEquals(10, voiture.getVitesseActuelle());    
    }

    @Test(expected = EtatIncorrectException.class)
    public void accelererEtatArreteeTest() throws EtatIncorrectException, ViolationDeContrainteException 
    {
        System.out.println("accelererEtatArretée");
        
        try
        {
            voiture.arreter();
            voiture.accelerer();
        }
        
        catch(ViolationDeContrainteException exception)
        {
            throw new ViolationDeContrainteException();
        }  
    }

    @Test
    public void freinerEtatDemarreeTest() throws EtatIncorrectException, ViolationDeContrainteException 
    {
        System.out.println("freinerEtatDemarrée");
        
        voiture.monterConducteur(conducteur); 
        
        voiture.demarrer();
        voiture.accelerer();
        voiture.freiner();
        
        assertEquals(0, voiture.getVitesseActuelle());    
    }
    
    @Test(expected = EtatIncorrectException.class)
    public void freinerEtatArreteeTest() throws EtatIncorrectException, ViolationDeContrainteException 
    {
        System.out.println("freinerEtatArrêtée");
        
        try
        {
            voiture.arreter();
            voiture.freiner();
        }
        
        catch(ViolationDeContrainteException exception)
        {
            throw new ViolationDeContrainteException();
        }  
    }
    
    @Test
    public void roulerEtatDemarreeTest() throws EtatIncorrectException, ViolationDeContrainteException 
    {
        System.out.println("roulerEtatDémarrée");
        
        voiture.monterConducteur(conducteur); 
        
        voiture.demarrer();
        voiture.rouler(3);
        
        assertEquals(0, voiture.getVitesseActuelle());    
    }

    @Test(expected = EtatIncorrectException.class)
    public void roulerEtatArreteeTest() throws EtatIncorrectException, ViolationDeContrainteException 
    {
        System.out.println("roulerEtatArrêtée");
        
        voiture.arreter();
        voiture.rouler(3);  
    }
    
    @Test
    public void estPassagerTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("estPassager");
        
        voiture.monterConducteur(conducteur);
        
        voiture.demarrer();
        voiture.arreter();
        
        voiture.monter(passager1);
        voiture.estPassager(passager1);
        
        voiture.monter(passager2);
        voiture.estPassager(passager2);
    }
    
    @Test(expected = ViolationDeContrainteException.class)
    public void passagerDejaPassagerTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("passagerDéjàPassager");
        
        voiture.monterConducteur(conducteur);
        
        voiture.demarrer();
        voiture.arreter();
        
        voiture.monter(passager1);
        voiture.monter(passager2);
        
        voiture.estPassager(passager3);
        voiture.monter(passager3);
    }
    
    @Test
    public void estConducteurTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("estConducteur");
        
        voiture.monterConducteur(conducteur);
        
        voiture.demarrer();
        voiture.arreter();
        
        voiture.monter(passager1);
        voiture.estConducteur(conducteur);
    }
    
    @Test(expected = ViolationDeContrainteException.class)
    public void estConducteurDejaPassagerTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("estConducteurDéjàPassager");
        
        voiture.monterConducteur(conducteur);
        
        voiture.demarrer();
        voiture.arreter();
        
        voiture.monter(passager1);
        voiture.descendre(conducteur);
        
        voiture.monterConducteur(passager1);
        voiture.estConducteur(passager1);
    }
    
    @Test
    public void monterEtatArreteeTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("monterEtatArretée");
        
        voiture.monterConducteur(conducteur);
        
        voiture.demarrer();
        voiture.arreter();
        
        voiture.monter(passager1);
    }
    
    @Test(expected = EtatIncorrectException.class)
    public void monterDejaPassagerTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("monterDéjàPassager");
        
        voiture.monterConducteur(conducteur);
        
        voiture.demarrer();
        
        voiture.monter(passager1);
    }
    
    @Test(expected = EtatIncorrectException.class)
    public void descendreEtatDemarreeTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("descendreEtatDemarrée");
        
        voiture.monterConducteur(conducteur);
        
        voiture.demarrer();
        
        voiture.monter(passager1);
        
        voiture.demarrer();
        voiture.accelerer();
        
        voiture.descendre(passager1);
    }
    
    @Test
    public void descendreEtatArreteeTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("descendreEtatArretée");
        
        voiture.monterConducteur(conducteur);
        
        voiture.demarrer();
        voiture.arreter();
        
        voiture.monter(passager1);
        
        voiture.demarrer();
        voiture.accelerer();
        voiture.arreter();
        
        voiture.descendre(passager1);
    }
    
    @Test
    public void afficherPersonnesVoitureTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("afficherPersonnesVoiture");
        
        voiture.monterConducteur(conducteur);
        
        voiture.demarrer();
        voiture.arreter();
        
        voiture.monter(passager1);
        voiture.monter(passager2);
        voiture.monter(passager3);
        
        this.listePassager.add(conducteur.getNom());
        
        this.listePassager.add(passager1.getNom());
        this.listePassager.add(passager2.getNom());
        this.listePassager.add(passager3.getNom());
        
        for(int leI = 0; leI < listePassager.size(); leI++)
        {
            System.out.println("Numéro : " + leI);
            System.out.println("Nom : " + listePassager);
        }
    }   
    
    @Test
    public void afficherPersonnesVoitureVideTest() throws EtatIncorrectException, ViolationDeContrainteException
    {
        System.out.println("afficherPersonneVoitureVide");
        
        for(int leI = 0; leI < listePassager.size(); leI++)
        {
            System.out.println("Numéro : " + leI);
            System.out.println("Nom : " + listePassager);
        }
    }
    
    
}
