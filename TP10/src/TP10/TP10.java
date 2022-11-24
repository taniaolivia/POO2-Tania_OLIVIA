/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP10;

import java.sql.Connection;
import java.sql.DriverManager;
import bd.ConnexionBD;
import java.sql.SQLException;
import java.util.List;
import metier.Personne;
/**
 *
 * @author taniaolivia
 */
public class TP10 
{
    public static void main(String[] args) throws SQLException
    {
        ConnexionBD connexion = new ConnexionBD("jdbc:derby:BD_TP10");
        connexion.initBD();
        
        try
        {
            connexion.creerTable();
        }
        
        catch(SQLException e)
        {
             System.err.println("Erreur lors de la création de la table");
        }
        
        Personne personne1 = new Personne(1,"Jone", "Malinaud", 15, "rue François de Vaux de Foletier", "17000", "La Rochelle", "0546513943");
        Personne personne2 = new Personne(2,"OLIVIAN", "Matthew", 8, "Rue du Hybride", "14250", "Jakarta", "0780712152");
        Personne personne3 = new Personne(3,"OLIVIA", "Tania", 8, "Rue du Hybride", "14250", "Jakarta", "0780712132");

        personne1.toString();
        personne2.toString();
        personne3.toString();
        
        connexion.ajouterPersonnes((List<Personne>) personne1);
        connexion.ajouterPersonnes((List<Personne>) personne2);
        connexion.ajouterPersonnes((List<Personne>) personne3);
        
        connexion.recupererPersonnes();
        
        connexion.recupererPersonneParNoTel("0546513943");
        
        connexion.recupererPersonnesParAdresse(15, "rue François de Vaux de Foletier");
        
        connexion.modifierPersonne(personne1);
   
    }
}
