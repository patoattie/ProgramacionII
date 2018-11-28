/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo17;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo17
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<iComportamiento> lista = new ArrayList<>();
        
        iComportamiento p1 = new Perro("Perro1", 1, true);
        iComportamiento g1 = new Gato("Gato1", 2, true);
        iComportamiento n1 = new Niño("Niño1");
        
        lista.add(p1);
        lista.add(g1);
        lista.add(n1);
        
        for (iComportamiento item : lista)
        {
            System.out.println(item.toString());
            if(item instanceof Perro)
            {
                item.alimentarse(eComida.DOGUI);
                item.dormir(3);
                ((Perro) item).jugar("Busca y devuelve");
            }
            else if(item instanceof Gato)
            {
                item.alimentarse(eComida.WHISKAS);
                item.dormir(12);
                ((Gato) item).jugar("No me hinches");
            }
            else if(item instanceof Niño)
            {
                item.alimentarse(eComida.MILANESA);
                item.dormir(8);
                ((Niño) item).jugar("Mancha");
            }
            
        }
    }
    
}
