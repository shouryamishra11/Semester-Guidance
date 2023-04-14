
package javaapplication2.Me;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MeSem3 extends javax.swing.JFrame {

    public MeSem3() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCSE205 = new javax.swing.JButton();
        btnCSE211 = new javax.swing.JButton();
        btnCSE320 = new javax.swing.JButton();
        btnINT306 = new javax.swing.JButton();
        btnINT213 = new javax.swing.JButton();
        btnMTH401 = new javax.swing.JButton();
        btnPEL131 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);


        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 57, 480, 44);

        btnCSE205.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE205.setText("CSE205");
        btnCSE205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE205ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE205);
        btnCSE205.setBounds(148, 142, 194, 31);

        btnCSE211.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE211.setText("CSE211");
        btnCSE211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE211ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE211);
        btnCSE211.setBounds(148, 191, 194, 31);

        btnCSE320.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE320.setText("CSE320");
        btnCSE320.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE320ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE320);
        btnCSE320.setBounds(148, 240, 194, 31);

        btnINT306.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINT306.setText("INT306");
        btnINT306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINT306ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT306);
        btnINT306.setBounds(148, 289, 194, 31);

        btnINT213.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINT213.setText("INT213");
        btnINT213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINT213ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT213);
        btnINT213.setBounds(148, 338, 194, 31);

        btnMTH401.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMTH401.setText("MTH401");
        btnMTH401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTH401ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMTH401);
        btnMTH401.setBounds(148, 387, 194, 31);

        btnPEL131.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPEL131.setText("PEL131");
        btnPEL131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPEL131ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEL131);
        btnPEL131.setBounds(148, 436, 194, 31);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Click here for classPPts and PDFs.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 538, 480, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-9, -7, 560, 670);


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
    private void btnCSE205ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE205.pdf");
    }

    private void btnCSE211ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE211.pdf");
    }

    private void btnCSE320ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE320.pdf");
    }

    private void btnINT306ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\INT306.pdf");
    }

    private void btnINT213ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\INT213.pdf");
    }

    private void btnMTH401ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\MTH401.pdf");
    }

    private void btnPEL131ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\PEL131.pdf");
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
            java.util.logging.Logger.getLogger(MeSem3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeSem3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeSem3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeSem3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeSem3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCSE205;
    private javax.swing.JButton btnCSE211;
    private javax.swing.JButton btnCSE320;
    private javax.swing.JButton btnINT213;
    private javax.swing.JButton btnINT306;
    private javax.swing.JButton btnMTH401;
    private javax.swing.JButton btnPEL131;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
}
