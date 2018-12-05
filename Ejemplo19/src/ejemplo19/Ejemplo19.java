/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo19;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo19
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int x;
        int y;
        int z;
        Scanner lector=new Scanner(System.in);
        try
        {
            System.out.println("Ingrese un número: ");
            x = Integer.parseInt(lector.nextLine());
            System.out.println("Ingrese otro número: ");
            y = Integer.parseInt(lector.nextLine());
            z = x / y;
        }
        catch(NumberFormatException ex)
        {
            System.out.println("ERROR. Debe ingresar un número válido");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("ERROR. No se puede dividir por cero");
        }
        catch(Exception ex)
        {
            System.out.println("ERROR inesperado: " + ex.getMessage());
        }
    }
    
}
