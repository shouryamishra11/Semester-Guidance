
package javaapplication2.Cse;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class CseSem5 extends javax.swing.JFrame {
    public CseSem5() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPEV106 = new javax.swing.JButton();
        btnINT246 = new javax.swing.JButton();
        btnCSE322 = new javax.swing.JButton();
        btnPEA305 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 62, 480, 49);

        btnPEV106.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPEV106.setText("PEV106");
        btnPEV106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPEV106ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEV106);
        btnPEV106.setBounds(185, 179, 159, 31);

        btnINT246.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINT246.setText("INT246");
        btnINT246.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINT246ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT246);
        btnINT246.setBounds(185, 256, 159, 31);

        btnCSE322.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE322.setText("CSE322");
        btnCSE322.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE322ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE322);
        btnCSE322.setBounds(185, 336, 159, 31);

        btnPEA305.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPEA305.setText("PEA305");
        btnPEA305.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPEA305ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEA305);
        btnPEA305.setBounds(185, 413, 159, 31);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Click here for PPTs and PDFs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 533, 480, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-49, -7, 580, 720);


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

    private void btnPEV106ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\PEV106.pdf");
    }

    private void btnINT246ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\INT246.pdf");
    }

    private void btnCSE322ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE322.pdf");
    }

    private void btnPEA305ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\PEA305.pdf");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(CseSem5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem5().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCSE322;
    private javax.swing.JButton btnINT246;
    private javax.swing.JButton btnPEA305;
    private javax.swing.JButton btnPEV106;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

}
