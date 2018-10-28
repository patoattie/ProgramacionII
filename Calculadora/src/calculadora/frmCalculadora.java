/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Sil y Pato
 */
public class frmCalculadora extends javax.swing.JFrame {

    public String getSignoDecimal() {
        return this.signoDecimal;
    }

    public void setSignoDecimal(String signoDecimal) {
        this.signoDecimal = signoDecimal;
    }

    /**
     * Creates new form frmCalculadora
     */
    public frmCalculadora() {
        initComponents();

        this.esDecimal = false;
        this.esPrimerDigito = true;
        this.esNegativo = false;
        this.signoDecimal = ".";
        this.INICIO_VISOR = "0" + this.getSignoDecimal();
        this.lblVisor.setText(INICIO_VISOR);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        lblVisor = new javax.swing.JLabel();
        btnC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnRetroceso = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMmas = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSigno = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnPorciento = new javax.swing.JButton();
        btnInversa = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocation(new java.awt.Point(509, 384));
        setResizable(false);

        lblVisor.setBackground(new java.awt.Color(255, 255, 255));
        lblVisor.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVisor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.black));
        lblVisor.setFocusable(false);
        lblVisor.setOpaque(true);

        btnC.setForeground(new java.awt.Color(255, 0, 0));
        btnC.setText("C");
        btnC.setBorder(null);
        btnC.setFocusable(false);
        btnC.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnCE.setForeground(new java.awt.Color(255, 0, 0));
        btnCE.setText("CE");
        btnCE.setBorder(null);
        btnCE.setFocusable(false);
        btnCE.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnRetroceso.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnRetroceso.setForeground(new java.awt.Color(255, 0, 0));
        btnRetroceso.setText("Retroceso");
        btnRetroceso.setAutoscrolls(true);
        btnRetroceso.setBorder(null);
        btnRetroceso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRetroceso.setFocusable(false);
        btnRetroceso.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnRetroceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocesoActionPerformed(evt);
            }
        });

        btnMC.setForeground(new java.awt.Color(255, 0, 0));
        btnMC.setText("MC");
        btnMC.setBorder(null);
        btnMC.setFocusable(false);
        btnMC.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnMR.setForeground(new java.awt.Color(255, 0, 0));
        btnMR.setBorder(null);
        btnMR.setFocusable(false);
        btnMR.setLabel("MR");
        btnMR.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnMS.setForeground(new java.awt.Color(255, 0, 0));
        btnMS.setBorder(null);
        btnMS.setFocusable(false);
        btnMS.setLabel("MS");
        btnMS.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnMmas.setForeground(new java.awt.Color(255, 0, 0));
        btnMmas.setAlignmentY(0.0F);
        btnMmas.setBorder(null);
        btnMmas.setFocusable(false);
        btnMmas.setLabel("M+");
        btnMmas.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btn7.setForeground(new java.awt.Color(0, 0, 255));
        btn7.setBorder(null);
        btn7.setFocusable(false);
        btn7.setLabel("7");
        btn7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setForeground(new java.awt.Color(0, 0, 255));
        btn8.setText("8");
        btn8.setBorder(null);
        btn8.setFocusable(false);
        btn8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setForeground(new java.awt.Color(0, 0, 255));
        btn9.setText("9");
        btn9.setBorder(null);
        btn9.setFocusable(false);
        btn9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setForeground(new java.awt.Color(0, 0, 255));
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.setFocusable(false);
        btn4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setForeground(new java.awt.Color(0, 0, 255));
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.setFocusable(false);
        btn5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setForeground(new java.awt.Color(0, 0, 255));
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.setFocusable(false);
        btn6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setForeground(new java.awt.Color(0, 0, 255));
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.setFocusable(false);
        btn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setForeground(new java.awt.Color(0, 0, 255));
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.setFocusable(false);
        btn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setForeground(new java.awt.Color(0, 0, 255));
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.setFocusable(false);
        btn3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnSigno.setForeground(new java.awt.Color(0, 0, 255));
        btnSigno.setText("+/-");
        btnSigno.setBorder(null);
        btnSigno.setFocusable(false);
        btnSigno.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoActionPerformed(evt);
            }
        });

        btnPunto.setForeground(new java.awt.Color(0, 0, 255));
        btnPunto.setText(".");
        btnPunto.setBorder(null);
        btnPunto.setFocusable(false);
        btnPunto.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btn0.setForeground(new java.awt.Color(0, 0, 255));
        btn0.setText("0");
        btn0.setBorder(null);
        btn0.setFocusable(false);
        btn0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnDividir.setForeground(new java.awt.Color(255, 0, 0));
        btnDividir.setText("/");
        btnDividir.setBorder(null);
        btnDividir.setFocusable(false);
        btnDividir.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnMultiplicar.setForeground(new java.awt.Color(255, 0, 0));
        btnMultiplicar.setText("*");
        btnMultiplicar.setBorder(null);
        btnMultiplicar.setFocusable(false);
        btnMultiplicar.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnSumar.setForeground(new java.awt.Color(255, 0, 0));
        btnSumar.setText("+");
        btnSumar.setBorder(null);
        btnSumar.setFocusable(false);
        btnSumar.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnRestar.setForeground(new java.awt.Color(255, 0, 0));
        btnRestar.setText("-");
        btnRestar.setBorder(null);
        btnRestar.setFocusable(false);
        btnRestar.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnRaiz.setForeground(new java.awt.Color(0, 0, 255));
        btnRaiz.setText("sqrt");
        btnRaiz.setBorder(null);
        btnRaiz.setFocusable(false);
        btnRaiz.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnPorciento.setForeground(new java.awt.Color(0, 0, 255));
        btnPorciento.setText("%");
        btnPorciento.setBorder(null);
        btnPorciento.setFocusable(false);
        btnPorciento.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnInversa.setForeground(new java.awt.Color(0, 0, 255));
        btnInversa.setText("1/x");
        btnInversa.setBorder(null);
        btnInversa.setFocusable(false);
        btnInversa.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnIgual.setForeground(new java.awt.Color(255, 0, 0));
        btnIgual.setText("=");
        btnIgual.setBorder(null);
        btnIgual.setFocusable(false);
        btnIgual.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRetroceso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnMmas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(btnMS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnInversa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPorciento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetroceso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPorciento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInversa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMmas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        this.borrarVisor();
    }//GEN-LAST:event_btnCActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.escribirNumero(this.btn1.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        this.escribirNumero(this.btn2.getText());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        this.escribirNumero(this.btn3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        this.escribirNumero(this.btn4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        this.escribirNumero(this.btn5.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        this.escribirNumero(this.btn6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        this.escribirNumero(this.btn7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        this.escribirNumero(this.btn8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        this.escribirNumero(this.btn9.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        this.escribirNumero(this.btn0.getText());
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        this.escribirDecimal();
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnRetrocesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocesoActionPerformed
        this.borrarNumero();
    }//GEN-LAST:event_btnRetrocesoActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        this.borrarVisor();
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }
    
    private void escribirNumero(String numero)
    {
        StringBuilder cadena = new StringBuilder();
        String visor = this.lblVisor.getText();
        if(!this.esDecimal)
        {
            visor = visor.substring(0, visor.length() - 1);
        }
        
        if(!this.esPrimerDigito)
        {
            cadena.append(visor);
        }
        else if(!"0".equals(numero))
        {
            this.esPrimerDigito = false;
        }
        
        cadena.append(numero);
        if(!this.esDecimal)
        {
            cadena.append(this.signoDecimal);
        }

        this.lblVisor.setText(cadena.toString());
    }

    private void borrarVisor()
    {
        this.esDecimal = false;
        this.esPrimerDigito = true;
        this.lblVisor.setText(this.INICIO_VISOR);
    }
    
    private void borrarNumero()
    {
        String visor = this.lblVisor.getText();
        int posicionHasta = visor.length() - 1;
        
        if(!this.esDecimal)
        {
            posicionHasta--;
        }
        
        if(visor.length() > this.INICIO_VISOR.length())
        {
            if(visor.charAt(posicionHasta) == this.signoDecimal.charAt(0))
            {
                this.esDecimal = false;
            }
            else
            {
                this.lblVisor.setText(visor.substring(0, posicionHasta));
                if(!this.esDecimal)
                {
                    this.lblVisor.setText(this.lblVisor.getText().concat(this.signoDecimal));
                }
            }
        }
        else
        {
            this.lblVisor.setText(this.INICIO_VISOR);
            this.esPrimerDigito = true;
            this.esDecimal = false;
        }
    }

    private void escribirDecimal()
    {
        if(!this.esDecimal)
        {
            this.esDecimal = true;
            this.esPrimerDigito = false;
            //this.escribirNumero(this.btnPunto.getText());
        }
    }
    
    private void escribirSigno()
    {
        String visor = this.lblVisor.getText();
        if(!this.INICIO_VISOR.equals(visor))
        {
            if(this.esNegativo)
            {
                this.lblVisor.setText(visor.substring(1, visor.length()));
                this.esNegativo = false;
            }
            else
            {
                this.lblVisor.setText("-".concat(visor));
                this.esNegativo = true;
            }
        }
    }
    
    private boolean esDecimal; //Va true cuando presiono '.', para verificar que no va más de un punto decimal
    private boolean esPrimerDigito; //Va true cuando ingreso el primer dígito, para que reemplace valor en lugar de acumular
    private boolean esNegativo; //Para el manejo del botón de signo.
    private String signoDecimal;
    private final String INICIO_VISOR;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnInversa;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMmas;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPorciento;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnRetroceso;
    private javax.swing.JButton btnSigno;
    private javax.swing.JButton btnSumar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel lblVisor;
    // End of variables declaration//GEN-END:variables
}
