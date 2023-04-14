
package javaapplication2.Me;


import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MeSem4 extends javax.swing.JFrame {


    public MeSem4() {
        initComponents();
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnINT404 = new javax.swing.JButton();
        btnCSE306 = new javax.swing.JButton();
        btnCSE316 = new javax.swing.JButton();
        btnCSE310 = new javax.swing.JButton();
        btnCSE408 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 61, 480, 58);

        btnINT404.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINT404.setText("INT404");
        btnINT404.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINT404ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINT404);
        btnINT404.setBounds(165, 173, 170, 31);

        btnCSE306.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE306.setText("CSE306");
        btnCSE306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE306ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE306);
        btnCSE306.setBounds(165, 222, 170, 31);

        btnCSE316.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE316.setText("CSE316");
        btnCSE316.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE316ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE316);
        btnCSE316.setBounds(165, 271, 170, 31);

        btnCSE310.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE310.setText("CSE310");
        btnCSE310.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE310ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE310);
        btnCSE310.setBounds(165, 320, 170, 31);

        btnCSE408.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE408.setText("CSE408");
        btnCSE408.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE408ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE408);
        btnCSE408.setBounds(165, 369, 170, 31);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Click here for class PPts and PDFs.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 500, 480, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-9, -7, 520, 650);


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

    private void btnINT404ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\INT404.pdf");
    }

    private void btnCSE306ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE306.pdf");
    }

    private void btnCSE316ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE316.pdf");
    }

    private void btnCSE310ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE310.pdf");
    }

    private void btnCSE408ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE408.pdf");
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
            java.util.logging.Logger.getLogger(MeSem4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeSem4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeSem4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeSem4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeSem4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCSE310;
    private javax.swing.JButton btnCSE316;
    private javax.swing.JButton btnCSE306;
    private javax.swing.JButton btnCSE408;
    private javax.swing.JButton btnINT404;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
}
