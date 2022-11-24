/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;
import java.util.Scanner;
import java.lang.NoSuchMethodException;
import java.lang.IllegalStateException;
/**
 *
 * @author taniaolivia
 */
public class main 
{
    public static void main(String[] args) throws MauvaisLoginException, MauvaisMdPException, 
                                         MauvaiseLongueurException, NbEssaisDepasseException
    {
        Connexion connexion = new Connexion();
        
        boolean isConnected = false;
        
        try(Scanner scanner = new Scanner(System.in))
        {
            while (!isConnected)
            {
                System.out.println("Entrez votre login : ");
                String login = scanner.nextLine();
                    
                System.out.println("Entrez le mot de passe : ");
                String motdepasse = scanner.nextLine();
                
                try 
                {
                    if(connexion.connecter(login, motdepasse))
                    {
                        isConnected = true;
                        System.out.println("Vous êtes connecté !");
                    }
                } 
                
                catch (NbEssaisDepasseException nbEssais) 
                {
                    System.out.println(nbEssais.getMessage());
                    break;
                } 
                
                catch (MauvaisLoginException mauvaisLog) 
                {
                    System.out.println(mauvaisLog.getMessage());
                    break;
                } 
                
                catch (MauvaisMdPException mauvaisMdP) 
                {
                    System.out.println(mauvaisMdP.getMessage());
                    break;
                } 
                
                catch (MauvaiseLongueurException mauvaiseLongueur) 
                {
                    System.out.println(mauvaiseLongueur.getMessage());
                    break;
                }
            }
        }
    }
}

