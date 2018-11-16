/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attiepatricio;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Biblioteca
{
    private int _capacidad;
    private ArrayList<Libro> _libros;

    public Biblioteca()
    {
        this._libros = new ArrayList<>();
    }

    public Biblioteca(int _capacidad)
    {
        this();
        this._capacidad = _capacidad;
    }
    
    private boolean estaEnBiblioteca(Libro unLibro)
    {
        boolean retorno = false;
        
        for (Libro _libro : this._libros)
        {
            if(_libro instanceof Manual && unLibro instanceof Manual && Manual.compararManuales((Manual)_libro, (Manual)unLibro))
            {
                retorno = true;
                break;
            }
            else if(_libro instanceof Novela && unLibro instanceof Novela && Novela.compararNovelas((Novela)_libro, (Novela)unLibro))
            {
                retorno = true;
                break;
            }
        }
        
        return retorno;
    }
    
    public boolean agregarLibro(Libro unLibro)
    {
        boolean retorno;
        
        if(this._libros.size() < this._capacidad)
        {
            if(!this.estaEnBiblioteca(unLibro))
            {
                retorno = this._libros.add(unLibro);
            }
            else
            {
                retorno = false;
            }
        }
        else
        {
            retorno = false;
        }
        
        return retorno;
    }
    
    public float getPrecioDeManuales()
    {
        float total = 0.0F;
        
        for (Libro _libro : this._libros)
        {
            if(_libro instanceof Manual)
            {
                total += _libro.getPrecio();
            }
        }
        
        return total;
    }

    public float getPrecioDeNovelas()
    {
        float total = 0.0F;
        
        for (Libro _libro : this._libros)
        {
            if(_libro instanceof Novela)
            {
                total += _libro.getPrecio();
            }
        }
        
        return total;
    }
    
    public float getPrecioTotal()
    {
        float total = this.getPrecioDeManuales() + this.getPrecioDeNovelas();
        
        return total;
    }
    
    private float ObtenerPrecio(EClaseLibro tipo)
    {
        float total;
        
        switch (tipo)
        {
            case Manual:
                total = this.getPrecioDeManuales();
                break;
            case Novela:
                total = this.getPrecioDeNovelas();
                break;
            case Todos:
                total = this.getPrecioTotal();
                break;
            default:
                total = 0.0F;
                break;
        }
        
        return total;
    }
    
    public static String MostrarBiblioteca(Biblioteca unaBiblioteca)
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("BIBLIOTECA").append("\n");
        cadena.append("----------").append("\n");
        cadena.append("Capacidad Total: ").append(unaBiblioteca._capacidad).append("\n");
        cadena.append("Espacio Restante: ").append(unaBiblioteca._capacidad - unaBiblioteca._libros.size()).append("\n");
        cadena.append("****************");
        
        for (Libro _libro : unaBiblioteca._libros)
        {
            if(_libro instanceof Manual)
            {
                cadena.append("\n").append(Manual.Mostrar(_libro));
            }
            else if(_libro instanceof Novela)
            {
                cadena.append("\n").append(Novela.Mostrar(_libro));
            }
            
            cadena.append("\n").append("****************");
        }
        
        cadena.append("\n").append("Recaudación por novela: ").append(unaBiblioteca.ObtenerPrecio(EClaseLibro.Novela));
        cadena.append("\n").append("Recaudación por manual: ").append(unaBiblioteca.ObtenerPrecio(EClaseLibro.Manual));
        cadena.append("\n").append("Recaudación por todo: ").append(unaBiblioteca.ObtenerPrecio(EClaseLibro.Todos));
        
        return cadena.toString();
    }
}
