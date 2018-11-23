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
public class Provincial extends Llamada
{
    protected Franja _franjaHoraria;
    protected float _costo;

    public Provincial(String origen, Franja miFranja, float duracion, String destino)
    {
        super(origen, destino, duracion);
        this._franjaHoraria = miFranja;
    }

    public Provincial(Franja miFranja, Llamada unaLlamada)
    {
        this(unaLlamada._nroOrigen, miFranja, unaLlamada._duracion, unaLlamada._nroDestino);
    }

    @Override
    public float getCostoLlamada()
    {
        return this.CalcularCosto();
    }

    private float CalcularCosto()
    {
        switch(this._franjaHoraria)
        {
            case FRANJA_1:
                this._costo = 0.99F;
                break;
            case FRANJA_2:
                this._costo = 1.25F;
                break;
            case FRANJA_3:
                this._costo = 0.66F;
                break;
            default:
                this._costo = 0.0F;
        }

        return this._costo * this._duracion;
    }
    
    @Override
    public String Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Llamada Provincial").append("\n");
        cadena.append("  Franja: ").append(this._franjaHoraria).append("\n");
        cadena.append("   Costo: ").append(this.getCostoLlamada()).append("\n");
        cadena.append(super.Mostrar());
        return cadena.toString();
    }
    
    @Override
    public boolean equals(Object unaLlamada)
    {
        boolean retorno = unaLlamada instanceof Provincial;
        
        return retorno;
    }
}
