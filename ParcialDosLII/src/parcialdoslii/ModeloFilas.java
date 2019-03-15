/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Sil y Pato
 */
public class ModeloFilas extends DefaultTableCellRenderer
{
    private int columnaEstado;

    public ModeloFilas(int columnaEstado)
    {
        this.columnaEstado = columnaEstado;
    }

    @Override
    public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column)
    {    
        this.setBackground(Color.WHITE);
        this.setForeground(Color.BLACK);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        
        if(table.getValueAt(row, this.columnaEstado).equals(ModeloTabla.getBORRA()))
        {
            this.setForeground(Color.LIGHT_GRAY);
        }
        else if(table.getValueAt(row, this.columnaEstado).equals(ModeloTabla.getACTUALIZA()))
        {
            this.setForeground(Color.BLUE);
        }
        else if(table.getValueAt(row, this.columnaEstado).equals(ModeloTabla.getINSERTA()))
        {
            this.setForeground(new Color(0, 155, 0)); //Verde oscuro
        }
        
        return this;
    }
}
