/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP9;

/**
 *
 * @author taniaolivia
 */
public class EtatIncorrectException extends Exception
{
    public EtatIncorrectException()
    {
        super();
    }
    
    public EtatIncorrectException(String msg)
    {
        super(msg);
    }
}
