/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

/**
 *
 * @author capacita_mecon
 */
public class Automovil {

    public int velocidadActual;
    public static int cantidadRuedas;

    public static void MostrarCantidadRuedas() {
        System.out.println("Cantidad de ruedas: " + Automovil.cantidadRuedas);
    }

    public void Acelerar(int velocidad) {
        this.velocidadActual += velocidad;
        System.out.println(cantidadRuedas);
    }
}
