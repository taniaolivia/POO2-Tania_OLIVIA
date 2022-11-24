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
public class Terrier extends Chien
{
    public Terrier(String nom)
    {
        super(nom);
    }

    @Override
    public void crier()
    {
        System.out.println("        Wwwoff wwwoff~");
    }
}
