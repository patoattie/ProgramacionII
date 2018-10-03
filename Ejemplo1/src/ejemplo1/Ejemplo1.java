/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unNumero;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        unNumero = lector.nextInt();
        System.out.println("El número es: " + unNumero);
    }
    
}
