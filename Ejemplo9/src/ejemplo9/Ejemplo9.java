/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo9;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo9
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ClaseB objetoB = new ClaseB(1, 2, 3);
        objetoB.mostrarDerivada(); //sólo veo lo protegido y lo público desde el mismo paquete.
        
        //unboxing
        ClaseA miA = new ClaseB(4, 5, 6);
        ClaseB miB = (ClaseB)miA;
    }
    
}
