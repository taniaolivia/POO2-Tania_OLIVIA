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
public class Appaloosa extends Cheval
{
    public Appaloosa(String nom)
    {
        super(nom);
    }

    @Override
    public void crier()
    {
        System.out.print("        hihi hihi~");
    }
}
