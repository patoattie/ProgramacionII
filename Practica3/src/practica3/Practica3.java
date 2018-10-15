/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author Sil y Pato
 */
public class Practica3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        byte opcionMarca;
        byte opcionProcesador;
        String opcionEncendida;
        float unPeso;
        Computadora miComputadora;
        
        System.out.println("Marca");
        System.out.println("-----");
        for(EMarca f : EMarca.values())
        {
            System.out.println(f.ordinal() + " - " + f);
        }
        System.out.println("Seleccione la Marca:");
        opcionMarca = lector.nextByte();
        System.out.println("");
        System.out.println("Procesador");
        System.out.println("----------");
        for(EProcesador f : EProcesador.values())
        {
            System.out.println(f.ordinal() + " - " + f);
        }
        System.out.println("Seleccione el Procesador:");
        opcionProcesador = lector.nextByte();
        System.out.println("");
        System.out.println("Ingrese el Peso de la computadora:");
        unPeso = lector.nextFloat();
        
        miComputadora = new Computadora(opcionMarca, opcionProcesador, unPeso, false);

        miComputadora.Encender();
        miComputadora.InformarEstado();

        miComputadora.Apagar();
        miComputadora.InformarEstado();
    }
    
}
