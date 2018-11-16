/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attiepatricio;


public class Manual extends Libro
{
    protected ETipo _tipo;

    public Manual(ETipo _tipo, Autor _autor, float _precio, String _titulo)
    {
        super(_autor, _precio, _titulo);
        this._tipo = _tipo;
    }
    
    public String Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append(Libro.Mostrar(this)).append("\n");
        cadena.append("Tipo: ").append(this._tipo);
        
        return cadena.toString();
    }
    
    public static boolean compararManuales(Manual uno, Manual dos)
    {
        boolean retorno = Libro.compararLibros(uno, dos) && uno._tipo.equals(dos._tipo);
        
        return retorno;
    }
}
