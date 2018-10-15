/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Sil y Pato
 */
public class Computadora 
{
    private boolean _estaEncendida;
    private EMarca _marca;
    private float _peso;
    private EProcesador _procesador;
    
    public Computadora(byte marca, byte procesador, float peso, boolean estaEncendida)
    {
        this.setMarca(marca);
        this.setProcesador(procesador);
        this.setPeso(peso);
        this.setEstaEncendida(estaEncendida);
    }

    public boolean getEstaEncendida() 
    {
        return this._estaEncendida;
    }

    public void setEstaEncendida(boolean encender) 
    {
        this._estaEncendida = encender;
    }

    public EMarca getMarca() 
    {
        return this._marca;
    }

    public void setMarca(EMarca marca) 
    {
        this._marca = marca;
    }

    public void setMarca(byte posicionMarca) 
    {
        if(posicionMarca < 0 || posicionMarca >= EMarca.values().length)
        {
            System.out.println("ERROR. Opción de Marca incorrecta. Debe estar entre 0 y " + (EMarca.values().length - 1));
        }
        else
        {
            this.setMarca(EMarca.values()[posicionMarca]);
        }
    }

    public float getPeso() 
    {
        return this._peso;
    }

    public void setPeso(float peso) 
    {
        if(peso <= 0)
        {
            System.out.println("ERROR. El Peso de la computadora debe ser positivo");
        }
        else
        {
            this._peso = peso;
        }
    }

    public EProcesador getProcesador() 
    {
        return this._procesador;
    }

    public void setProcesador(EProcesador procesador) 
    {
        this._procesador = procesador;
    }

    public void setProcesador(byte posicionProcesador) 
    {
        if(posicionProcesador < 0 || posicionProcesador >= EProcesador.values().length)
        {
            System.out.println("ERROR. Opción de Procesador incorrecta. Debe estar entre 0 y " + (EProcesador.values().length - 1));
        }
        else
        {
            this.setProcesador(EProcesador.values()[posicionProcesador]);
        }
    }
    
    public void InformarEstado()
    {
        String respuestaEncendida;
        
        System.out.println("");
        System.out.println("Datos de la Computadora");
        System.out.println("------------------");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Procesador: " + this.getProcesador());
        System.out.println("Peso: " + this.getPeso());
        if(this.getEstaEncendida())
        {
            respuestaEncendida = "SI";
        }
        else
        {
            respuestaEncendida = "NO";
        }
        System.out.println("Encendida: " + respuestaEncendida);
    }
    
    public void Encender()
    {
        this.setEstaEncendida(true);
    }

    public void Apagar()
    {
        this.setEstaEncendida(false);
    }
}
