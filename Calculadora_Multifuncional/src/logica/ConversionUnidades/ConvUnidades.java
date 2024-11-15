package logica.ConversionUnidades;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import presentacion.Calculadora;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import persistencia.LecturaEscritura;

public class ConvUnidades extends javax.swing.JFrame {

    private List<String> milista = new ArrayList<>();

    public ConvUnidades() {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup1.add(op1);
        buttonGroup1.add(op2);
        buttonGroup1.add(op3);
        buttonGroup1.add(op4);
        buttonGroup1.add(op5);
        buttonGroup1.add(op6);
        buttonGroup1.add(op7);
        buttonGroup1.add(op8);
        buttonGroup1.add(op9);
        buttonGroup1.add(op10);
        milista.add("OPCIÓN------------> Conversión de Unidades");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        op5 = new javax.swing.JRadioButton();
        op6 = new javax.swing.JRadioButton();
        op7 = new javax.swing.JRadioButton();
        op8 = new javax.swing.JRadioButton();
        op9 = new javax.swing.JRadioButton();
        combo1 = new javax.swing.JComboBox<>();
        op10 = new javax.swing.JRadioButton();
        historial = new javax.swing.JButton();
        areaTexto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONVERSIÓN DE UNIDADES");

        jButton10.setText("Convertir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Limpiar");
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

        op1.setText("Longitud");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setText("Masa");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setText("Tiempo");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        op4.setText("Área");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        op5.setText("Velocidad");
        op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op5ActionPerformed(evt);
            }
        });

        op6.setText("Aceleración");
        op6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op6ActionPerformed(evt);
            }
        });

        op7.setText("Fuerza");
        op7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op7ActionPerformed(evt);
            }
        });

        op8.setText("Trabajo");
        op8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op8ActionPerformed(evt);
            }
        });

        op9.setText("Presión");
        op9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op9ActionPerformed(evt);
            }
        });

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        op10.setText("Temperatura");
        op10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op10ActionPerformed(evt);
            }
        });

        historial.setText("Historial");
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op3)
                                    .addComponent(op4)
                                    .addComponent(op2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op6)
                                    .addComponent(op7)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(op1)
                                .addGap(18, 18, 18)
                                .addComponent(op5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(op9)
                                            .addComponent(op10))
                                        .addGap(42, 42, 42)
                                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(op8)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11)
                                .addGap(46, 46, 46))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(historial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op5)
                    .addComponent(op1)
                    .addComponent(op8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(op9)
                            .addComponent(op6)
                            .addComponent(op2)
                            .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(op3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(op4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(op7)
                                .addComponent(op10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton11))
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(historial))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        try {
            DecimalFormat df;
            df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
            String mp = null;
            String seleccion1 = (String) combo1.getSelectedItem();
            double m1;
            m1 = Double.parseDouble(areaTexto.getText());
            if (op1.isSelected()) {
                Longitud l1 = new Longitud(m1);
                if ("Metro a Pulgada".equals(seleccion1)) {
                    mp = String.valueOf(l1.metroPulgada());
                }
                if ("Pulgada a Metro".equals(seleccion1)) {
                    mp = String.valueOf(l1.pulgadaMetro());
                }
                if ("Metro a Pie".equals(seleccion1)) {
                    mp = String.valueOf(l1.metroPie());
                }
                if ("Pie a Metro".equals(seleccion1)) {
                    mp = String.valueOf(l1.pieMetro());
                }
            }
            if (op2.isSelected()) {
                Masa l1 = new Masa(m1);
                if ("Kilogramo a Libra".equals(seleccion1)) {
                    mp = String.valueOf(l1.kiloLibra());
                }
                if ("Libra a Kilogramo".equals(seleccion1)) {
                    mp = String.valueOf(l1.libraKilo());
                }
            }
            if (op3.isSelected()) {
                Tiempo l1 = new Tiempo(m1);
                if ("Segundo a Minuto".equals(seleccion1)) {
                    mp = String.valueOf(l1.segMin());
                }
                if ("Minuto a Segundo".equals(seleccion1)) {
                    mp = String.valueOf(l1.minSeg());
                }
            }
            if (op4.isSelected()) {
                Area l1 = new Area(m1);
                if ("Metro cuadrado a Pie cuadrado".equals(seleccion1)) {
                    mp = String.valueOf(l1.metroPieC());
                }
                if ("Pie cuadrado a Metro cuadrado".equals(seleccion1)) {
                    mp = String.valueOf(l1.pieMetroC());
                }
            }
            if (op5.isSelected()) {
                Velocidad l1 = new Velocidad(m1);
                if ("Metro por segundo a Pie por segundo".equals(seleccion1)) {
                    mp = String.valueOf(l1.metroPieS());
                }
                if ("Pie por segundo a Metro por segundo".equals(seleccion1)) {
                    mp = String.valueOf(l1.pieMetroS());
                }
            }
            if (op6.isSelected()) {
                Aceleracion l1 = new Aceleracion(m1);
                if ("Metro por segundo cuadrado a Pie por segundo cuadrado".equals(seleccion1)) {
                    mp = String.valueOf(l1.metroPieA());
                }
                if ("Pie por segundo cuadrado a Metro por segundo cuadrado".equals(seleccion1)) {
                    mp = String.valueOf(l1.pieMetroA());
                }
            }
            if (op7.isSelected()) {
                Fuerza l1 = new Fuerza(m1);
                if ("Poundal a Newton".equals(seleccion1)) {
                    mp = String.valueOf(l1.poundalNewton());
                }
                if ("Newton a Poundal".equals(seleccion1)) {
                    mp = String.valueOf(l1.newtonPoundal());
                }
            }
            if (op8.isSelected()) {
                Trabajo l1 = new Trabajo(m1);
                if ("Poundal pie a Joule".equals(seleccion1)) {
                    mp = String.valueOf(l1.poundalJoule());
                }
                if ("Joule a Poundal pie".equals(seleccion1)) {
                    mp = String.valueOf(l1.joulePoundal());
                }
            }
            if (op9.isSelected()) {
                Presion l1 = new Presion(m1);
                if ("Poundal por pie cuadrado a Pascal".equals(seleccion1)) {
                    mp = String.valueOf(l1.poundalPascal());
                }
                if ("Pascal a poundal por pie cuadrado".equals(seleccion1)) {
                    mp = String.valueOf(l1.pascalPoundal());
                }
            }
            if (op10.isSelected()) {
                Temperatura l1 = new Temperatura(m1);
                if ("Celcius a Fahrenheit".equals(seleccion1)) {
                    mp = String.valueOf(l1.celciusFahr());
                }
                if ("Fahrenheit a Celcius".equals(seleccion1)) {
                    mp = String.valueOf(l1.fahrCelcius());
                }
                if ("Celcius a Kelvin".equals(seleccion1)) {
                    mp = String.valueOf(l1.celciusKelvin());
                }
                if ("Kelvin a Celcius".equals(seleccion1)) {
                    mp = String.valueOf(l1.kelvinCelcius());
                }
            } 
        if(buttonGroup1.getSelection() == null){
                JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna conversión");
                areaTexto.setText("");
        }else{
            areaTexto.setText(seleccion1 + "\t" + m1 + "  ------  " + df.format(Double.parseDouble(mp)));
            milista.add(seleccion1 + "\t" + m1 + "  ------  " + df.format(Double.parseDouble(mp)));
            areaTexto.setFocusable(false);
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Conversión no válida");
            areaTexto.setText("");
            areaTexto.setFocusable(true);
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        areaTexto.setText("");
        areaTexto.setFocusable(true);
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
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Metro a Pulgada");
        combo1.addItem("Pulgada a Metro");
        combo1.addItem("Pie a Metro");
        combo1.addItem("Metro a Pie");
    }//GEN-LAST:event_op1ActionPerformed

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed

    }//GEN-LAST:event_combo1ActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        LecturaEscritura.anadirHistorial(milista);
        LecturaEscritura.EscribirHistorial();
        LecturaEscritura.abrirHistorial();
        milista.clear();
        milista.add("OPCIÓN------------> Conversión de Unidades");
    }//GEN-LAST:event_historialActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Kilogramo a Libra");
        combo1.addItem("Libra a Kilogramo");
    }//GEN-LAST:event_op2ActionPerformed

    private void op8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op8ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Poundal pie a Joule");
        combo1.addItem("Joule a Poundal pie");
    }//GEN-LAST:event_op8ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Segundo a Minuto");
        combo1.addItem("Minuto a Segundo");
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Pie cuadrado a Metro cuadrado");
        combo1.addItem("Metro cuadrado a Pie cuadrado");
    }//GEN-LAST:event_op4ActionPerformed

    private void op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op5ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Metro por segundo a Pie por segundo");
        combo1.addItem("Pie por segundo a Metro por segundo");
    }//GEN-LAST:event_op5ActionPerformed

    private void op6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op6ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Metro por segundo cuadrado a Pie por segundo cuadrado");
        combo1.addItem("Pie por segundo cuadrado a Metro por segundo cuadrado");
    }//GEN-LAST:event_op6ActionPerformed

    private void op7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op7ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Poundal a Newton");
        combo1.addItem("Newton a Poundal");
    }//GEN-LAST:event_op7ActionPerformed

    private void op9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op9ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Poundal por pie cuadrado a Pascal");
        combo1.addItem("Pascal a poundal por pie cuadrado");
    }//GEN-LAST:event_op9ActionPerformed

    private void op10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op10ActionPerformed
        combo1.removeAllItems();
        combo1.addItem("Kelvin a Celcius");
        combo1.addItem("Celcius a Kelvin");
        combo1.addItem("Celcius a Fahrenheit");
        combo1.addItem("Fahrenheit a Celcius");
    }//GEN-LAST:event_op10ActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConvUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConvUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConvUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConvUnidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaTexto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JButton historial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op10;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JRadioButton op5;
    private javax.swing.JRadioButton op6;
    private javax.swing.JRadioButton op7;
    private javax.swing.JRadioButton op8;
    private javax.swing.JRadioButton op9;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        public void run() {
            new ConvUnidades().setVisible(true);
        }
    }
}
