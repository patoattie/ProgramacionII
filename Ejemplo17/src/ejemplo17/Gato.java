/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo17;


public class Gato extends Animal
{
    protected boolean _esAmigable;

    public Gato(String _nombre, int _edad, boolean _esAmigable)
    {
        super(_nombre, _edad);
        this._esAmigable = _esAmigable;
    }
    
    @Override
    public String toString()
    {
        StringBuilder cadena=new StringBuilder();
        
        cadena.append(super.toString()).append("\n");
        cadena.append("Amigable: ");
        if(this._esAmigable)
        {
            cadena.append("SI");
        }
        else
        {
            cadena.append("NO");
        }

        return cadena.toString();
    }

    @Override
    public void alimentarse(eComida unaComida)
    {
        System.out.println("Soy un Gato y comí " + unaComida.toString());
    }

    @Override
    public void dormir(int cantidadHoras)
    {
        System.out.println("Soy un Gato y dormí " + cantidadHoras + " horas");
    }

    @Override
    public void jugar(String juego)
    {
        System.out.println("Soy un Gato y jugué " + juego);
    }
}
