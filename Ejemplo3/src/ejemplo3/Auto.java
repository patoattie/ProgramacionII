/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

import java.util.Random;

/**
 *
 * @author capacita_mecon
 */
public class Auto
{

    private eFabricante _fabricante;
    //Composición o agregación compuesta: Una clase que utiliza otra.
    //Auto es clase dependiente de Rueda
    public Rueda ruedaDD;
    public Rueda ruedaDI;
    public Rueda ruedaTD;
    public Rueda ruedaTI;
    public static int contador;
    public static Random azar;
    
    private int _kilometrosRecorridos;
    
    public Auto()
    {
        int numeroAleatorio = (int)(Math.random() * eFabricante.values().length);
        this._fabricante = eFabricante.values()[numeroAleatorio];
        this.ruedaDD = new Rueda();
        this.ruedaDI = new Rueda();
        this.ruedaTD = new Rueda();
        this.ruedaTI = new Rueda();
        contador++;
    }
    
    static
    {
        contador = 0;
        azar = new Random();
    }
    
    public void AgregarKilometros(int kilometros)
    {
        this._kilometrosRecorridos += kilometros;
    }

    public eFabricante getFabricante()
    {
        return this._fabricante;
    }

    public void VolverACero()
    {
        this._kilometrosRecorridos = 0;
    }

    public int GetKms()
    {
        return this._kilometrosRecorridos;
    }
}
