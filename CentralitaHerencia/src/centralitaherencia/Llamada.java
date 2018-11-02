/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralitaherencia;

/**
 *
 * @author capacita_mecon
 */
public class Llamada
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
    
    public void Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("  Origen: ").append(this._nroOrigen).append("\n");
        cadena.append(" Destino: ").append(this._nroDestino).append("\n");
        cadena.append("Duración: ").append(this._duracion);
        
        System.out.println(cadena.toString());
    }
    
    public static int OrdenarPorDuracion(Llamada uno, Llamada dos)
    {
        return Float.compare(uno._duracion, dos._duracion);
    }
}
