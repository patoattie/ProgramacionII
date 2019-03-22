/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sil y Pato
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal(Diccionario miDiccionario, Ranking miRanking)
    {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        this.diccionarioActivo = miDiccionario;
        this.ranking = miRanking;
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
        menAhorcado = new javax.swing.JMenu();
        menAhorcadoNuevo = new javax.swing.JMenuItem();
        menAhorcadoCargar = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        menAhorcadoRanking = new javax.swing.JMenuItem();
        menDiccionario = new javax.swing.JMenu();
        menDiccionarioCargar = new javax.swing.JMenuItem();
        menSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego del Ahorcado");
        setSize(new java.awt.Dimension(0, 0));

        menAhorcado.setText("Juego");

        menAhorcadoNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menAhorcadoNuevo.setText("Nuevo Ahorcado");
        menAhorcadoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAhorcadoNuevoActionPerformed(evt);
            }
        });
        menAhorcado.add(menAhorcadoNuevo);

        menAhorcadoCargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menAhorcadoCargar.setText("Cargar Ahorcado");
        menAhorcadoCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAhorcadoCargarActionPerformed(evt);
            }
        });
        menAhorcado.add(menAhorcadoCargar);
        menAhorcado.add(separador);

        menAhorcadoRanking.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menAhorcadoRanking.setText("Ver Ranking");
        menAhorcadoRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAhorcadoRankingActionPerformed(evt);
            }
        });
        menAhorcado.add(menAhorcadoRanking);

        menuPrincipal.add(menAhorcado);

        menDiccionario.setText("Diccionario");

        menDiccionarioCargar.setText("Administrar");
        menDiccionarioCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menDiccionarioCargarActionPerformed(evt);
            }
        });
        menDiccionario.add(menDiccionarioCargar);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menAhorcadoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAhorcadoNuevoActionPerformed
        try
        {
            //JuegoAhorcado.jugarPorConsola(new JuegoAhorcado("*", 10, miDiccionario));
            this.setEnabled(false);
            
            dlgNuevoAhorcado dialogo = new dlgNuevoAhorcado(this, true);
            dialogo.setVisible(true);
            
            if(!dialogo.isDialogoCancelado())
            {
                JuegoAhorcado.jugarPorEntornoGrafico(new JuegoAhorcado(dialogo.getCmbMascara(), Integer.parseInt(dialogo.getCmbFallosMaximos()), Integer.parseInt(dialogo.getCmbMuestraAyuda()), this.diccionarioActivo, dialogo.getCmbDificultad(), this.ranking));
            }
            this.setEnabled(true);
        }
        catch (DiccionarioVacioException | DificultadPalabraException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Nuevo Juego Ahorcado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menAhorcadoNuevoActionPerformed

    private void menSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_menSalirMouseClicked

    private void menAhorcadoCargarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menAhorcadoCargarActionPerformed
    {//GEN-HEADEREND:event_menAhorcadoCargarActionPerformed
        JuegoAhorcado juego = new JuegoAhorcado();
        dlgArchivo dialogo = new dlgArchivo(this, true, juego.getListaJuegos(), TipoDialogoEnum.ABRIR);
        dialogo.setTitle("Cargar Juego");
        dialogo.setVisible(true);

        String nombreArchivo = dialogo.getArchivoSeleccionado();

        try
        {
            if(!dialogo.isDialogoCancelado())
            {
                JuegoAhorcado.jugarPorEntornoGrafico(JuegoAhorcado.cargarJuego(nombreArchivo));
            }
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "No existe el juego ingresado", "Cargar Juego", JOptionPane.ERROR_MESSAGE);
        }
        finally
        {
            dialogo.dispose();
        }
    }//GEN-LAST:event_menAhorcadoCargarActionPerformed

    private void menDiccionarioCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menDiccionarioCargarActionPerformed
        frmDiccionario diccionario = new frmDiccionario(this.diccionarioActivo);
        diccionario.setVisible(true);
    }//GEN-LAST:event_menDiccionarioCargarActionPerformed

    private void menAhorcadoRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAhorcadoRankingActionPerformed
        frmRanking ranking = new frmRanking(this.ranking);
        ranking.setVisible(true);
    }//GEN-LAST:event_menAhorcadoRankingActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu menAhorcado;
    private javax.swing.JMenuItem menAhorcadoCargar;
    private javax.swing.JMenuItem menAhorcadoNuevo;
    private javax.swing.JMenuItem menAhorcadoRanking;
    private javax.swing.JMenu menDiccionario;
    private javax.swing.JMenuItem menDiccionarioCargar;
    private javax.swing.JMenu menSalir;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
    private Diccionario diccionarioActivo;
    private Ranking ranking;
}
