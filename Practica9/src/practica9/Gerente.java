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
public class Gerente extends SerHumano
{
    private int _bono;

    public Gerente(int bono, String _nombre, byte _peso, byte _altura, String _sexo)
    {
        super(_nombre, _peso, _altura, _sexo);
        this._bono = bono;
    }
    
    public void coordinar()
    {
        System.out.println("Estoy en la oficina...");
    }
}
