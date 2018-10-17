/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo5;

import java.util.Date;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MiClase1 obj1 = new MiClase1();
        MiClase1 obj2 = new MiClase1(2, "Pepe");
        MiClase1 obj3 = new MiClase1(3, "Maria");
        
        obj1.MostrarDatos();
        obj2.MostrarDatos();
        obj3.MostrarDatos();

        MiClase1 obj4 = new MiClase1(obj3);

        obj4.MostrarDatos();
        obj3.MostrarDatos();
    }
    
}
