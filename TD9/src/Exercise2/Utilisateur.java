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
public class Utilisateur
{
    private final String login;
    private String motDePasse;
    
    public Utilisateur(String login, String motDePasse)
    {
        this.login = login;
        this.motDePasse = motDePasse;
    }
    
    public String getLogin()
    {
        return this.login;
    }
    
    public String getMotDePasse()
    {
        return this.motDePasse;
    }
    
    public void setMotDePasse(String motDePasse)
    {
        this.motDePasse = motDePasse;
    }
}
