/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author taniaolivia
 */
public class Connexion 
{
    private static final int NB_MAX_ESSAI = 3;
    private static final int LONGUEUR_MAX = 10;
    private int nbEssai = 0;
    private Utilisateur utilisateur = new Utilisateur("Tania", "Blackanduki");
    
    public Connexion()
    {
        super();
    }
    
    public boolean connecter(String login, String motDePasse) throws NbEssaisDepasseException, MauvaiseLongueurException, MauvaisMdPException, MauvaisLoginException
    {
        if (!login.equals(utilisateur.getLogin()))
        {
            throw new MauvaisLoginException("Mauvais login!");
        }
        
        if (!motDePasse.equals(utilisateur.getMotDePasse()))
        {
            throw new MauvaisMdPException("Mauvais mot de passe!");
        }
        
        if((LONGUEUR_MAX < utilisateur.getLogin().length())&& (LONGUEUR_MAX < utilisateur.getMotDePasse().length()))
        {
            throw new MauvaiseLongueurException("Mauvais login et mot de passe!");
        }
        
        if(NB_MAX_ESSAI < nbEssai)
        {
            throw new NbEssaisDepasseException("Nombre d'essai max atteinte ");
        }
        return true;
    }
    
    public int getNbEssai()
    {
        return this.nbEssai;
    }
}
