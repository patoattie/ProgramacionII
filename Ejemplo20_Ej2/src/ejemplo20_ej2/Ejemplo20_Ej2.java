/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo20_ej2;

import java.util.Scanner;

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
        int opcion = 0;
        int dato;
        char tecla;
        
        Scanner lector = new Scanner(System.in);
        
        do
        {
            System.out.println("1 - Ingresar elemento");
            System.out.println("2 - Leer elemento");
            System.out.println("------");
            System.out.println("0 - Salir");
            
            opcion = lector.nextInt();
            
            switch(opcion)
            {
                case 1:
                    try
                    {
                        Pila.InsertarDato(opcion);
                    }
                    catch(DesbordePilaExcepcion e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try
                    {
                        dato = Pila.ExtraerDato();
                    }
                    catch(PilaVaciaExcepcion e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
    
            if(opcion != 0)
            {
                Ejemplo20_Ej2.pressAnyKeyToContinue();
                System.out.println("\n\n\n\n\n\n\n");
            }
        } while(opcion != 0);
    }
    
     public static void pressAnyKeyToContinue()
    { 
        System.out.println("Presione cualquier tecla para continuar...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
}
