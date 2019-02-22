/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author pattie
 */
public class JuegoAhorcado
{
    private static Diccionario listaPalabras;
    private static int fallosMaximos;
    private Palabra palabraSeleccionada;
    private Stack<Character> letrasJugadas;
    private int cantidadFallos;
    
    static //Constructor estático
    {
        fallosMaximos = 10;
        listaPalabras = new Diccionario();
    }

    public JuegoAhorcado()
    {
        letrasJugadas = new Stack<>();
        cantidadFallos = 0;
    }
    
    
}
