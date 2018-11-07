/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplii;

/**
 *
 * @author capacita_mecon
 */
public class Producto
{
    private int _codigoBarras;
    private String _nombre;
    private double _precio;
    private eTipoComestible _tipo;

    public Producto(int codigo, String nombre, eTipoComestible tipo, double precio)
    {
        this(codigo, nombre, tipo);
        this._precio = precio;
    }

    public Producto(int codigo, String nombre, eTipoComestible tipo)
    {
        this(codigo);
        this._nombre = nombre;
        this._tipo = tipo;
    }

    public Producto(int codigo)
    {
        this._codigoBarras = codigo;
    }
    
    public void Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("Nombre: ").append(this._nombre).append("\n");
        cadena.append("Tipo: ").append(this._tipo).append("\n");
        cadena.append("Código: ").append(this._codigoBarras).append("\n");
        cadena.append("Precio: ").append(this._precio);
        
        System.out.println(cadena.toString());
    }
    
    public static boolean comparaComestible(Producto unProducto, eTipoComestible tipo)
    {
        boolean retorno;
        
        if(unProducto._tipo.equals(tipo))
        {
            retorno = true;
        }
        else
        {
            retorno = false;
        }
        
        return retorno;
    }
    
    public static boolean comparaDosProductos(Producto unProducto, Producto otroProducto)
    {
        boolean retorno;
        
        if(unProducto._codigoBarras == otroProducto._codigoBarras
                && unProducto._nombre.equalsIgnoreCase(otroProducto._nombre)
                //&& unProducto._precio == otroProducto._precio
                && unProducto._tipo.equals(otroProducto._tipo))
        {
            retorno = true;
        }
        else
        {
            retorno = false;
        }
        
        return retorno;
    }
}
