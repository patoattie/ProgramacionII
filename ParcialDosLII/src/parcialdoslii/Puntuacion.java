/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pattie
 */
public class Puntuacion
{
    private String jugador;
    private String fecha;
    private int puntaje;
    public static final String JUGADOR_POR_DEFECTO = "Anónimo";

    public Puntuacion(String jugador, String fecha, int puntaje)
    {
        this.jugador = jugador;
        this.puntaje = puntaje;
        this.fecha = fecha;
    }

    public Puntuacion(String jugador, int puntaje)
    {
        this(jugador, Puntuacion.getFecha(new Date()), puntaje);
    }

    public Puntuacion(String jugador)
    {
        this(jugador, 0);
    }
    
    public Puntuacion(int puntaje)
    {
        this(Puntuacion.JUGADOR_POR_DEFECTO, puntaje);
    }
    
    public Puntuacion()
    {
        this(Puntuacion.JUGADOR_POR_DEFECTO);
    }

    public String getJugador()
    {
        return jugador;
    }

    public final void setJugador(String jugador)
    {
        this.jugador = jugador;
    }
    

    public int getPuntaje()
    {
        return puntaje;
    }

    public void setPuntaje(int puntaje)
    {
        this.puntaje = puntaje;
    }

    public String getFecha()
    {
        return fecha;
    }

    public static String getFecha(Date fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        return formato.format(fecha);
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    public void setFecha(Date fecha)
    {
        this.setFecha(Puntuacion.getFecha(fecha));
    }

    @Override
    public String toString()
    {
        return this.getJugador() + ";" + this.getFecha() + ";" + this.getPuntaje(); 
    }
}
