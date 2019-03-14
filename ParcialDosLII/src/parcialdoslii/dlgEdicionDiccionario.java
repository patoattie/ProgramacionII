/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author pattie
 */
public class dlgEdicionDiccionario extends javax.swing.JDialog implements KeyEventDispatcher
{

    /**
     * Creates new form dlgEdicionDiccionario
     */
    public dlgEdicionDiccionario(java.awt.Frame parent, boolean modal, Palabra palabraEditada, String accion, Diccionario diccionario)
    {
        super(parent, modal);
        this.dialogoCancelado = false;
        this.palabraEditada = palabraEditada;
        this.accion = accion;
        this.diccionario = diccionario;
        initComponents();
        this.capturarEventosTeclado();
        this.setearTitulo();
        this.iniciarTextos();
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

        lblPalabra = new javax.swing.JLabel();
        lblDefinicion = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDefinicion = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPalabra.setText("Palabra:");

        lblDefinicion.setText("Definición:");

        txtPalabra.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtPalabraFocusGained(evt);
            }
        });

        txtDefinicion.setColumns(20);
        txtDefinicion.setLineWrap(true);
        txtDefinicion.setRows(5);
        txtDefinicion.setWrapStyleWord(true);
        txtDefinicion.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtDefinicionFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtDefinicion);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPalabra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabra))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDefinicion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPalabra)
                    .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lblDefinicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        if(this.validarDefinicion(this.txtDefinicion.getText()) && this.validarPalabra(this.txtPalabra.getText()))
        {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.dialogoCancelado = true;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPalabraFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtPalabraFocusGained
    {//GEN-HEADEREND:event_txtPalabraFocusGained
        this.validarDefinicion(this.txtDefinicion.getText());
    }//GEN-LAST:event_txtPalabraFocusGained

    private void txtDefinicionFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtDefinicionFocusGained
    {//GEN-HEADEREND:event_txtDefinicionFocusGained
        try
        {
            String c = evt.getOppositeComponent().getName();
            this.validarPalabra(this.txtPalabra.getText());
        }
        catch(NullPointerException e) //Cuando el objeto anterior es un JOptionPane, el método getOppositeComponent() lanza NullPointerException.
        {
        }
        
    }//GEN-LAST:event_txtDefinicionFocusGained

    public boolean isDialogoCancelado()
    {
        return dialogoCancelado;
    }

    public String getTxtDefinicion()
    {
        return txtDefinicion.getText();
    }

    public String getTxtPalabra()
    {
        return txtPalabra.getText();
    }

    private void capturarEventosTeclado()
    {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
    }
    
    private void iniciarTextos()
    {
        this.txtPalabra.setText(this.palabraEditada.getPalabra());
        this.txtDefinicion.setText(this.palabraEditada.getDefinicion());
        this.txtPalabra.setEditable(this.accion.equals(ModeloTablaDiccionario.getINSERTA()));
    }
    
    private void setearTitulo()
    {
        if(this.accion.equals(ModeloTablaDiccionario.getINSERTA()))
        {
            this.setTitle("Agregar Palabra");
        }
        else if(this.accion.equals(ModeloTablaDiccionario.getACTUALIZA()))
        {
            this.setTitle("Editar Palabra");
        }
    }
    
    private boolean validarPalabra(String palabra)
    {
        boolean palabraValidada = true;

        if(this.accion.equals(ModeloTablaDiccionario.getINSERTA()))
        {
            try
            {
                this.txtPalabra.setText(Palabra.validaPalabra(palabra));
                this.diccionario.existePalabra(new Palabra(palabra, this.txtDefinicion.getText()));
            }
            catch (CaracterPalabraException | ExistePalabraException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), this.getTitle(), JOptionPane.ERROR_MESSAGE);
                palabraValidada = false;
            }
        }
        
        return palabraValidada;
    }
    
    private boolean validarDefinicion(String definicion)
    {
        boolean definicionValidada = true;
        
        this.txtDefinicion.setText(Palabra.validaDefinicion(definicion));
        
        return definicionValidada;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDefinicion;
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JTextArea txtDefinicion;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
    private boolean dialogoCancelado;
    private Palabra palabraEditada;
    private String accion;
    private Diccionario diccionario;

    @Override
    public boolean dispatchKeyEvent(KeyEvent e)
    {
        boolean keyHandled = false;
        if (e.getID() == KeyEvent.KEY_TYPED) {
            switch(e.getKeyChar())
            {
                case KeyEvent.VK_ESCAPE:
                    this.dialogoCancelado = true;
                    this.setVisible(false);
                    break;
                /*case KeyEvent.VK_ENTER:
                    this.setVisible(false);
                    break;*/
            }
        }
        return keyHandled;
    }
}
