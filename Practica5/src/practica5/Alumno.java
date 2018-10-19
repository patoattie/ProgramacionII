/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author capacita_mecon
 */
public class Alumno
{
    private int id;
    private String apellidoNombre;
    private String eMail;
    private float promedio;
    private int[] notasIngreso;
    private String direccion;
    private static int contador;
    public static byte cantidadNotas;

    static //Constructor estático
    {
        contador = 0;
        cantidadNotas = 3;
    }
    
    public Alumno()
    {
        Alumno.contador++;
        this.id = Alumno.contador;
        this.notasIngreso = new int[Alumno.cantidadNotas];
    }

    public Alumno(String apellidoNombre)
    {
        this();
        this.apellidoNombre = apellidoNombre;
    }
    
    public Alumno(String apellidoNombre, String direccion)
    {
        this(apellidoNombre);
        this.direccion = direccion;
    }
    
    public Alumno(String apellidoNombre, String eMail, String direccion)
    {
        this(apellidoNombre, direccion);
        this.eMail = eMail;
    }
    
    public int getId()
    {
        return this.id;
    }

    public String getApellidoNombre()
    {
        return this.apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre)
    {
        this.apellidoNombre = apellidoNombre;
    }

    public String geteMail()
    {
        return this.eMail;
    }

    public void seteMail(String eMail)
    {
        this.eMail = eMail;
    }

    public float getPromedio()
    {
        return this.promedio;
    }

    public int[] getNotasIngreso()
    {
        return this.notasIngreso;
    }

    public boolean setNotasIngreso(int[] notasIngreso)
    {
        boolean retorno = true;
        
        for (int i : notasIngreso)
        {
            if(i < 1 || i > 10)
            {
                retorno = false;
                break;
            }
        }
        
        if(retorno)
        {
            this.notasIngreso = notasIngreso;
        }
        
        return retorno;
    }

    public String getDireccion()
    {
        return this.direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }
    
    public void CalcularPromedio()
    {
        int sumatoria = 0;
        
        for (int nota : this.getNotasIngreso())
        {
            sumatoria += nota;
        }
        
        this.promedio = (float)sumatoria / Alumno.cantidadNotas;
    }
    
    public String AlumnoAString()
    {
        String retorno;
        
        retorno = "ID: " + this.getId() + "\n";
        retorno += "Apellido y Nombre: " + this.getApellidoNombre() + "\n";
        retorno += "Dirección: " + this.getDireccion() + "\n";        
        retorno += "e-mail: " + this.geteMail() + "\n";
        for (int i : this.getNotasIngreso())
        {
            retorno += "Nota: " + i + "\n";
        }
        retorno += "Promedio: " + this.getPromedio();

        return retorno;
    }
    
}
