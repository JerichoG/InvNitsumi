package UI;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksi;

public class Login extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    
    public Login() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Logo.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AtasPanel = new javax.swing.JPanel();
        NamaToko = new javax.swing.JLabel();
        BawahPanel = new javax.swing.JPanel();
        Pass = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        ButtonLogin = new javax.swing.JButton();
        User = new javax.swing.JLabel();
        PasswordText = new javax.swing.JPasswordField();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AtasPanel.setBackground(new java.awt.Color(255, 153, 51));

        NamaToko.setFont(new java.awt.Font("Rockwell Condensed", 1, 48)); // NOI18N
        NamaToko.setForeground(new java.awt.Color(255, 255, 255));
        NamaToko.setText("I N V E N T O R Y  N I T S U M I");

        javax.swing.GroupLayout AtasPanelLayout = new javax.swing.GroupLayout(AtasPanel);
        AtasPanel.setLayout(AtasPanelLayout);
        AtasPanelLayout.setHorizontalGroup(
            AtasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AtasPanelLayout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(NamaToko)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        AtasPanelLayout.setVerticalGroup(
            AtasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AtasPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(NamaToko)
                .addGap(20, 20, 20))
        );

        BawahPanel.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout BawahPanelLayout = new javax.swing.GroupLayout(BawahPanel);
        BawahPanel.setLayout(BawahPanelLayout);
        BawahPanelLayout.setHorizontalGroup(
            BawahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BawahPanelLayout.setVerticalGroup(
            BawahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        Pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 153, 51));
        Pass.setText("Password");

        UsernameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextActionPerformed(evt);
            }
        });
        UsernameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameTextKeyPressed(evt);
            }
        });

        ButtonLogin.setBackground(new java.awt.Color(255, 153, 51));
        ButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLogin.setText("Masuk");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        User.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        User.setForeground(new java.awt.Color(255, 153, 51));
        User.setText("Username");

        PasswordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordTextKeyPressed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICON/LOGO150.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AtasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BawahPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(User)
                            .addComponent(Pass))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UsernameText)
                                .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(484, 484, 484))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Logo)
                        .addGap(575, 575, 575))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(AtasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(Logo)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(User)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pass))))
                .addGap(78, 78, 78)
                .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(BawahPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextActionPerformed
    
    private String encryptPassword(String input){
        String encPass=null;
        if(input==null) return null;
        
        try{
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(input.getBytes(),0,input.length());
            encPass=new BigInteger(1,digest.digest()).toString(16);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return encPass;
    }
    
    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
       String level =""; 
        try {
            UsernameText.requestFocus();
            java.sql.Statement stat = conn.createStatement();
            ResultSet result=stat.executeQuery ("select * from user where "
                + "Username='" +UsernameText.getText()+"'");
            String p = PasswordText.getText();
            String password=encryptPassword(p);
            if (result.next()) {
                if (password.equals(result.getString("password"))){
                    //new menuUtama().show();
                    JOptionPane.showMessageDialog(rootPane, "Selamat Datang  "+UsernameText.getText());
                    Dashboard mn = new Dashboard();
                    mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    mn.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane,"Password Salah");
                    PasswordText.setText("");
                    UsernameText.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "User Tidak Ditemukan");
                UsernameText.setText("");
                PasswordText.setText("");
                UsernameText.requestFocus();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void UsernameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameTextKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PasswordText.requestFocus();
        }
    }//GEN-LAST:event_UsernameTextKeyPressed

    private void PasswordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTextKeyPressed
         if (evt.getKeyCode()== KeyEvent.VK_ENTER) {
            ButtonLoginActionPerformed(new ActionEvent(evt.getSource(), evt.getID(), "Key Press Login"));
        }
    }//GEN-LAST:event_PasswordTextKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AtasPanel;
    private javax.swing.JPanel BawahPanel;
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NamaToko;
    private javax.swing.JLabel Pass;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JLabel User;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
