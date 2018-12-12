/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo20_ej1;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo20_Ej1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            Ejemplo20_Ej1.verificarRango(101, 10);
        }
        catch(fueraDeRangoExcepcion e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            Ejemplo20_Ej1.verificarRango(101, 0);
        }
        catch(fueraDeRangoExcepcion e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            Ejemplo20_Ej1.verificarRango(55, 12);
        }
        catch(fueraDeRangoExcepcion e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void verificarRango(int par1, int par2) throws fueraDeRangoExcepcion
    {
        if(!(par1 < 100 && par2 > 9))
        {
            throw new fueraDeRangoExcepcion("ERROR. El parámetro 1 debe ser menor a 100 y el parámetro 2 mayor a 9");
        }
        else
        {
            System.out.println(par1 + " / " + par2 + " = " + ((float)par1 / par2));
        }
    }
    
}
