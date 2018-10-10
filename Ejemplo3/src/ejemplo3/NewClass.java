/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *
 * @author capacita_mecon
 */
public class NewClass
{

    private int x;
    private String cadena;
    public static int entero;

    public NewClass()
    {

    }

    public NewClass(int entero, String texto)
    {
        this.x = entero;
        this.cadena = texto;
    }

    //Constructor estático
    static
    {
        entero = 9;
    }

}
