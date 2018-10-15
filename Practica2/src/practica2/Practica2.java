/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Sil y Pato
 */
public class Practica2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        Cuenta miCuenta = new Cuenta();
        String unNombre;
        long unaCuenta;
        double unSaldo;
        byte opcionTipoInteres;
        
        //Pido los datos por consola
        System.out.println("Ingrese número de cuenta:");
        unaCuenta = lector.nextLong();
        System.out.println("Ingrese nombre:");
        unNombre = lector.next();
        System.out.println("Tipo de Interés");
        System.out.println("---------------");
        for(ETipoInteres f : ETipoInteres.values())
        {
            System.out.println(f.ordinal() + " - " + f);
        }
        System.out.println("Seleccione el Tipo:");
        opcionTipoInteres = lector.nextByte();
        System.out.println("Ingrese el saldo de la cuenta");
        unSaldo = lector.nextDouble();
        
        //Invoco los setters
        miCuenta.setNroCuenta(unaCuenta);
        miCuenta.setNombre(unNombre);
        miCuenta.setTipoInteres(opcionTipoInteres);
        miCuenta.setSaldo(unSaldo);
        
        //Muestro la Cuenta a través de los getters
        System.out.println("");
        System.out.println("Datos de la Cuenta");
        System.out.println("------------------");
        System.out.println("Número: " + miCuenta.getNroCuenta());
        System.out.println("Nombre: " + miCuenta.getNombre());
        System.out.println("Tipo de Interés: " + miCuenta.getTipoInteres());
        System.out.println("Saldo: " + miCuenta.getSaldo());
    }
    
}
