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

    //d) El constructor de la clase Container deberá instanciar la lista
    public Container(int capacidad, String empresa)
    {
        this._capacidad = capacidad;
        this._empresa = empresa;
        this._listaProductos = new ArrayList<>();
    }
    
    //7) Crear el método de instancia Agregar (Producto) que agregue a la lista de productos del contenedor 
    //   el producto pasado por parámetro sólo si la capacidad lo permite y el producto no se encuentra ya en la lista.
    public boolean Agregar(Producto proUno)
    {
        boolean retorno;
        
        if(!this.ContieneProducto(this, proUno) && this._listaProductos.size() < this._capacidad)
        {
            retorno = this._listaProductos.add(proUno);
        }
        else
        {
            retorno = false;
        }
        
        return retorno;
    }
    
    //4) Crear un método de clase Mostrar (Container) que muestre los datos del contenedor pasado por parámetro. 
    //   Se deberá mostrar también la lista completa de sus productos.
    public static void Mostrar(Container contenedor)
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("-__-__Container__-__-").append("\n");
        cadena.append("Empresa:").append(contenedor._empresa).append("\n");
        cadena.append("Capacidad:").append(contenedor._capacidad).append("\n");
        cadena.append("Productos:");
        
        System.out.println(cadena.toString());
        
        for (Producto unProducto : contenedor._listaProductos)
        {
            unProducto.Mostrar();
        }
    }
    
    //6) El método SeleccionarComestible retornara una lista con todos los productos que pertenecen al tipo indicado.
    public static ArrayList<Producto> SeleccionarComestible(Container contenedorUno, eTipoComestible tipo)
    {
        ArrayList<Producto> retorno = new ArrayList<>();
        
        for (Producto unProducto : contenedorUno._listaProductos)
        {
            if(Producto.comparaComestible(unProducto, tipo))
            {
                retorno.add(unProducto);
            }
        }
        
        return retorno;
    }
    
    //5) El método ContieneProducto que devuelve verdadero sólo si el producto se encuentra en la lista.
    public boolean ContieneProducto(Container unContenedor, Producto unProducto)
    {
        boolean retorno = false;
        
        for (Producto elProducto : unContenedor._listaProductos)
        {
            if(Producto.comparaDosProductos(unProducto, elProducto))
            {
                retorno = true;
                break;
            }
        }
        
        return retorno;
    }
}
