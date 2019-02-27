/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

/**
 *
 * @author pattie
 */
public class Palabra
{
    private String palabra;
    private String definicion;

    public Palabra(String palabra, String definicion) throws CaracterPalabraException
    {
        this.setPalabra(palabra);
        this.setDefinicion(definicion);
    }
    
    public Palabra(String palabra) throws CaracterPalabraException
    {
        this(palabra, "No se halló definición");
    }

    public Palabra()
    {
    }

    public String getPalabra()
    {
        return palabra;
    }

    public final void setPalabra(String palabra) throws CaracterPalabraException
    {
        //if(palabra.matches("[^A-Za-z]")) //La palabra no puede contener caracteres que no sean letras
        if(!Palabra.existeCaracterEspecial(palabra)) //La palabra no puede contener caracteres que no sean letras
        {
            throw new CaracterPalabraException("ERROR. La palabra '" + palabra + "' no puede contener caracteres especiales o acentuados, números, o espacios en blanco");
        }
        else
        {
            this.palabra = palabra.toUpperCase();
        }
    }

    public String getDefinicion()
    {
        return definicion;
    }

    public final void setDefinicion(String definicion)
    {
        this.definicion = definicion;
    }

    @Override
    public String toString() {
        return this.getPalabra() + ";" + this.getDefinicion(); 
    }
    
    private static boolean existeCaracterEspecial(String palabra)
    {
        boolean retorno = true;
        
        for (int i = 0; i < palabra.length(); i++)
        {
            char caracter = palabra.charAt(i);
            
            if(!((caracter >= 'a' && caracter <= 'z') || (caracter >= 'A' && caracter <= 'Z')))
            {
                retorno = false;
                break;
            }
        }
        
        return retorno;
    }
}
