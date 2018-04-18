
package cConvert;
//shameek m

public class cConverters extends javax.swing.JFrame {

    double BRITISH_POUND=93.93;
    double USA_DOLLAR=65.02;
    double CHINA_RENMINBI=10.29;
    double JAPAN_YEN=0.62 ;
    double DUBAI_AED=17.70;
    double JORDAN_DINAR=91.65;
    double BRAZIL_REAL=19.63;
    double INDONESIA_RUPIAH=0.0047;
            
    
    public cConverters() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcmbCurrency = new javax.swing.JComboBox<>();
        jlblConvert = new javax.swing.JLabel();
        jtextConvert = new javax.swing.JTextField();
        jbtnConvert = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Phosphate", 1, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CURRENCY CONVERTER");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jcmbCurrency.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jcmbCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one....", "BRITISH POUND", "USA", "CHINA", "JAPAN", "DUBAI", "JORDAN", "BRAZIL", "INDONESIA" }));
        jcmbCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrencyActionPerformed(evt);
            }
        });

        jlblConvert.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jlblConvert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblConvert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jtextConvert.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jtextConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtextConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextConvertActionPerformed(evt);
            }
        });

        jbtnConvert.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jbtnConvert.setText("CONVERT");
        jbtnConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jbtnExit.setText("EXIT");
        jbtnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jbtnReset.setText("RESET");
        jbtnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jbtnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtextConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtextConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextConvertActionPerformed
       
    }//GEN-LAST:event_jtextConvertActionPerformed

    private void jcmbCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrencyActionPerformed
        
    }//GEN-LAST:event_jcmbCurrencyActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
         jtextConvert.setText(null);
         jlblConvert.setText(null);
         jcmbCurrency.setSelectedIndex(0);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConvertActionPerformed
       double INDIAN_RUPEE=Double.parseDouble(jtextConvert.getText());
       if(jcmbCurrency.getSelectedItem().equals("BRITISH POUND"))
       {jtextConvert.setText(jtextConvert.getText()+"£");
           String cConvert1=String.format("₹ % .2f",INDIAN_RUPEE*BRITISH_POUND );
           jlblConvert.setText(cConvert1);
       }
        if(jcmbCurrency.getSelectedItem().equals("USA"))
       {jtextConvert.setText(jtextConvert.getText()+"$");
           String cConvert1=String.format("₹ % .2f",INDIAN_RUPEE*USA_DOLLAR );
           jlblConvert.setText(cConvert1);
       }
       if(jcmbCurrency.getSelectedItem().equals("CHINA"))
       {jtextConvert.setText(jtextConvert.getText()+"¥");
           String cConvert1=String.format("₹ % .2f",INDIAN_RUPEE*CHINA_RENMINBI );
           jlblConvert.setText(cConvert1);
       }
       if(jcmbCurrency.getSelectedItem().equals("JAPAN"))
       {jtextConvert.setText(jtextConvert.getText()+"円");
           String cConvert1=String.format("₹ % .2f",INDIAN_RUPEE*JAPAN_YEN );
           jlblConvert.setText(cConvert1);
       }
       if(jcmbCurrency.getSelectedItem().equals("DUBAI"))
       {jtextConvert.setText(jtextConvert.getText()+"د.");
           String cConvert1=String.format("₹% .2f",INDIAN_RUPEE*DUBAI_AED );
           jlblConvert.setText(cConvert1);
       }
       if(jcmbCurrency.getSelectedItem().equals("JORDAN"))
       {jtextConvert.setText(jtextConvert.getText()+"د.");
           String cConvert1=String.format("₹% .2f",INDIAN_RUPEE*JORDAN_DINAR );
           jlblConvert.setText(cConvert1);
       }
       if(jcmbCurrency.getSelectedItem().equals("BRAZIL"))
       {jtextConvert.setText(jtextConvert.getText()+"R$");
           String cConvert1=String.format("₹ % .2f",INDIAN_RUPEE*BRAZIL_REAL );
           jlblConvert.setText(cConvert1);
       }
       if(jcmbCurrency.getSelectedItem().equals("INDONESIA"))
       {jtextConvert.setText(jtextConvert.getText()+"Rp");
           String cConvert1=String.format("₹ % .2f",INDIAN_RUPEE*INDONESIA_RUPIAH );
           jlblConvert.setText(cConvert1);
       }
       
    }//GEN-LAST:event_jbtnConvertActionPerformed

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
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cConverters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cConverters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnConvert;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> jcmbCurrency;
    private javax.swing.JLabel jlblConvert;
    private javax.swing.JTextField jtextConvert;
    // End of variables declaration//GEN-END:variables
}
