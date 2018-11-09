/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavaderoautos;


public class Camion extends Vehiculo
{
    protected float _tara;

    public Camion(float _tara, String _patente, int _cantRuedas, eMarcas _marca)
    {
        super(_patente, _cantRuedas, _marca);
        this._tara = _tara;
    }

    public Camion(float _tara, Vehiculo unVehiculo)
    {
        this(_tara, unVehiculo.getPatente(), unVehiculo.getCantRuedas(), unVehiculo.getMarca());
    }

    @Override
    protected String Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        super.Mostrar();
        cadena.append("      Tara: ").append(this._tara);
        
        return cadena.toString();
    }
}
