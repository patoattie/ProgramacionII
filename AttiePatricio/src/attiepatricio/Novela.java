/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attiepatricio;


public class Novela extends Libro
{
    protected EGenero _genero;

    public Novela(EGenero _genero, Autor _autor, float _precio, String _titulo)
    {
        super(_autor, _precio, _titulo);
        this._genero = _genero;
    }

    public String Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append(Libro.Mostrar(this)).append("\n");
        cadena.append("Género: ").append(this._genero);
        
        return cadena.toString();
    }

    public static boolean compararNovelas(Novela uno, Novela dos)
    {
        boolean retorno = Libro.compararLibros(uno, dos) && uno._genero.equals(dos._genero);
        
        return retorno;
    }
}
