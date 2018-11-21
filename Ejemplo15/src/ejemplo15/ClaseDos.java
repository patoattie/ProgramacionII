/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo15;


public class ClaseDos extends ClaseUno
{
    protected int _atributoDos;

    public ClaseDos(String _atributoUno, int _atributoDos)
    {
        super(_atributoUno);
        this._atributoDos = _atributoDos;
    }

    public int getDos()
    {
        return this._atributoDos;
    }
    
    public String mostrarDos()
    {
        return super.mostrarUno() + " ClaseDos";
    }
}
