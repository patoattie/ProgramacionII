/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo15;

import java.util.ArrayList;

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
//        ClaseUno uno = new ClaseUno("Atributo String Uno");
        ClaseDos dos = new ClaseDos("Hola", 1);
//        ClaseDos dos1 = new ClaseDos("Atributo String Tres", 2);
        ClaseTres tres = new ClaseTres("Chau", 3, 3.9F);
//        ClaseUno uno = dos;
        ArrayList<ClaseUno> lista=new ArrayList<>();
        
        lista.add(dos);
        lista.add(tres);
        
        for (ClaseUno item : lista)
        {
            System.out.println(item.toString());
        }
        
//        System.out.println("1)");
//        System.out.println(uno.getUno());
//        System.out.println(uno.mostrarUno());
//        System.out.println("2)");
//        System.out.println(dos.getDos());
//        System.out.println(dos.mostrar());
//        System.out.println("3)");
//        System.out.println(tres.getTres());
//        System.out.println(tres.mostrar());
//        System.out.println(uno.mostrar());
    }
    
}
