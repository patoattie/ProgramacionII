/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralitaherencia;

/**
 *
 * @author capacita_mecon
 */
public class CentralitaHerencia
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Centralita c1 = new Centralita("Telefónica");
        Llamada ll1 = new Local("ll1o", 30.0F, "ll1d", 2.65F);
        Llamada ll2 = new Provincial("ll2o", Franja.FRANJA_1, 21.0F, "ll2d");
        Llamada ll3 = new Local("ll3o", 45.0F, "ll3d", 1.99F);
        Llamada ll4 = new Provincial(Franja.FRANJA_3, ll2);
        
        c1._listaDeLlamadas.add(ll1);
        c1._listaDeLlamadas.add(ll2);
        c1._listaDeLlamadas.add(ll3);
        c1._listaDeLlamadas.add(ll4);
        
        c1.Mostrar();
    }
    
}
