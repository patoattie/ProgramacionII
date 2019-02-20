/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo24;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author capacita_mecon
 */
public class Archivo
{
    private String _nombre;
    private String _ruta;

    public Archivo(String _nombre, String _ruta)
    {
        this._nombre = _nombre;
        this._ruta = _ruta;
    }
    
    public Archivo(String _nombre)
    {
        this(_nombre, "");
    }

    public String getNombre()
    {
        return this._nombre;
    }

    public void setNombre(String _nombre)
    {
        this._nombre = _nombre;
    }

    public String getRuta()
    {
        return this._ruta;
    }

    public void setRuta(String _ruta)
    {
        this._ruta = _ruta;
    }
    
    public void crearArchivo() throws IOException, ArchivoExistenteExcepcion
    {
        File nuevoArchivo = new File(_ruta + _nombre);
        boolean creoArchivo;
        
        creoArchivo = nuevoArchivo.createNewFile();
        
        if(!creoArchivo)
        {
            throw new ArchivoExistenteExcepcion("El archivo ya existe");
        }
    }
}
