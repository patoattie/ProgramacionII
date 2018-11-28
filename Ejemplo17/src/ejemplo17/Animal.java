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
public abstract class Animal implements iComportamiento, iJugable
{
    protected String _nombre;
    protected int _edad;

    public Animal(String _nombre, int _edad)
    {
        this._nombre = _nombre;
        this._edad = _edad;
    }
    
    @Override
    public String toString()
    {
        StringBuilder cadena = new StringBuilder();

        cadena.append("Nombre: ").append(this._nombre).append("\n");
        cadena.append("Edad: ").append(this._edad);

        return cadena.toString();
    }
}
