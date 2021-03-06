/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.awt.Component;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Sil y Pato
 */
public class frmDiccionario extends javax.swing.JFrame {

    /**
     * Creates new form frmDiccionario
     */
    public frmDiccionario(Diccionario diccionario) {
        this.diccionario = diccionario;
        this.modeloTabla = new ModeloTablaDiccionario(0, 4);
        this.modeloFilas = new ModeloFilas(ModeloTablaDiccionario.getCOL_ESTADO());
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
        txtDificultad = new javax.swing.JTextField();
        menuDiccionario = new javax.swing.JMenuBar();
        menDiccionario = new javax.swing.JMenu();
        menDiccionarioAgregar = new javax.swing.JMenuItem();
        menDiccionarioEditar = new javax.swing.JMenuItem();
        menDiccionarioBorrar = new javax.swing.JMenuItem();
        menDiccionarioRehabilitar = new javax.swing.JMenuItem();
        menDiccionarioSeparador1 = new javax.swing.JPopupMenu.Separator();
        menDiccionarioGuardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrar Diccionario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tablaPalabras.setAutoCreateRowSorter(true);
        tablaPalabras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPalabras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaPalabras.getTableHeader().setReorderingAllowed(false);
        tablaPalabras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPalabrasMouseClicked(evt);
            }
        });
        tablaPalabras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
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

        txtDificultad.setEditable(false);

        menDiccionario.setText("Diccionario");

        menDiccionarioAgregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menDiccionarioAgregar.setText("Agregar Palabra");
        menDiccionarioAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menDiccionarioAgregarActionPerformed(evt);
            }
        });
        menDiccionario.add(menDiccionarioAgregar);

        menDiccionarioEditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menDiccionarioEditar.setText("Editar Palabra");
        menDiccionarioEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menDiccionarioEditarActionPerformed(evt);
            }
        });
        menDiccionario.add(menDiccionarioEditar);

        menDiccionarioBorrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        menDiccionarioBorrar.setText("Borrar Palabra");
        menDiccionarioBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menDiccionarioBorrarActionPerformed(evt);
            }
        });
        menDiccionario.add(menDiccionarioBorrar);

        menDiccionarioRehabilitar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menDiccionarioRehabilitar.setText("Rehabilitar Palabra");
        menDiccionarioRehabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menDiccionarioRehabilitarActionPerformed(evt);
            }
        });
        menDiccionario.add(menDiccionarioRehabilitar);
        menDiccionario.add(menDiccionarioSeparador1);

        menDiccionarioGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menDiccionarioGuardar.setText("Guardar");
        menDiccionarioGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menDiccionarioGuardarActionPerformed(evt);
            }
        });
        menDiccionario.add(menDiccionarioGuardar);

        menuDiccionario.add(menDiccionario);

        setJMenuBar(menuDiccionario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtDificultad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPalabrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPalabrasMouseClicked
        this.refrescarDatos(false);
    }//GEN-LAST:event_tablaPalabrasMouseClicked

    private void tablaPalabrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaPalabrasKeyReleased
        this.refrescarDatos(false);        
    }//GEN-LAST:event_tablaPalabrasKeyReleased

    private void menDiccionarioAgregarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menDiccionarioAgregarActionPerformed
    {//GEN-HEADEREND:event_menDiccionarioAgregarActionPerformed
        String fila[] = new String[this.tablaPalabras.getColumnCount()];
        dlgEdicionDiccionario dialogo = new dlgEdicionDiccionario(this, true, new Palabra(), ModeloTablaDiccionario.getINSERTA(), this.diccionario, this.modeloTabla);
        dialogo.setVisible(true);
        
        if(!dialogo.isDialogoCancelado())
        {
            fila[ModeloTablaDiccionario.getCOL_ESTADO()] = ModeloTablaDiccionario.getINSERTA();
            fila[ModeloTablaDiccionario.getCOL_PALABRA()] = dialogo.getTxtPalabra();
            fila[ModeloTablaDiccionario.getCOL_DEFINICION()] = dialogo.getTxtDefinicion();
            fila[this.modeloTabla.getColDificultad()] = dialogo.getCmbDificultad();
            this.modeloTabla.addRow(fila);
            this.modeloTabla.agregarCambiosSinGuardar();
            this.tablaPalabras.setRowSelectionInterval(ModeloTablaDiccionario.getFilaTabla(this.tablaPalabras, this.modeloTabla.getRowCount() - 1), ModeloTablaDiccionario.getFilaTabla(this.tablaPalabras, this.modeloTabla.getRowCount() - 1));
            this.refrescarDatos(true);
        }
        
        dialogo.dispose();
    }//GEN-LAST:event_menDiccionarioAgregarActionPerformed

    private void menDiccionarioEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menDiccionarioEditarActionPerformed
    {//GEN-HEADEREND:event_menDiccionarioEditarActionPerformed
        String palabra = this.getPalabraSeleccionada();
        String definicion = this.getDefinicionSeleccionada();
        String estadoActual = this.getEstadoSeleccionado();
        String dificultad = this.getDificultadSeleccionada();
        String estadoNuevo;
        
        if(!estadoActual.equals(ModeloTablaDiccionario.getBORRA()))
        {
            dlgEdicionDiccionario dialogo = null;

            if(estadoActual.equals(ModeloTablaDiccionario.getSIN_CAMBIOS()))
            {
                estadoNuevo = ModeloTablaDiccionario.getACTUALIZA();
            }
            else
            {
                //Si estoy editando una palabra nueva, mantengo el estado.
                estadoNuevo = estadoActual;
            }

            try
            {
                dialogo = new dlgEdicionDiccionario(this, true, new Palabra(palabra, definicion, dificultad), estadoNuevo, this.diccionario, this.modeloTabla);
            }
            catch (CaracterPalabraException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Editar Palabra", JOptionPane.ERROR_MESSAGE);
            }
            catch(IllegalArgumentException e)
            {
            }
            dialogo.setVisible(true);

            if(!dialogo.isDialogoCancelado())
            {
                palabra = dialogo.getTxtPalabra();
                definicion = dialogo.getTxtDefinicion();
                dificultad = dialogo.getCmbDificultad();
                this.modeloTabla.setPalabra(palabra, ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
                this.modeloTabla.setDefinicion(definicion, ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
                this.modeloTabla.setEstado(estadoNuevo, ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
                this.modeloTabla.setDificultad(dificultad, ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
                this.modeloTabla.agregarCambiosSinGuardar();
                this.refrescarDatos(true);
            }

            dialogo.dispose();
        }
    }//GEN-LAST:event_menDiccionarioEditarActionPerformed

    private void menDiccionarioRehabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menDiccionarioRehabilitarActionPerformed
        String estadoActual = this.getEstadoSeleccionado();
        String estadoNuevo = ModeloTablaDiccionario.getBORRA();
        
        if(estadoActual.equals(ModeloTablaDiccionario.getBORRA()))
        {
            String definicionAlmacenada = this.diccionario.getListaPalabras().get(this.diccionario.buscarPalabra(this.getPalabraSeleccionada())).getDefinicion();
            String definicionActual = this.getDefinicionSeleccionada();
            
            if(definicionAlmacenada.equalsIgnoreCase(definicionActual))
            {
                estadoNuevo = ModeloTablaDiccionario.getSIN_CAMBIOS();
                //Resto el cambio hecho con el borrado. Casteo a Object para que interprete el entero como valor y no como índice.
                this.modeloTabla.restarCambiosSinGuardar();
            }
            else
            {
                //Si previo al borrado había modificado la definición, entonces restauro al estado correcto.
                estadoNuevo = ModeloTablaDiccionario.getACTUALIZA();
            }
            
            this.modeloTabla.setEstado(estadoNuevo, ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
            
            this.refrescarDatos(true);
        }
    }//GEN-LAST:event_menDiccionarioRehabilitarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        if(this.modeloTabla.getCambiosSinGuardar() > 0)
        {
            switch(JOptionPane.showConfirmDialog(null, "Desea guardar los cambios antes de salir?", "Salir del Diccionario", JOptionPane.YES_NO_CANCEL_OPTION))
            {
                case JOptionPane.YES_OPTION:
                    try
                    {
                        this.persistirEnMemoria();
                        this.dispose();
                    }
                    catch (CaracterPalabraException | ExistePalabraException | IndexOutOfBoundsException | NoExistePalabraException e)
                    {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Guardar Diccionario", JOptionPane.ERROR_MESSAGE);
                    }
                    catch (FileNotFoundException e)
                    {
                        JOptionPane.showMessageDialog(null, "ERROR. Archivo XML no encontrado", "Guardar Diccionario", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case JOptionPane.NO_OPTION:
                    this.dispose();
                    break;
            }
        }
        else
        {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void menDiccionarioGuardarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menDiccionarioGuardarActionPerformed
    {//GEN-HEADEREND:event_menDiccionarioGuardarActionPerformed
        try
        {
            this.persistirEnMemoria();
            JOptionPane.showMessageDialog(null, "Se guardó el Diccionario correctamente", "Guardar Diccionario", JOptionPane.INFORMATION_MESSAGE);
            this.refrescarDatos(true);
        }
        catch (CaracterPalabraException | ExistePalabraException | IndexOutOfBoundsException | NoExistePalabraException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Guardar Diccionario", JOptionPane.ERROR_MESSAGE);
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "ERROR. Archivo XML no encontrado", "Guardar Diccionario", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menDiccionarioGuardarActionPerformed

    private void menDiccionarioBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menDiccionarioBorrarActionPerformed
        String estadoActual = this.getEstadoSeleccionado();
        String estadoNuevo = ModeloTablaDiccionario.getBORRA();

        if(!estadoActual.equals(ModeloTablaDiccionario.getBORRA()))
        {
            if(estadoActual.equals(ModeloTablaDiccionario.getINSERTA()))
            {
                int filaSeleccionada = this.tablaPalabras.getSelectedRow();

                //Resto el cambio hecho con la inserción. Casteo a Object para que interprete el entero como valor y no como índice.
                this.modeloTabla.restarCambiosSinGuardar();

                //Necesito traducir el número de fila visible al número de fila del modelo con convertRowIndexToModel.
                this.modeloTabla.removeRow(ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));

                this.tablaPalabras.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);
            }
            else
            {
                if(estadoActual.equals(ModeloTablaDiccionario.getSIN_CAMBIOS()))
                {
                    //Si la fila ya estaba actualizada no se agrega ningún cambio, sino sumo 1.
                    this.modeloTabla.agregarCambiosSinGuardar();
                }
                this.modeloTabla.setEstado(estadoNuevo, ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
            }

            this.refrescarDatos(true);
        }
    }//GEN-LAST:event_menDiccionarioBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menDiccionario;
    private javax.swing.JMenuItem menDiccionarioAgregar;
    private javax.swing.JMenuItem menDiccionarioBorrar;
    private javax.swing.JMenuItem menDiccionarioEditar;
    private javax.swing.JMenuItem menDiccionarioGuardar;
    private javax.swing.JMenuItem menDiccionarioRehabilitar;
    private javax.swing.JPopupMenu.Separator menDiccionarioSeparador1;
    private javax.swing.JMenuBar menuDiccionario;
    private javax.swing.JTable tablaPalabras;
    private javax.swing.JTextArea txtDefinicion;
    private javax.swing.JTextField txtDificultad;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
    private Diccionario diccionario;
    private ModeloTablaDiccionario modeloTabla;
    private ModeloFilas modeloFilas;
    
    private void inicializarTabla()
    {
        this.tablaPalabras.setModel(this.modeloTabla); //Asigno el modelo de la tabla
        this.tablaPalabras.setDefaultRenderer(Object.class, this.modeloFilas); //Para poder manejar colores según el estado.
        this.tablaPalabras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //Permito únicamente selección simple de filas.
        String titulo[] = ModeloTablaDiccionario.TITULOS_COLUMNAS;
        String fila[] = new String[this.tablaPalabras.getColumnCount()];
        this.modeloTabla.setColumnIdentifiers(titulo);
        this.modeloTabla.setColDificultad((this.modeloTabla.findColumn("")) + 1);
        
        for (Palabra unaPalabra : this.diccionario.getListaPalabras())
        {
            fila[ModeloTablaDiccionario.getCOL_PALABRA()] = unaPalabra.getPalabra();
            fila[ModeloTablaDiccionario.getCOL_DEFINICION()] = unaPalabra.getDefinicion();
            fila[ModeloTablaDiccionario.getCOL_ESTADO()] = ModeloTabla.getSIN_CAMBIOS();
            try
            {
                fila[this.modeloTabla.getColDificultad()] = unaPalabra.getDificultad();
            }
            catch(NullPointerException e)
            {
                fila[this.modeloTabla.getColDificultad()] = "";
            }
            this.modeloTabla.addRow(fila);
        }
        
        this.tablaPalabras.getTableHeader().setResizingAllowed(true);

        this.tablaPalabras.getRowSorter().toggleSortOrder(ModeloTablaDiccionario.getCOL_PALABRA()); //Ordeno por Palabra en forma ascendente.
        if(this.tablaPalabras.getRowCount() > 0)
        {
            this.tablaPalabras.setRowSelectionInterval(0, 0); //Selecciono inicialmente la primera fila.
        }
        
        this.refrescarDatos(true);
    }
    
    private void refrescarDatos(boolean redibujarTabla)
    {
        if(this.tablaPalabras.getSelectedRowCount() == 1)
        {
            this.txtPalabra.setText(this.getPalabraSeleccionada());
            this.txtDefinicion.setText(this.getDefinicionSeleccionada());
            this.txtDificultad.setText(this.getDificultadSeleccionada());
        }
        else
        {
            this.txtPalabra.setText("");
            this.txtDefinicion.setText("");
            this.txtDificultad.setText("");
        }
        
        //Si la fila está borrada no la puedo editar ni borrar
        this.menDiccionarioEditar.setEnabled((this.tablaPalabras.getSelectedRowCount() == 1) && !this.getEstadoSeleccionado().equals(ModeloTablaDiccionario.getBORRA()));
        this.menDiccionarioBorrar.setEnabled((this.tablaPalabras.getSelectedRowCount() == 1) && !this.getEstadoSeleccionado().equals(ModeloTablaDiccionario.getBORRA()));
        
        //Unicamente si la fila está borrada puedo rehabilitar
        this.menDiccionarioRehabilitar.setEnabled((this.tablaPalabras.getSelectedRowCount() == 1) && this.getEstadoSeleccionado().equals(ModeloTablaDiccionario.getBORRA()));
        
        //Habilito la opción de guardar únicamente si hay cambios no guardados
        this.menDiccionarioGuardar.setEnabled(this.modeloTabla.getCambiosSinGuardar() > 0);
        
        if(redibujarTabla)
        {
            this.adaptarAnchoColumnas();
            this.tablaPalabras.repaint();
        }
    }
    
    private void persistirEnMemoria() throws CaracterPalabraException, ExistePalabraException, IndexOutOfBoundsException, NoExistePalabraException, FileNotFoundException
    {
        String estadoLeido;
        String palabraLeida;
        String definicionLeida;
        String dificultadLeida;
        
        for (int i = 0; i < this.modeloTabla.getRowCount(); i++)
        {
            estadoLeido = this.modeloTabla.getEstado(i);
            palabraLeida = this.modeloTabla.getPalabra(i);
            definicionLeida = this.modeloTabla.getDefinicion(i);
            dificultadLeida = this.modeloTabla.getDificultad(i);
            
            if(estadoLeido.equals(ModeloTablaDiccionario.getINSERTA()))
            {
                this.diccionario.agregarPalabra(new Palabra(palabraLeida, definicionLeida, dificultadLeida));
                this.modeloTabla.setEstado(ModeloTablaDiccionario.getSIN_CAMBIOS(), i);
                this.modeloTabla.restarCambiosSinGuardar();
            }
            else if(estadoLeido.equals(ModeloTablaDiccionario.getACTUALIZA()))
            {
                this.diccionario.editarPalabra(this.diccionario.buscarPalabra(palabraLeida), new Palabra(palabraLeida, definicionLeida, dificultadLeida));
                this.modeloTabla.setEstado(ModeloTablaDiccionario.getSIN_CAMBIOS(), i);
                this.modeloTabla.restarCambiosSinGuardar();
            }
            else if(estadoLeido.equals(ModeloTablaDiccionario.getBORRA()))
            {
                this.diccionario.eliminarPalabra(this.diccionario.buscarPalabra(palabraLeida));
                this.modeloTabla.removeRow(i);
                i--; //Para acomodar el índice por la fila borrada
                this.modeloTabla.restarCambiosSinGuardar();
            }
        }
        
        this.diccionario.grabarDiccionario(Diccionario.getARCHIVO_XML());
    }
    
    private String getPalabraSeleccionada()
    {
        return this.modeloTabla.getPalabra(ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
    }

    private String getDefinicionSeleccionada()
    {
        return this.modeloTabla.getDefinicion(ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
    }

    private String getEstadoSeleccionado()
    {
        return this.modeloTabla.getEstado(ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
    }
    
    private String getDificultadSeleccionada()
    {
        return this.modeloTabla.getDificultad(ModeloTablaDiccionario.getFilaModelo(this.tablaPalabras, this.tablaPalabras.getSelectedRow()));
    }

    public ModeloTablaDiccionario getModeloTabla()
    {
        return modeloTabla;
    }
    
    private void adaptarAnchoColumnas()
    {
        for (int column = 0; column < this.tablaPalabras.getColumnCount(); column++)
        {
            final TableColumnModel columnModel = this.tablaPalabras.getColumnModel();
            int width = ModeloTablaDiccionario.getANCHO_MINIMO(); // Min width
            for (int row = 0; row < this.tablaPalabras.getRowCount(); row++)
            {
                TableCellRenderer renderer = this.tablaPalabras.getCellRenderer(row, column);
                Component comp = this.tablaPalabras.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            if(width > ModeloTablaDiccionario.getANCHO_MAXIMO())
            {
                width = ModeloTablaDiccionario.getANCHO_MAXIMO();
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }

        //Invisibilizo la columna Estado.
        this.tablaPalabras.getColumnModel().getColumn(ModeloTablaDiccionario.getCOL_ESTADO()).setMinWidth(0);
        this.tablaPalabras.getColumnModel().getColumn(ModeloTablaDiccionario.getCOL_ESTADO()).setPreferredWidth(0);
        this.tablaPalabras.getColumnModel().getColumn(ModeloTablaDiccionario.getCOL_ESTADO()).setResizable(false);
    }
}
