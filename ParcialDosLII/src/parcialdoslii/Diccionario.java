/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

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
    
    public boolean agregarPalabra(Palabra unaPalabra)
    {
        return this.listaPalabras.add(unaPalabra);
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
}
