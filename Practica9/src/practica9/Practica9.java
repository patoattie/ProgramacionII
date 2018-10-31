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
public class Practica9
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Gerente g1 = new Gerente(1000, "Juan Gerente", (byte)80, (byte)18, "M");
        Empleado e1 = new Empleado(850, "Pepe Empleado", (byte)75, (byte)15, "M");
        System.out.println("Datos Gerente:\n");
        System.out.println(g1.mostrarHumano());
        System.out.println("Datos Empleado:\n");
        System.out.println(e1.mostrarHumano());
        System.out.println("Gerente come");
        System.out.println(g1.comer("Milanga"));
        System.out.println("Empleado come");
        System.out.println(e1.comer("Muzza"));
        System.out.println("Gerente duerme");
        g1.dormir();
        System.out.println("Empleado duerme");
        e1.dormir();
        System.out.println("Gerente coordina");
        g1.coordinar();
        System.out.println("Empleado trabaja");
        e1.trabajar();
    }
}
