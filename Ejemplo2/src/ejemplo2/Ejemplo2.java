/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

import genericas.Genericas;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clase 2
        /*Automovil miAuto = new Automovil();
        miAuto.velocidadActual = 50;
        Automovil.cantidadRuedas = 4;
        Automovil.MostrarCantidadRuedas();
        System.out.println("Velocidad: " + miAuto.velocidadActual);
        miAuto.Acelerar(25);
        System.out.println("Velocidad: " + miAuto.velocidadActual);*/
        
        //Test Calculadora
        int num1;
        int num2;
        char operador;
        String operadores;
        operadores = "+-*/";
        num1 = Genericas.pedirEntero("Ingrese primer número: ");
        num2 = Genericas.pedirEntero("Ingrese segundo número: ");
        for (int i = 0; i < operadores.length(); i++) {
            operador = operadores.charAt(i);
            Calculadora.SetOperador(operador);
            Calculadora.CalcularOperacion(num1, num2);
            System.out.print(num1);
            System.out.print(" ");
            System.out.print(operador);
            System.out.print(" ");
            System.out.print(num2);
            System.out.print(" = ");
            Calculadora.MostrarResultado();
            System.out.println("");
        }
    }
    
}
