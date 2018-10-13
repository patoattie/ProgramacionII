/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import genericas.Genericas;
import java.util.Scanner;

/**
 *
 * @author Sil y Pato
 */
public class Practica1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in);
        boolean huboError = false;
        Alumno alumno1 = null;
        Alumno alumno2 = null;
        Alumno alumno3 = null;
        
        if(!CargarAtributos(alumno1))
        {
            System.out.println("ERROR. No se pudo cargar en memoria el alumno 1");
        }

        if(!CargarAtributos(alumno2))
        {
            System.out.println("ERROR. No se pudo cargar en memoria el alumno 2");
        }

        if(!CargarAtributos(alumno3))
        {
            System.out.println("ERROR. No se pudo cargar en memoria el alumno 3");
        }
    }
    
    private static boolean CargarAtributos(Alumno unAlumno)
    {
        boolean retorno;

        Scanner lector = new Scanner(System.in);
        String unApellido;
        String unNombre;
        int unLegajo;
        byte nota1;
        byte nota2;

        System.out.println("Ingrese Legajo del Alumno: ");
        unLegajo = lector.nextInt();
        
        System.out.println("Ingrese Apellido del Alumno: ");
        unApellido = lector.next();

        System.out.println("Ingrese Nombre del Alumno: ");
        unNombre = lector.next();
        
        retorno = ValidarAtributosPublicos(unApellido, unNombre, unLegajo);
        
        if(retorno)
        {
            unAlumno = new Alumno(unApellido, unNombre, unLegajo);
            
            System.out.println("Ingrese Nota 1 del Alumno: ");
            nota1 = lector.nextByte();
            System.out.println("Ingrese Nota 2 del Alumno: ");
            nota2 = lector.nextByte();
            unAlumno.Estudiar(nota1, nota2);
            unAlumno.CalcularFinal();
            unAlumno.Mostrar();
        }

        return retorno;
    }
    
    private static boolean ValidarAtributosPublicos(String apellido, String nombre, int legajo)
    {
        boolean retorno = true;
        
        if(legajo <= 0)
        {
            System.out.println("ERROR. El Legajo del Alumno debe ser un número positivo");
            retorno = false;
        }

        if(apellido.isEmpty())
        {
            System.out.println("ERROR. El Apellido del Alumno es un dato de ingreso obligatorio");
            retorno = false;
        }
        else
        {
            if(!Genericas.todosAlfabeticos(apellido))
            {
                System.out.println("ERROR. El Apellido del Alumno contiene caracteres no válidos");
                retorno = false;
            }
        }

        if(nombre.isEmpty())
        {
            System.out.println("ERROR. El Nombre del Alumno es un dato de ingreso obligatorio");
            retorno = false;
        }
        else
        {
            if(!Genericas.todosAlfabeticos(nombre))
            {
                System.out.println("ERROR. El Nombre del Alumno contiene caracteres no válidos");
                retorno = false;
            }
        }

        return retorno;
    }
}
