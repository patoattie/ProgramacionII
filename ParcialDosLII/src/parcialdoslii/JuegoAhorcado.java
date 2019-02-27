/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

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
    private char caracterMascara;
    
    public JuegoAhorcado()
    {
        this.letrasJugadas = "";
        this.cantidadFallos = 0;
    }

    public JuegoAhorcado(char caracterMascara, int fallosMaximos, Diccionario unDiccionario) throws DiccionarioVacioException
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
            this.caracterMascara = caracterMascara;
        }
    }

    public Palabra getPalabraSeleccionada()
    {
        return palabraSeleccionada;
    }

    public String getLetrasJugadas()
    {
        return letrasJugadas;
    }

    public void setLetrasJugadas(String letrasJugadas)
    {
        this.letrasJugadas = this.letrasJugadas.concat(letrasJugadas);
    }

    public int getCantidadFallos()
    {
        return cantidadFallos;
    }

    public void setCantidadFallos()
    {
        this.cantidadFallos++;
    }
    
    public String getPalabra()
    {
        String retorno = this.palabraSeleccionada.getPalabra();

        // TODO Falta desarrollar el código.
        
        return retorno;
    }
}
