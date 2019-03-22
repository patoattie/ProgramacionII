/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Ranking implements java.io.Serializable, FilenameFilter
{

    private static final String ARCHIVO_XML = "Ranking.xml";
    private ArrayList<Puntuacion> listaPuntuaciones;
    private static String directorio = "ranking" + System.getProperty("file.separator");

    public Ranking()
    {
        this.listaPuntuaciones = new ArrayList<>();
    }

    public Ranking(ArrayList<Puntuacion> listaPuntuaciones)
    {
        this();
        this.listaPuntuaciones = listaPuntuaciones;
    }

    public static String getDirectorio()
    {
        return directorio;
    }

    public String[] getListaRankings()
    {
        File dir = new File(directorio);
        
        return dir.list(this);
    }

    public static String getARCHIVO_XML()
    {
        return ARCHIVO_XML;
    }
    
    public boolean agregarPuntuacion(Puntuacion unaPuntuacion)
    {
        return this.listaPuntuaciones.add(unaPuntuacion);
    }

    public ArrayList<Puntuacion> getListaPuntuaciones()
    {
        return listaPuntuaciones;
    }

    public void setListaPuntuaciones(ArrayList<Puntuacion> listaPuntuaciones)
    {
        this.listaPuntuaciones = listaPuntuaciones;
    }

    @Override
    public String toString()
    {
        StringBuilder salida = new StringBuilder();
        for (Puntuacion unaPuntuacion : this.listaPuntuaciones)
        {
            salida.append(unaPuntuacion.toString()).append("\n");
        }
        
        return salida.toString();
    }
    
    public int getCantidadPuntuaciones()
    {
        return this.listaPuntuaciones.size();
    }

    public static Ranking crearRanking(String archivoXML) throws FileNotFoundException
    {
        return (Ranking) XML.cargar(directorio, archivoXML);
    }

    public void grabarRanking(String archivoXML) throws FileNotFoundException
    {
        XML.guardar(directorio, archivoXML, this);
    }
    
    @Override
    public boolean accept(File dir, String name)
    {
        return name.endsWith(XML.getExtension());
    }
    
    public void editarPuntuacion(int indice, Puntuacion puntuacion) throws IndexOutOfBoundsException
    {
        if(indice < 0 || indice >= this.listaPuntuaciones.size())
        {
            throw new IndexOutOfBoundsException("ERROR. La posición indicada está fuera de rango");
        }
        else
        {
            Puntuacion anterior = this.listaPuntuaciones.get(indice);
            this.listaPuntuaciones.set(indice, new Puntuacion(anterior.getJugador(), puntuacion.getPuntaje()));
        }
    }
    
    public int buscarPuntuacion(String jugador)
    {
        int retorno = -1;
        
        for (Puntuacion unaPuntuacion : this.listaPuntuaciones)
        {
            if(unaPuntuacion.getJugador().equalsIgnoreCase(jugador))
            {
                retorno = this.listaPuntuaciones.indexOf(unaPuntuacion);
            }
        }
        
        return retorno;
    }

    public void eliminarPuntuacion(int indice) throws IndexOutOfBoundsException
    {
        if(indice < 0 || indice >= this.listaPuntuaciones.size())
        {
            throw new IndexOutOfBoundsException("ERROR. La posición indicada está fuera de rango");
        }
        else
        {
            this.listaPuntuaciones.remove(indice);
        }
    }

    public void eliminarPuntuacion(int indice, String jugador) //throws NoExistePalabraException
    {
        Puntuacion anterior = this.listaPuntuaciones.get(indice);
        if(anterior.getJugador().equalsIgnoreCase(jugador))
        {
            this.eliminarPuntuacion(indice);
        }
        /*else
        {
            throw new NoExistePalabraException("ERROR. La palabra '" + jugador + "' no existe en la posición indicada");
        }*/
    }
}
