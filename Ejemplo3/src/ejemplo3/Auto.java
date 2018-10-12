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

    public eFabricante fabricante;
    //Composición o agregación compuesta: Una clase que utiliza otra.
    //Auto es clase dependiente de Rueda
    public Rueda ruedaDD;
    public Rueda ruedaDI;
    public Rueda ruedaTD;
    public Rueda ruedaTI;
    public static int contador;
    public static Random azar;
    
    public Auto()
    {
        int numeroAleatorio = (int)(Math.random() * eFabricante.values().length);
        this.fabricante = eFabricante.values()[numeroAleatorio];
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
}
