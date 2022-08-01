package logica.CalculoAreaVolumen;

import java.util.ArrayList;
import presentacion.Calculadora;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.LecturaEscritura;

public class calcVolFrame extends javax.swing.JFrame {

    private final List<String> milista = new ArrayList<>();

    public calcVolFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        buttonGroup1.add(esfera);
        buttonGroup1.add(cuboide);
        buttonGroup1.add(cilindro);
        buttonGroup1.add(cubo);
        buttonGroup1.add(cono);

        milista.add("OPCIÓN------------> Cálculo de Volumen");
    }

    public void LimpiarLados() {
        lado1.setVisible(false);
        areaTexto1.setVisible(false);
        lado2.setVisible(false);
        areaTexto2.setVisible(false);
        lado3.setVisible(false);
        areaTexto3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        esfera = new javax.swing.JRadioButton();
        cuboide = new javax.swing.JRadioButton();
        cilindro = new javax.swing.JRadioButton();
        cubo = new javax.swing.JRadioButton();
        cono = new javax.swing.JRadioButton();
        combo1 = new javax.swing.JComboBox<>();
        historial = new javax.swing.JButton();
        esfera1 = new javax.swing.JLabel();
        cubo1 = new javax.swing.JLabel();
        cuboide1 = new javax.swing.JLabel();
        cilindro1 = new javax.swing.JLabel();
        cono1 = new javax.swing.JLabel();
        AreaPerimetro = new javax.swing.JButton();
        lado1 = new javax.swing.JLabel();
        areaTexto1 = new javax.swing.JTextField();
        lado2 = new javax.swing.JLabel();
        areaTexto2 = new javax.swing.JTextField();
        lado3 = new javax.swing.JLabel();
        areaTexto3 = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        res = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA DE PERÍMETRO, ÁREA Y VOLUMEN");

        jButton10.setText("Calcular");
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

        esfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esferaActionPerformed(evt);
            }
        });

        cuboide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuboideActionPerformed(evt);
            }
        });

        cilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindroActionPerformed(evt);
            }
        });

        cubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuboActionPerformed(evt);
            }
        });

        cono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conoActionPerformed(evt);
            }
        });

        combo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Volumen" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        historial.setText("Historial");
        historial.setToolTipText("Guarda el historial y abre el archivo.");
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });

        esfera1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        esfera1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esfera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/esfera.png"))); // NOI18N
        esfera1.setText("Esfera");

        cubo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cubo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cubo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/cubo.png"))); // NOI18N
        cubo1.setText("Cubo");

        cuboide1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cuboide1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuboide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/paralele (2).png"))); // NOI18N
        cuboide1.setText("Paralelepípedo");

        cilindro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cilindro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cilindro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/cilindro.png"))); // NOI18N
        cilindro1.setText("Cilindro");

        cono1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/cono.png"))); // NOI18N
        cono1.setText("Cono");

        AreaPerimetro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AreaPerimetro.setText("Calcular Área/Perímetro");
        AreaPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaPerimetroActionPerformed(evt);
            }
        });

        lado1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lado1.setText("Ingrese el lado:");

        areaTexto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        areaTexto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lado2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lado2.setText("Ingrese el lado:");

        areaTexto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        areaTexto2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lado3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lado3.setText("Ingrese el lado:");

        areaTexto3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        areaTexto3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        res.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        res.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(cubo))
                    .addComponent(esfera, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuboide, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(0, 399, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cubo1)
                                .addComponent(cuboide1)
                                .addComponent(esfera1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cono)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cono1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(cilindro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cilindro1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(AreaPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(res)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton11)))
                                .addGap(151, 151, 151))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(historial)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lado2)
                            .addComponent(lado3)
                            .addComponent(lado1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areaTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AreaPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(cono)
                                    .addGap(29, 29, 29))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(cubo)
                                    .addGap(25, 25, 25)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cubo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cono1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lado1))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lado2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lado3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cilindro1)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(res))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(cilindro)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cuboide)
                                        .addGap(47, 47, 47))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cuboide1)
                                        .addGap(33, 33, 33)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(esfera1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(esfera)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(historial))
                        .addContainerGap())))
        );

        lado1.setVisible(false);
        areaTexto1.setVisible(false);
        lado2.setVisible(false);
        areaTexto2.setVisible(false);
        lado3.setVisible(false);
        areaTexto3.setVisible(false);
        resultado.setFocusable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            if (cubo.isSelected()) {
                milista.add("Cubo");
                double l;
                l = Double.parseDouble(areaTexto1.getText());
                Cubo t = new Cubo(l);
                resultado.setText(String.valueOf(t.volumen()));
                milista.add("Lado = " + String.valueOf(l) + "\t" + "---> " + "Volumen = " + resultado.getText() + " u3");
            }

            if (cuboide.isSelected()) {
                milista.add("Paralelepípedo");
                double l1;
                double l2;
                double l3;
                l1 = Double.parseDouble(areaTexto1.getText());
                l2 = Double.parseDouble(areaTexto2.getText());
                l3 = Double.parseDouble(areaTexto3.getText());
                Cuboide c = new Cuboide(l1, l2, l3);
                resultado.setText(String.valueOf(c.volumen()));
                milista.add("Largo = " + String.valueOf(l1) + "\t" + "Ancho = " + String.valueOf(l2) + "\t" + "Alto = " + String.valueOf(l3) + "\t" + "---> " + "Volumen = " + resultado.getText() + " u3");
            }

            if (esfera.isSelected()) {
                milista.add("Esfera");
                double l;
                l = Double.parseDouble(areaTexto1.getText());
                Esfera e = new Esfera(l);
                resultado.setText(String.valueOf(e.volumen()));
                milista.add("Radio = " + String.valueOf(l) + "\t" + "---> " + "Volumen = " + resultado.getText() + " u3");
            }

            if (cono.isSelected()) {
                milista.add("Cono");
                double l1;
                double l2;
                l1 = Double.parseDouble(areaTexto1.getText());
                l2 = Double.parseDouble(areaTexto2.getText());
                Cono c = new Cono(l1, l2);
                resultado.setText(String.valueOf(c.volumen()));
                milista.add("Radio de la base = " + String.valueOf(l1) + "Altura = " + String.valueOf(l2)  + "\t" + "---> " + "Volumen = " + resultado.getText() + " u3");
            }

            if (cilindro.isSelected()) {
                milista.add("Cilindro");
                double l1;
                double l2;
                l1 = Double.parseDouble(areaTexto1.getText());
                l2 = Double.parseDouble(areaTexto2.getText());
                Cilindro c = new Cilindro(l1, l2);
                resultado.setText(String.valueOf(c.volumen()));
                milista.add("Radio de la base = " + String.valueOf(l1) + "Altura = " + String.valueOf(l2)  + "\t" + "---> " + "Volumen = " + resultado.getText() + " u3");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Texto no válido");
        }


    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        areaTexto1.setText("");
        areaTexto2.setText("");
        areaTexto3.setText("");
        resultado.setText("");
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

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed

    }//GEN-LAST:event_combo1ActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        LecturaEscritura.anadirHistorial(milista);
        LecturaEscritura.EscribirHistorial();
        LecturaEscritura.abrirHistorial();
        milista.clear();
        milista.add("OPCIÓN------------> Cálculo de Volumen");
    }//GEN-LAST:event_historialActionPerformed

    private void esferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esferaActionPerformed
        LimpiarLados();
        lado1.setText("Ingrese el radio:");
        lado1.setVisible(true);
        areaTexto1.setVisible(true);
    }//GEN-LAST:event_esferaActionPerformed

    private void cuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuboActionPerformed
        LimpiarLados();
        lado1.setText("Ingrese el lado:");
        lado1.setVisible(true);
        areaTexto1.setVisible(true);
    }//GEN-LAST:event_cuboActionPerformed

    private void cilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroActionPerformed
        LimpiarLados();
        lado1.setText("Ingrese el radio de la base:");
        lado1.setVisible(true);
        areaTexto1.setVisible(true);
        lado2.setText("Ingrese la altura:");
        lado2.setVisible(true);
        areaTexto2.setVisible(true);
    }//GEN-LAST:event_cilindroActionPerformed

    private void AreaPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaPerimetroActionPerformed
        if (!milista.isEmpty()) {
            LecturaEscritura.anadirHistorial(milista);
            milista.clear();
        }
        calcAreaVolFrame cv = new calcAreaVolFrame();
        cv.setTitle("Perímetro, Área y Volumen");
        cv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AreaPerimetroActionPerformed

    private void cuboideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuboideActionPerformed
        LimpiarLados();
        lado1.setText("Ingrese el largo:");
        lado1.setVisible(true);
        areaTexto1.setVisible(true);
        lado2.setText("Ingrese el ancho:");
        lado2.setVisible(true);
        areaTexto2.setVisible(true);
        lado3.setText("Ingrese el alto:");
        lado3.setVisible(true);
        areaTexto3.setVisible(true);
    }//GEN-LAST:event_cuboideActionPerformed

    private void conoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conoActionPerformed
        LimpiarLados();
        lado1.setText("Ingrese el radio de la base:");
        lado1.setVisible(true);
        areaTexto1.setVisible(true);
        lado2.setText("Ingrese la altura:");
        lado2.setVisible(true);
        areaTexto2.setVisible(true);
    }//GEN-LAST:event_conoActionPerformed

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
            java.util.logging.Logger.getLogger(calcVolFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcVolFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcVolFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcVolFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AreaPerimetro;
    private javax.swing.JTextField areaTexto1;
    private javax.swing.JTextField areaTexto2;
    private javax.swing.JTextField areaTexto3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cilindro;
    private javax.swing.JLabel cilindro1;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JRadioButton cono;
    private javax.swing.JLabel cono1;
    private javax.swing.JRadioButton cubo;
    private javax.swing.JLabel cubo1;
    private javax.swing.JRadioButton cuboide;
    private javax.swing.JLabel cuboide1;
    private javax.swing.JRadioButton esfera;
    private javax.swing.JLabel esfera1;
    private javax.swing.JButton historial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lado1;
    private javax.swing.JLabel lado2;
    private javax.swing.JLabel lado3;
    private javax.swing.JLabel res;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        public void run() {
            new calcVolFrame().setVisible(true);
        }
    }
}
