/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo20_ej2;

import java.util.Stack;

/**
 *
 * @author capacita_mecon
 */
public class Pila
{
    public static int capacidad;
    //public static int[] a;
    public static Stack<Integer> numeros;
    
    static
    {
        numeros = new Stack<>();
        capacidad = 3;
    }
    
    public static void InsertarDato(int dato) throws DesbordePilaExcepcion
    {
        if(Pila.numeros.size() == Pila.capacidad)
        {
            throw new DesbordePilaExcepcion("ERROR. No puede almacenar más de " + Pila.capacidad + " elementos en la pila");
        }
        else
        {
            Pila.numeros.push(dato);
        }
    }

    public static int ExtraerDato() throws PilaVaciaExcepcion
    {
        int dato = 0;
        
        if(Pila.numeros.isEmpty())
        {
            throw new PilaVaciaExcepcion("ERROR. No hay elementos en la pila");
        }
        else
        {
            dato = Pila.numeros.pop();
        }
        
        return dato;
    }
}
