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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author capacita_mecon
 */
public class XML
{
    private static String extension = ".xml";

    public static String getExtension()
    {
        return extension;
    }
    
    public static Object cargar(String directorio, String archivoXML) throws FileNotFoundException
    {
        String nombreArchivoXML = directorio + archivoXML;
        
        if(!archivoXML.endsWith(extension))
        {
            nombreArchivoXML = nombreArchivoXML + extension;
        }

        FileInputStream fis = new FileInputStream(nombreArchivoXML);
        BufferedInputStream bis = new BufferedInputStream(fis);
        XMLDecoder decoder = new XMLDecoder(bis);
        
        return decoder.readObject();
    }

    public static void guardarNuevo(String directorio, String archivoXML, Object miObjeto) throws FileNotFoundException, ArchivoException
    {
        if(archivoXML != null && !archivoXML.isEmpty())
        {
            String nombreArchivoXML = directorio + archivoXML;
            if(!archivoXML.endsWith(extension))
            {
                nombreArchivoXML = nombreArchivoXML + extension;
            }
            File f = new File(nombreArchivoXML);

            if(f.exists())
            {
                throw new ArchivoExisteException("El archivo existe");
            }

            guardar(directorio, archivoXML, miObjeto);
        }
        else
        {
            throw new ArchivoNuloException("Debe elegir un nombre de archivo válido");
        }
    }

    public static void guardar(String directorio, String archivoXML, Object miObjeto) throws FileNotFoundException
    {
        String nombreArchivoXML = directorio + archivoXML;
        
        if(!archivoXML.endsWith(extension))
        {
            nombreArchivoXML = nombreArchivoXML + extension;
        }

        FileOutputStream fos = new FileOutputStream(nombreArchivoXML);
        BufferedOutputStream bos = new BufferedOutputStream(fos); 
        XMLEncoder encoder = new XMLEncoder(bos);

        encoder.writeObject(miObjeto);
        encoder.close();
    }
}
