/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author capacita_mecon
 */

/*
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(7);
        lista.add(1);
        lista.add(4);
        
        lista.forEach((_item) ->
        {
            System.out.println("Elemento: " + _item);
        });
        
        System.out.println("");

        for (int i = 0; i < lista.size(); i++)
        {
            System.out.println("Elemento: " + lista.get(i));
        }
        
        Collections.sort(lista); //Solamente ascendente.

        for (int i = 0; i < lista.size(); i++)
        {
            System.out.println("Elemento: " + lista.get(i));
        }
*/

public class Ejemplo7
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Perro perro1 = new Perro ("Renata", 10, eRaza.DALMATA);
        Perro perro2 = new Perro ("Maggie", 12, eRaza.BASSET);
        Perro perro3 = new Perro ("Max", 8, eRaza.OVEJERO);
        Perro perro4 = new Perro ("Pamela", 10, eRaza.COCKER);
        Perro perro5 = perro3; //Apuntan al mismo segmento del Heap
        
        Veterinaria vet1 = new Veterinaria("LA VETERINARIA");
        vet1.agregarPerro(perro1);
        vet1.agregarPerro(perro2);
        vet1.agregarPerro(perro3);
        vet1.agregarPerro(perro4);
        vet1.agregarPerro(perro5);
        
        System.out.println(vet1.mostrarVeterinaria());
        
        vet1.quitarPerro(2);
        System.out.println("Borro 2");
        System.out.println(vet1.mostrarVeterinaria());

        /*
        ArrayList<Perro> lista = new ArrayList<>();
        boolean esIgual = perro5.equals(perro3);

        lista.add(perro1);
        lista.add(perro2);
        lista.add(perro3);
        lista.add(perro4);
        lista.add(perro5);
        
        /*for (int i = 0; i < lista.size(); i++)
        {
            System.out.println(Perro.mostrarPerro(lista.get(i)));
        }*/
        /*
        for (Perro unPerro : lista)
        {
            System.out.println(Perro.mostrarPerro(unPerro));
        }
        if(esIgual)
        {
            System.out.println("Perro 5 y Perro 3 son el mismo objeto");
        }
        
        lista.remove(perro3);
        lista.remove(0); //Se puede usar indexOf, que dado un objeto retorna su indice
        for (Perro unPerro : lista)
        {
            System.out.println(Perro.mostrarPerro(unPerro));
        }
        */
        
    }
    
}
