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
public class AttiePatricio
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Biblioteca miBiblioteca = new Biblioteca(5);
        
        Autor a = new Autor("Esteban", "Rey");
        Autor b = new Autor("Joe", "Mayo");
        Manual m1 = new Manual(ETipo.Finanzas, a, 500, "Economia para tontos");
        Novela n1 = new Novela(EGenero.Romantica, a, 750, "El amor en tiempos de ...");
        Manual m2 = new Manual(ETipo.Escolar, new Autor("Moni", "Argento"), 500, "Como criar a sus hijos");
        Manual m3 = new Manual(ETipo.Tecnico, b, 854, "Java, desde el punto de vista de C#");
        Novela n2 = new Novela(EGenero.Accion, a, 410, "Miseria");
        Novela n3 = n2;
        
        miBiblioteca.agregarLibro(m1);
        miBiblioteca.agregarLibro(n1);
        miBiblioteca.agregarLibro(m2);
        miBiblioteca.agregarLibro(n2);
        miBiblioteca.agregarLibro(m3);
        
        if(!miBiblioteca.agregarLibro(n3))
        {
            System.out.println("\nEspacio insuficiente\n");
        }
        
        System.out.println(Biblioteca.MostrarBiblioteca(miBiblioteca));
    }
    
}
