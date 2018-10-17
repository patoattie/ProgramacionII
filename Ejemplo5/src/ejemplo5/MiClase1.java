/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo5;

import java.util.Date;

/**
 *
 * @author capacita_mecon
 */
public class MiClase1
{
    private int entero;
    private String cadena;
    private Date fecha;
    
    public MiClase1()
    {
        
    }

    public MiClase1(int entero, String cadena, Date fecha)
    {
        this.entero = entero;
        this.cadena = cadena;
        this.fecha = fecha;
    }
    
    public MiClase1(int entero, String cadena)
    {
        this.entero = entero;
        this.cadena = cadena;
    }
    
    public void CargarValor(int entero)
    {
        this.entero = entero;
    }
    
    public void CargarValor(String cadena)
    {
        this.cadena = cadena;
    }
    
    public void CargarValor(Date fecha)
    {
        this.fecha = fecha;
    }
    
    public void MostrarDatos()
    {
        System.out.println("Entero: " + this.entero);
        System.out.println("Cadena: " + this.cadena);

        if(this.fecha == null)
        {
            System.out.println("Fecha: null");
        }
        else
        {
            System.out.println("Fecha: " + this.fecha.toLocaleString());
        }
        System.out.println("-------------------");
    }
}
