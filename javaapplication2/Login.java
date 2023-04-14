
package javaapplication2;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }


    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPasswd = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);
        setSize(500,630);
        setLocationRelativeTo(null);

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsername.setText("Username");
        getContentPane().add(lblUsername);
        lblUsername.setBounds(88, 68, 130, 35);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setText("Password");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(88, 144, 130, 35);


        getContentPane().add(txtUser);
        txtUser.setBounds(283, 68, 157, 35);


        getContentPane().add(txtPasswd);
        txtPasswd.setBounds(283, 144, 157, 35);

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(70, 460, 95, 30);

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(280, 460, 101, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/AppBGW.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-85, -119, 610, 770);

    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String reg=txtUser.getText();
        String pass=txtPasswd.getText();

        try{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/semlogin","root","9874");

            Statement stmt=con.createStatement();
            ResultSet rst=stmt.executeQuery("select * from login");
            while(rst.next()){

                String a=rst.getString(1);
                String b=rst.getString(2);
                String c=rst.getString(3);


                if(b.equals(reg) && c.equals(pass) )
                {
                    new First().setVisible(true);
                    return;
                }

            }
            JOptionPane.showMessageDialog(this,"Invalid User");

        }
        catch(Exception e){

        }

    }

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
        txtUser.setText("");
        txtPasswd.setText("");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPasswd;
    private javax.swing.JTextField txtUser;

}
