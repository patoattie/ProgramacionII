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
        this(palabra, Palabra.validaDefinicion(""));
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
        this.palabra = Palabra.validaPalabra(palabra);
    }
    
    public static String validaPalabra(String palabra) throws CaracterPalabraException
    {
        String palabraValidada;
        //if(palabra.matches("[^A-Za-z]")) //La palabra no puede contener caracteres que no sean letras
        if(palabra.isEmpty())
        {
            throw new CaracterPalabraException("ERROR. La palabra es de ingreso obligatorio");
        }
        else if(Palabra.existeCaracterEspecial(palabra)) //La palabra no puede contener caracteres que no sean letras
        {
            throw new CaracterPalabraException("ERROR. La palabra '" + palabra + "' no puede contener caracteres especiales o acentuados, números, o espacios en blanco");
        }
        else
        {
            palabraValidada = palabra.toUpperCase();
        }
        
        return palabraValidada;
    }
    
    public static String validaDefinicion(String definicion)
    {
        String definicionValidada;
        
        if(definicion.isEmpty())
        {
            definicionValidada = "No se halló definición";
        }
        else
        {
            definicionValidada = definicion;
        }
        
        return definicionValidada;
    }

    public String getDefinicion()
    {
        return definicion;
    }

    public final void setDefinicion(String definicion)
    {
        this.definicion = Palabra.validaDefinicion(definicion);
    }

    @Override
    public String toString() {
        return this.getPalabra() + ";" + this.getDefinicion(); 
    }
    
    protected static boolean existeCaracterEspecial(String palabra)
    {
        boolean retorno = false;
        
        for (int i = 0; i < palabra.length(); i++)
        {
            char caracter = palabra.toUpperCase().charAt(i);
            
            if(!((caracter >= 'A' && caracter <= 'Z') || caracter == 'Ñ'))
            {
                retorno = true;
                break;
            }
        }
        
        return retorno;
    }
}
