/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercise1;

/**
 *
 * @author taniaolivia
 */
public abstract class Chien implements Animal
{
    protected int age;
    protected String nom;

    public Chien(String nom)
    {
        this.nom = nom;
        age = 0;
    }

    public void vieillir()
    {
        this.age +=7;
    }

    public void afficher()
    {
        System.out.println("        Salut! Je suis un chien ^-^");
        System.out.println("        Je m'appelle " + this.nom + " woof~");
        System.out.println("        J'ai " + this.age + " ans woof~");
    }

    public abstract void crier();
}
