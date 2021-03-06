/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;

/**
 *
 * @author Sil y Pato
 */
public class dlgNuevoAhorcado extends javax.swing.JDialog implements KeyEventDispatcher
{

    /**
     * Creates new form dlgNuevoAhorcado
     */
    public dlgNuevoAhorcado(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        this.dialogoCancelado = false;
        initComponents();
        this.iniciarComboDificultad();
        this.iniciarComboMascara();
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

        lblDificultad = new javax.swing.JLabel();
        cmbDificultad = new javax.swing.JComboBox<>();
        separador = new javax.swing.JSeparator();
        lblMascara = new javax.swing.JLabel();
        cmbMascara = new javax.swing.JComboBox<>();
        lblFallosMaximos = new javax.swing.JLabel();
        cmbFallosMaximos = new javax.swing.JComboBox<>();
        lblMuestraAyuda = new javax.swing.JLabel();
        cmbMuestraAyuda = new javax.swing.JComboBox<>();
        btnJugar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        separador2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nuevo Juego Ahorcado");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        lblDificultad.setText("Dificultad:");

        cmbDificultad.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmbDificultadItemStateChanged(evt);
            }
        });

        lblMascara.setText("Máscara:");

        lblFallosMaximos.setText("Fallos Máximos:");

        lblMuestraAyuda.setText("Muestra Ayuda:");

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnJugarActionPerformed(evt);
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
                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDificultad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFallosMaximos)
                            .addComponent(lblMascara)
                            .addComponent(lblMuestraAyuda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFallosMaximos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMascara, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMuestraAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDificultad)
                    .addComponent(cmbDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMascara)
                    .addComponent(cmbMascara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFallosMaximos)
                    .addComponent(cmbFallosMaximos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMuestraAyuda)
                    .addComponent(cmbMuestraAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnJugar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDificultadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDificultadItemStateChanged
        this.llenarComboFallos(this.cmbDificultad.getSelectedItem().toString());
        this.llenarComboAyuda(this.cmbFallosMaximos.getSelectedItem().toString());
    }//GEN-LAST:event_cmbDificultadItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dialogoCancelado = true;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnJugarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        this.dialogoCancelado = true;
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing
    
    private void iniciarComboDificultad()
    {
        this.cmbDificultad.addItem(DificultadPalabraEnum.FACIL.toString());
        this.cmbDificultad.addItem(DificultadPalabraEnum.DIFICIL.toString());
    }
    
    private void iniciarComboMascara()
    {
        for (char i = 33; i < 127; i++)
        {
            if(!Character.isLetterOrDigit(i))
            {
                this.cmbMascara.addItem(Character.toString(i));
            }
        }
        
        this.cmbMascara.setSelectedItem("*");
    }
    
    private void llenarComboFallos(String dificultad)
    {
        this.cmbFallosMaximos.removeAllItems();
        
        for (int i = JuegoAhorcado.getFallosMinimosPermitidos() ; i < JuegoAhorcado.getFallosMinimosPermitidos() * (3 - DificultadPalabraEnum.valueOf(dificultad).ordinal()); i++)
        {
            this.cmbFallosMaximos.addItem(Integer.toString(i));
        }
        
        this.cmbFallosMaximos.setSelectedItem(Integer.toString(JuegoAhorcado.getFallosMinimosPermitidos() * (2 - DificultadPalabraEnum.valueOf(dificultad).ordinal())));
    }
    
    private void llenarComboAyuda(String fallosMaximos)
    {
        int cantidadFallos = Integer.parseInt(fallosMaximos);
        
        this.cmbMuestraAyuda.removeAllItems();

        for (int i = 0; i < cantidadFallos; i++)
        {
            this.cmbMuestraAyuda.addItem(Integer.toString(i));
        }
        
        this.cmbMuestraAyuda.setSelectedItem(String.valueOf(cantidadFallos / 2));
    }

    public boolean isDialogoCancelado()
    {
        return dialogoCancelado;
    }

    public String getCmbDificultad()
    {
        return this.cmbDificultad.getItemAt(this.cmbDificultad.getSelectedIndex());
    }

    public String getCmbFallosMaximos()
    {
        return this.cmbFallosMaximos.getItemAt(this.cmbFallosMaximos.getSelectedIndex());
    }

    public String getCmbMascara()
    {
        return this.cmbMascara.getItemAt(this.cmbMascara.getSelectedIndex());
    }

    public String getCmbMuestraAyuda()
    {
        return this.cmbMuestraAyuda.getItemAt(this.cmbMuestraAyuda.getSelectedIndex());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JComboBox<String> cmbDificultad;
    private javax.swing.JComboBox<String> cmbFallosMaximos;
    private javax.swing.JComboBox<String> cmbMascara;
    private javax.swing.JComboBox<String> cmbMuestraAyuda;
    private javax.swing.JLabel lblDificultad;
    private javax.swing.JLabel lblFallosMaximos;
    private javax.swing.JLabel lblMascara;
    private javax.swing.JLabel lblMuestraAyuda;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador2;
    // End of variables declaration//GEN-END:variables
    private boolean dialogoCancelado;

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
