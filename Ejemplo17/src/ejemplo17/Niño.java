/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo17;


public class Niño extends Persona implements iJugable
{

    public Niño(String _nombre)
    {
        super(_nombre);
    }
    
    @Override
    public void alimentarse(eComida unaComida)
    {
        System.out.println("Soy un Niño y comí " + unaComida.toString());
    }

    @Override
    public void dormir(int cantidadHoras)
    {
        System.out.println("Soy un Niño y dormí " + cantidadHoras + " horas");
    }

    @Override
    public void jugar(String juego)
    {
        System.out.println("Soy un Niño y jugué " + juego);
    }
}
