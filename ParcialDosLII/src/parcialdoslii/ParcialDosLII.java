/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author pattie
 */
public class ParcialDosLII
{

    private static final String NOMBRE_XML = "palabras.xml";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        cargarListaPalabras();
    }
    
    private static void cargarListaPalabras()
    {
        ArrayList<Palabra> lista = new ArrayList<>();
        lista.add(new Palabra("PARACAIDAS", "Artefacto de tela resistente o de otra materia análoga, que se extiende en el aire en forma de sombrilla grande, cuya función es la de moderar la velocidad de caída de un cuerpo que se arroja desde una aeronave"));
        lista.add(new Palabra("DECORACION", "Arte que estudia la combinación de elementos ornamentales y la acomodación del espacio interior"));
        lista.add(new Palabra("MATRIMONIO", "Antigua institución social, presente en gran cantidad de culturas, que establece un vínculo conyugal entre personas naturales, reconocido y consolidado por medio de prácticas comunitarias y normas legales, consuetudinarias, religiosas o morales"));
        lista.add(new Palabra("REDITO", "Renta, utilidad o beneficio renovable que rinde un capital"));
        lista.add(new Palabra("CUENTA", "Cálculo u operación aritmética.\nCada una de las bolas ensartadas que componen el rosario"));
        lista.add(new Palabra("OVULO", "Células sexuales o gametos femeninos.1​ Son células grandes, esféricas e inmóviles."));
        lista.add(new Palabra("TECHO", "Parte superior de un edificio, construcción, habitáculo, etc., que lo cubre y cierra"));
        lista.add(new Palabra("HORA", "Tiempo que equivale a 60 minutos, es decir, 3600 segundos"));
        lista.add(new Palabra("VIOLIN", "Instrumento musical de cuerda, el más pequeño y agudo entre los de su clase, que se compone de una caja de resonancia en forma de 8, un mástil sin trastes y cuatro cuerdas que se hacen sonar con un arco"));
        lista.add(new Palabra("CINTA", "Tira de tela u otro material de propiedades semejantes que sirve para atar, ceñir o adornar"));
        lista.add(new Palabra("CUERDA", "Conjunto de hilos entrelazados que forman un solo cuerpo largo y flexible que sirve para atar, suspender pesos, etc."));
        lista.add(new Palabra("ZAPATILLA", "Calzado cómodo y ligero, de paño, piel, etc., y con suela delgada, que se usa para estar en casa"));
        lista.add(new Palabra("VENTILADOR", "Instrumento o aparato con aspas giratorias que impulsa o remueve el aire"));
        
        
    }
    
    private static void serializarPalabras(Palabra unaPalabra)
    {
        XMLEncoder encoder = null;
        
     
        try {
               FileOutputStream fos = new FileOutputStream(NOMBRE_XML);
               BufferedOutputStream bos = new BufferedOutputStream(fos); 
            
            
               encoder = new XMLEncoder(bos);
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("ERROR: guardando palabra");
        }
        encoder.writeObject(unaPalabra);
        encoder.close();
    }
}
