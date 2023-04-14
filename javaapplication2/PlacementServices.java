package javaapplication2;


import java.awt.*;
import java.net.URI;
public class PlacementServices extends javax.swing.JFrame {

    public PlacementServices() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTPC = new javax.swing.JButton();
        btnCampus = new javax.swing.JButton();
        btnStudyMat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel1.setText("Placement Services");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 36, 541, 68);

        btnTPC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTPC.setText("TPC");
        btnTPC.setPreferredSize(new java.awt.Dimension(125, 35));
        btnTPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTPCActionPerformed(evt);
            }
        });
        getContentPane().add(btnTPC);
        btnTPC.setBounds(130, 210, 260, 35);

        btnCampus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCampus.setText("On Campus Companies");
        btnCampus.setPreferredSize(new java.awt.Dimension(125, 35));
        btnCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampusActionPerformed(evt);
            }
        });
        getContentPane().add(btnCampus);
        btnCampus.setBounds(130, 300, 260, 40);

        btnStudyMat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnStudyMat.setText("Study Material");
        btnStudyMat.setPreferredSize(new java.awt.Dimension(125, 35));
        btnStudyMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudyMatActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudyMat);
        btnStudyMat.setBounds(130, 390, 260, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Students can mail us at");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 550, 215, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("'rahulnb003@gmail.com' if they would like us to add some other materials or company details");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 570, 490, 31);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-19, -7, 640, 650);


    }

    private void btnCampusActionPerformed(java.awt.event.ActionEvent evt) {
        Desktop browser=Desktop.getDesktop();
        try{
            browser.browse(new URI("https://ums.lpu.in/Placements/frmPlacementDriveRegistration.aspx"));
        }
        catch (Exception e)
        {
            System.out.println("Error in opening site");
        }
    }

    private void btnTPCActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnStudyMatActionPerformed(java.awt.event.ActionEvent evt) {
        Desktop browser=Desktop.getDesktop();
        try{
            browser.browse(new URI("https://docs.google.com/spreadsheets/d/1H07_-t5GtEKn-AwTTguoPR-AA4ZdG8qIyDeRX0DvaJo/edit?usp=sharing"));
        }
        catch (Exception e)
        {
            System.out.println("Error in opening site");
        }
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
            java.util.logging.Logger.getLogger(PlacementServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlacementServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlacementServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlacementServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlacementServices().setVisible(true);
            }
        });
    }


    private javax.swing.JButton btnCampus;
    private javax.swing.JButton btnStudyMat;
    private javax.swing.JButton btnTPC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;

}
