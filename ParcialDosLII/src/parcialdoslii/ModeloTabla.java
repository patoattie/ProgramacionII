/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pattie
 */
public abstract class ModeloTabla extends DefaultTableModel
{
    private static final String INSERTA = "I";
    private static final String ACTUALIZA = "U";
    private static final String BORRA = "D";
    private static final String SIN_CAMBIOS = " ";
    private int cambiosSinGuardar;

    public ModeloTabla(int fila, int columna)
    {
        super(fila, columna);
        this.cambiosSinGuardar = 0;
    }
    
    public static String getINSERTA()
    {
        return INSERTA;
    }

    public static String getACTUALIZA()
    {
        return ACTUALIZA;
    }

    public static String getBORRA()
    {
        return BORRA;
    }

    public static String getSIN_CAMBIOS()
    {
        return SIN_CAMBIOS;
    }

    public int getCambiosSinGuardar()
    {
        return cambiosSinGuardar;
    }

    public void agregarCambiosSinGuardar()
    {
        this.cambiosSinGuardar++;
    }

    public void restarCambiosSinGuardar()
    {
        this.cambiosSinGuardar--;
    }

    @Override
    public abstract boolean isCellEditable(int fila, int columna);

    @Override
    public abstract Class<?> getColumnClass(int i);
}
