/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo6;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] miVector = new int[5];
        Scanner lector = new Scanner(System.in);
        int[] otroVector;
        
        for (int i = 0; i < miVector.length; i++)
        {
            System.out.println("Ingrese posicion " + i);
            miVector[i] = lector.nextInt();
        }

        System.out.println("Mi Vector:");
        for (int i = 0; i < miVector.length; i++)
        {
            System.out.println(i + ") " + miVector[i]);
        }
        
        otroVector = miVector.clone();
        System.out.println("Otro Vector:");
        for (int i = 0; i < otroVector.length; i++)
        {
            System.out.println(i + ") " + otroVector[i]);
        }

        System.out.println("Modifico Mi Vector:");
        for (int i = 0; i < miVector.length; i++)
        {
            miVector[i] = i + 1;
        }

        System.out.println("Mi Vector:");
        for (int i = 0; i < miVector.length; i++)
        {
            System.out.println(i + ") " + miVector[i]);
        }

        System.out.println("Otro Vector:");
        for (int i = 0; i < otroVector.length; i++)
        {
            System.out.println(i + ") " + otroVector[i]);
        }
        //Utilizando un foreach
        for (int i : otroVector)
        {
            System.out.println(i);
        }
    }
    
}
