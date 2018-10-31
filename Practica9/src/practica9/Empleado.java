/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

/**
 *
 * @author capacita_mecon
 */
public class Empleado extends SerHumano
{
    private int _sueldo;

    public Empleado(int _sueldo, String _nombre, byte _peso, byte _altura, String _sexo)
    {
        super(_nombre, _peso, _altura, _sexo);
        this._sueldo = _sueldo;
    }
    
    public void trabajar()
    {
        System.out.println("Estoy trabajando...");
    }
}
