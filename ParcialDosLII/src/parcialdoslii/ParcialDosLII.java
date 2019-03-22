/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.io.FileNotFoundException;

/**
 *
 * @author pattie
 */
public class ParcialDosLII
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //cargarListaPalabras();
        
        Diccionario miDiccionario = null;
        Ranking miRanking = null;

        try
        {
            miDiccionario = Diccionario.crearDiccionario(Diccionario.getARCHIVO_XML());
        }
        catch(FileNotFoundException e)
        {
            System.out.println("ERROR. Archivo XML no encontrado");
        }

        try
        {
            miRanking = Ranking.crearRanking(Ranking.getARCHIVO_XML());
        }
        catch(FileNotFoundException e)
        {
            miRanking = new Ranking();
        }

        //System.out.println(miDiccionario.toString());
        frmPrincipal ventana = new frmPrincipal(miDiccionario, miRanking);
        ventana.setVisible(true);
        

//        try
//        {
//            //JuegoAhorcado.jugarPorConsola(new JuegoAhorcado("*", 10, miDiccionario));
//            JuegoAhorcado.jugarPorEntornoGrafico(new JuegoAhorcado("*", 10, miDiccionario));
//        }
//        catch (DiccionarioVacioException e)
//        {
//            System.out.println(e.getMessage());
//        }
    }
    
    private static void cargarListaPalabras()
    {
        Diccionario miDiccionario = new Diccionario();

        try 
        {
            miDiccionario.agregarPalabra(new Palabra("Paracaidas", "Artefacto de tela resistente o de otra materia análoga, que se extiende en el aire en forma de sombrilla grande, cuya función es la de moderar la velocidad de caída de un cuerpo que se arroja desde una aeronave"));
            miDiccionario.agregarPalabra(new Palabra("Decoracion", "Arte que estudia la combinación de elementos ornamentales y la acomodación del espacio interior"));
            miDiccionario.agregarPalabra(new Palabra("Matrimonio", "Antigua institución social, presente en gran cantidad de culturas, que establece un vínculo conyugal entre personas naturales, reconocido y consolidado por medio de prácticas comunitarias y normas legales, consuetudinarias, religiosas o morales"));
            miDiccionario.agregarPalabra(new Palabra("Redito", "Renta, utilidad o beneficio renovable que rinde un capital"));
            miDiccionario.agregarPalabra(new Palabra("Cuenta", "Cálculo u operación aritmética.\nCada una de las bolas ensartadas que componen el rosario"));
            miDiccionario.agregarPalabra(new Palabra("Ovulo", "Células sexuales o gametos femeninos.​ Son células grandes, esféricas e inmóviles."));
            miDiccionario.agregarPalabra(new Palabra("Techo", "Parte superior de un edificio, construcción, habitáculo, etc., que lo cubre y cierra"));
            miDiccionario.agregarPalabra(new Palabra("Hora", "Tiempo que equivale a 60 minutos, es decir, 3600 segundos"));
            miDiccionario.agregarPalabra(new Palabra("Violin", "Instrumento musical de cuerda, el más pequeño y agudo entre los de su clase, que se compone de una caja de resonancia en forma de 8, un mástil sin trastes y cuatro cuerdas que se hacen sonar con un arco"));
            miDiccionario.agregarPalabra(new Palabra("Cinta", "Tira de tela u otro material de propiedades semejantes que sirve para atar, ceñir o adornar"));
            miDiccionario.agregarPalabra(new Palabra("Cuerda", "Conjunto de hilos entrelazados que forman un solo cuerpo largo y flexible que sirve para atar, suspender pesos, etc."));
            miDiccionario.agregarPalabra(new Palabra("Zapatilla", "Calzado cómodo y ligero, de paño, piel, etc., y con suela delgada, que se usa para estar en casa"));
            miDiccionario.agregarPalabra(new Palabra("Ventilador", "Instrumento o aparato con aspas giratorias que impulsa o remueve el aire"));

            try
            {
                miDiccionario.grabarDiccionario(Diccionario.getARCHIVO_XML());
            }
            catch (FileNotFoundException e)
            {
                System.out.println("ERROR. Archivo XML no encontrado");
            }
        } 
        catch (ExistePalabraException e)
        {
            System.out.println(e.getMessage());
        }
        catch (CaracterPalabraException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
