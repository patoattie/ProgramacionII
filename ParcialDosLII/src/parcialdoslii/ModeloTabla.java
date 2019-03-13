/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pattie
 */
public class ModeloTabla extends DefaultTableModel
{
    private static final String INSERTA = "I";
    private static final String ACTUALIZA = "U";
    private static final String BORRA = "D";
    private static final String SIN_CAMBIOS = " ";
    private static final int COL_PALABRA = 0;
    private static final int COL_DEFINICION = 1;
    private static final int COL_ESTADO = 2;
    private static final int ANCHO_MAXIMO = 750;
    private static final int ANCHO_MINIMO = 15;

    public ModeloTabla(int fila, int columna)
    {
        super(fila, columna);
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

    public static int getCOL_PALABRA()
    {
        return COL_PALABRA;
    }

    public static int getCOL_DEFINICION()
    {
        return COL_DEFINICION;
    }

    public static int getCOL_ESTADO()
    {
        return COL_ESTADO;
    }

    public static int getANCHO_MAXIMO()
    {
        return ANCHO_MAXIMO;
    }

    public static int getANCHO_MINIMO()
    {
        return ANCHO_MINIMO;
    }

    @Override
    public boolean isCellEditable(int fila, int columna)
    {
        boolean esEditable = false;
        
        switch(columna)
        {
            case ModeloTabla.COL_PALABRA:
                if(((String)this.getValueAt(fila, ModeloTabla.COL_ESTADO)).equalsIgnoreCase(ModeloTabla.INSERTA))
                {
                    esEditable = true;
                }
                break;
            case ModeloTabla.COL_DEFINICION:
                esEditable = true;
                break;
        }
        
        return esEditable;
    }

    @Override
     public Class<?> getColumnClass(int i)
    {
        return String.class;
    }
}
