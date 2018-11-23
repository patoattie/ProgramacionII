/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralitaabstracta;

/**
 *
 * @author capacita_mecon
 */
public class Local extends Llamada
{
    protected float _costo;

    public Local(String origen, float duracion, String destino, float costo)
    {
        super(origen, destino, duracion);
        this._costo = costo;
    }

    public Local(Llamada unaLlamada, float costo)
    {
        this(unaLlamada._nroOrigen, unaLlamada._duracion, unaLlamada._nroDestino, costo);
    }

    @Override
    public float getCostoLlamada()
    {
        return this.CalcularCosto();
    }
    
    private float CalcularCosto()
    {
        return this._costo * this._duracion;
    }
    
    @Override
    protected String Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        cadena.append("  Origen: ").append(this._nroOrigen).append("\n");
        cadena.append(" Destino: ").append(this._nroDestino).append("\n");
        cadena.append("Duración: ").append(this._duracion).append("\n");
        cadena.append("Llamada Local").append("\n");
        cadena.append("   Costo: ").append(this.getCostoLlamada());
        return cadena.toString();
    }
    
    @Override
    public boolean equals(Object unaLlamada)
    {
        boolean retorno = unaLlamada instanceof Local;
        
        return retorno;
    }
}
