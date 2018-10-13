/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;

/**
 *
 * @author Sil y Pato
 */
public class Alumno 
{
    private byte _nota1;
    private byte _nota2;
    private float _notaFinal;
    public String apellido;
    public String nombre;
    public int legajo;
    
    public Alumno(String apellido, String nombre, int legajo)
    {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
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
