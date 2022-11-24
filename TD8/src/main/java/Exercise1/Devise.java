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
public enum Devise 
{
    EURO("EURO"), DOLLAR("DOLLAR");
    
    private String symbole;
    
    private Devise(String symbole)
    {
        this.symbole = symbole;
    }
    
    public String getSymbole()
    {
        return symbole;
    }
}
