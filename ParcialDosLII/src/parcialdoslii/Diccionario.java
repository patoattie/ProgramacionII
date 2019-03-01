/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Diccionario implements java.io.Serializable
{
    private ArrayList<Palabra> listaPalabras;

    public Diccionario()
    {
        this.listaPalabras = new ArrayList<>();
    }

    public Diccionario(ArrayList<Palabra> listaPalabras)
    {
        this();
        this.listaPalabras = listaPalabras;
    }
    
    public boolean agregarPalabra(Palabra unaPalabra) throws ExistePalabraException
    {
        boolean retorno;
        
        if(this.existePalabra(unaPalabra))
        {
            retorno = false;
            throw new ExistePalabraException("ERROR. La palabra '" + unaPalabra.getPalabra() + "' ya existe en el Diccionario");
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
        FileInputStream fis = new FileInputStream(archivoXML);
        BufferedInputStream bis = new BufferedInputStream(fis);
        XMLDecoder decoder = new XMLDecoder(bis);
        
        Diccionario unDiccionario = (Diccionario) decoder.readObject();

        return unDiccionario;
    }

    public void grabarDiccionario(String archivoXML) throws FileNotFoundException
    {
        FileOutputStream fos = new FileOutputStream(archivoXML);
        BufferedOutputStream bos = new BufferedOutputStream(fos); 
        XMLEncoder encoder = new XMLEncoder(bos);

        encoder.writeObject(this);
        encoder.close();
    }
    
    public boolean existePalabra(Palabra unaPalabra)
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
        
        return retorno;
    }
    
}
