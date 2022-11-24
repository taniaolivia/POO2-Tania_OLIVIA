/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;
import java.time.LocalDate;
/**
 *
 * @author taniaolivia
 */
public class main 
{
    public static void main(String[] args) 
    {
        Client client = new Client("Tania ", "Olivia", "28 Rue du Cordouan, La Rochelle, 17000");
        
        System.out.println("____________________________________");
        System.out.println("               Client               ");
        System.out.println("____________________________________");
        System.out.println();
        System.out.println(client.toString());
        System.out.println();
        
        LocalDate localDate = LocalDate.now();
        Moto moto = new Moto(55, "Honda", 5, "XX5", localDate, "J9978");
        
        System.out.println("____________________________________");
        System.out.println("                Moto                ");
        System.out.println("____________________________________");
        System.out.println();
        
        System.out.println(moto.toString());
        System.out.println();
        System.out.println();
        
        LocalDate localDate1 = LocalDate.now();
        Voiture voiture = new Voiture(17, "Mercedes-Benz", 9, "S289", localDate1, "N0324");
        
        System.out.println("____________________________________");
        System.out.println("               Voiture              ");
        System.out.println("____________________________________");
        System.out.println();
        
        System.out.println(voiture.toString());
        System.out.println();
        System.out.println();
        
        LocalDate localDate2 = LocalDate.now();
        PoidsLourd poids = new PoidsLourd(21, "Renault", 5, "JG89", localDate2, "LL023");

        System.out.println("____________________________________");
        System.out.println("            Poids Lourd             ");
        System.out.println("____________________________________");
        System.out.println();
        
        System.out.println(poids.toString());
        System.out.println();
        System.out.println();
        
        
        System.out.println("____________________________________");
        System.out.println("     Les descriptions du contrat    ");
        System.out.println("____________________________________");
        System.out.println();
        
        System.out.println("Contrat Moto : ");
        System.out.println();
        System.out.println(moto.getDescriptionCourte()); 
        System.out.println();
        
        System.out.println("Contrat Voiture : ");
        System.out.println();
        System.out.println(voiture.getDescriptionCourte()); 
        System.out.println();
        
        System.out.println("Contrat Poids Lourd : ");
        System.out.println();
        System.out.println(poids.getDescriptionCourte());
        System.out.println();
        System.out.println();
        
        System.out.println("____________________________");
        System.out.println("      Les comparaisons    " );
        System.out.println("____________________________");
        System.out.println();
        
        System.out.println("Client - Client : " + client.equals(client));
        System.out.println("Moto - Voiture : " + moto.equals(voiture));
        System.out.println("Moto - Moto : " + moto.equals(moto));
        System.out.println("Moto - Poids Lourds : " + moto.equals(poids));
        System.out.println("Voiture - Moto  : " + voiture.equals(moto));
        System.out.println("Voiture - Voiture : " + voiture.equals(voiture));
        System.out.println("Voiture - Poids Lourds : " + voiture.equals(poids));
        System.out.println("Poids Lourds - Moto : " + poids.equals(moto));
        System.out.println("Poids Lourds - Poids Lourds : " + poids.equals(poids));
        System.out.println("Poids Lourds - Voiture  : " + poids.equals(voiture));
        System.out.println();
        System.out.println();
        
        System.out.println("____________________________________");
        System.out.println("             Hash Code              ");
        System.out.println("____________________________________");
        System.out.println();
        
        System.out.println("Client : " + client.hashCode());
        
        System.out.println("Moto : " + moto.hashCode());

        System.out.println("Voiture : " + voiture.hashCode());

        System.out.println("Poids Lourd : " + poids.hashCode());
        System.out.println();
        System.out.println();
        
        
        
    }
}
