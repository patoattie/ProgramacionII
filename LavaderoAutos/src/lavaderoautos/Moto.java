/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavaderoautos;


public class Moto extends Vehiculo
{
    protected float _cilindrada;

    public Moto(float _cilindrada, String _patente, int _cantRuedas, eMarcas _marca)
    {
        super(_patente, _cantRuedas, _marca);
        this._cilindrada = _cilindrada;
    }

    @Override
    protected String Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append(super.Mostrar()).append("\n");
        cadena.append("Cilindrada: ").append(this._cilindrada);
        
        return cadena.toString();
    }
}
