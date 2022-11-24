/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP9;
import java.util.HashSet;
/**
 *
 * @author taniaolivia
 */
public class Voiture 
{
    public static final int VITESSE_MAX = 180;
    public static final int VITESSE_MIN = 0;
    private final String marque;
    private final String modele;
    private final String immatriculation;
    private final int nbPassegerMax;
    private final double PTAC;
    private int vitesseActuelle;
    private int nbKilometres;
    private int poidsActuel;
    private EtatVoiture etat;
    private Personne conducteur;
    private Personne passagers;
    HashSet<String> listePassager; 
    private int nbPassager = 0;
    
    public Voiture(String marque, String modele, String immatriculation, int nbPassegerMax, double PTAC, int vitesseActuelle, int nbKilometres, int poidsActuel)
    {
        this.marque = marque;
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.nbPassegerMax = nbPassegerMax;
        this.PTAC = PTAC;
        this.vitesseActuelle = vitesseActuelle;
        this.nbKilometres = nbKilometres;
        this.poidsActuel = poidsActuel;
    }
    
    public int getNbPassargers()
    {
        this.listePassager = new HashSet<String>();
        
        for(int leI = 0; leI < listePassager.size(); leI++)
        {
            this.nbPassager++;
        }
        
        return nbPassager;
    }
    
    public void monterConducteur(Personne conducteur) throws EtatIncorrectException
    {
        if(this.etat != EtatVoiture.DEMARREE)
        {
            throw new EtatIncorrectException("Impossible de monter le conducteur lorsque la voiture n’est pas arrêtée !");
        }
        
        else
        {
            this.poidsActuel += conducteur.getPoids();
        }     
    }
    
    public void demarrer() throws EtatIncorrectException, ViolationDeContrainteException
    {
        if(this.etat == EtatVoiture.DEMARREE)
        {
            throw new EtatIncorrectException("La voiture est déjà démarrée !");
        }
        
        else if(conducteur == null)
        {
            throw new ViolationDeContrainteException("Impossible de démarrer sans conducteur !");
        }
        
        else
        {
            this.etat = EtatVoiture.DEMARREE;
        }  
    }
    
    public void arreter() throws EtatIncorrectException
    {
        if(this.etat == EtatVoiture.ARRETEE)
        {
            throw new EtatIncorrectException("La voiture est déjà arretée !");
        }
        
        else
        {
            this.etat = EtatVoiture.ARRETEE;
            this.vitesseActuelle = VITESSE_MIN;
            this.poidsActuel -= conducteur.getPoids();
        } 
    }
    
    public void accelerer() throws EtatIncorrectException, ViolationDeContrainteException
    {
        if(this.etat == EtatVoiture.ARRETEE)
        {
            throw new EtatIncorrectException("La voiture n'est pas démarée !");
        }
        
        if(this.vitesseActuelle >= VITESSE_MAX)
        {
            throw new ViolationDeContrainteException("Vitesse maximal atteinte !");
        }
        
        else
        {
            this.vitesseActuelle += 10;
        }        
    }
    
    public void freiner() throws EtatIncorrectException, ViolationDeContrainteException
    {
        if(this.etat == EtatVoiture.ARRETEE)
        {
            throw new EtatIncorrectException("La voiture n'est pas démarée !");
        }
        
        if(this.vitesseActuelle == VITESSE_MIN)
        {
            throw new ViolationDeContrainteException("Vitesse minimal atteinte !");
        }
        
        else
        {
            this.vitesseActuelle -= 10;
        }
            
    }
    
    public void rouler(int nbHeures) throws EtatIncorrectException
    { 
        if(this.etat == EtatVoiture.ARRETEE)
        {
            throw new EtatIncorrectException("La voiture est arrêtée !");
        }
        
        else
        {
            this.nbKilometres += nbHeures * this.vitesseActuelle;
        }
            
    }
    
    public boolean estPassager(Personne p)
    {
        for(int leI = 0; leI < listePassager.size(); leI++)
        {
            if(listePassager.contains(p.getNom()))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean estConducteur(Personne p)
    {
        if(p == conducteur)
        {
            return true;
        }
            
        else
        {
            return false;
        }
            
    }
    
    public void monter(Personne unPassager) throws EtatIncorrectException, ViolationDeContrainteException
    {
        if(this.etat != EtatVoiture.ARRETEE)
        {
            throw new EtatIncorrectException("La voiture n'est pas arrêtée !");
        }
        
        if(this.nbPassager == this.nbPassegerMax)
        {
            throw new ViolationDeContrainteException("Plus de place !");
        }
        
        if((this.poidsActuel + unPassager.getPoids()) >= this.PTAC)
        {
            throw new ViolationDeContrainteException("Passager trop Lourd !");
        }
        
        if(unPassager.equals(passagers))
        {
            throw new ViolationDeContrainteException("Personne déjà passager");
        }
        
        if(unPassager.equals(conducteur))
        {
            throw new ViolationDeContrainteException("Personne déjà conducteur");
        }
        
        else
        {
            this.listePassager.add(unPassager.getNom());
            this.poidsActuel += unPassager.getPoids();
        }
    }
    
    public void descendre(Personne unPassager) throws EtatIncorrectException, ViolationDeContrainteException
    {
        for(int leI = 0; leI < listePassager.size(); leI++)
        {
            if(!listePassager.contains(unPassager.getNom()))
            {
                throw new ViolationDeContrainteException("Le passager n’existe pas");
            }
        }
        
        if(this.etat != EtatVoiture.ARRETEE)
        {
            throw new EtatIncorrectException("La voiture n'est pas arrêtée!");
        }
        
        if(this.nbPassager == 0)
        {
            throw new ViolationDeContrainteException("Il n’y a plus de passager!");
        }
        
        else
        {
            this.listePassager.remove(unPassager);
            this.poidsActuel -= unPassager.getPoids();
        }
    }
    
    public void afficherPersonnes()
    {
        for(int leI = 0; leI < listePassager.size(); leI++)
        {
            System.out.println("Numéro : " + leI);
            System.out.println("Nom : " + listePassager);
        }
    }
    
    public String getMarque()
    {
        return this.marque;
    }
    
    public String getModele()
    {
        return this.modele;
    }
    
    public String getImmatriculation()
    {
        return this.immatriculation;
    }
    
    public int getNbPassegerMax()
    {
        return this.nbPassegerMax;
    }
    
    public double getPTAC()
    {
        return this.PTAC;
    }
    
    public int getVitesseActuelle()
    {
        return this.vitesseActuelle;
    }
    
    public int getNbKilometres()
    {
        return this.nbKilometres;
    }
    
    public int getPoidsActuel()
    {
        return this.poidsActuel;
    }
}
