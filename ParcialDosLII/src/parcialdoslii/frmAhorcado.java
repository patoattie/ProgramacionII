/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author capacita_mecon
 */
public class frmAhorcado extends javax.swing.JFrame
{

    /**
     * Creates new form frmAhorcado
     */
    public frmAhorcado(JuegoAhorcado miJuego, int xFilo, int yFilo, int yFiloMax)
    {
        initComponents();
        this.juego = miJuego;
        this.xFilo = xFilo;
        this.yFilo = yFilo;
        this.yFiloMax = yFiloMax;
        this.yFiloRatio = (this.yFiloMax - this.yFilo) / this.juego.getFallosMaximos();
        this.setLayout(null);
        this.setComponentZOrder(this.lblFilo, 0);
        this.setComponentZOrder(this.lblGuillotina, 1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPalabra = new javax.swing.JLabel();
        lblLetrasJugadas = new javax.swing.JLabel();
        cmbLetraJugada = new javax.swing.JComboBox<>();
        lblFilo = new javax.swing.JLabel();
        btnJugarLetra = new javax.swing.JButton();
        txtDefinicion = new javax.swing.JTextArea();
        lblJugadasRealizadas = new javax.swing.JLabel();
        lblFallosRestantes = new javax.swing.JLabel();
        lblGuillotina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Ahorcado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblPalabra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnJugarLetra.setText("Jugar Letra");
        btnJugarLetra.setFocusable(false);
        btnJugarLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarLetraActionPerformed(evt);
            }
        });

        txtDefinicion.setEditable(false);
        txtDefinicion.setColumns(20);
        txtDefinicion.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtDefinicion.setLineWrap(true);
        txtDefinicion.setRows(5);
        txtDefinicion.setWrapStyleWord(true);
        txtDefinicion.setFocusable(false);
        txtDefinicion.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblFallosRestantes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(lblJugadasRealizadas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGuillotina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbLetraJugada, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnJugarLetra)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblLetrasJugadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtDefinicion, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lblFilo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFilo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDefinicion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLetraJugada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJugarLetra)))
                    .addComponent(lblGuillotina, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJugadasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblFallosRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLetrasJugadas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        for (char i = 'A'; i <= 'N'; i++)
        {
            this.cmbLetraJugada.addItem(Character.toString(i));
        }
        
        this.cmbLetraJugada.addItem(Character.toString('Ñ'));
        
        for (char i = 'O'; i <= 'Z'; i++)
        {
            this.cmbLetraJugada.addItem(Character.toString(i));
        }
        
        this.lblFallosRestantes.setText("Fallos restantes: " + (this.juego.getFallosMaximos() - this.juego.getCantidadFallos()));
        this.lblJugadasRealizadas.setText("Jugadas realizadas: " + this.juego.getCantidadJugadas());
        this.lblGuillotina.setIcon(new ImageIcon("guillotina2.jpg"));
        this.lblFilo.setIcon(new ImageIcon("filo.jpg"));
        this.lblFilo.setLocation(this.lblGuillotina.getLocation().x + this.xFilo, this.lblGuillotina.getLocation().y + this.yFilo);
        
        try
        {
            this.lblPalabra.setText(this.juego.getPalabra());
            this.txtDefinicion.setText(this.juego.getDefinicion());
        }
        catch (JuegoException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje del Juego", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnJugarLetraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnJugarLetraActionPerformed
    {//GEN-HEADEREND:event_btnJugarLetraActionPerformed
        try
        {
            this.juego.jugarLetra(this.cmbLetraJugada.getItemAt(this.cmbLetraJugada.getSelectedIndex()));
            this.lblPalabra.setText(this.juego.getPalabra());
            this.txtDefinicion.setText(this.juego.getDefinicion());
        }
        catch (LetraJugadaException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje del Juego", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (JuegoException e)
        {
            if(e instanceof JuegoPerdidoException)
            {
                this.lblFilo.setVisible(false);
                this.lblGuillotina.setIcon(new ImageIcon("guillotina3.jpg"));
            }
            this.lblPalabra.setText(this.juego.getPalabraSeleccionada().getPalabra());
            this.btnJugarLetra.setEnabled(false);
            JOptionPane.showMessageDialog(null, e.getMessage(), "Mensaje del Juego", JOptionPane.INFORMATION_MESSAGE);
        }
        finally
        {
            this.lblFallosRestantes.setText("Fallos restantes: " + (this.juego.getFallosMaximos() - this.juego.getCantidadFallos()));
            this.lblJugadasRealizadas.setText("Jugadas realizadas: " + this.juego.getCantidadJugadas());
            this.lblLetrasJugadas.setText(this.juego.getLetrasJugadas());
            this.lblFilo.setLocation(this.lblGuillotina.getLocation().x + this.xFilo, this.lblGuillotina.getLocation().y + this.yFilo + (this.yFiloRatio * this.juego.getCantidadFallos()));
        }
    }//GEN-LAST:event_btnJugarLetraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugarLetra;
    private javax.swing.JComboBox<String> cmbLetraJugada;
    private javax.swing.JLabel lblFallosRestantes;
    private javax.swing.JLabel lblFilo;
    private javax.swing.JLabel lblGuillotina;
    private javax.swing.JLabel lblJugadasRealizadas;
    private javax.swing.JLabel lblLetrasJugadas;
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JTextArea txtDefinicion;
    // End of variables declaration//GEN-END:variables
    private final JuegoAhorcado juego;
    private int xFilo;
    private int yFilo;
    private int yFiloMax;
    private int yFiloRatio;
}
