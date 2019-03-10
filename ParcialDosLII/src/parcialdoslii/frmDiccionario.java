/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.awt.Component;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sil y Pato
 */
public class frmDiccionario extends javax.swing.JFrame implements TableModel{

    /**
     * Creates new form frmDiccionario
     */
    public frmDiccionario(Diccionario diccionario) {
        this.diccionario = diccionario;
        initComponents();
        this.inicializarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPalabras = new javax.swing.JTable();
        txtPalabra = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDefinicion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diccionario");

        tablaPalabras.setAutoCreateRowSorter(true);
        tablaPalabras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tablaPalabras);

        txtDefinicion.setColumns(20);
        txtDefinicion.setLineWrap(true);
        txtDefinicion.setRows(5);
        txtDefinicion.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDefinicion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPalabras;
    private javax.swing.JTextArea txtDefinicion;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
    private Diccionario diccionario;
    
    @Override
    public int getRowCount()
    {
        return this.diccionario.getCantidadPalabras();
    }

    @Override
    public int getColumnCount()
    {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex)
    {
        String nombreColumna = "";
        
        switch(columnIndex)
        {
            case 0:
                nombreColumna = "Palabra";
                break;
            case 1:
                nombreColumna = "Definición";
                break;
        }
        
        return nombreColumna;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return this.tablaPalabras.getValueAt(0, columnIndex).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Palabra palabra = this.diccionario.getListaPalabras().get(rowIndex);
        String retorno = "";
        
        switch(columnIndex)
        {
            case 0:
                retorno = palabra.getPalabra();
                this.txtPalabra.setText(retorno);
                break;
            case 1:
                retorno = palabra.getDefinicion();
                this.txtDefinicion.setText(retorno);
                break;
        }

        /*if(this.tablaPalabras.getSelectedRow() >= 0)
        {
            //this.txtPalabra.setText((String)this.tablaPalabras.getValueAt(this.tablaPalabras.getSelectedRow(), 0));
            this.txtPalabra.setText(this.tablaPalabras.get);
            this.txtDefinicion.setText((String)this.tablaPalabras.getValueAt(this.tablaPalabras.getSelectedRow(), 1));
        }*/
        
        return retorno;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        /*try
        {
            this.diccionario.editarPalabra(rowIndex, (String) aValue);
        }
        catch (CaracterPalabraException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Editar Palabra", JOptionPane.ERROR_MESSAGE);
        }*/
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void inicializarTabla()
    {
        this.tablaPalabras.setModel(this);
        this.tablaPalabras.createDefaultColumnsFromModel();
        this.tablaPalabras.getTableHeader().setResizingAllowed(true);
        final TableColumnModel columnModel = this.tablaPalabras.getColumnModel();
        
        //Adapta ancho de columnas al contenido
        for (int column = 0; column < this.tablaPalabras.getColumnCount(); column++)
        {
            int width = 15; // Min width
            for (int row = 0; row < this.tablaPalabras.getRowCount(); row++)
            {
                TableCellRenderer renderer = this.tablaPalabras.getCellRenderer(row, column);
                Component comp = this.tablaPalabras.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > 1000)
            {
                width=1000;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }

        this.tablaPalabras.repaint();
    }
}
