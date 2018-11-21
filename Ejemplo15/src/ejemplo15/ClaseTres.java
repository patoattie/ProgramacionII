/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo15;


public final class ClaseTres extends ClaseDos
{
    protected float _atributoTres;

    public ClaseTres(ClaseDos unClaseDos, float _atributoTres)
    {
        super(unClaseDos._atributoUno, unClaseDos._atributoDos);
        this._atributoTres = _atributoTres;
    }

    public float getTres()
    {
        return this._atributoTres;
    }
    
    public String mostrarTres()
    {
        return super.mostrarDos() + " ClaseTres";
    }
}
