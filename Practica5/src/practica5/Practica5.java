/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class Practica5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] notas = new int[Alumno.cantidadNotas];
        Scanner lector = new Scanner(System.in);
        Alumno alumno1 = new Alumno("Perez, Juan", "perez@mail.com", "Balcarce 186");
        for (int i = 0; i < notas.length; i++)
        {
            System.out.print("Ingrese nota " + (i + 1) + ": ");
            notas[i] = lector.nextInt();
        }
        
        if(alumno1.setNotasIngreso(notas))
        {
            System.out.println("Notas cargadas ok");
            alumno1.CalcularPromedio();
            System.out.println(alumno1.AlumnoAString());
        }
        else
        {
            System.out.println("Error de carga, las notas deben estar comprendidas entre 1 y 10");
        }
        
    }
    
}
