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
        return true;
    }
    
    public void Mostrar(Container contenedor)
    {
        
    }
    
    public ArrayList<Producto> SeleccionarComestible(Container contenedorUno, eTipoComestible tipo)
    {
        return null;
    }
    
    public boolean ContieneProducto(Container unContenedor, Producto unProducto)
    {
        return true;
    }
}
