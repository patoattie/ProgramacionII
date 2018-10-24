/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo7;

/**
 *
 * @author capacita_mecon
 */
public class Perro
{
    private String nombre;
    private int edad;
    private eRaza raza;

    public Perro(String nombre, int edad, eRaza raza)
    {
        this(nombre, edad);
        this.raza = raza;
    }

    public Perro(String nombre, int edad)
    {
        this(nombre);
        this.edad = edad;
    }

    public Perro(String nombre)
    {
        this();
        this.nombre = nombre;
    }

    public Perro()
    {

    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return this.edad;
    }

    public boolean setEdad(int edad)
    {
        boolean retorno = true;
        
        if(this.edad < 0)
        {
            retorno = false;
            System.out.println("ERROR. La edad no puede ser negativa");
        }
        else
        {
            this.edad = edad;
        }
        
        return retorno;
    }

    public eRaza getRaza()
    {
        return this.raza;
    }

    public void setRaza(eRaza raza)
    {
        this.raza = raza;
    }
    
    public static void mostrarPerro(Perro unPerro)    
    {
        String retorno;
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("DATOS DEL PERRO").append("\n");
        cadena.append("---------------").append("\n");
        cadena.append("Nombre: ").append(unPerro.getNombre()).append("\n");
        cadena.append("Edad: ").append(unPerro.getEdad()).append("\n");
        cadena.append("Raza: ").append(unPerro.getRaza()).append("\n");
        
        retorno = cadena.toString();
        System.out.println(retorno);        
    }
}
