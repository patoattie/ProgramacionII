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
public interface TablaDiccionarioAptaAhorcado
{
    public abstract int getColDificultad();
    public abstract void setColDificultad(int posicionColumna);
    public abstract String getDificultad(int fila) throws IndexOutOfBoundsException;
    public abstract void setDificultad(String valor, int fila) throws IndexOutOfBoundsException;
}
