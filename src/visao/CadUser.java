package visao;

import dao.UsuarioDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class CadUser extends javax.swing.JFrame {

    private UsuarioDao usuarioDAO = new UsuarioDao();
    
    public CadUser() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_nome = new javax.swing.JTextField();
        jtf_login = new javax.swing.JTextField();
        jtf_senha = new javax.swing.JTextField();
        jtf_nivel = new javax.swing.JTextField();
        jl_nome = new javax.swing.JLabel();
        jl_login = new javax.swing.JLabel();
        jl_senha = new javax.swing.JLabel();
        jl_nivel = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        btn_cadastrar = new javax.swing.JButton();
        btn_cadastrar1 = new javax.swing.JButton();
        backUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de usuário");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_nome.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 440, 30));

        jtf_login.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 440, 30));

        jtf_senha.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 440, 30));

        jtf_nivel.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 440, 30));

        jl_nome.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_nome.setForeground(new java.awt.Color(255, 255, 255));
        jl_nome.setText("Nome:");
        getContentPane().add(jl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 80, 30));

        jl_login.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_login.setForeground(new java.awt.Color(255, 255, 255));
        jl_login.setText("Login:");
        getContentPane().add(jl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 80, 30));

        jl_senha.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_senha.setForeground(new java.awt.Color(255, 255, 255));
        jl_senha.setText("Senha:");
        getContentPane().add(jl_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 80, 30));

        jl_nivel.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_nivel.setForeground(new java.awt.Color(255, 255, 255));
        jl_nivel.setText("Nível:");
        getContentPane().add(jl_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 80, 30));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 200, -1));

        btn_cadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cadastrar.png"))); // NOI18N
        btn_cadastrar.setText("CADASTRAR");
        btn_cadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 110, 30));

        btn_cadastrar1.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastrar1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_cadastrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/anterior.png"))); // NOI18N
        btn_cadastrar1.setText("VOLTAR");
        btn_cadastrar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 110, 30));

        backUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo-user.jpg"))); // NOI18N
        getContentPane().add(backUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        
        String nome = jtf_nome.getText();
        String login = jtf_login.getText();
        String nivel = jtf_nivel.getText();
        String senha = jtf_senha.getText();
        
        if(nome.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o nome!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if(login.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o login!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if(senha.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a senha!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if(nivel.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o nivel!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Usuario usuario = new Usuario(nome, login, senha, nivel);
       
        try {
            usuarioDAO.insert(usuario);
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            
            jtf_nome.setText("");
            jtf_login.setText("");
            jtf_senha.setText("");
            jtf_nivel.setText("");
        
        } catch(SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar1ActionPerformed
       
        CadUser.this.dispose();
        
    }//GEN-LAST:event_btn_cadastrar1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backUser;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cadastrar1;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jl_login;
    private javax.swing.JLabel jl_nivel;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_senha;
    private javax.swing.JTextField jtf_login;
    private javax.swing.JTextField jtf_nivel;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTextField jtf_senha;
    // End of variables declaration//GEN-END:variables
}
