/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo15;


public final class ClaseTres extends ClaseDos
{
    protected float _atributoTres;

    public ClaseTres(String _atributoUno, int _atributoDos, float _atributoTres)
    {
        super(_atributoUno, _atributoDos);
        this._atributoTres = _atributoTres;
    }

    public float getTres()
    {
        return this._atributoTres;
    }
    
    @Override
    public String mostrar()
    {
        return super.mostrar() + " ClaseTres";
    }

    @Override
    public String toString()
    {
        return super.toString() + " ClaseTres";
    }
}
