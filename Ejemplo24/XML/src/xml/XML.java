/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacita_mecon
 */
public class XML {

    /**
     * @param args the command line arguments
     */
    private static final String SERIALIZED_FILE_NAME = "dvd.xml";

    public static void main(String[] args) {
        Movie bourneIndentity = new Movie("The Bourne Identity", 119, "Doug Liman", 2002, "Matt Damon, Franka Potente");
        Movie bourneSupermacy = new Movie("The Bourne Supremacy", 108, "Paul Greengrass", 2004, "Matt Damon, Franka Potente, Joan Allen");
        Movie bourneUltimatum = new Movie("The Bourne Ultimatum", 115, "Paul Greengrass", 2007, "Matt Damon, Edgar Ramirez, Joan Allen");
        Movie bourneLegacy = new Movie("The Bourne Legacy", 135, "Tony Gilroy", 2012, "Jeremy Renner, Rachel Weisz, Edward Norton");

        List moviesList = new ArrayList();
        moviesList.add(bourneIndentity);
        moviesList.add(bourneSupermacy);
        moviesList.add(bourneUltimatum);
        moviesList.add(bourneLegacy);

        DVD bourneSeries = new DVD();
        bourneSeries.setMovies(moviesList);

        serializarPeliculas(bourneSeries);

        //Lectura
        DVD lectura = deserializarPeliculas();

        System.out.println(lectura.toString());

    }

    public static void serializarPeliculas(DVD bourneSeries) {
        XMLEncoder encoder = null;
        
     
        try {
               FileOutputStream fos = new FileOutputStream(SERIALIZED_FILE_NAME);
               BufferedOutputStream bos = new BufferedOutputStream(fos); 
            
            
               encoder = new XMLEncoder(bos);
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("ERROR: guardando dvds");
        }
        encoder.writeObject(bourneSeries);
        encoder.close();
    }

    public static DVD deserializarPeliculas() {
        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado");
        }
        
        DVD peliculas = (DVD) decoder.readObject();

        return peliculas;
    }
}
