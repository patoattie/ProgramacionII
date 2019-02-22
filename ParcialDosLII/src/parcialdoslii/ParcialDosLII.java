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

    private static final String ARCHIVO_XML = "Diccionario.xml";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        cargarListaPalabras();
    }
    
    public static void cargarListaPalabras()
    {
        Diccionario miDiccionario = new Diccionario();

        miDiccionario.agregarPalabra(new Palabra("PARACAIDAS", "Artefacto de tela resistente o de otra materia análoga, que se extiende en el aire en forma de sombrilla grande, cuya función es la de moderar la velocidad de caída de un cuerpo que se arroja desde una aeronave"));
        miDiccionario.agregarPalabra(new Palabra("DECORACION", "Arte que estudia la combinación de elementos ornamentales y la acomodación del espacio interior"));
        miDiccionario.agregarPalabra(new Palabra("MATRIMONIO", "Antigua institución social, presente en gran cantidad de culturas, que establece un vínculo conyugal entre personas naturales, reconocido y consolidado por medio de prácticas comunitarias y normas legales, consuetudinarias, religiosas o morales"));
        miDiccionario.agregarPalabra(new Palabra("REDITO", "Renta, utilidad o beneficio renovable que rinde un capital"));
        miDiccionario.agregarPalabra(new Palabra("CUENTA", "Cálculo u operación aritmética.\nCada una de las bolas ensartadas que componen el rosario"));
        miDiccionario.agregarPalabra(new Palabra("OVULO", "Células sexuales o gametos femeninos.​ Son células grandes, esféricas e inmóviles."));
        miDiccionario.agregarPalabra(new Palabra("TECHO", "Parte superior de un edificio, construcción, habitáculo, etc., que lo cubre y cierra"));
        miDiccionario.agregarPalabra(new Palabra("HORA", "Tiempo que equivale a 60 minutos, es decir, 3600 segundos"));
        miDiccionario.agregarPalabra(new Palabra("VIOLIN", "Instrumento musical de cuerda, el más pequeño y agudo entre los de su clase, que se compone de una caja de resonancia en forma de 8, un mástil sin trastes y cuatro cuerdas que se hacen sonar con un arco"));
        miDiccionario.agregarPalabra(new Palabra("CINTA", "Tira de tela u otro material de propiedades semejantes que sirve para atar, ceñir o adornar"));
        miDiccionario.agregarPalabra(new Palabra("CUERDA", "Conjunto de hilos entrelazados que forman un solo cuerpo largo y flexible que sirve para atar, suspender pesos, etc."));
        miDiccionario.agregarPalabra(new Palabra("ZAPATILLA", "Calzado cómodo y ligero, de paño, piel, etc., y con suela delgada, que se usa para estar en casa"));
        miDiccionario.agregarPalabra(new Palabra("VENTILADOR", "Instrumento o aparato con aspas giratorias que impulsa o remueve el aire"));
        
        serializarPalabras(miDiccionario);
    }
    
    public static void serializarPalabras(Diccionario unDiccionario)
    {
        XMLEncoder encoder = null;
     
        try 
        {
               FileOutputStream fos = new FileOutputStream(ARCHIVO_XML);
               BufferedOutputStream bos = new BufferedOutputStream(fos); 
            
               encoder = new XMLEncoder(bos);
        } 
        catch (FileNotFoundException fileNotFound) 
        {
            System.out.println("ERROR: guardando palabra");
        }

        encoder.writeObject(unDiccionario);
        encoder.close();
    }
}
