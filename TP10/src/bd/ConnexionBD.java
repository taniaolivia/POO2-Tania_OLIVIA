/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import metier.Personne;
import java.util.ArrayList;
import java.sql.BatchUpdateException;


/**
 *
 * @author taniaolivia
 */
public class ConnexionBD 
{
    private String url;
    private Personne personne;
    
    public ConnexionBD(String url)
    {
        this.url = url;
    }
    
    public Connection initBD()
    {
        
        Connection con = null;
        try
        {
            this.url = "jdbc:derby:BD_TP10"; 
        
            Properties properties = new Properties();
            properties.put("create", "true"); 
            properties.put("user", "tania"); 
            properties.put("password", "love");

            con = DriverManager.getConnection(this.url, properties);
            
            return con;
        }
        
        catch(SQLException e)
        {
            System.err.println("impossible de se connecter à la base : " + this.url);
        } 
        
        return con;
        
    }
    
    
    public void creerTable() throws SQLException
    {
        Connection con = this.initBD();
        Statement statement = null;
        String createTable = "CREATE TABLE ANNUAIRE("
                + "ID CHAR(5) NOT NULL, "
                + "NOM VARCHAR(30) NOT NULL, "
                + "PRENOM VARCHAR(30) NOT NULL, "
                + "NORUE INTEGER NOT NULL, "
                + "NOMRUE VARCHAR(50) NOT NULL, " 
                + "CODEPOSTAL CHAR(5) NOT NULL, " 
                + "VILLE VARCHAR(20) NOT NULL, " 
                + "NOTEL CHAR(10), " 
                + "PRIMARY KEY (ID) "
                + ")";
       
        try 
        {
            statement = con.createStatement();

            System.out.println(createTable);
                       
            statement.execute(createTable);
          
            System.out.println("Table créé");
        } 
           
        catch(SQLException e)
        {
              System.err.println("Erreur lors de la création de la table");
        }
        
        finally 
        {
            if (statement != null) 
            {
                statement.close();
            }

            if (con != null) 
            {
                con.close();
            }
        }
    }
    
    public void ajouterPersonnes(List<Personne> liste) throws SQLException 
    {
        Connection con = this.initBD();
    
        String sql = "INSERT INTO ANNUAIRE" + "(NOM, PRENOM, NORUE, NOMRUE, CODEPOSTAL, VILLE, NOTEL)" + "VALUES" + "(?,?,?,?,?,?,?)";
        
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        try 
        {
            int count = 0;
            
            for (Personne personne : liste)
            {
                pstmt.setString(1, personne.getNom());
                pstmt.setString(2, personne.getPrenom());
                pstmt.setInt(3, personne.getNoRue());
                pstmt.setString(4, personne.getNomRue());
                pstmt.setString(5, personne.getCodePostal());
                pstmt.setString(6, personne.getVille());
                pstmt.setString(7, personne.getNoTel());
            
                pstmt.addBatch();
                count++;
            
                if (count % 100 == 0 || count == liste.size())
                {
                    pstmt.executeBatch();
                }
                
                System.out.println("Nuplets inséré dans la table");
            }
        }
        
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    public List<Personne> recupererPersonnes() throws SQLException
    {
        Connection con = this.initBD();
        List<Personne> liste = new ArrayList<Personne>();
        
        try
        {   
            String sql = "SELECT * FROM Annuaire";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next())
            {
                int id = rs.getInt(1);
                String nom = rs.getString(2);
                String prenom = rs.getString(3);
                int noRue = rs.getInt(4);
                String nomRue = rs.getString(5);
                String codePostal = rs.getString(6);
                String ville = rs.getString(7);
                String noTel = rs.getString(8);

                personne.setID(id);
                personne.setNoRue(noRue);
                personne.setNomRue(nomRue);
                personne.setCodePostal(codePostal);
                personne.setVille(ville);
                personne.setNoTel(noTel);
                liste.add(personne);
                
                System.out.println(id + " - " + personne.getNom() + " - " + personne.getPrenom()
                       + " - " + personne.getNoRue() + " - " + personne.getNomRue()
                       + " - " + personne.getCodePostal() + " - " + personne.getVille()
                       + " - " + personne.getNoTel());
            }
            rs.close();
            con.close();
        }
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        return liste;
    }
    
    public Personne recupererPersonneParNoTel(String noTel)
    {
        ArrayList<Personne> liste = new ArrayList<Personne>();
        
        Connection con = this.initBD();

        try
        {
            String sql = "SELECT * "
                        + "FROM ANNUAIRE "
                        + "WHERE NOTEL = 0546513943";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        
            while (rs.next())
            {
                personne.setNoTel(noTel);

                liste.add(personne);
                
                System.out.println(personne.getID() + " - " + personne.getNom() + " - " + personne.getPrenom()
                       + " - " + personne.getNoRue() + " - " + personne.getNomRue()
                       + " - " + personne.getCodePostal() + " - " + personne.getVille()
                       + " - " + personne.getNoTel());
            }
            rs.close();
            con.close();
        }
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        return null;
    }
    
    public List<Personne> recupererPersonnesParAdresse(int noRue, String nomRue) throws SQLException
    {
        Connection con = this.initBD();
        List<Personne> liste = new ArrayList<Personne>();
       
        try
        {   
            String sql = "SELECT * "
                    + "FROM ANNUAIRE "
                    + "WHERE NORUE = 15"
                    + "AND NOMRUE = rue François de Vaux de Foletier";
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next())
            {
                personne.setNoRue(noRue);
               
                personne.setNomRue(nomRue);

                liste.add(personne);
                
                System.out.println(personne.getID() + " - " + personne.getNom() + " - " + personne.getPrenom()
                       + " - " + personne.getNoRue() + " - " + personne.getNomRue()
                       + " - " + personne.getCodePostal() + " - " + personne.getVille()
                       + " - " + personne.getNoTel());
            }
            rs.close();
            con.close();
        }
        
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
        return liste;
   
    }
    
   public boolean modifierPersonne(Personne p)
   {
        String sql = "UPDATE ANNUAIRE "
                      + "SET NOTEL = 0546513933, "
                      + "WHERE ID = 1";

        try (Connection con = this.initBD(); PreparedStatement pstmt = con.prepareStatement(sql)) 
        {
            pstmt.setString(1, p.getNoTel());
            pstmt.executeUpdate();
            System.out.println("Le contenu de table a été modifié");
        } 
        
        catch (SQLException e) 
        {
            System.err.println("Erreur lors de la modification du contenu de la table");
        } 
        return true;
   }

}
