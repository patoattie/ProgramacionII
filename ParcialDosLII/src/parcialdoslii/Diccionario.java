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
public class Diccionario implements java.io.Serializable, FilenameFilter, DiccionarioAptoAhorcado
{

    private static final String ARCHIVO_XML = "Diccionario.xml";
    private ArrayList<Palabra> listaPalabras;
    private static String directorio = "diccionarios" + System.getProperty("file.separator");

    public Diccionario()
    {
        this.listaPalabras = new ArrayList<>();
    }

    public Diccionario(ArrayList<Palabra> listaPalabras)
    {
        this();
        this.listaPalabras = listaPalabras;
    }

    public static String getDirectorio()
    {
        return directorio;
    }

    public String[] getListaDiccionarios()
    {
        File dir = new File(directorio);
        
        return dir.list(this);
    }

    public static String getARCHIVO_XML() {
        return ARCHIVO_XML;
    }
    
    public boolean agregarPalabra(Palabra unaPalabra) throws ExistePalabraException
    {
        boolean retorno;
        
        if(this.existePalabra(unaPalabra))
        {
            retorno = false;
        }
        else
        {
            retorno = this.listaPalabras.add(unaPalabra);
        }
        
        return retorno;
    }

    public ArrayList<Palabra> getListaPalabras()
    {
        return listaPalabras;
    }

    public void setListaPalabras(ArrayList<Palabra> listaPalabras)
    {
        this.listaPalabras = listaPalabras;
    }

    @Override
    public String toString()
    {
        StringBuilder salida = new StringBuilder();
        for (Palabra unaPalabra : this.listaPalabras)
        {
            salida.append(unaPalabra.toString()).append("\n");
        }
        
        return salida.toString();
    }
    
    public int getCantidadPalabras()
    {
        return this.listaPalabras.size();
    }

    public static Diccionario crearDiccionario(String archivoXML) throws FileNotFoundException
    {
        return (Diccionario) XML.cargar(directorio, archivoXML);
    }

    public void grabarDiccionario(String archivoXML) throws FileNotFoundException
    {
        XML.guardar(directorio, archivoXML, this);
    }
    
    public boolean existePalabra(Palabra unaPalabra) throws ExistePalabraException
    {
        boolean retorno = false;
        
        for (Palabra termino : this.listaPalabras) 
        {
            if(termino.getPalabra().equalsIgnoreCase(unaPalabra.getPalabra()))
            {
                retorno = true;
                break;
            }
        }
        
        if(retorno)
        {
            throw new ExistePalabraException("ERROR. La palabra '" + unaPalabra.getPalabra() + "' ya existe en el Diccionario");
        }
        
        return retorno;
    }

    @Override
    public boolean accept(File dir, String name)
    {
        return name.endsWith(XML.getExtension());
    }
    
    public void editarPalabra(int indice, Palabra palabra) throws CaracterPalabraException, IndexOutOfBoundsException
    {
        if(indice < 0 || indice >= this.listaPalabras.size())
        {
            throw new IndexOutOfBoundsException("ERROR. La posición indicada está fuera de rango");
        }
        else
        {
            Palabra anterior = this.listaPalabras.get(indice);
            try
            {
                this.listaPalabras.set(indice, new Palabra(anterior.getPalabra(), palabra.getDefinicion(), palabra.getDificultad()));
            }
            catch (CaracterPalabraException e)
            {
                this.listaPalabras.set(indice, anterior);
                throw e;
            }
        }
    }
    
    public int buscarPalabra(String palabra)
    {
        int retorno = -1;
        
        for (Palabra unaPalabra : this.listaPalabras)
        {
            if(unaPalabra.getPalabra().equalsIgnoreCase(palabra))
            {
                retorno = this.listaPalabras.indexOf(unaPalabra);
            }
        }
        
        return retorno;
    }

    public void eliminarPalabra(int indice) throws IndexOutOfBoundsException
    {
        if(indice < 0 || indice >= this.listaPalabras.size())
        {
            throw new IndexOutOfBoundsException("ERROR. La posición indicada está fuera de rango");
        }
        else
        {
            this.listaPalabras.remove(indice);
        }
    }

    public void eliminarPalabra(int indice, String palabra) throws NoExistePalabraException
    {
        Palabra anterior = this.listaPalabras.get(indice);
        if(anterior.getPalabra().equalsIgnoreCase(palabra))
        {
            this.eliminarPalabra(indice);
        }
        else
        {
            throw new NoExistePalabraException("ERROR. La palabra '" + palabra + "' no existe en la posición indicada");
        }
    }

    public Palabra getPalabraAleatoria() throws DiccionarioVacioException
    {
        Palabra unaPalabra = null;
        int indiceAleatorio;
        
        if (this.getListaPalabras().isEmpty())
        {
            throw new DiccionarioVacioException("ERROR. El Diccionario esta vacío");
        }
        else
        {
            indiceAleatorio = (int) (Math.random() * (this.getListaPalabras().size()));
            unaPalabra = this.getListaPalabras().get(indiceAleatorio);
        }
        
        return unaPalabra;
    }

    @Override
    public Palabra getPalabraAleatoria(String dificultad) throws DiccionarioVacioException
    {
        Palabra retorno = null;
        
        int cantidadPalabras = 0;
        int ultimoIndiceHallado = -1;
        for (Palabra unaPalabra : this.listaPalabras)
        {
            if(unaPalabra.getDificultad().equalsIgnoreCase(dificultad))
            {
                cantidadPalabras++;
                ultimoIndiceHallado = this.listaPalabras.indexOf(unaPalabra);
                
                if(cantidadPalabras > 1)
                {
                    break;
                }
            }
        }
        
        switch(cantidadPalabras)
        {
            case 0:
                throw new DiccionarioVacioException("ERROR. El Diccionario esta vacío");
            case 1:
                retorno = this.listaPalabras.get(ultimoIndiceHallado);
                break;
            case 2:
                do
                {
                    retorno = this.getPalabraAleatoria();
                } while(!retorno.getDificultad().equalsIgnoreCase(dificultad));
                break;
        }
        
        return retorno;
    }
}
