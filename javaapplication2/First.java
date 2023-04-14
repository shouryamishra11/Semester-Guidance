package javaapplication2;

import javaapplication2.Cse.CSE;
import javaapplication2.Me.ME;


public class First extends javax.swing.JFrame {

    public First() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCSE = new javax.swing.JButton();
        btnME = new javax.swing.JButton();
        btnPlacement = new javax.swing.JButton();
        btnFaculty = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();


        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36));
        jLabel1.setText("Choose Your Branch");
        getContentPane().add
                (jLabel1);
        jLabel1.setBounds(10, 70, 360, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 36));
        jLabel2.setText("Other Services");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 328, 314, 48);

        btnCSE.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnCSE.setText("B.Tech CSE");
        btnCSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSEActionPerformed(evt);
            }
        });
        getContentPane().add(btnCSE);
        btnCSE.setBounds(96, 152, 252, 32);

        btnME.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnME.setText("B.Tech ME");
        btnME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMEActionPerformed(evt);
            }
        });
        getContentPane().add(btnME);
        btnME.setBounds(96, 231, 252, 32);

        btnPlacement.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnPlacement.setText("Placement Services");
        btnPlacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacementActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlacement);
        btnPlacement.setBounds(96, 407, 252, 32);

        btnFaculty.setFont(new java.awt.Font("Segoe UI", 1, 18));
        btnFaculty.setText("Faculty Contacts");
        btnFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacultyActionPerformed(evt);
            }
        });
        getContentPane().add(btnFaculty);
        btnFaculty.setBounds(96, 485, 252, 32);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(408, 68, 37, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg")));
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-1, -4, 500, 630);


    }

    private void btnCSEActionPerformed(java.awt.event.ActionEvent evt) {
        new CSE().setVisible(true);

    }

    private void btnMEActionPerformed(java.awt.event.ActionEvent evt) {
        new ME().setVisible(true);
    }

    private void btnPlacementActionPerformed(java.awt.event.ActionEvent evt) {
        new PlacementServices().setVisible(true);
    }

    private void btnFacultyActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCSE;
    private javax.swing.JButton btnFaculty;
    private javax.swing.JButton btnME;
    private javax.swing.JButton btnPlacement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;

}
