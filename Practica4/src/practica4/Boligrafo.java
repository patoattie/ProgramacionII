/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.awt.Color;

/**
 *
 * @author pattie
 */
public class Boligrafo
{
    private Color _color;
    private int _tinta;
    private static final int CAPACIDAD = 100;
    
    public Boligrafo(Color colorBoligrafo, int cantidadTinta)
    {
        this._color = colorBoligrafo;
        this._tinta = cantidadTinta;
    }
    
    public Boligrafo(int cantidadTinta)
    {
        this(new Color(0, 0, 255), cantidadTinta); //Por defecto Azul.
    }
    
    public Boligrafo(Color colorBoligrafo)
    {
        this(colorBoligrafo, Boligrafo.CAPACIDAD); //Por defecto se llena con la capacidad del boligrafo.
    }
    
    public Boligrafo()
    {
        this(new Color(0, 0, 255), Boligrafo.CAPACIDAD); //Por defecto Azul y se llena con la capacidad del boligrafo.
    }
    
    public boolean Pintar(int gasto)
    {
        boolean retorno;
        
        if(this.getTinta() - gasto < 0)
        {
            retorno = false;
        }
        else
        {
            this._tinta -= gasto;
            retorno = true;
        }
        
        return retorno;
    }
    
    public void Recargar()
    {
        this._tinta = Boligrafo.CAPACIDAD;
    }

    public Color getColor()
    {
        return this._color;
    }

    public int getTinta()
    {
        return this._tinta;
    }
}
