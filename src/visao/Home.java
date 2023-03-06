package visao;

import modelo.Usuario;

public class Home extends javax.swing.JFrame {
    
    private Usuario usuario;

    public Home(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        jl_nomeUsuario.setText(usuario.getNome());
        controleNivelAcesso();
    }
    
    public Home() {
        initComponents();
    }
    
    private void controleNivelAcesso() {
        if(usuario.getNivel().equals("gerente")) {
            this.jm_manutencao.setVisible(true);
            this.jm_operacoes.setVisible(true);
            this.jm_vendas.setVisible(true);
            this.jm_sobre.setVisible(true);  
        } 
        
        if(usuario.getNivel().equals("vendedor")) {
            this.jm_manutencao.setVisible(true);
            this.jmi_clientes.setVisible(true);
            this.jmi_carros.setVisible(false);
            this.jmi_compras.setVisible(false);
            this.jmi_distribuidora.setVisible(false);
            this.jmi_funcionarios.setVisible(false);
            this.jmi_usuario.setVisible(false);
            
            this.jm_operacoes.setVisible(false);
            this.jm_sobre.setVisible(true);
            this.jm_vendas.setVisible(true);
        }
        
        if(usuario.getNivel().equals("comprador")) {
            this.jm_manutencao.setVisible(true);
            this.jmi_clientes.setVisible(false);
            this.jmi_carros.setVisible(false);
            this.jmi_compras.setVisible(true);
            this.jmi_distribuidora.setVisible(true);
            this.jmi_funcionarios.setVisible(false);
            this.jmi_usuario.setVisible(false);
            
            this.jm_operacoes.setVisible(false);
            this.jm_sobre.setVisible(true);
            this.jm_vendas.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jl_bemvindo = new javax.swing.JLabel();
        jl_nomeUsuario = new javax.swing.JLabel();
        btn_anterior2 = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        backHome = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_manutencao = new javax.swing.JMenu();
        jmi_funcionarios = new javax.swing.JMenuItem();
        jmi_clientes = new javax.swing.JMenuItem();
        jmi_distribuidora = new javax.swing.JMenuItem();
        jmi_carros = new javax.swing.JMenuItem();
        jmi_compras = new javax.swing.JMenuItem();
        jmi_usuario = new javax.swing.JMenuItem();
        jm_operacoes = new javax.swing.JMenu();
        jmi_relatorio = new javax.swing.JMenuItem();
        jm_vendas = new javax.swing.JMenu();
        jmi_vendas = new javax.swing.JMenuItem();
        jm_sobre = new javax.swing.JMenu();
        jmi_sobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_bemvindo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jl_bemvindo.setForeground(new java.awt.Color(255, 255, 255));
        jl_bemvindo.setText("Bem vindo(a): ");
        getContentPane().add(jl_bemvindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, 180, -1));

        jl_nomeUsuario.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jl_nomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jl_nomeUsuario.setText(" ");
        getContentPane().add(jl_nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 790, 890, -1));

        btn_anterior2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btn_anterior2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/anterior.png"))); // NOI18N
        btn_anterior2.setText("Sair");
        btn_anterior2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_anterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anterior2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_anterior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 790, 90, 30));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/sobre.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        backHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(backHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 840));

        jMenuBar1.setBackground(new java.awt.Color(153, 0, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jm_manutencao.setText("Manutenção");
        jm_manutencao.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        jmi_funcionarios.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jmi_funcionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/funcionarioo.png"))); // NOI18N
        jmi_funcionarios.setText("Funcionarios");
        jmi_funcionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_funcionariosActionPerformed(evt);
            }
        });
        jm_manutencao.add(jmi_funcionarios);

        jmi_clientes.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jmi_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cliente.png"))); // NOI18N
        jmi_clientes.setText("Clientes");
        jmi_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_clientesActionPerformed(evt);
            }
        });
        jm_manutencao.add(jmi_clientes);

        jmi_distribuidora.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jmi_distribuidora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/distribuidor.png"))); // NOI18N
        jmi_distribuidora.setText("Distribuidora");
        jmi_distribuidora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_distribuidoraActionPerformed(evt);
            }
        });
        jm_manutencao.add(jmi_distribuidora);

        jmi_carros.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jmi_carros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/carro.png"))); // NOI18N
        jmi_carros.setText("Carros");
        jmi_carros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_carrosActionPerformed(evt);
            }
        });
        jm_manutencao.add(jmi_carros);

        jmi_compras.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jmi_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/compra.png"))); // NOI18N
        jmi_compras.setText("Compras");
        jmi_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_comprasActionPerformed(evt);
            }
        });
        jm_manutencao.add(jmi_compras);

        jmi_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/user.png"))); // NOI18N
        jmi_usuario.setText("Usuário");
        jmi_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_usuarioActionPerformed(evt);
            }
        });
        jm_manutencao.add(jmi_usuario);

        jMenuBar1.add(jm_manutencao);

        jm_operacoes.setText("Operações");
        jm_operacoes.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        jmi_relatorio.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jmi_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/relatorioo.png"))); // NOI18N
        jmi_relatorio.setText("Relatório");
        jmi_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_relatorioActionPerformed(evt);
            }
        });
        jm_operacoes.add(jmi_relatorio);

        jMenuBar1.add(jm_operacoes);

        jm_vendas.setText("Vendas");
        jm_vendas.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        jmi_vendas.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jmi_vendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/venda.png"))); // NOI18N
        jmi_vendas.setText("Vendas");
        jmi_vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_vendasActionPerformed(evt);
            }
        });
        jm_vendas.add(jmi_vendas);

        jMenuBar1.add(jm_vendas);

        jm_sobre.setText("Sobre");
        jm_sobre.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        jmi_sobre.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jmi_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/sobree.png"))); // NOI18N
        jmi_sobre.setText("Sobre");
        jmi_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_sobreActionPerformed(evt);
            }
        });
        jm_sobre.add(jmi_sobre);

        jMenuBar1.add(jm_sobre);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void jmi_distribuidoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_distribuidoraActionPerformed
       
        CadDistribuidora distr = new CadDistribuidora();
        distr.setVisible(true);
        
    }//GEN-LAST:event_jmi_distribuidoraActionPerformed

    private void jmi_funcionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_funcionariosActionPerformed
        
        CadFuncionario func = new CadFuncionario();
        func.setVisible(true);
        
    }//GEN-LAST:event_jmi_funcionariosActionPerformed

    private void jmi_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_clientesActionPerformed
        
        CadCliente cnt = new CadCliente();
        cnt.setVisible(true);
        
    }//GEN-LAST:event_jmi_clientesActionPerformed

    private void jmi_carrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_carrosActionPerformed
        
        CadCarros car = new CadCarros();
        car.setVisible(true);
        
    }//GEN-LAST:event_jmi_carrosActionPerformed

    private void jmi_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_comprasActionPerformed
        
        CadCompras com = new CadCompras();
        com.setVisible(true);
        
    }//GEN-LAST:event_jmi_comprasActionPerformed

    private void jmi_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_relatorioActionPerformed
        
        Relatorio rel = new Relatorio();
        rel.setVisible(true);
        
    }//GEN-LAST:event_jmi_relatorioActionPerformed

    private void jmi_vendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_vendasActionPerformed
        
        CadVendas venda = new CadVendas();
        venda.setVisible(true);
        
    }//GEN-LAST:event_jmi_vendasActionPerformed

    private void jmi_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_sobreActionPerformed
        
        Sobre sob = new Sobre();
        sob.setVisible(true);
        
    }//GEN-LAST:event_jmi_sobreActionPerformed

    private void jmi_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_usuarioActionPerformed

        CadUser user = new CadUser();
        user.setVisible(true);
        
    }//GEN-LAST:event_jmi_usuarioActionPerformed

    private void btn_anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior2ActionPerformed

        Home.this.dispose();

    }//GEN-LAST:event_btn_anterior2ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backHome;
    private javax.swing.JButton btn_anterior2;
    private javax.swing.JLabel icon;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jl_bemvindo;
    private javax.swing.JLabel jl_nomeUsuario;
    private javax.swing.JMenu jm_manutencao;
    private javax.swing.JMenu jm_operacoes;
    private javax.swing.JMenu jm_sobre;
    private javax.swing.JMenu jm_vendas;
    private javax.swing.JMenuItem jmi_carros;
    private javax.swing.JMenuItem jmi_clientes;
    private javax.swing.JMenuItem jmi_compras;
    private javax.swing.JMenuItem jmi_distribuidora;
    private javax.swing.JMenuItem jmi_funcionarios;
    private javax.swing.JMenuItem jmi_relatorio;
    private javax.swing.JMenuItem jmi_sobre;
    private javax.swing.JMenuItem jmi_usuario;
    private javax.swing.JMenuItem jmi_vendas;
    // End of variables declaration//GEN-END:variables
}
