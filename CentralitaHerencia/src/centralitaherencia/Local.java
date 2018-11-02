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

    public float CostoLlamada()
    {
        return this.CalcularCosto();
    }
    
    private float CalcularCosto()
    {
        return this._costo * this._duracion;
    }
    
    @Override
    public void Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Llamada Local").append("\n");
        cadena.append("   Costo: ").append(this.CostoLlamada());
        super.Mostrar();
        System.out.println(cadena.toString());
    }
}
