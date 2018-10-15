/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Sil y Pato
 */
public class Cuenta 
{
    private String _nombre;
    private long _nroCuenta;
    private double _saldo;
    private ETipoInteres _tipoInteres;

    public String getNombre() 
    {
        return this._nombre;
    }

    public void setNombre(String _nombre) 
    {
        if(_nombre.length() <= 1)
        {
            System.out.println("ERROR. El Nombre es un dato de ingreso obligatorio y debe contener al menos dos caracteres");
        }
        else
        {
            if(!_nombre.matches("([a-z]|[A-Z]|)+")) //Sólo permite caracteres alfabéticos
            {
                System.out.println("ERROR. El Nombre contiene caracteres no válidos");
            }
            else
            {
                this._nombre = _nombre;
            }
        }
    }

    public long getNroCuenta() 
    {
        return this._nroCuenta;
    }

    public void setNroCuenta(long _nroCuenta) 
    {
        if(_nroCuenta <= 0)
        {
            System.out.println("ERROR. El Número de Cuenta debe ser positivo");
        }
        else
        {
            this._nroCuenta = _nroCuenta;
        }
    }

    public double getSaldo() 
    {
        return this._saldo;
    }

    public void setSaldo(double _saldo) 
    {
        if(_saldo < 0)
        {
            System.out.println("ERROR. El Saldo debe ser cero o positivo");
        }
        else
        {
            this._saldo = _saldo;
        }
    }

    public ETipoInteres getTipoInteres() 
    {
        return this._tipoInteres;
    }

    public void setTipoInteres(ETipoInteres _tipoInteres) 
    {
        this._tipoInteres = _tipoInteres;
    }

    public void setTipoInteres(byte posicionTipoInteres) 
    {
        if(posicionTipoInteres < 0 || posicionTipoInteres >= ETipoInteres.values().length)
        {
            System.out.println("ERROR. Opción de Tipo de Interés incorrecta. Debe estar entre 0 y " + (ETipoInteres.values().length - 1));
        }
        else
        {
            this.setTipoInteres(ETipoInteres.values()[posicionTipoInteres]);
        }
    }
}
