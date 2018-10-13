/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;
import java.util.Scanner;
import genericas.Genericas;

/**
 *
 * @author Sil y Pato
 */
public class Alumno {
    private byte _nota1;
    private byte _nota2;
    private float _notaFinal;
    public String apellido;
    public String nombre;
    public int legajo;
    
    public Alumno()
    {
        Scanner lector = new Scanner(System.in);
        String unApellido;
        String unNombre;
        int unLegajo;
        byte nota1;
        byte nota2;
        boolean huboError = false;
        
        System.out.println("Ingrese Legajo del Alumno: ");
        unLegajo = lector.nextInt();
        if(unLegajo <= 0)
        {
            System.out.println("ERROR. El Legajo del Alumno debe ser un número positivo");
            huboError = true;
        }
        
        if(!huboError)
        {
            System.out.println("Ingrese Apellido del Alumno: ");
            unApellido = lector.next();
            if(unApellido.isEmpty())
            {
                System.out.println("ERROR. El Apellido del Alumno es un dato de ingreso obligatorio");
                huboError = true;
            }
            else
            {
                if(!Genericas.todosAlfabeticos(unApellido))
                {
                    System.out.println("ERROR. El Apellido del Alumno contiene caracteres no válidos");
                    huboError = true;
                }
            }
        }

        if(!huboError)
        {
            System.out.println("Ingrese Nombre del Alumno: ");
            unNombre = lector.next();
            if(unNombre.isEmpty())
            {
                System.out.println("ERROR. El Nombre del Alumno es un dato de ingreso obligatorio");
                huboError = true;
            }
            else
            {
                if(!Genericas.todosAlfabeticos(unNombre))
                {
                    System.out.println("ERROR. El Nombre del Alumno contiene caracteres no válidos");
                    huboError = true;
                }
            }
        }

        if(!huboError)
        {
            System.out.println("Ingrese Nota 1 del Alumno: ");
            nota1 = lector.nextByte();
            System.out.println("Ingrese Nota 2 del Alumno: ");
            nota2 = lector.nextByte();
            this.Estudiar(nota1, nota2);
            if(this._nota1 == 0 || this._nota2 == 0)
            {
                huboError = true;
            }
        }
    }
    
    public void CalcularFinal()
    {
        Random numeroAleatorio = new Random();
        
        if(this._nota1 >= 4 && this._nota2 >= 4)
        {
            this._notaFinal = numeroAleatorio.nextInt(10) + 1;
        }
        else
        {
            this._notaFinal = -1;
        }
    }
    
    public void Estudiar(byte notaUno, byte notaDos)
    {
        boolean huboError = false;
        
        if(notaUno < 1 || notaUno > 10)
        {
            System.out.println("ERROR. La nota 1 debe estar comprendida entre 1 y 10");
            huboError = true;
        }
        if(notaDos < 1 || notaDos > 10)
        {
            System.out.println("ERROR. La nota 2 debe estar comprendida entre 1 y 10");
            huboError = true;
        }
        
        if(!huboError)
        {
            this._nota1 = notaUno;
            this._nota2 = notaDos;
        }
    }
    
    public void Mostrar()
    {
        System.out.println("DATOS DEL ALUMNO");
        System.out.println("----------------");
        System.out.println("Legajo: " + this.legajo);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nota 1: " + this._nota1);
        System.out.println("Nota 2: " + this._nota2);
        if(this._notaFinal != -1)
        {
            System.out.println("Nota Final: " + this._notaFinal);
        }
    }
}
