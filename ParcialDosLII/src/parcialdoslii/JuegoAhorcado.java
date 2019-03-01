/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.util.Scanner;

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
    private String caracterMascara;
    
    public JuegoAhorcado()
    {
        this.letrasJugadas = "";
        this.cantidadFallos = 0;
    }

    public JuegoAhorcado(String caracterMascara, int fallosMaximos, Diccionario unDiccionario) throws DiccionarioVacioException
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

            this.jugadaMuestraAyuda = this.fallosMaximos - 3;
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
        this.letrasJugadas = this.letrasJugadas.concat(letrasJugadas.toUpperCase());
    }

    public int getCantidadFallos()
    {
        return cantidadFallos;
    }

    public void setCantidadFallos()
    {
        this.cantidadFallos++;
    }
    
    public String getPalabra() throws JuegoException
    {
        String retorno = this.palabraSeleccionada.getPalabra();
        boolean faltanLetras = false;

        for (int i = 0; i < retorno.length(); i++)
        {
            String caracterLeido = retorno.substring(i, i + 1);
            if(!caracterLeido.equalsIgnoreCase(this.caracterMascara) && !this.letrasJugadas.contains(caracterLeido))
            {
                retorno = retorno.replace(caracterLeido.charAt(0), this.caracterMascara.charAt(0));
                faltanLetras = true;
            }
        }
        
        if(!faltanLetras)
        {
            throw new JuegoException("JUEGO GANADO");
        }
        
        return retorno;
    }
    
    public String getDefinicion()
    {
        String retorno = "";
        
        if(this.cantidadFallos >= this.jugadaMuestraAyuda)
        {
            retorno = this.palabraSeleccionada.getDefinicion();
        }
        
        return retorno;
    }
    
    public void jugarLetra(String letraJugada) throws LetraJugadaException, JuegoException
    {
        if(this.cantidadFallos < this.fallosMaximos)
        {
            String letraJugadaUpper = letraJugada.substring(0, 1).toUpperCase();
            char letraJugadaChar = letraJugadaUpper.charAt(0);

            //if(letraJugadaChar < 'A' || letraJugadaChar > 'Z')
            if(Palabra.existeCaracterEspecial(letraJugadaUpper))
            {
                throw new LetraJugadaException("ERROR. La letra '" + letraJugada + "' es un caracter especial y no puede ser jugado");
            }
            else if(this.letrasJugadas.contains(letraJugadaUpper))
            {
                throw new LetraJugadaException("ERROR. La letra '" + letraJugada + "' ya fue jugada");
            }
            else
            {
                this.setLetrasJugadas(letraJugadaUpper);

                if(!this.palabraSeleccionada.getPalabra().contains(letraJugadaUpper))
                {
                    this.setCantidadFallos();

                    if(this.cantidadFallos == this.fallosMaximos)
                    {
                        throw new JuegoException("GAME OVER");
                    }
                }
            }
        }
        else
        {
            throw new JuegoException("GAME OVER");
        }
    }

    public static void jugarPorConsola(JuegoAhorcado miJuego)
    {
        Scanner lector = new Scanner(System.in);
        final String TERMINA = "0";
        String letraJugada = "";
        String palabra = "";
        boolean finJuego = false;
        
        do
        {
            try
            {
                palabra = miJuego.getPalabra();
                System.out.println(palabra);
                System.out.println(miJuego.getDefinicion());

                System.out.print("Ingrese letra a jugar (o '" + TERMINA + "' para finalizar): ");
                letraJugada = lector.next();

                if(!letraJugada.equalsIgnoreCase(TERMINA))
                {
                    miJuego.jugarLetra(letraJugada);
                }
            }
            catch (LetraJugadaException e)
            {
                System.out.println(e.getMessage());
            }
            catch(JuegoException e)
            {
                finJuego = true;
                System.out.println(e.getMessage());
                System.out.println("Palabra: " + miJuego.getPalabraSeleccionada().getPalabra());
            }
        } while(!letraJugada.equalsIgnoreCase(TERMINA) && !finJuego);
    }
    
    public static void jugarPorEntornoGrafico(JuegoAhorcado miJuego)
    {
        frmAhorcado ventana = new frmAhorcado(miJuego);
        ventana.setVisible(true);
    }
}
