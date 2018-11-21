/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo15;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo15
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ClaseUno uno = new ClaseUno("Atributo String Uno");
        ClaseDos dos = new ClaseDos("Atributo String Dos", 2);
        ClaseDos dos1 = new ClaseDos("Atributo String Tres", 2);
        ClaseTres tres = new ClaseTres(dos1, 3.0F);
        
        System.out.println("1");
        System.out.println(uno.getUno());
        System.out.println(uno.mostrarUno());
        System.out.println("2");
        System.out.println(dos.getDos());
        System.out.println(dos.mostrarDos());
        System.out.println("3");
        System.out.println(tres.getTres());
        System.out.println(tres.mostrarTres());
    }
    
}
