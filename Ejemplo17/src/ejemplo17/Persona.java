/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo17;

/**
 *
 * @author capacita_mecon
 */
public abstract class Persona implements iComportamiento
{
    protected String _nombre;

    public Persona(String _nombre)
    {
        this._nombre = _nombre;
    }

    @Override
    public String toString()
    {
        StringBuilder cadena = new StringBuilder();

        cadena.append("Nombre: ").append(this._nombre).append("\n");

        return cadena.toString();
    }
}
