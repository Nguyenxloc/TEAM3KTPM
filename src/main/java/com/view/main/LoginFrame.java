/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view.main;

import java.io.File;

/**
 *
 * @author 84374
 */
public class LoginFrame extends javax.swing.JFrame {

    private String user = "locnpph29878";
    private String passWord = "123456";
    private int vaiTro = 2;
    private String dir = null;

    ////// query sql -- get vaiTro
    //select *from taikhoan
    // if vaiTro=1--->sv--->form sv
    // if vaiTro=2--->gv--->form gv
    // if vaiTro=3--->cb--->form cb
    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        String path = "src\\main\\java\\com\\view\\icon\\";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        dir = absolutePath;
        
        
        initComponents();
        setLocationRelativeTo(null);
        kButton1.setkBorderRadius(30);
    }

    public void verify(String userPara, String passWordPara) {
        if (userPara.equalsIgnoreCase(user) && passWordPara.equalsIgnoreCase(passWord)) {
            vaiTro = 1;/// ////// query sql --   //select vaiTro from taikhoan where user=userPara this.passWord= passWordPara
            if (vaiTro == 1) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new MainOfSV().setVisible(true);
                    }
                });
            } else if (vaiTro == 2) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new MainOfGV().setVisible(true);
                    }
                });
            } else {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new MainOfCB().setVisible(true);
                    }
                });
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setAlignmentX(1.0F);
        kGradientPanel1.setAlignmentY(1.0F);
        kGradientPanel1.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setkGradientFocus(150);
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 255, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN FORM");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("password");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("username");

        kButton1.setBackground(new java.awt.Color(255, 255, 255));
        kButton1.setBorder(null);
        kButton1.setText("Login");
        kButton1.setAlignmentX(1.0F);
        kButton1.setAlignmentY(1.0F);
        kButton1.setDisplayedMnemonicIndex(1);
        kButton1.setIconTextGap(6);
        kButton1.setkBackGroundColor(new java.awt.Color(255, 51, 204));
        kButton1.setkBorderRadius(30);
        kButton1.setkEndColor(new java.awt.Color(102, 102, 255));
        kButton1.setkHoverColor(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(102, 255, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 153, 255));
        kButton1.setkIndicatorThickness(7);
        kButton1.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(255, 102, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setIcon(new javax.swing.ImageIcon(dir+"\\baomat2.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addComponent(kButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 410, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(dir+"\\baomat1.png"));
        System.out.println("Test link: "+dir+"\\baomat1.png");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 520, 340));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html>\nNEVER STOP LEARNING\n<br>\nBECAUSE LIFE NEVER STOPS TEACHING\n");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 500, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        verify(user, passWord);
        this.dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
