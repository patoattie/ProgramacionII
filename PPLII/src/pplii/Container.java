/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplii;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Container
{
    private int _capacidad;
    private String _empresa;
    private ArrayList<Producto> _listaProductos;

    public Container(int capacidad, String empresa)
    {
        this._capacidad = capacidad;
        this._empresa = empresa;
        this._listaProductos = new ArrayList<>();
    }
    
    public boolean Agregar(Producto proUno)
    {
        boolean retorno;
        
        if(!this.ContieneProducto(this, proUno))
        {
            retorno = this._listaProductos.add(proUno);
        }
        else
        {
            retorno = false;
        }
        
        return retorno;
    }
    
    public void Mostrar(Container contenedor)
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("-__-__Container__-__-").append("\n");
        cadena.append("Empresa:").append(this._empresa).append("\n");
        cadena.append("Capacidad:").append(this._capacidad).append("\n");
        cadena.append("Productos:");
        
        System.out.println(cadena.toString());
        
        for (Producto unProducto : this._listaProductos)
        {
            unProducto.Mostrar();
        }
    }
    
    public ArrayList<Producto> SeleccionarComestible(Container contenedorUno, eTipoComestible tipo)
    {
        ArrayList<Producto> retorno = new ArrayList<>();
        
        for (Producto unProducto : contenedorUno._listaProductos)
        {
            if(unProducto.comparaComestible(unProducto, tipo))
            {
                retorno.add(unProducto);
            }
        }
        
        return retorno;
    }
    
    public boolean ContieneProducto(Container unContenedor, Producto unProducto)
    {
        boolean retorno = unContenedor._listaProductos.contains(unProducto);
        
        return retorno;
    }
}
