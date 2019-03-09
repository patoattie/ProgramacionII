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
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author capacita_mecon
 */
public class XML
{
    private static String directorio = "xml\\";
    private static String extension = ".xml";

    public static String getDirectorio()
    {
        return directorio;
    }

    public static String getExtension()
    {
        return extension;
    }
    
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

            guardar(archivoXML, miObjeto);
        }
        else
        {
            throw new ArchivoNuloException("Debe elegir un nombre de archivo válido");
        }
    }

    public static void guardar(String archivoXML, Object miObjeto) throws FileNotFoundException
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
    
    public static String dialogo(boolean guardar)
    {
        JFileChooser dialogo = new JFileChooser(directorio);
        String retorno = "";
        int seleccion;
        FileFilter filtro = new FileFilter()
        {
            @Override
            public boolean accept(File f)
            {
                return f.getName().endsWith(extension);
            }

            @Override
            public String getDescription()
            {
                return "Archivo XML";
            }
        };

        dialogo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        dialogo.setFileFilter(filtro);
        dialogo.setAcceptAllFileFilterUsed(false);
        if(guardar)
        {
            dialogo.setDialogType(JFileChooser.SAVE_DIALOG);
            seleccion = dialogo.showSaveDialog(null);
        }
        else
        {
            dialogo.setDialogType(JFileChooser.OPEN_DIALOG);
            seleccion = dialogo.showOpenDialog(null);
        }
        
        if(seleccion == JFileChooser.APPROVE_OPTION)
        {
            retorno = dialogo.getSelectedFile().getName();
        }
        
        return retorno;
    }
}
