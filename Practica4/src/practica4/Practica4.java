/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.awt.Color;

/**
 *
 * @author pattie
 */
public class Practica4
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Color colorAzul = new Color(0, 0, 255); //RGB
        Color colorRojo = new Color(255, 0, 0); //RGB
        Boligrafo biromeAzul = new Boligrafo(colorAzul, 100);
        Boligrafo biromeRoja = new Boligrafo(colorRojo, 50);
                
        System.out.println("Birome Azul");
        System.out.println("-----------");
        System.out.println("Cantidad de Tinta: " + biromeAzul.getTinta());
        System.out.println("Utilizo 30 para pintar");
        if(!biromeAzul.Pintar(30))
        {
            System.out.println("Está intentado gastar por encima de la cantidad actual de tinta (" + biromeAzul.getTinta() + ")");
        }
        System.out.println("Cantidad de Tinta: " + biromeAzul.getTinta());
        System.out.println("");
        System.out.println("Birome Roja");
        System.out.println("-----------");
        System.out.println("Cantidad de Tinta: " + biromeRoja.getTinta());
        System.out.println("Utilizo 40 para pintar");
        if(!biromeRoja.Pintar(40))
        {
            System.out.println("Está intentado gastar por encima de la cantidad actual de tinta (" + biromeRoja.getTinta() + ")");
        }
        System.out.println("Cantidad de Tinta: " + biromeRoja.getTinta());
        System.out.println("");
        System.out.println("Recargo ambar biromes");
        biromeAzul.Recargar();
        biromeRoja.Recargar();
        System.out.println("Cantidad de Tinta Birome Azul: " + biromeAzul.getTinta());
        System.out.println("Cantidad de Tinta Birome Roja: " + biromeRoja.getTinta());
    }
    
}
