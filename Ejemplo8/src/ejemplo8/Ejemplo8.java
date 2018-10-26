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
        Queue<Turno> colaUrgente = new LinkedList<>();
        Queue<Turno> colaNormal = new LinkedList<>();
        
        Paciente p1 = new Paciente("1234", "Perez");
        Paciente p2 = new Paciente("2345", "Garcia");
        Paciente p3 = new Paciente("3456", "Fernandez");
        Paciente p4 = new Paciente("4567", "Gomez");
        
        Turno t1 = new Turno(p4, eTipo.NORMAL);
        Turno t2 = new Turno(p2, eTipo.NORMAL);
        Turno t3 = new Turno(p3, eTipo.URGENTE);
        Turno t4 = new Turno(p1, eTipo.URGENTE);
        
        /* C O L A S
        ------------

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
        //Tres formas de desapilar (el atributo size() se actualiza dinámicamente a medida que desapilo)
        //1)
        //sizeCola = cola.size();
        //for (int i = 0; i < sizeCola; i++)
        //{
        //    System.out.println("Desencolo: " + cola.poll());
        //}
        //2)
        //for (int i = cola.size(); i > 0; i--)
        //{
        //    System.out.println("Desencolo: " + cola.poll());
        //}
        //3)
        while (cola.size() > 0)
        {
            System.out.println("Desencolo: " + cola.poll());
        }
        System.out.println("Cantidad de elementos encolados: " + cola.size());
        */
        
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
        //Tres formas de desapilar (el atributo size() se actualiza dinámicamente a medida que desapilo)
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
        //3)
        while (pila.size() > 0)
        {
            System.out.println("Desapilo: " + pila.pop());
        }
        System.out.println("Cantidad de elementos apilados: " + pila.size());
        */
    }
    
}
