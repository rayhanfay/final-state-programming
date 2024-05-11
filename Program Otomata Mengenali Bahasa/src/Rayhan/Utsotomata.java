package Rayhan;
import javax.swing.SwingWorker;
import javax.swing.JOptionPane;

public class Utsotomata extends javax.swing.JFrame {
int i;
char huruf;


    public Utsotomata() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTestTBA = new javax.swing.JPanel();
        jLabelNim = new javax.swing.JLabel();
        jNama = new javax.swing.JTextField();
        jNim = new javax.swing.JTextField();
        jLabelNama = new javax.swing.JLabel();
        jLabelOutput = new javax.swing.JLabel();
        jOutputNama = new java.awt.TextField();
        jOutputNim = new java.awt.TextField();
        tLoopNim = new java.awt.TextField();
        tLoopNama = new java.awt.TextField();
        JBanding = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jMengenali = new javax.swing.JLabel();
        jScanNim = new java.awt.TextField();
        jScanNama = new java.awt.TextField();
        jLabelMid = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finite State Automata_Rayhan Al Farassy_2207135776");
        setBackground(new java.awt.Color(204, 255, 204));
        setFont(new java.awt.Font("Ebrima", 0, 10)); // NOI18N
        setResizable(false);

        jTestTBA.setBackground(new java.awt.Color(102, 102, 102));
        jTestTBA.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N

        jLabelNim.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabelNim.setForeground(new java.awt.Color(255, 153, 0));
        jLabelNim.setText("NIM   :");

        jNama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamaActionPerformed(evt);
            }
        });
        jNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNamaKeyTyped(evt);
            }
        });

        jNim.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jNim.setMinimumSize(new java.awt.Dimension(64, 29));
        jNim.setPreferredSize(new java.awt.Dimension(64, 29));
        jNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNimActionPerformed(evt);
            }
        });
        jNim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNimKeyTyped(evt);
            }
        });

        jLabelNama.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabelNama.setForeground(new java.awt.Color(255, 153, 0));
        jLabelNama.setText("NAMA :");

        jLabelOutput.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelOutput.setForeground(new java.awt.Color(255, 153, 0));
        jLabelOutput.setText("OUTPUT :");

        jOutputNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jOutputNama.setEditable(false);
        jOutputNama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jOutputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOutputNamaActionPerformed(evt);
            }
        });

        jOutputNim.setEditable(false);
        jOutputNim.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jOutputNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOutputNimActionPerformed(evt);
            }
        });

        tLoopNim.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tLoopNim.setEditable(false);
        tLoopNim.setFont(new java.awt.Font("Coolvetica Rg", 1, 18)); // NOI18N
        tLoopNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLoopNimActionPerformed(evt);
            }
        });

        tLoopNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tLoopNama.setEditable(false);
        tLoopNama.setFont(new java.awt.Font("Coolvetica Rg", 1, 18)); // NOI18N
        tLoopNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLoopNamaActionPerformed(evt);
            }
        });

        JBanding.setBackground(new java.awt.Color(255, 153, 0));
        JBanding.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        JBanding.setText("BANDINGKAN");
        JBanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBandingActionPerformed(evt);
            }
        });

        jClear.setBackground(new java.awt.Color(255, 153, 0));
        jClear.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jClear.setText("CLEAR");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        jExit.setBackground(new java.awt.Color(255, 153, 0));
        jExit.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jExit.setText("EXIT");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        jMengenali.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jMengenali.setForeground(new java.awt.Color(255, 153, 0));
        jMengenali.setText("MENGENALI BAHASA:");

        jScanNim.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScanNim.setEditable(false);
        jScanNim.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jScanNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jScanNimActionPerformed(evt);
            }
        });

        jScanNama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScanNama.setEditable(false);
        jScanNama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jScanNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jScanNamaActionPerformed(evt);
            }
        });

        jLabelMid.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelMid.setForeground(new java.awt.Color(255, 153, 0));
        jLabelMid.setText("MID TEST TBA");

        javax.swing.GroupLayout jTestTBALayout = new javax.swing.GroupLayout(jTestTBA);
        jTestTBA.setLayout(jTestTBALayout);
        jTestTBALayout.setHorizontalGroup(
            jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTestTBALayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTestTBALayout.createSequentialGroup()
                        .addComponent(jLabelNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jNama, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTestTBALayout.createSequentialGroup()
                        .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOutput)
                            .addComponent(jLabelNim))
                        .addGap(9, 9, 9)
                        .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jOutputNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jNim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jOutputNim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBanding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jClear, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTestTBALayout.createSequentialGroup()
                        .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTestTBALayout.createSequentialGroup()
                                .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tLoopNim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tLoopNama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScanNama, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScanNim, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jMengenali))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTestTBALayout.createSequentialGroup()
                        .addComponent(jLabelMid)
                        .addGap(37, 37, 37))))
        );
        jTestTBALayout.setVerticalGroup(
            jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTestTBALayout.createSequentialGroup()
                .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTestTBALayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNama)
                            .addComponent(jNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTestTBALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelMid)
                        .addGap(27, 27, 27)))
                .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTestTBALayout.createSequentialGroup()
                        .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNim)
                            .addComponent(jNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jTestTBALayout.createSequentialGroup()
                                .addComponent(jOutputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jOutputNim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(JBanding, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jTestTBALayout.createSequentialGroup()
                        .addComponent(jMengenali)
                        .addGap(24, 24, 24)
                        .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScanNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tLoopNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jTestTBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tLoopNim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScanNim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jLabelNama.getAccessibleContext().setAccessibleName("name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTestTBA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTestTBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBandingActionPerformed
        // Deklarasi
        String namaKu = jNama.getText();
        String nimKu = jNim.getText();
        jOutputNama.setText("");
        jOutputNim.setText("");
        int delay = 1000;
        char [] karakterNama = namaKu.toCharArray();
        char [] karakterNIM = nimKu.toCharArray();
        
        char [] tangkapNama = new char[namaKu.length()];
        char [] tangkapNIM = new char[nimKu.length()];
        // Search Nama
        try{
        String ambil ="";
          for(int a=0;a<namaKu.length();a++){
              tangkapNama[a] = karakterNama[a];
                String perhuruf = Character.toString(tangkapNama[a]);
                if(a!=0) ambil += karakterNama[a-1];
            for (i=65;i<=122; i++){
                Thread.sleep(50);
                jScanNama.setText("");
                Thread.sleep(50);
                huruf= (char) i;
                tLoopNama.setText(" "+huruf);
                jOutputNama.setText(" "+ambil);
                Thread.sleep(50);
                jScanNama.setText("Di Tolak");
                this.setVisible(true);
                
                
                if(huruf==karakterNama[a]) {
                    jScanNama.setText("Di Terima");
                    Thread.sleep(500);
                    jOutputNama.setText(" "+ambil+huruf);
                    //JOptionPane.showMessageDialog(null, "HURUF DITERIMA");
                    break;
                }
                //JOptionPane.showMessageDialog(null, "HURUF DITOLAK");
            }
        }
        }
        catch (InterruptedException ex){ ex.printStackTrace();//do nothing
        }
        //JOptionPane.showMessageDialog(null, "Nama Di Kenali");
        // Search NIM
        try{

        String ambil ="";
           for(int a=0;a<nimKu.length();a++){
              tangkapNIM[a] = karakterNIM[a];
                String perhuruf = Character.toString(tangkapNIM[a]);
                if(a!=0) ambil += karakterNIM[a-1];
            for (i=48;i<=57;i++){
                Thread.sleep(50);
                jScanNim.setText("");
                Thread.sleep(50);
                huruf= (char) i;
                tLoopNim.setText(" "+huruf);
                jOutputNim.setText(" "+ambil);
                Thread.sleep(50); 
                jScanNim.setText("Di Tolak");
                this.setVisible(true);
                
                
                if(huruf==karakterNIM[a]){
                jScanNim.setText("Di Terima");
                Thread.sleep(500);    
                jOutputNim.setText(" "+ambil+huruf);
                //JOptionPane.showMessageDialog(null, "ANGKA DITERIMA");
                    break;
                }
                //JOptionPane.showMessageDialog(null, "HURUF DITOLAK");
            }
        }
        }
        catch (InterruptedException ex){ ex.printStackTrace();//do nothing
        }
        JOptionPane.showMessageDialog(null, "Nama dan Nim Di Kenali");
        
    }//GEN-LAST:event_JBandingActionPerformed

    private void jOutputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOutputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOutputNamaActionPerformed

    private void jOutputNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOutputNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOutputNimActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
   //int selectedOption = JOptionPane.showConfirmDialog(null,
   // "Apakah anda ingin keluar dari program?", "Close Program", JOptionPane.YES_NO_OPTION);
   // if (selectedOption == JOptionPane.YES_OPTION) {
   System.exit(0);
   // }
        // TODO add your handling code here:
    }//GEN-LAST:event_jExitActionPerformed

    private void tLoopNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLoopNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLoopNamaActionPerformed

    private void jNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNamaActionPerformed

    private void tLoopNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLoopNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLoopNimActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        jNama.setText("");
        jNim.setText("");
        jOutputNama.setText("");
        jOutputNim.setText("");
        tLoopNama.setText("");
        tLoopNim.setText("");
    }//GEN-LAST:event_jClearActionPerformed

    private void jNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNamaKeyTyped
        char ketik = evt.getKeyChar();
        if(Character.isDigit(ketik)){
            evt.consume();
        }
    }//GEN-LAST:event_jNamaKeyTyped

    private void jNimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNimKeyTyped
        char ketik = evt.getKeyChar();
        if(!(Character.isDigit(ketik))){
            evt.consume();
        }
    }//GEN-LAST:event_jNimKeyTyped

    private void jNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNimActionPerformed

    private void jScanNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jScanNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScanNimActionPerformed

    private void jScanNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jScanNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScanNamaActionPerformed

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
            java.util.logging.Logger.getLogger(Utsotomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utsotomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utsotomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utsotomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</edit-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fol
        //</editor-fold>
        //</edit-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fol

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utsotomata().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBanding;
    private javax.swing.JButton jClear;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMid;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNim;
    private javax.swing.JLabel jLabelOutput;
    private javax.swing.JLabel jMengenali;
    private javax.swing.JTextField jNama;
    private javax.swing.JTextField jNim;
    private java.awt.TextField jOutputNama;
    private java.awt.TextField jOutputNim;
    private java.awt.TextField jScanNama;
    private java.awt.TextField jScanNim;
    private javax.swing.JPanel jTestTBA;
    private java.awt.TextField tLoopNama;
    private java.awt.TextField tLoopNim;
    // End of variables declaration//GEN-END:variables
}
