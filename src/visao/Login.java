package visao;

import dao.UsuarioDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 * @author Gustavo Matheus Pauvels
 */

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_login = new javax.swing.JTextField();
        jtf_senha = new javax.swing.JPasswordField();
        jl_usuario = new javax.swing.JLabel();
        jl_senha = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_cadastro = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jl_semCadastro = new javax.swing.JLabel();
        backLogin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jtf_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, 30));
        getContentPane().add(jtf_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, 30));

        jl_usuario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jl_usuario.setText("Login:");
        getContentPane().add(jl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 50, 30));

        jl_senha.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jl_senha.setForeground(new java.awt.Color(255, 255, 255));
        jl_senha.setText("Senha:");
        getContentPane().add(jl_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 50, 30));

        btn_login.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/login.png"))); // NOI18N
        btn_login.setText("Login");
        btn_login.setBorder(null);
        btn_login.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 60, 20));

        btn_cadastro.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        btn_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/login.png"))); // NOI18N
        btn_cadastro.setText("Cadastrar");
        btn_cadastro.setBorder(null);
        btn_cadastro.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 80, 20));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icon.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jl_semCadastro.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jl_semCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jl_semCadastro.setText("Caso não tenha cadastro, clique aqui: ");
        getContentPane().add(jl_semCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 260, 30));

        backLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Login.jpg"))); // NOI18N
        getContentPane().add(backLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_loginActionPerformed

    private void btn_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroActionPerformed
        
        CadUser user = new CadUser();
        user.setVisible(true);
        
    }//GEN-LAST:event_btn_cadastroActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        
        String login = jtf_login.getText();
        String senha = String.valueOf(jtf_senha.getPassword());
        
        if (login.length() > 0 && senha.length() > 0) {
            UsuarioDao usuarioDao = new UsuarioDao();
            
            try {
                Usuario usuario = usuarioDao.login(login, senha);

                if (usuario == null) {
                    JOptionPane.showMessageDialog(null, "Login ou Senha incorretos!", "ERRO", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                Home home = new Home(usuario);
                home.setVisible(true);
                this.dispose();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao realizar consulta ao banco", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

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
                if ("Windows".equals(info.getName())) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLogin;
    private javax.swing.JButton btn_cadastro;
    private javax.swing.JButton btn_login;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jl_semCadastro;
    private javax.swing.JLabel jl_senha;
    private javax.swing.JLabel jl_usuario;
    private javax.swing.JTextField jtf_login;
    private javax.swing.JPasswordField jtf_senha;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
