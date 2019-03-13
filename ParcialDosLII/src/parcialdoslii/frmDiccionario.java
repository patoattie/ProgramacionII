/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Sil y Pato
 */
public class frmDiccionario extends javax.swing.JFrame implements TableModelListener{

    /**
     * Creates new form frmDiccionario
     */
    public frmDiccionario(Diccionario diccionario) {
        this.diccionario = diccionario;
        this.modeloTabla = new ModeloTabla(0, 3);
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
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPalabras = new javax.swing.JTable();
        txtPalabra = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDefinicion = new javax.swing.JTextArea();
        menuDiccionario = new javax.swing.JMenuBar();
        menDiccionario = new javax.swing.JMenu();
        menDiccionarioAgregar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Diccionario");

        tablaPalabras.setAutoCreateRowSorter(true);
        tablaPalabras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        tablaPalabras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaPalabras.getTableHeader().setReorderingAllowed(false);
        tablaPalabras.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tablaPalabrasMouseClicked(evt);
            }
        });
        tablaPalabras.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                tablaPalabrasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPalabras);

        txtPalabra.setEditable(false);

        txtDefinicion.setEditable(false);
        txtDefinicion.setColumns(20);
        txtDefinicion.setLineWrap(true);
        txtDefinicion.setRows(5);
        txtDefinicion.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDefinicion);

        menDiccionario.setText("Diccionario");

        menDiccionarioAgregar.setText("Agregar Palabra");
        menDiccionarioAgregar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menDiccionarioAgregarActionPerformed(evt);
            }
        });
        menDiccionario.add(menDiccionarioAgregar);

        menuDiccionario.add(menDiccionario);

        setJMenuBar(menuDiccionario);

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
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPalabrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPalabrasMouseClicked
        this.completarDetalle(this.tablaPalabras.getSelectedRow());
    }//GEN-LAST:event_tablaPalabrasMouseClicked

    private void tablaPalabrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPalabrasKeyReleased
        this.completarDetalle(this.tablaPalabras.getSelectedRow());        
    }//GEN-LAST:event_tablaPalabrasKeyReleased

    private void menDiccionarioAgregarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menDiccionarioAgregarActionPerformed
    {//GEN-HEADEREND:event_menDiccionarioAgregarActionPerformed
        String fila[] = new String[this.tablaPalabras.getColumnCount()];
        fila[ModeloTabla.getCOL_ESTADO()] = ModeloTabla.getINSERTA();
        this.modeloTabla.addRow(fila);
    }//GEN-LAST:event_menDiccionarioAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menDiccionario;
    private javax.swing.JMenuItem menDiccionarioAgregar;
    private javax.swing.JMenuBar menuDiccionario;
    private javax.swing.JTable tablaPalabras;
    private javax.swing.JTextArea txtDefinicion;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
    private Diccionario diccionario;
    private ModeloTabla modeloTabla;
    
    private void inicializarTabla()
    {
        this.tablaPalabras.setModel(this.modeloTabla);
        String titulo[] = {"Palabra", "Definición", ""};
        String fila[] = new String[this.tablaPalabras.getColumnCount()];
        this.modeloTabla.setColumnIdentifiers(titulo);
        this.modeloTabla.addTableModelListener(this);
        
        for (Palabra unaPalabra : this.diccionario.getListaPalabras())
        {
            fila[ModeloTabla.getCOL_PALABRA()] = unaPalabra.getPalabra();
            fila[ModeloTabla.getCOL_DEFINICION()] = unaPalabra.getDefinicion();
            fila[ModeloTabla.getCOL_ESTADO()] = ModeloTabla.getSIN_CAMBIOS();
            this.modeloTabla.addRow(fila);
        }
        
        this.tablaPalabras.getTableHeader().setResizingAllowed(true);

        //Adapta ancho de columnas al contenido
        for (int column = 0; column < this.tablaPalabras.getColumnCount(); column++)
        {
            final TableColumnModel columnModel = this.tablaPalabras.getColumnModel();
            int width = ModeloTabla.getANCHO_MINIMO(); // Min width
            for (int row = 0; row < this.tablaPalabras.getRowCount(); row++)
            {
                TableCellRenderer renderer = this.tablaPalabras.getCellRenderer(row, column);
                Component comp = this.tablaPalabras.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            if(width > ModeloTabla.getANCHO_MAXIMO())
            {
                width = ModeloTabla.getANCHO_MAXIMO();
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
        
        this.tablaPalabras.getColumnModel().getColumn(ModeloTabla.getCOL_ESTADO()).setMinWidth(1);
        this.tablaPalabras.getColumnModel().getColumn(ModeloTabla.getCOL_ESTADO()).setPreferredWidth(0);
        this.tablaPalabras.getColumnModel().getColumn(ModeloTabla.getCOL_ESTADO()).setResizable(false);
        this.tablaPalabras.setRowSelectionInterval(0, 0);
        this.completarDetalle(0);
    }
    
    private void completarDetalle(int fila)
    {
        this.txtPalabra.setText((String)this.tablaPalabras.getValueAt(fila, 0));
        this.txtDefinicion.setText((String)this.tablaPalabras.getValueAt(fila, 1));
    }

    @Override
    public void tableChanged(TableModelEvent tme)
    {
        switch(tme.getType())
        {
            case TableModelEvent.UPDATE:
                try
                {
                    String palabraTabla = (String) this.tablaPalabras.getValueAt(tme.getFirstRow(), 0);
                    String definicionTabla = (String) this.tablaPalabras.getValueAt(tme.getFirstRow(), 1);
                    this.diccionario.editarDefinicion(this.diccionario.buscarPalabra(palabraTabla), definicionTabla);
                }
                catch (CaracterPalabraException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Editar Diccionario", JOptionPane.ERROR_MESSAGE);
                }

                break;
        }
    }
}
