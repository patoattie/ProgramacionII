/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo17;


public class Perro extends Animal
{
    protected boolean _tieneVacunas;

    public Perro(String _nombre, int _edad, boolean _tieneVacunas)
    {
        super(_nombre, _edad);
        this._tieneVacunas = _tieneVacunas;
    }

    @Override
    public String toString()
    {
        StringBuilder cadena=new StringBuilder();
        
        cadena.append(super.toString()).append("\n");
        cadena.append("Vacunas: ");
        if(this._tieneVacunas)
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
        System.out.println("Soy un Perro y comí " + unaComida.toString());
    }

    @Override
    public void dormir(int cantidadHoras)
    {
        System.out.println("Soy un Perro y dormí " + cantidadHoras + " horas");
    }

    @Override
    public void jugar(String juego)
    {
        System.out.println("Soy un Perro y jugué " + juego);
    }
    
}
