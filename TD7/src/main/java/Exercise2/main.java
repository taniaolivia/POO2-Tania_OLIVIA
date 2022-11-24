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
public class main 
{
    public static void main(String [] args)
    {
        ArticleElectromenager microondes = new ArticleElectromenager(19, 28, "Micro-ondes", "Panasonic", 3);
        ArticleElectromenager toasteur = new ArticleElectromenager(16, 24, "Toasteur", "Philip", 6);
        
        System.out.println("____________________________________");
        System.out.println("    Les articles d'electromenager   ");
        System.out.println("____________________________________");
        System.out.println();
        
        System.out.println("Articles : ");
        System.out.println();
        System.out.println("~" + microondes.toString());
        System.out.println("~" + toasteur.toString());
        System.out.println();
        System.out.println();
        
        System.out.println("____________________________________");
        System.out.println("    Remplissage de Micro-ondes   " );
        System.out.println("____________________________________");
        System.out.println();
        
        System.out.println("Micro-ondes : " + microondes.remplirStock(3) + " €");
        System.out.println();
        
        System.out.println("o Vente 1 : ");
        System.out.println();
        System.out.println("    ~Prix de vente : " + microondes.vendre(2) + " €");
        System.out.println("    ~Bénéfice de vente : " + microondes.benefice() + " €");
        System.out.println();
        
        System.out.println("o Vente 2 : ");
        System.out.println();
        System.out.println("    ~Prix de vendre : " + microondes.vendre(1) + " €");
        System.out.println("    ~Bénéfice de vente : " + microondes.benefice() + " €");
        System.out.println();
        System.out.println();
        
        System.out.println("____________________________________");
        System.out.println("      Remplissage de Toasteur    " );
        System.out.println("____________________________________");
        System.out.println();
        
        System.out.println("Toasteur : " + toasteur.remplirStock(5) + " €");
        System.out.println();
        
        
        System.out.println("o Vente 1 : ");
        System.out.println();
        System.out.println("    ~Prix de vente : " + toasteur.vendre(2) + " €");
        System.out.println("    ~Bénéfice de vente : " + toasteur.benefice() + " €");
        System.out.println();
        
        System.out.println("o Vente 2 : ");
        System.out.println();
        System.out.println("    ~Prix de vente : " + toasteur.vendre(4) + " €");
        System.out.println("    ~Bénéfice de vente : " + toasteur.benefice() + " €");
        System.out.println();
        System.out.println();

        System.out.println("____________________________");
        System.out.println("      Les comparaisons    " );
        System.out.println("____________________________");
        System.out.println();
        
        System.out.println("Micro-ondes - Toasteur : " + microondes.equals(toasteur));
        System.out.println("Micro-ondes - Micro-ondes : " + microondes.equals(microondes));
        System.out.println("Toasteur - Toasteur : " + toasteur.equals(toasteur));
        System.out.println("Toasteur - Micro-ondes  : " + toasteur.equals(microondes));
        System.out.println();
        System.out.println();
        
        System.out.println("Hash code de microondes : " + microondes.hashCode());
    }
}
