/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo8
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /* C O L A S
        ------------*/

        Queue<Integer> cola = new LinkedList<>();
        cola.offer(1);
        cola.offer(9);
        cola.offer(3);
        cola.offer(7);
        //int sizeCola;
        for (int i : cola)
        {
            System.out.println(i);
        }
        System.out.println("Cantidad de elementos encolados: " + cola.size());
        System.out.println("Primer elemento a desencolar: " + cola.peek());
        //Dos formas de desapilar (el atributo size() se actualiza dinámicamente a medida que desapilo)
        //1)
        //sizeCola = cola.size();
        //for (int i = 0; i < sizeCola; i++)
        //{
        //    System.out.println("Desencolo: " + cola.poll());
        //}
        //2)
        for (int i = cola.size(); i > 0; i--)
        {
            System.out.println("Desencolo: " + cola.poll());
        }
        System.out.println("Cantidad de elementos encolados: " + cola.size());

        /* P I L A S
        ------------

        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(9);
        pila.push(3);
        pila.push(7);
        //int sizePila;
        //System.out.println("7\n3\n9\n1");
        for (int i : pila)
        {
            System.out.println(i);
        }
        System.out.println("Cantidad de elementos apilados: " + pila.size());
        System.out.println("Primer elemento a desapilar: " + pila.peek());
        //Dos formas de desapilar (el atributo size() se actualiza dinámicamente a medida que desapilo)
        //1)
        //sizePila = pila.size();
        //for (int i = 0; i < sizePila; i++)
        //{
        //    System.out.println("Desapilo: " + pila.pop());
        //}
        //2)
        for (int i = pila.size(); i > 0; i--)
        {
            System.out.println("Desapilo: " + pila.pop());
        }
        System.out.println("Cantidad de elementos apilados: " + pila.size());
        */
    }
    
}
