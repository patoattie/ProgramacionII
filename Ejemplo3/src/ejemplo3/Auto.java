/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

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
    
    public Auto()
    {
        double numero = Math.random();
//        switch(numero)
//        {
//            case 0:
//                this.fabricante = eFabricante.FORD;
//                break;
//            case 1:
//                this.fabricante = eFabricante.CHEVROLET;
//                break;
//            case 2:
//                this.fabricante = eFabricante.HONDA;
//                break;
//        }
        this.ruedaDD = new Rueda();
        this.ruedaDI = new Rueda();
        this.ruedaTD = new Rueda();
        this.ruedaTI = new Rueda();
        contador++;
    }
    
    static
    {
        contador = 0;
    }
}
