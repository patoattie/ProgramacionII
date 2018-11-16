/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attiepatricio;

/**
 *
 * @author capacita_mecon
 */
public class Libro
{
    protected Autor _autor;
    protected int _cantidadPaginas;
    protected float _precio;
    protected String _titulo;
    
    private static int generadorDePaginas()
    {
        final int PAGINAS_MINIMO = 10;
        final int PAGINAS_MAXIMO = 580;
        int retorno = (int) (Math.random() * PAGINAS_MAXIMO) + PAGINAS_MINIMO;
        
        return retorno;
    }

    public Libro()
    {
        this._cantidadPaginas = Libro.generadorDePaginas();
    }

    public Libro(Autor _autor, String _titulo)
    {
        this();
        this._autor = _autor;
        this._titulo = _titulo;
    }

    public Libro(Autor _autor, float _precio, String _titulo)
    {
        this(_autor, _titulo);
        this._precio = _precio;
    }
    
    public float getPrecio()
    {
        return this._precio;
    }
    
    public int getCantidadDePaginas()
    {
        return this._cantidadPaginas;
    }
    
    public static String Mostrar(Libro unLibro)
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("Autor: ").append(Autor.mostrarAutor(unLibro._autor)).append("\n");
        cadena.append("Páginas: ").append(unLibro._cantidadPaginas).append("\n");
        cadena.append("Precio: ").append(unLibro._precio).append("\n");
        cadena.append("Título: ").append(unLibro._titulo);
        
        return cadena.toString();
    }
    
    public static boolean compararLibros(Libro uno, Libro dos)
    {
        boolean retorno = uno._titulo.equalsIgnoreCase(dos._titulo) && Autor.compararAutores(uno._autor, dos._autor);
        
        return retorno;
    }
}
