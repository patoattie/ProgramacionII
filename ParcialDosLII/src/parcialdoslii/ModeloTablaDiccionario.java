/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import javax.swing.JOptionPane;

/**
 *
 * @author pattie
 */
public class ModeloTablaDiccionario extends ModeloTabla
{
    private static final int COL_PALABRA = 0;
    private static final int COL_DEFINICION = 1;
    private static final int COL_ESTADO = 2;
    private static final int ANCHO_MAXIMO = 750;
    private static final int ANCHO_MINIMO = 15;

    public ModeloTablaDiccionario(int fila, int columna)
    {
        super(fila, columna);
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
        
        /*switch(columna)
        {
            case ModeloTablaDiccionario.COL_PALABRA:
                if(((String)this.getValueAt(fila, ModeloTablaDiccionario.COL_ESTADO)).equalsIgnoreCase(ModeloTabla.getINSERTA()))
                {
                    esEditable = true;
                }
                break;
            case ModeloTablaDiccionario.COL_DEFINICION:
                esEditable = true;
                break;
        }*/
        
        return esEditable;
    }

    @Override
     public Class<?> getColumnClass(int i)
    {
        return String.class;
    }
     
    /*@Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
                    if(columnIndex == ModeloTablaDiccionario.getCOL_PALABRA())
                    {
                        try
                        {
                            aValue = Palabra.validaPalabra((String)aValue);
                            if(this.getValueAt(rowIndex, ModeloTablaDiccionario.getCOL_ESTADO()) == ModeloTablaDiccionario.getINSERTA())
                            {
                                this.setValueAt(Palabra.validaDefinicion(""), rowIndex, ModeloTablaDiccionario.getCOL_DEFINICION());
                            }
                        }
                        catch (CaracterPalabraException e)
                        {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Editar Diccionario", JOptionPane.ERROR_MESSAGE);
                            //this.tablaPalabras.getCellEditor(this.tablaPalabras.getEditingRow(), this.tablaPalabras.getEditingColumn()).cancelCellEditing();
                        }
                    }
                    else if(columnIndex == ModeloTablaDiccionario.getCOL_DEFINICION())
                    {
                        aValue = Palabra.validaDefinicion((String)aValue);
                    }
    }*/
}
