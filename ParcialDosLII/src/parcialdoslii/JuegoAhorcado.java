/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.util.Stack;

/**
 *
 * @author pattie
 */
public class JuegoAhorcado
{
    private int fallosMaximos;
    private Palabra palabraSeleccionada;
    private String letrasJugadas;
    private int cantidadFallos;
    private int jugadaMuestraAyuda;
    private final int FALLOS_MINIMOS_PERMITIDOS = 5;
    
    public JuegoAhorcado()
    {
        this.letrasJugadas = "";
        this.cantidadFallos = 0;
    }

    public JuegoAhorcado(int fallosMaximos, Diccionario unDiccionario) throws DiccionarioVacioException
    {
        this();

        if(unDiccionario == null)
        {
            throw new DiccionarioVacioException("ERROR. El Diccionario esta vacío");
        }
        else
        {
            if(fallosMaximos < this.FALLOS_MINIMOS_PERMITIDOS)
            {
                this.fallosMaximos = this.FALLOS_MINIMOS_PERMITIDOS;
            }
            else
            {
                this.fallosMaximos = fallosMaximos;
            }

            this.jugadaMuestraAyuda = this.fallosMaximos - 2;
            this.palabraSeleccionada = unDiccionario.getPalabra();
        }
    }

    public Palabra getPalabraSeleccionada()
    {
        return palabraSeleccionada;
    }
}
