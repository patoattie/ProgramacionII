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
public class Ejemplo3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*NewClass j = new NewClass(4, "Pepe");
        //NewClass m = new NewClass(8, "Maria");
        System.out.println(NewClass.entero);*/
        
        /*Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        Rueda rueda3 = new Rueda();*/
        
        //System.out.println("Cantidad de Autos: " + Auto.contador);
//        eFabricante fabricante;
//        fabricante = eFabricante.FORD;
//        System.out.println(fabricante);
//        for(eFabricante f : eFabricante.values())
//        {
//            System.out.println(f.ordinal() + ": " + f);
//        }
        Auto auto1 = new Auto();
        System.out.println("Fabricante Auto " + Auto.contador + ": " + auto1.fabricante);
        Auto auto2 = new Auto();
        System.out.println("Fabricante Auto " + Auto.contador + ": " + auto2.fabricante);
        Auto auto3 = new Auto();
        System.out.println("Fabricante Auto " + Auto.contador + ": " + auto3.fabricante);
        Auto auto4 = new Auto();
        System.out.println("Fabricante Auto " + Auto.contador + ": " + auto4.fabricante);
        Auto auto5 = new Auto();
        System.out.println("Fabricante Auto " + Auto.contador + ": " + auto5.fabricante);
    }

}
