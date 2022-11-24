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
public class MauvaisLoginException extends Exception
{
        public MauvaisLoginException()
    {
        super();
    }
    
    public MauvaisLoginException(String message)
    {
        super(message);
    }
}
