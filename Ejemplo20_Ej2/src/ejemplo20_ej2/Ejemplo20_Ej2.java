/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo20_ej2;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo20_Ej2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int numero; 
        
        System.out.println("Cargo en la pila");
        for(int i = 0; i < 4; i++)
        {
            try
            {
                Pila.InsertarDato(i);
                System.out.println(i + 1);
            }
            catch(DesbordePilaExcepcion e)
            {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Leo desde la pila");
        for(int i = 0; i < 4; i++)
        {
            try
            {
                numero = Pila.ExtraerDato();
                System.out.println(numero + 1);
            }
            catch(PilaVaciaExcepcion e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
