/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavaderoautos;

/**
 *
 * @author capacita_mecon
 */
public class Vehiculo
{
    protected String _patente;
    protected int _cantRuedas;
    protected eMarcas _marca;

    public Vehiculo(String _patente, int _cantRuedas, eMarcas _marca)
    {
        this._patente = _patente;
        this._cantRuedas = _cantRuedas;
        this._marca = _marca;
    }

    public String getPatente()
    {
        return _patente;
    }

    public int getCantRuedas()
    {
        return _cantRuedas;
    }

    public void setCantRuedas(int _cantRuedas)
    {
        this._cantRuedas = _cantRuedas;
    }

    public eMarcas getMarca()
    {
        return _marca;
    }

    public void setMarca(eMarcas _marca)
    {
        this._marca = _marca;
    }
    
    protected String Mostrar()
    {
        return "";
    }
    
    protected static boolean ComparaVehiculos(Vehiculo uno, Vehiculo dos)
    {
        return true;
    }
}
