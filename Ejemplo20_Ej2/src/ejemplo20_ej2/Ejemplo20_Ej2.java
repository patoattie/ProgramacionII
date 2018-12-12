/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo20_ej2;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */

/*
Crear las siguientes Excepciones:
    a. DesbordePilaExcepcion cuyo constructor recibirá un String que representa un mensaje.
    b. PilaVaciaExcepcion cuyo constructor recibirá un String que representa un mensaje.

Crear la clase Pila que poseerá los siguientes atributos públicos y de clase:
int capacidad
int[] a
Stack<Integer> numeros

Con los siguientes métodos:

void InsertarDato(int) para sumar elementos a la pila. Para ello deberá verificar que la 
cantidad de elementos que tiene la pila no supere el valor de la capacidad de la colección. 
En caso contrario lanzar la excepción correspondiente
ExtraerDato() para retirar el tope de la pila. En el caso de que no haya elementos para 
retirar, lanzar la excepción correspondiente.

En el método Main, realizar un menú de opciones en donde se pueda interactuar con un 
menú de usuarios que permita agregar, quitar y mostrar los elementos de una pila. 
Manejar las excepciones que se puedan llegar a generar.
*/

public class Ejemplo20_Ej2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int opcion = 0;
        int dato;
        
        Scanner lector = new Scanner(System.in);
        
        do
        {
            System.out.println("1 - Ingresar elemento");
            System.out.println("2 - Quitar elemento");
            System.out.println("3 - Mostrar los elementos");
            System.out.println("------");
            System.out.println("0 - Salir");
            
            opcion = lector.nextInt();
            
            switch(opcion)
            {
                case 1:
                    try
                    {
                        Pila.InsertarDato(opcion);
                    }
                    catch(DesbordePilaExcepcion e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try
                    {
                        dato = Pila.ExtraerDato();
                    }
                    catch(PilaVaciaExcepcion e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    if(Pila.numeros.isEmpty())
                    {
                        System.out.println("No hay elementos");
                    }
                    else
                    {
                        for (int elemento : Pila.numeros)
                        {
                            System.out.println(elemento);
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
    
            if(opcion != 0)
            {
                Ejemplo20_Ej2.presioneCualquierTecla();
                System.out.println("\n\n\n\n\n\n\n");
            }
        } while(opcion != 0);
    }
    
    public static void presioneCualquierTecla()
    { 
        System.out.println("Presione cualquier tecla para continuar...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
}
