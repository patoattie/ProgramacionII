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

    //b) El constructor Producto(int, string, eTipoComestible, double) sólo inicializará el precio del producto
    public Producto(int codigo, String nombre, eTipoComestible tipo, double precio)
    {
        this(codigo, nombre, tipo);
        this._precio = precio;
    }

    //a) El constructor Producto(int, string, eTipoComestible) sólo inicializará el nombre y el tipo del producto
    public Producto(int codigo, String nombre, eTipoComestible tipo)
    {
        this(codigo);
        this._nombre = nombre;
        this._tipo = tipo;
    }

    //c) Todas las instancias de producto deben de alguna forma inicializar el atributo _codigoDeBarra
    public Producto(int codigo)
    {
        this._codigoBarras = codigo;
    }
    
    //2) Crear el método de instancia mostrar() que muestre por pantalla todos los atributos del producto.    
    public void Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("Nombre: ").append(this._nombre).append("\n");
        cadena.append("Tipo: ").append(this._tipo).append("\n");
        cadena.append("Código: ").append(this._codigoBarras).append("\n");
        cadena.append("Precio: ").append(String.format("%.0f", this._precio));
        
        System.out.println(cadena.toString());
    }
    
    //b) El método comparaComestible devuelve verdadero sólo si el producto pertenece al tipo de comestible con el que se compara
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
    
    //a) El método comparaDosProductos permite comparar dos productos y devuelva verdadero sólo cuando estos sean iguales
    public static boolean comparaDosProductos(Producto unProducto, Producto otroProducto)
    {
        boolean retorno;
        
        if(unProducto._codigoBarras == otroProducto._codigoBarras)
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
