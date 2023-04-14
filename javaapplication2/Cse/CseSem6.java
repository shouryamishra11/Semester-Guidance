
package javaapplication2.Cse;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class CseSem6 extends javax.swing.JFrame {

    public CseSem6() {
        initComponents();
    }



    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCSE308 = new javax.swing.JButton();
        btnCSE423 = new javax.swing.JButton();
        btnCSE427 = new javax.swing.JButton();
        btnGEN331 = new javax.swing.JButton();
        btnINT247 = new javax.swing.JButton();
        btnINT417 = new javax.swing.JButton();
        btnPEA306 = new javax.swing.JButton();
        btnPES319 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 42, 480, 62);

        btnCSE308.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE308.setText("CSE308");
        btnCSE308.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE308ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE308);
        btnCSE308.setBounds(147, 114, 166, 31);

        btnCSE423.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE423.setText("CSE423");
        btnCSE423.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE423ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE423);
        btnCSE423.setBounds(147, 151, 166, 31);

        btnCSE427.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE427.setText("CSE427");
        btnCSE427.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE427ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE427);
        btnCSE427.setBounds(147, 192, 166, 31);

        btnGEN331.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGEN331.setText("GEN331");
        btnGEN331.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGEN331ActionPerformed(evt);
            }
        });
        getContentPane().add(btnGEN331);
        btnGEN331.setBounds(147, 233, 166, 31);

        btnINT247.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINT247.setText("INT247");
        btnINT247.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINT247ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT247);
        btnINT247.setBounds(147, 278, 166, 31);

        btnINT417.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINT417.setText("INT417");
        btnINT417.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINT417ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT417);
        btnINT417.setBounds(147, 319, 166, 31);

        btnPEA306.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPEA306.setText("PEA306");
        btnPEA306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPEA306ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEA306);
        btnPEA306.setBounds(147, 360, 166, 31);

        btnPES319.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPES319.setText("PES319");
        btnPES319.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPES319ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPES319);
        btnPES319.setBounds(147, 401, 166, 31);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Click here for class PPTs and PDFs.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 527, 480, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-8, -2, 520, 640);
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


    private void btnCSE308ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE308.pdf");
    }

    private void btnCSE423ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE423.pdf");
    }

    private void btnCSE427ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE427.pdf");
    }

    private void btnGEN331ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\GEN331.pdf");
    }

    private void btnINT247ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\INT247.pdf");
    }

    private void btnINT417ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\INT417.pdf");
    }

    private void btnPEA306ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\PEA306.pdf");
    }

    private void btnPES319ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\PES319.pdf");
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
            java.util.logging.Logger.getLogger(CseSem6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem6().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCSE308;
    private javax.swing.JButton btnCSE423;
    private javax.swing.JButton btnCSE427;
    private javax.swing.JButton btnGEN331;
    private javax.swing.JButton btnINT247;
    private javax.swing.JButton btnINT417;
    private javax.swing.JButton btnPEA306;
    private javax.swing.JButton btnPES319;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
}
