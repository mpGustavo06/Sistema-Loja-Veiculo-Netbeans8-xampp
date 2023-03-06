package visao;

import dao.ClienteDao;
import modelo.Cliente;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadCliente extends javax.swing.JFrame {

    private ClienteDao clienteDao = new ClienteDao();
    private List<Cliente> clientes;
    private Cliente clienteSelect;

    public CadCliente() {
        initComponents();
        atualizarTabela();
        atualizarBotoes(true);
        habilitarForm(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        jl_nomeC = new javax.swing.JLabel();
        jl_cpfC = new javax.swing.JLabel();
        jl_enderecoC = new javax.swing.JLabel();
        jl_cidadeC = new javax.swing.JLabel();
        jl_estadoC = new javax.swing.JLabel();
        jl_telefoneC = new javax.swing.JLabel();
        jl_emailC = new javax.swing.JLabel();
        jl_generoC = new javax.swing.JLabel();
        jl_dataNascC = new javax.swing.JLabel();
        jl_pesquisaC = new javax.swing.JLabel();
        jtf_nomeC = new javax.swing.JTextField();
        jtf_cpfC = new javax.swing.JTextField();
        jtf_genero = new javax.swing.JTextField();
        jtf_dataNascC = new javax.swing.JTextField();
        jtf_enderecoC = new javax.swing.JTextField();
        jtf_cidadeC = new javax.swing.JTextField();
        jtf_estadoC = new javax.swing.JTextField();
        jtf_telefoneC = new javax.swing.JTextField();
        jtf_emailC = new javax.swing.JTextField();
        jtf_pesquisaC = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_anterior2 = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tabela_clientes = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        backCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadstro de cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        jl_nomeC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_nomeC.setForeground(new java.awt.Color(255, 255, 255));
        jl_nomeC.setText("Nome:");
        getContentPane().add(jl_nomeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 30));

        jl_cpfC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_cpfC.setForeground(new java.awt.Color(255, 255, 255));
        jl_cpfC.setText("CPF:");
        getContentPane().add(jl_cpfC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 160, 30));

        jl_enderecoC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_enderecoC.setForeground(new java.awt.Color(255, 255, 255));
        jl_enderecoC.setText("Endereço:");
        getContentPane().add(jl_enderecoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 160, 30));

        jl_cidadeC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_cidadeC.setForeground(new java.awt.Color(255, 255, 255));
        jl_cidadeC.setText("Cidade:");
        getContentPane().add(jl_cidadeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 160, 30));

        jl_estadoC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_estadoC.setForeground(new java.awt.Color(255, 255, 255));
        jl_estadoC.setText("Estado:");
        getContentPane().add(jl_estadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 160, 30));

        jl_telefoneC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_telefoneC.setForeground(new java.awt.Color(255, 255, 255));
        jl_telefoneC.setText("Telefone:");
        getContentPane().add(jl_telefoneC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 160, 30));

        jl_emailC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_emailC.setForeground(new java.awt.Color(255, 255, 255));
        jl_emailC.setText("E-mail:");
        getContentPane().add(jl_emailC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 160, 30));

        jl_generoC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_generoC.setForeground(new java.awt.Color(255, 255, 255));
        jl_generoC.setText("Gênero:");
        getContentPane().add(jl_generoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, 30));

        jl_dataNascC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_dataNascC.setForeground(new java.awt.Color(255, 255, 255));
        jl_dataNascC.setText("Data de nascimento:");
        getContentPane().add(jl_dataNascC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 160, 30));

        jl_pesquisaC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_pesquisaC.setForeground(new java.awt.Color(255, 255, 255));
        jl_pesquisaC.setText("Pesquisa:");
        getContentPane().add(jl_pesquisaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 160, 30));
        getContentPane().add(jtf_nomeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 440, 30));
        getContentPane().add(jtf_cpfC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 440, 30));
        getContentPane().add(jtf_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 440, 30));
        getContentPane().add(jtf_dataNascC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 440, 30));
        getContentPane().add(jtf_enderecoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 440, 30));
        getContentPane().add(jtf_cidadeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 440, 30));
        getContentPane().add(jtf_estadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 440, 30));
        getContentPane().add(jtf_telefoneC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 440, 30));
        getContentPane().add(jtf_emailC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 440, 30));
        getContentPane().add(jtf_pesquisaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 440, 30));

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
        getContentPane().add(btn_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 470, 110, 30));

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

        tabela_clientes.setBackground(new java.awt.Color(204, 204, 255));
        tabela_clientes.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tabela_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Gênero", "Data de nascimento", "Endereço", "Cidade", "Estado", "Telefone", "E-mail", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela_clientes.setGridColor(new java.awt.Color(0, 0, 0));
        tabela_clientes.setSelectionForeground(new java.awt.Color(204, 153, 255));
        jScrollPane.setViewportView(tabela_clientes);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1180, 280));

        titulo.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CADASTRO DE CLIENTE");
        titulo.setToolTipText("");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 70));

        backCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(backCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed

        atualizarBotoes(false);
        habilitarForm(true);
        jtf_nomeC.requestFocus();
        clienteSelect = null;
        
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior2ActionPerformed

        CadCliente.this.dispose();

    }//GEN-LAST:event_btn_anterior2ActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        
        atualizarTabela();
        
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        clienteSelect = null;
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        
          int linha = tabela_clientes.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        clienteSelect = clientes.get(linha);
        
        try {
            clienteDao.remover(clienteSelect.getCodigo());
            JOptionPane.showMessageDialog(null, "Cadastro removido!");
            atualizarTabela();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        
        int linha = tabela_clientes.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        atualizarBotoes(false);
        habilitarForm(true);
        clienteSelect = clientes.get(linha);
        
        jtf_nomeC.setText(clienteSelect.getNome());
        jtf_cpfC.setText(clienteSelect.getCpf());
        jtf_genero.setText(clienteSelect.getGenero());
        jtf_dataNascC.setText(clienteSelect.getDataNasc());
        jtf_enderecoC.setText(clienteSelect.getEndereco());
        jtf_cidadeC.setText(clienteSelect.getCidade());
        jtf_estadoC.setText(clienteSelect.getEstado());
        jtf_telefoneC.setText(clienteSelect.getTelefone());
        jtf_emailC.setText(clienteSelect.getEmail());
        
        atualizarTabela();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        
        String nome = jtf_nomeC.getText();
        String cpf = jtf_cpfC.getText();
        String genero = jtf_genero.getText();
        String dataNasc = jtf_dataNascC.getText();
        String endereco = jtf_enderecoC.getText();
        String cidade = jtf_cidadeC.getText();
        String estado = jtf_estadoC.getText();
        String telefone = jtf_telefoneC.getText();
        String email = jtf_emailC.getText();
        
        if (nome.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o nome!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cpf.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o CPF!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (genero.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o gênero!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (dataNasc.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a data de nascimento!", "Atenção", JOptionPane.WARNING_MESSAGE);
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
        
        if (clienteSelect == null) {
            Cliente cliente = new Cliente(nome, cpf, genero, dataNasc, endereco, cidade, estado, telefone, email);

            try {
                clienteDao.adicionar(cliente);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
                
                jtf_nomeC.setText("");
                jtf_cpfC.setText("");
                jtf_genero.setText("");
                jtf_dataNascC.setText("");
                jtf_enderecoC.setText("");
                jtf_cidadeC.setText("");
                jtf_estadoC.setText("");
                jtf_telefoneC.setText("");
                jtf_emailC.setText("");

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no bando de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        
        } else {
            clienteSelect.setNome(nome);
            clienteSelect.setCpf(cpf);
            clienteSelect.setGenero(genero);
            clienteSelect.setDataNasc(dataNasc);
            clienteSelect.setEndereco(endereco);
            clienteSelect.setCidade(cidade);
            clienteSelect.setEstado(estado);
            clienteSelect.setTelefone(telefone);
            clienteSelect.setEmail(email);

            try {
                clienteDao.alterar(clienteSelect);
                JOptionPane.showMessageDialog(null, "Cadastro alterado!");
                atualizarTabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        clienteSelect = null;
        atualizarTabela();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void habilitarForm(boolean status) {
        jtf_nomeC.setEnabled(status);
        jtf_cpfC.setEnabled(status);
        jtf_genero.setEnabled(status);
        jtf_dataNascC.setEnabled(status);
        jtf_enderecoC.setEnabled(status);
        jtf_cidadeC.setEnabled(status);
        jtf_estadoC.setEnabled(status);
        jtf_telefoneC.setEnabled(status);
        jtf_emailC.setEnabled(status);
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
            clientes = clienteDao.buscarNome(jtf_pesquisaC.getText());
            
            DefaultTableModel model = (DefaultTableModel) tabela_clientes.getModel();
            model.setNumRows(0);
            
            for (int i = 0; i < clientes.size(); i++) {
                Cliente cliente = clientes.get(i);
                model.addRow(new Object[] {
                    cliente.getNome(),
                    cliente.getCpf(),
                    cliente.getGenero(),
                    cliente.getDataNasc(),
                    cliente.getEndereco(),
                    cliente.getCidade(),
                    cliente.getEstado(),
                    cliente.getTelefone(),
                    cliente.getEmail(),
                    cliente.getCodigo()
                });
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backCliente;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior2;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel icon;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel jl_cidadeC;
    private javax.swing.JLabel jl_cpfC;
    private javax.swing.JLabel jl_dataNascC;
    private javax.swing.JLabel jl_emailC;
    private javax.swing.JLabel jl_enderecoC;
    private javax.swing.JLabel jl_estadoC;
    private javax.swing.JLabel jl_generoC;
    private javax.swing.JLabel jl_nomeC;
    private javax.swing.JLabel jl_pesquisaC;
    private javax.swing.JLabel jl_telefoneC;
    private javax.swing.JTextField jtf_cidadeC;
    private javax.swing.JTextField jtf_cpfC;
    private javax.swing.JTextField jtf_dataNascC;
    private javax.swing.JTextField jtf_emailC;
    private javax.swing.JTextField jtf_enderecoC;
    private javax.swing.JTextField jtf_estadoC;
    private javax.swing.JTextField jtf_genero;
    private javax.swing.JTextField jtf_nomeC;
    private javax.swing.JTextField jtf_pesquisaC;
    private javax.swing.JTextField jtf_telefoneC;
    private javax.swing.JTable tabela_clientes;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
