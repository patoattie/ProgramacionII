/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo7;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Veterinaria
{
    private String nombre;
    private ArrayList<Perro> lista;

    public Veterinaria(String nombre)
    {
        this.nombre = nombre;
        this.lista = new ArrayList<>();
    }
    
    private boolean existePerro(Perro unPerro)
    {
        boolean retorno = false;

        for (Perro miPerro : this.lista)
        {
            if(miPerro.equals(unPerro))
            {
                retorno = true;
                break;
            }
        }
        
        return retorno;
    }
    
    public boolean agregarPerro(Perro unPerro)
    {
        boolean retorno = true;
        
        /*if(!this.lista.contains(unPerro))
        {
            this.lista.add(unPerro);
        }*/

        if(!this.existePerro(unPerro))
        {
            this.lista.add(unPerro);
        }
        else
        {
            retorno = false;
            System.out.println("El Perro " + unPerro.getNombre() +" ya se encuentra ingresado en la Veterinaria");
        }
        
        return retorno;
    }
    
    public boolean quitarPerro(int indice)
    {
        boolean retorno = true;
        
        if(this.existePerro(this.lista.get(indice)))
        {
            this.lista.remove(indice);
        }
        else
        {
            retorno = false;
            System.out.println("El Perro no se encuentra ingresado en la Veterinaria");
        }
        
        return retorno;
    }

    public String getNombre()
    {
        return this.nombre;
    }
    
    public String mostrarVeterinaria()
    {
        String retorno;
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("DATOS DE LA VETERINARIA").append("\n");
        cadena.append("-----------------------").append("\n");
        cadena.append("Nombre: ").append(this.getNombre()).append("\n");
        
        retorno = cadena.toString();
        
        for (Perro unPerro : lista)
        {
            retorno += Perro.mostrarPerro(unPerro);
        }
        
        return retorno;
    }
    
}
