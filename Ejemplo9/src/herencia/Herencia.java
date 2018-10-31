/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import ejemplo9.ClaseA;

/**
 *
 * @author capacita_mecon
 */
public class Herencia
{
    ClaseA objetoA;

    public Herencia()
    {
        this.objetoA = new ClaseA(7, 8, 9);
        this.objetoA.mostrarPublic(); //sólo veo lo público desde otro paquete
    }
    
}
