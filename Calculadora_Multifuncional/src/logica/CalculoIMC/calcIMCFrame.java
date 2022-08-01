package logica.CalculoIMC;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.LecturaEscritura;
import presentacion.Calculadora;

public class calcIMCFrame extends javax.swing.JFrame {

    private List<String> milista = new ArrayList<>();

    public calcIMCFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        areaTexto3.setFocusable(false);
        areaTexto4.setFocusable(false);
        areaTexto5.setFocusable(false);
        areaTexto6.setFocusable(false);
        milista.add("OPCIÓN------------> Cálculo de IMC");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        historial = new javax.swing.JButton();
        areaTexto = new javax.swing.JTextField();
        areaTexto2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        areaTexto3 = new javax.swing.JTextField();
        areaTexto5 = new javax.swing.JTextField();
        areaTexto4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto6 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULO IMC");

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jButton11.setText("Reiniciar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        historial.setText("Historial");
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });

        areaTexto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        areaTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTextoActionPerformed(evt);
            }
        });

        areaTexto2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        areaTexto2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaTexto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTexto2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("cm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("kg");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ALTURA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PESO");

        areaTexto3.setEditable(false);
        areaTexto3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        areaTexto3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaTexto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTexto3ActionPerformed(evt);
            }
        });

        areaTexto5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        areaTexto5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaTexto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTexto5ActionPerformed(evt);
            }
        });

        areaTexto4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        areaTexto4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        areaTexto4.setText("IMC");
        areaTexto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTexto4ActionPerformed(evt);
            }
        });

        areaTexto6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(areaTexto6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(areaTexto)
                                    .addComponent(areaTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(Calcular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(areaTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(areaTexto5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(areaTexto4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Calcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(areaTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(areaTexto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(historial)
                    .addComponent(jButton11))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        areaTexto.setText("");
        areaTexto2.setText("");
        areaTexto3.setText("");
        areaTexto5.setText("");
        areaTexto6.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!milista.isEmpty()) {
            LecturaEscritura.anadirHistorial(milista);
            milista.clear();
        }
        Calculadora c = new Calculadora();
        c.setTitle("Calculadora");
        c.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(calcIMCFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        LecturaEscritura.anadirHistorial(milista);
        LecturaEscritura.EscribirHistorial();
        LecturaEscritura.abrirHistorial();
        milista.clear();
        milista.add("OPCIÓN------------> Cálculo de IMC");
    }//GEN-LAST:event_historialActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        try {
            String res;
            Double p = Double.parseDouble(areaTexto.getText());
            Double a = Double.parseDouble(areaTexto2.getText());
            calcIMC ci = new calcIMC(p, a);
            res = String.valueOf(ci.calcularIMC());
            areaTexto3.setText(res);
            if (Double.parseDouble(res) > 0 && Double.parseDouble(res) <= 5) {
                areaTexto5.setText("Delgadez III");
                areaTexto6.setText("Postración, Atenia, Adinamia,\nEnfermedades Degenerativas\ny Peligro de Muerte.");
            }
            if (Double.parseDouble(res) > 5 && Double.parseDouble(res) <= 10) {
                areaTexto5.setText("Delgadez II");
                areaTexto6.setText("Anorexia, Bulimia, Osteoporosis y Autoconsumo de Masa Muscular.");
            }
            if (Double.parseDouble(res) > 10 && Double.parseDouble(res) <= 18.5) {
                areaTexto5.setText("Delgadez I");
                areaTexto6.setText("Trastornos Digestivos, Debilidad, Fatiga Crónica, Estrés, Ansiedad y Difusión Hormonal.");
            }
            if (Double.parseDouble(res) > 18.5 && Double.parseDouble(res) <= 24.9) {
                areaTexto5.setText("Peso Normal");
                areaTexto6.setText("Estado Normal, Buen Nivel de Energía,\nVitalidad y Buena Condición Física.");
            }
            if (Double.parseDouble(res) > 24.9 && Double.parseDouble(res) <= 29.9) {
                areaTexto5.setText("Sobrepeso");
                areaTexto6.setText("Fatiga, Enfermedades Digestivas, Problemas Cardíacos, Mala Circulación en piernas y Várices.");
            }
            if (Double.parseDouble(res) > 29.9 && Double.parseDouble(res) <= 34.9) {
                areaTexto5.setText("Obesidad I");
                areaTexto6.setText("Diabetes, Hipertensión, Enfermedades Cardiovasculares, Problemas Articulares, Rodilla y Columna, Cálculos Biliares.");
            }
            if (Double.parseDouble(res) > 34.9 && Double.parseDouble(res) <= 39.9) {
                areaTexto5.setText("Obesidad II");
                areaTexto6.setText("Diabetes, Cáncer, Angina de Pecho, Infartos, Tromboflebitis, Arterosclerosis, Embolias, Alteraciones Menstruación. ");
            }
            if (Double.parseDouble(res) > 39.9) {
                areaTexto5.setText("Obesidad III");
                areaTexto6.setText("Falta de Aire, Somnolencia, Trombosis Pulmonar, Úlceras Varicosas, Cáncer de Próstata, Reflujo Esofágico, Discriminación Social, Laboral y Sexual.");
            }
            milista.add("Peso = " + p + " kg" + "\t" + "Altura = " + a + " cm" + "\t" + "IMC = " + res);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Texto no válido");
            areaTexto.setText("");
            areaTexto2.setText("");
        }
    }//GEN-LAST:event_CalcularActionPerformed

    private void areaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTextoActionPerformed

    private void areaTexto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTexto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTexto2ActionPerformed

    private void areaTexto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTexto3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTexto3ActionPerformed

    private void areaTexto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTexto5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTexto5ActionPerformed

    private void areaTexto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTexto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTexto4ActionPerformed

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
            java.util.logging.Logger.getLogger(calcIMCFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcIMCFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcIMCFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcIMCFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcIMCFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField areaTexto;
    private javax.swing.JTextField areaTexto2;
    private javax.swing.JTextField areaTexto3;
    private javax.swing.JTextField areaTexto4;
    private javax.swing.JTextField areaTexto5;
    private javax.swing.JTextPane areaTexto6;
    private javax.swing.JButton historial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
