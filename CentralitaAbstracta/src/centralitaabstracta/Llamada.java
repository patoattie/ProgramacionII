/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralitaabstracta;

import java.util.Comparator;

/**
 *
 * @author capacita_mecon
 */
public abstract class Llamada
{
    protected float _duracion;
    protected String _nroDestino;
    protected String _nroOrigen;

    public Llamada(String origen, String destino, float duracion)
    {
        this._duracion = duracion;
        this._nroDestino = destino;
        this._nroOrigen = origen;
    }
    
    public float getDuracion()
    {
        return _duracion;
    }

    public String getNroDestino()
    {
        return _nroDestino;
    }

    public String getNroOrigen()
    {
        return _nroOrigen;
    }
    
    /*
    public static int OrdenarPorDuracion(Llamada uno, Llamada dos)
    {
        int retorno;
        
        if(uno._duracion > dos._duracion)
        {
            retorno = 1;
        }
        else if(uno._duracion < dos._duracion)
        {
            retorno = -1;
        }
        else
        {
            retorno = 0;
        }
        
        return retorno;
    }
    */
    public static Comparator<Llamada> CompararDuracionAsc = ((uno, dos) ->
    {
        int retorno;
        
        if(uno._duracion > dos._duracion)
        {
            retorno = 1;
        }
        else if(uno._duracion < dos._duracion)
        {
            retorno = -1;
        }
        else
        {
            retorno = 0;
        }
        
        return retorno;
    });
    
    public static boolean CompararLlamadas(Llamada uno, Llamada dos)
    {
        boolean retorno;
        
        if(uno.equals(dos))
        {
            retorno = (uno._nroOrigen.equals(dos._nroOrigen) && uno._nroDestino.equals(dos._nroDestino));
        }
        else
        {
            retorno = false;
        }
        
        return retorno;
    }
    
    public abstract float getCostoLlamada();
    protected abstract String Mostrar();

    @Override
    public String toString()
    {
        return this.Mostrar();
    }
}
