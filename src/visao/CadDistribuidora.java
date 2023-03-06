package visao;

import dao.DistribuidoraDao;
import modelo.Distribuidora;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadDistribuidora extends javax.swing.JFrame {
    
    private DistribuidoraDao distDao = new DistribuidoraDao();
    private List<Distribuidora> dists;
    private Distribuidora distSelect;

    public CadDistribuidora() {
        initComponents();
        atualizarTabela();
        atualizarBotoes(true);
        habilitarForm(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        jl_empresaD = new javax.swing.JLabel();
        jl_cnpjD = new javax.swing.JLabel();
        jl_enderecoD = new javax.swing.JLabel();
        jl_cidadeD = new javax.swing.JLabel();
        jl_estadoD = new javax.swing.JLabel();
        jl_telefoneD = new javax.swing.JLabel();
        jl_emailD = new javax.swing.JLabel();
        jl_responsavelD = new javax.swing.JLabel();
        jl_pesquisaD = new javax.swing.JLabel();
        jtf_empresaD = new javax.swing.JTextField();
        jtf_cnpjD = new javax.swing.JTextField();
        jtf_responsavelD = new javax.swing.JTextField();
        jtf_cidadeD = new javax.swing.JTextField();
        jtf_estadoD = new javax.swing.JTextField();
        jtf_telefoneD = new javax.swing.JTextField();
        jtf_emailD = new javax.swing.JTextField();
        jtf_enderecoD = new javax.swing.JTextField();
        jtf_pesquisaD = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_anterior2 = new javax.swing.JButton();
        distribuidoras = new javax.swing.JScrollPane();
        tabela_distribuidoras = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        backFuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadstro de distribuidora");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        jl_empresaD.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_empresaD.setForeground(new java.awt.Color(255, 255, 255));
        jl_empresaD.setText("Empresa:");
        getContentPane().add(jl_empresaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 30));

        jl_cnpjD.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_cnpjD.setForeground(new java.awt.Color(255, 255, 255));
        jl_cnpjD.setText("CNPJ:");
        getContentPane().add(jl_cnpjD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 160, 30));

        jl_enderecoD.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_enderecoD.setForeground(new java.awt.Color(255, 255, 255));
        jl_enderecoD.setText("Endereço:");
        getContentPane().add(jl_enderecoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 160, 30));

        jl_cidadeD.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_cidadeD.setForeground(new java.awt.Color(255, 255, 255));
        jl_cidadeD.setText("Cidade:");
        getContentPane().add(jl_cidadeD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 160, 30));

        jl_estadoD.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_estadoD.setForeground(new java.awt.Color(255, 255, 255));
        jl_estadoD.setText("Estado:");
        getContentPane().add(jl_estadoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 160, 30));

        jl_telefoneD.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_telefoneD.setForeground(new java.awt.Color(255, 255, 255));
        jl_telefoneD.setText("Telefone:");
        getContentPane().add(jl_telefoneD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 160, 30));

        jl_emailD.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_emailD.setForeground(new java.awt.Color(255, 255, 255));
        jl_emailD.setText("E-mail:");
        getContentPane().add(jl_emailD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 160, 30));

        jl_responsavelD.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_responsavelD.setForeground(new java.awt.Color(255, 255, 255));
        jl_responsavelD.setText("Responsável:");
        getContentPane().add(jl_responsavelD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, 30));

        jl_pesquisaD.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_pesquisaD.setForeground(new java.awt.Color(255, 255, 255));
        jl_pesquisaD.setText("Pesquisa:");
        getContentPane().add(jl_pesquisaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 160, 30));

        jtf_empresaD.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_empresaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 440, 30));
        getContentPane().add(jtf_cnpjD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 440, 30));

        jtf_responsavelD.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_responsavelD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 440, 30));

        jtf_cidadeD.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_cidadeD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 440, 30));

        jtf_estadoD.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_estadoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 440, 30));
        getContentPane().add(jtf_telefoneD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 440, 30));

        jtf_emailD.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_emailD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 440, 30));

        jtf_enderecoD.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_enderecoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 440, 30));

        jtf_pesquisaD.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_pesquisaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 440, 30));

        btn_pesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btn_pesquisar.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/pesquisar.png"))); // NOI18N
        btn_pesquisar.setText("PESQUISAR");
        btn_pesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 110, 30));

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
        getContentPane().add(btn_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, 110, 30));

        btn_excluir.setBackground(new java.awt.Color(255, 255, 255));
        btn_excluir.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/excluir.png"))); // NOI18N
        btn_excluir.setText("EXCLUIR");
        btn_excluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 810, 110, 30));

        btn_alterar.setBackground(new java.awt.Color(255, 255, 255));
        btn_alterar.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/editar.png"))); // NOI18N
        btn_alterar.setText("ALTERAR");
        btn_alterar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 810, 110, 30));

        btn_salvar.setBackground(new java.awt.Color(255, 255, 255));
        btn_salvar.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/salvar.png"))); // NOI18N
        btn_salvar.setText("SALVAR");
        btn_salvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 810, 110, 30));

        btn_cancelar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cancelar.png"))); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 810, 110, 30));

        btn_anterior2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btn_anterior2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/anterior.png"))); // NOI18N
        btn_anterior2.setText("Voltar");
        btn_anterior2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_anterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anterior2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_anterior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 90, 30));

        tabela_distribuidoras.setBackground(new java.awt.Color(204, 204, 255));
        tabela_distribuidoras.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tabela_distribuidoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Empresa", "CNPJ", "Resposável", "Endereço", "Cidade", "Estado", "Telefone", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela_distribuidoras.setGridColor(new java.awt.Color(0, 0, 0));
        tabela_distribuidoras.setSelectionForeground(new java.awt.Color(204, 153, 255));
        distribuidoras.setViewportView(tabela_distribuidoras);

        getContentPane().add(distribuidoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1180, 280));

        titulo.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CADASTRO DE DISTRIBUIDORA");
        titulo.setToolTipText("");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 70));

        backFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(backFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btn_anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior2ActionPerformed

        CadDistribuidora.this.dispose();
        
    }//GEN-LAST:event_btn_anterior2ActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        
        atualizarBotoes(false);
        habilitarForm(true);
        jtf_empresaD.requestFocus();
        distSelect = null;
        
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        
        atualizarTabela();
        
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        distSelect = null;
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        
        int linha = tabela_distribuidoras.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        distSelect = dists.get(linha);
        
        try {
            distDao.remover(distSelect.getCodigo());
            JOptionPane.showMessageDialog(null, "Cadastro removido!");
            atualizarTabela();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        
        int linha = tabela_distribuidoras.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        atualizarBotoes(false);
        habilitarForm(true);
        distSelect = dists.get(linha);
        
        jtf_empresaD.setText(distSelect.getEmpresa());
        jtf_cnpjD.setText(distSelect.getCnpj());
        jtf_responsavelD.setText(distSelect.getResponsavel());
        jtf_enderecoD.setText(distSelect.getEndereco());
        jtf_cidadeD.setText(distSelect.getCidade());
        jtf_estadoD.setText(distSelect.getEstado());
        jtf_telefoneD.setText(distSelect.getTelefone());
        jtf_emailD.setText(distSelect.getEmail());
        
        atualizarTabela();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        
        String empresa = jtf_empresaD.getText();
        String cnpj = jtf_cnpjD.getText();
        String responsavel = jtf_responsavelD.getText();
        String endereco = jtf_enderecoD.getText();
        String cidade = jtf_cidadeD.getText();
        String estado = jtf_estadoD.getText();
        String telefone = jtf_telefoneD.getText();
        String email = jtf_emailD.getText();
        
        if (empresa.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a empresa!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cnpj.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o CNPJ!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (responsavel.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o responsável!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (endereco.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o endereço!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (cidade.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a cidade!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (estado.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o estado!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (telefone.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o telefone!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (email.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o e-mail!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (distSelect == null) {
            Distribuidora dist = new Distribuidora(empresa, cnpj, responsavel, endereco, cidade, estado, telefone, email);

            try {
                distDao.adicionar(dist);
                JOptionPane.showMessageDialog(null, "Distribuidora cadastrado!");
                
                jtf_empresaD.setText("");
                jtf_cnpjD.setText("");
                jtf_responsavelD.setText("");
                jtf_enderecoD.setText("");
                jtf_cidadeD.setText("");
                jtf_estadoD.setText("");
                jtf_telefoneD.setText("");
                jtf_emailD.setText("");

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no bando de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        
        } else {
            distSelect.setEmpresa(empresa);
            distSelect.setCnpj(cnpj);
            distSelect.setResponsavel(responsavel);
            distSelect.setEndereco(endereco);
            distSelect.setCidade(cidade);
            distSelect.setEstado(estado);
            distSelect.setTelefone(telefone);
            distSelect.setEmail(email);

            try {
                distDao.alterar(distSelect);
                JOptionPane.showMessageDialog(null, "Cadastro alterado!");
                atualizarTabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        distSelect = null;
        atualizarTabela();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void habilitarForm(boolean status) {
        jtf_empresaD.setEnabled(status);
        jtf_cnpjD.setEnabled(status);
        jtf_responsavelD.setEnabled(status);
        jtf_enderecoD.setEnabled(status);
        jtf_cidadeD.setEnabled(status);
        jtf_estadoD.setEnabled(status);
        jtf_telefoneD.setEnabled(status);
        jtf_emailD.setEnabled(status);
    }
    
    private void atualizarBotoes(boolean status) {
        btn_cadastrar.setEnabled(status);
        btn_excluir.setEnabled(status);
        btn_alterar.setEnabled(status);
        btn_pesquisar.setEnabled(status);
        btn_cancelar.setEnabled(!status);
        btn_salvar.setEnabled(!status);
    }

    private void atualizarTabela() {
        try {
            dists = distDao.buscarNome(jtf_pesquisaD.getText());
            
            DefaultTableModel model = (DefaultTableModel) tabela_distribuidoras.getModel();
            model.setNumRows(0);
            
            for (int i = 0; i < dists.size(); i++) {
                Distribuidora dist = dists.get(i);
                model.addRow(new Object[] {
                    dist.getEmpresa(),
                    dist.getCnpj(),
                    dist.getResponsavel(),
                    dist.getEndereco(),
                    dist.getCidade(),
                    dist.getEstado(),
                    dist.getTelefone(),
                    dist.getEmail(),
                });
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backFuncionario;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior2;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JScrollPane distribuidoras;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jl_cidadeD;
    private javax.swing.JLabel jl_cnpjD;
    private javax.swing.JLabel jl_emailD;
    private javax.swing.JLabel jl_empresaD;
    private javax.swing.JLabel jl_enderecoD;
    private javax.swing.JLabel jl_estadoD;
    private javax.swing.JLabel jl_pesquisaD;
    private javax.swing.JLabel jl_responsavelD;
    private javax.swing.JLabel jl_telefoneD;
    private javax.swing.JTextField jtf_cidadeD;
    private javax.swing.JTextField jtf_cnpjD;
    private javax.swing.JTextField jtf_emailD;
    private javax.swing.JTextField jtf_empresaD;
    private javax.swing.JTextField jtf_enderecoD;
    private javax.swing.JTextField jtf_estadoD;
    private javax.swing.JTextField jtf_pesquisaD;
    private javax.swing.JTextField jtf_responsavelD;
    private javax.swing.JTextField jtf_telefoneD;
    private javax.swing.JTable tabela_distribuidoras;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
