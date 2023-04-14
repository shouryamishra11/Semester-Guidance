
package javaapplication2.Cse;


import javax.swing.*;
import java.awt.*;
import java.io.File;

public class CseSem1 extends javax.swing.JFrame {


    public CseSem1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCHE110 = new javax.swing.JButton();
        btnMEC107 = new javax.swing.JButton();
        btnCSE101 = new javax.swing.JButton();
        btnECE131 = new javax.swing.JButton();
        btnMTH165 = new javax.swing.JButton();
        btnCLICK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();


        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 37, 353, 59);

        btnCHE110.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCHE110.setText("CHE110");
        btnCHE110.setPreferredSize(new java.awt.Dimension(220, 50));
        btnCHE110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCHE110ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCHE110);
        btnCHE110.setBounds(150, 160, 224, 50);

        btnMEC107.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMEC107.setText("MEC107");
        btnMEC107.setPreferredSize(new java.awt.Dimension(220, 50));
        btnMEC107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMEC107ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMEC107);
        btnMEC107.setBounds(150, 220, 224, 50);

        btnCSE101.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE101.setText("CSE101");
        btnCSE101.setPreferredSize(new java.awt.Dimension(220, 50));
        btnCSE101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE101ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE101);
        btnCSE101.setBounds(150, 290, 224, 50);

        btnECE131.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnECE131.setText("ECE131");
        btnECE131.setPreferredSize(new java.awt.Dimension(220, 50));
        btnECE131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnECE131ActionPerformed(evt);
            }
        });
        getContentPane().add(btnECE131);
        btnECE131.setBounds(150, 360, 224, 50);

        btnMTH165.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMTH165.setText("MTH165");
        btnMTH165.setPreferredSize(new java.awt.Dimension(220, 50));
        btnMTH165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTH165ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMTH165);
        btnMTH165.setBounds(150, 430, 224, 50);

        btnCLICK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCLICK.setForeground(new java.awt.Color(0, 0, 153));
        btnCLICK.setText("Click here for class PPTs and PDFs.");
        btnCLICK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLICKActionPerformed(evt);
            }
        });
        getContentPane().add(btnCLICK);
        btnCLICK.setBounds(0, 522, 490, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-12, -5, 590, 710);


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

    private void btnCHE110ActionPerformed(java.awt.event.ActionEvent evt) {


        pdf("E:\\\\PDF\\\\CSE101.pdf");

    }

    private void btnMEC107ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\MEC107.pdf");
    }

    private void btnCSE101ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE101.pdf");
    }

    private void btnECE131ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\ECE131.pdf");
    }

    private void btnMTH165ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\MTH165.pdf");
    }

    private void btnCLICKActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(javaapplication2.Cse.CseSem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javaapplication2.Cse.CseSem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javaapplication2.Cse.CseSem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javaapplication2.Cse.CseSem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaapplication2.Cse.CseSem1().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCHE110;
    private javax.swing.JButton btnCLICK;
    private javax.swing.JButton btnCSE101;
    private javax.swing.JButton btnECE131;
    private javax.swing.JButton btnMEC107;
    private javax.swing.JButton btnMTH165;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

}
