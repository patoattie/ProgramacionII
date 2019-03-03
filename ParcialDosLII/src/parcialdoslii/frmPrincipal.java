/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

/**
 *
 * @author Sil y Pato
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal(Diccionario miDiccionario) {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        this.diccionarioActivo = miDiccionario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPrincipal = new javax.swing.JMenuBar();
        menJuego = new javax.swing.JMenu();
        menJuegoNuevo = new javax.swing.JMenuItem();
        menDiccionario = new javax.swing.JMenu();
        menSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego del Ahorcado");
        setSize(new java.awt.Dimension(0, 0));

        menJuego.setText("Juego");

        menJuegoNuevo.setText("Nuevo");
        menJuegoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menJuegoNuevoActionPerformed(evt);
            }
        });
        menJuego.add(menJuegoNuevo);

        menuPrincipal.add(menJuego);

        menDiccionario.setText("Diccionario");
        menuPrincipal.add(menDiccionario);

        menSalir.setText("Salir");
        menSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menSalirMouseClicked(evt);
            }
        });
        menuPrincipal.add(menSalir);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menJuegoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menJuegoNuevoActionPerformed
        try
        {
            //JuegoAhorcado.jugarPorConsola(new JuegoAhorcado("*", 10, miDiccionario));
            this.setEnabled(false);
            JuegoAhorcado.jugarPorEntornoGrafico(new JuegoAhorcado("*", 10, this.diccionarioActivo));
            this.setEnabled(true);
        }
        catch (DiccionarioVacioException e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_menJuegoNuevoActionPerformed

    private void menSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_menSalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu menDiccionario;
    private javax.swing.JMenu menJuego;
    private javax.swing.JMenuItem menJuegoNuevo;
    private javax.swing.JMenu menSalir;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
    private Diccionario diccionarioActivo;
}
