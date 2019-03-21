/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

/**
 *
 * @author capacita_mecon
 */
public interface PalabraAptaAhorcado
{
    public abstract void setDificultad(DificultadPalabraEnum dificultad);
    public abstract DificultadPalabraEnum getDificultad();
    public abstract void validaDificultad(String dificultad) throws DificultadPalabraException;
}
