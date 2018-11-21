/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo15;

/**
 *
 * @author capacita_mecon
 */
public abstract class ClaseUno
{
    protected String _atributoUno;

    public ClaseUno(String _atributoUno)
    {
        this._atributoUno = _atributoUno;
    }

    public String getUno()
    {
        return this._atributoUno;
    }
    
    public abstract String mostrar();
    /*{
        return "ClaseUno";
    }*/
    
    @Override
    public String toString()
    {
        return "ClaseUno";
    }
}
