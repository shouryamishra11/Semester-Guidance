
package javaapplication2.Me;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MeSem7 extends javax.swing.JFrame {

    public MeSem7() {
        initComponents();
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnINT248 = new javax.swing.JButton();
        btnINT405 = new javax.swing.JButton();
        btnINT407 = new javax.swing.JButton();
        btnGRN332 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 46, 480, 45);

        btnINT248.setBackground(new java.awt.Color(255, 255, 255));
        btnINT248.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINT248.setText("INT248");
        btnINT248.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINT248ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT248);
        btnINT248.setBounds(167, 133, 157, 31);

        btnINT405.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINT405.setText("INT405");
        btnINT405.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINT405ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT405);
        btnINT405.setBounds(167, 228, 157, 31);

        btnINT407.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINT407.setText("INT407");
        btnINT407.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINT407ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT407);
        btnINT407.setBounds(167, 326, 157, 31);

        btnGRN332.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGRN332.setText("GEN332");
        btnGRN332.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRN332ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGRN332);
        btnGRN332.setBounds(167, 416, 157, 31);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 153));
        jButton5.setText("Click here for class PPTs and PDFs.");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(10, 559, 480, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -20, 520, 670);

    }
    public void pdf(String a){

        try{
            File file=new File(a);

            if(file.exists()){
                if(Desktop.isDesktopSupported())
                {
                    Desktop.getDesktop().open(file);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Not supported");
                }
            }
            else {
                JOptionPane.showMessageDialog(this,"File Not Exist");
            }
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }

    private void btnINT248ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\INT248.pdf");
    }

    private void btnINT405ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\INT405.pdf");
    }

    private void btnINT407ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\INT407.pdf");
    }

    private void btnGRN332ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\GRN332.pdf");
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(MeSem7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeSem7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeSem7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeSem7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeSem7().setVisible(true);
            }
        });
    }


    private javax.swing.JButton btnGRN332;
    private javax.swing.JButton btnINT248;
    private javax.swing.JButton btnINT405;
    private javax.swing.JButton btnINT407;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

}
