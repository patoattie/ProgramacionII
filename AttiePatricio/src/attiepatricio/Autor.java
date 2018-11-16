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
public class Autor
{
    private String _apellido;
    private String _nombre;

    public Autor(String _nombre, String _apellido)
    {
        this._apellido = _apellido;
        this._nombre = _nombre;
    }
    
    public static boolean compararAutores(Autor uno, Autor dos)
    {
        boolean retorno = uno._apellido.equalsIgnoreCase(dos._apellido) && uno._nombre.equalsIgnoreCase(dos._nombre);
        
        return retorno;
    }
    
    public static String mostrarAutor(Autor unAutor)
    {
        StringBuilder retorno = new StringBuilder();
        
        retorno.append(unAutor._apellido).append(" ").append(unAutor._nombre);
        
        return retorno.toString();
    }
}
