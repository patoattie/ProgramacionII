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

/*
Crear la clase fueraDeRangoExcepcion que hereda de la clase Exception. Cuyo constructor 
recibe como parámetro un String que representa un mensaje.
 La clase Main, tendrá un método verificarRango que recibe como parámetros dos enteros. 
Este método verifica si el primer parámetro es menor que 100 y el segundo mayor que 9. 
En caso de que no se cumplan estas condiciones, el método deberá lanzar una excepción 
del tipo fueraDeRangoExcepcion. 
Pedir en el método Main dos valores intentar dividirlos entre sí y manejar las 
correspondientes excepciones que se puedan generar.
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
