/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author capacita_mecon
 */
public class XML
{
    public static Object cargar(String archivoXML) throws FileNotFoundException
    {
        FileInputStream fis = new FileInputStream(archivoXML);
        BufferedInputStream bis = new BufferedInputStream(fis);
        XMLDecoder decoder = new XMLDecoder(bis);
        
        return decoder.readObject();
    }

    public static void guardarNuevo(String archivoXML, Object miObjeto) throws FileNotFoundException, ArchivoException
    {
        if(archivoXML != null && !archivoXML.isEmpty())
        {
            String nombreArchivoXML = "xml\\" + archivoXML + ".xml";
            File f = new File(nombreArchivoXML);

            if(f.exists())
            {
                throw new ArchivoExisteException("El archivo existe");
            }

            guardar(archivoXML, miObjeto);
        }
        else
        {
            throw new ArchivoNuloException("Debe elegir un nombre de archivo válido");
        }
    }

    public static void guardar(String archivoXML, Object miObjeto) throws FileNotFoundException
    {
        String nombreArchivoXML = "xml\\" + archivoXML + ".xml";

        FileOutputStream fos = new FileOutputStream(nombreArchivoXML);
        BufferedOutputStream bos = new BufferedOutputStream(fos); 
        XMLEncoder encoder = new XMLEncoder(bos);

        encoder.writeObject(miObjeto);
        encoder.close();
    }
}
