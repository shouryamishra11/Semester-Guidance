
package javaapplication2.Cse;


import javax.swing.*;
import java.awt.*;
import java.io.File;

public class CseSem2 extends javax.swing.JFrame {


    public CseSem2() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCSE202 = new javax.swing.JButton();
        btnCSE326 = new javax.swing.JButton();
        btnECE216 = new javax.swing.JButton();
        btnECE213 = new javax.swing.JButton();
        btnMEC103 = new javax.swing.JButton();
        btnMTH166 = new javax.swing.JButton();
        btnPEL121 = new javax.swing.JButton();
        btnPHY109 = new javax.swing.JButton();
        btnPHY119 = new javax.swing.JButton();
        btnCLICK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Subjects");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 37, 464, 73);

        btnCSE202.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE202.setText("CSE202");
        btnCSE202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE202ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE202);
        btnCSE202.setBounds(188, 128, 171, 31);

        btnCSE326.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCSE326.setText("CSE326");
        btnCSE326.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSE326ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE326);
        btnCSE326.setBounds(187, 169, 172, 31);

        btnECE216.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnECE216.setText("ECE216");
        btnECE216.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnECE216ActionPerformed(evt);
            }
        });
        getContentPane().add(btnECE216);
        btnECE216.setBounds(186, 210, 173, 31);

        btnECE213.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnECE213.setText("ECE213");
        btnECE213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnECE213ActionPerformed(evt);
            }
        });
        getContentPane().add(btnECE213);
        btnECE213.setBounds(186, 251, 173, 31);

        btnMEC103.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMEC103.setText("MEC103");
        btnMEC103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMEC103ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMEC103);
        btnMEC103.setBounds(186, 292, 173, 31);

        btnMTH166.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMTH166.setText("MTH166");
        btnMTH166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMTH166ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMTH166);
        btnMTH166.setBounds(186, 333, 173, 31);

        btnPEL121.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPEL121.setText("PEL121");
        btnPEL121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPEL121ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPEL121);
        btnPEL121.setBounds(186, 374, 173, 31);

        btnPHY109.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPHY109.setText("PHY109");
        btnPHY109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPHY109ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPHY109);
        btnPHY109.setBounds(186, 415, 175, 31);

        btnPHY119.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPHY119.setText("PHY119");
        btnPHY119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPHY119ActionPerformed(evt);
            }
        });
        getContentPane().add(btnPHY119);
        btnPHY119.setBounds(186, 456, 175, 31);

        btnCLICK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCLICK.setForeground(new java.awt.Color(0, 0, 153));
        btnCLICK.setText("Click here for class PPts and PDFs");
        btnCLICK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLICKActionPerformed(evt);
            }
        });
        getContentPane().add(btnCLICK);
        btnCLICK.setBounds(10, 531, 480, 35);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-17, -11, 560, 710);


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

    private void btnCLICKActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnPHY119ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\PHY119.pdf");
    }

    private void btnPHY109ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\PHY109.pdf");
    }

    private void btnPEL121ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\PEL121.pdf");
    }

    private void btnMTH166ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\MTH166.pdf");
    }

    private void btnMEC103ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\MEC103.pdf");
    }

    private void btnECE213ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\ECE213.pdf");
    }

    private void btnECE216ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\ECE216.pdf");
    }

    private void btnCSE326ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE326.pdf");
    }

    private void btnCSE202ActionPerformed(java.awt.event.ActionEvent evt) {
        pdf("E:\\\\PDF\\\\CSE202.pdf");
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
            java.util.logging.Logger.getLogger(CseSem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CseSem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CseSem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CseSem2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CseSem2().setVisible(true);
            }
        });
    }


    private javax.swing.JButton btnCLICK;
    private javax.swing.JButton btnCSE202;
    private javax.swing.JButton btnCSE326;
    private javax.swing.JButton btnECE213;
    private javax.swing.JButton btnECE216;
    private javax.swing.JButton btnMEC103;
    private javax.swing.JButton btnMTH166;
    private javax.swing.JButton btnPEL121;
    private javax.swing.JButton btnPHY109;
    private javax.swing.JButton btnPHY119;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

}
