/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import static Exercise1.Devise.DOLLAR;

/**
 *
 * @author taniaolivia
 */
public class main 
{
     public static void main(String[] args) throws DecouvertNonAutoriseException 
     {
         Compte client1 = new Compte(13780972, DOLLAR);
         Compte client2 = new Compte(67397492, DOLLAR);
        

        
        System.out.println("-------------------------------------------------------");
        System.out.println("                        Client 1                       ");
        System.out.println("-------------------------------------------------------");
        System.out.println();
        
        System.out.println("-------------------------------------------------------");
        System.out.println("               Votre historique du compte              ");
        System.out.println("-------------------------------------------------------"); 
        System.out.println();
        
        try
        {
            System.out.println(client1.toString());
            client1.deposer(400);
        
            client1.setCreditAutorise(70);
            System.out.println();
            
            System.out.println("   ~Vous avez débité un montant de 400 " + Devise.DOLLAR + " sur votre compte~");
            System.out.println();
        }

        finally
        {
            System.out.println(client1.toString());
        }
        
        System.out.println();
        System.out.println("-------------------------------------------------------"); 
        System.out.println();
        
        
        try
        {
            System.out.println(client1.toString());
            System.out.println();
            
            client1.setCreditAutorise(70);
            System.out.println();
            
            client1.retirer(50);
            
            System.out.println("   ~Vous avez retiré un montant de 50 " + Devise.DOLLAR + " sur votre compte~");
            System.out.println();
        }

        catch(DecouvertNonAutoriseException decouvertException)
        {
            System.out.println(decouvertException.getMessage());
        }
        
        finally
        {
            System.out.println(client1.toString());
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("-------------------------------------------------------");
        System.out.println("                        Client 2                       ");
        System.out.println("-------------------------------------------------------");
        System.out.println();
        
        System.out.println("-------------------------------------------------------");
        System.out.println("               Votre historique du compte              ");
        System.out.println("-------------------------------------------------------"); 
        System.out.println();
        
        try
        {
            System.out.println(client2.toString());
           
            client2.setCreditAutorise(500);
            
            System.out.println();
             
            client2.deposer(650);
            System.out.println("   ~Vous avez débité un montant de 650 " + Devise.DOLLAR + " sur votre compte~");
            System.out.println();
        }

        finally
        {
            System.out.println(client2.toString());
        }
        
        System.out.println();
        System.out.println("-------------------------------------------------------"); 
        System.out.println();
        
        
        try
        {
            System.out.println(client1.toString());
            System.out.println();
            
            client2.setCreditAutorise(500);
            System.out.println();
            
            client2.retirer(350);
            
            System.out.println("   ~Vous avez retiré un montant de 350 " + Devise.DOLLAR + " sur votre compte~");
            System.out.println();
        }

        catch(DecouvertNonAutoriseException decouvertException)
        {
            System.out.println(decouvertException.getMessage());
        }
        
        finally
        {
            System.out.println(client2.toString());
        }
        
        System.out.println();
        System.out.println();
     }
}
