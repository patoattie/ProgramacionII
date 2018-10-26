/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo8;

/**
 *
 * @author capacita_mecon
 */
public class Paciente
{
    private String dni;
    private String nombre;

    public Paciente(String dni, String nombre)
    {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public String getDni()
    {
        return dni;
    }

    public String getNombre()
    {
        return nombre;
    }
}
