/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.otomata;

/**
 *
 * @author Usera
 */
import java.util.Scanner;
 
public class Otomata extends javax.swing.JFrame {
    char Alphabet;
    int i;

    public Otomata() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        Judul = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NamaInput = new javax.swing.JLabel();
        Fieldinputnama = new javax.swing.JTextField();
        OutputNama = new javax.swing.JLabel();
        FieldOutputNama = new javax.swing.JTextField();
        RunButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        KetSearchNama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(157, 107, 77));
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Judul.setFont(new java.awt.Font("Nexa", 1, 12));
        Judul.setText("Final state program ini : saya makan nasi " + " saya memasak nasi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        NamaInput.setFont(new java.awt.Font("Arial", 0, 12));
        NamaInput.setText("Input");
        OutputNama.setFont(new java.awt.Font("Arial", 0, 12));
        OutputNama.setText("Hasil");
        RunButton.setFont(new java.awt.Font("Nexa", 1, 10));
        RunButton.setText("Enter");
        RunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunButtonHasClicked(evt);
            }
        });
        ClearButton.setFont(new java.awt.Font("Nexa", 1, 10));
        ClearButton.setText("Reset");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonHasClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NamaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(Fieldinputnama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RunButton)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(OutputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(FieldOutputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE) // Mengatur lebar FieldOutputNama
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ClearButton)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(OutputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(KetSearchNama, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE) // Mengatur lebar KetSearchNama
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaInput)
                    .addComponent(Fieldinputnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RunButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OutputNama)
                    .addComponent(FieldOutputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) // Mengatur lebar FieldOutputNama
                    .addComponent(ClearButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OutputNama)
                    .addComponent(KetSearchNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) // Mengatur lebar KetSearchNama
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void FieldinputnamaPerformed(java.awt.event.ActionEvent evt){

    }
   
   private void RunButtonHasClicked(java.awt.event.ActionEvent evt) {
String targetString1 = "saya makan nasi"; // Target String pertama
String targetString2 = "saya memasak nasi"; // Target String kedua

char[] CharNama1 = targetString1.toCharArray(); // Ubah targetString1 menjadi array karakter
char[] CharNama2 = targetString2.toCharArray(); // Ubah targetString2 menjadi array karakter

int currentIndex1 = 0; // Indeks karakter saat ini untuk targetString1
int currentIndex2 = 0; // Indeks karakter saat ini untuk targetString2

try {
    String catching = " ";
    String userInput = Fieldinputnama.getText(); // Ambil input pengguna

    // Loop melalui karakter-karakter input pengguna
    for (char inputChar : userInput.toCharArray()) {
        // Periksa dengan targetString1
        if (inputChar == CharNama1[currentIndex1]) {
            catching += inputChar;

            this.setVisible(true);
            KetSearchNama.setText("Input Diterima");
            Thread.sleep(1000);
            FieldOutputNama.setText(catching);

            currentIndex1++; // Pindah ke karakter berikutnya

            // Jika currentIndex1 mencapai panjang targetString1, artinya string telah dikenali
            if (currentIndex1 == targetString1.length()) {
                KetSearchNama.setText("Input Benar. Program Berjalan");
                currentIndex1 = 0; // Reset indeks
                catching = " "; // Reset string yang sedang dikonstruksi
            }
        }
        // Periksa dengan targetString2
        else if (inputChar == CharNama2[currentIndex2]) {
            catching += inputChar;

            this.setVisible(true);
            KetSearchNama.setText("Input Diterima");
            Thread.sleep(1000);
            FieldOutputNama.setText(catching);

            currentIndex2++; // Pindah ke karakter berikutnya

            // Jika currentIndex2 mencapai panjang targetString2, artinya string telah dikenali
            if (currentIndex2 == targetString2.length()) {
                KetSearchNama.setText("Input Benar. Program Berjalan");
                currentIndex2 = 0; // Reset indeks
                catching = " "; // Reset string yang sedang dikonstruksi
            }
        } else {
            // Jika karakter tidak sesuai dengan karakter dari kedua target string
            if (targetString1.contains(String.valueOf(inputChar))) {
                KetSearchNama.setText("Karakter diketahui tetapi input tidak terima.");
            } else if (targetString2.contains(String.valueOf(inputChar))) {
                KetSearchNama.setText("Karakter diketahui tetapi input tidak terima.");
            } else {
                KetSearchNama.setText("Karakter tidak diketahui dan input tidak terima.");
            }
            FieldOutputNama.setText(""); // Clear output
            currentIndex1 = 0; // Reset indeks targetString1
            currentIndex2 = 0; // Reset indeks targetString2
            catching = " "; // Reset string yang sedang dikonstruksi
            break; // Keluar dari loop
        }
    }
} catch (Exception e) {
    // Tangani pengecualian jika diperlukan
    e.printStackTrace();
}

}

    
    private void FieldOutputNamaActionPerformed(java.awt.event.ActionEvent evt){

    }

    private void ClearButtonHasClicked(java.awt.event.ActionEvent evt){
        Fieldinputnama.setText("");
        FieldOutputNama.setText("");
        KetSearchNama.setText("");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Otomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Otomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Otomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Otomata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Otomata().setVisible(true);
            }
        });
    }

    private javax.swing.JButton ClearButton;
    private javax.swing.JTextField Fieldinputnama;
    private javax.swing.JTextField FieldOutputNama;
    private javax.swing.JLabel OutputNama;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel NamaInput;
    private javax.swing.JButton RunButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel KetSearchNama;
}