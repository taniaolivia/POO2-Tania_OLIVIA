/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transport;

/**
 *
 * @author taniaolivia
 */
public class main 
{
     /**
     * @param args the command line arguments
     * @throws Transport.EncombrementLimiteAtteinteException
     */
    public static void main(String[] args) throws EncombrementLimiteAtteinteException 
    {
        Marchandise marchandise = new Marchandise(100, 50);
        
        System.out.println("____________________________________");
        System.out.println("               Aerien               ");
        System.out.println("____________________________________");
        System.out.println();
        
        Aerien aerien = new Aerien(200);
        
        System.out.println("Encombrement : " + aerien.calculEncombrement(marchandise));
        System.out.println("Cout : " + aerien.calculCout());
        System.out.println();
        System.out.println();
        
        System.out.println("____________________________________");
        System.out.println("            Aerien Urgent           ");
        System.out.println("____________________________________");
        System.out.println();
        
        AerienUrgent aerienUrgent = new AerienUrgent(300);
        
        System.out.println("Cout : " + aerienUrgent.calculCout());
        System.out.println();
        System.out.println();
        
        System.out.println("____________________________________");
        System.out.println("              Fluvial               ");
        System.out.println("____________________________________");
        System.out.println();
        
        Fluvial fluvial = new Fluvial(500);
        
        System.out.println("Encombrement : " +  fluvial.calculEncombrement(marchandise));
        System.out.println();
        System.out.println();
        
        System.out.println("____________________________________");
        System.out.println("              Routier               ");
        System.out.println("____________________________________");
        System.out.println();
        
        Routier routier = new Routier(400);
        
        System.out.println("Encombrement : " + routier.calculEncombrement(marchandise)); 
        System.out.println("Cout : " +  routier.calculCout()); 
        System.out.println();
        System.out.println();
    }
}
