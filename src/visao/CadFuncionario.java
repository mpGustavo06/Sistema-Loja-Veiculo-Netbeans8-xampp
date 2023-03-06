package visao;

import dao.FuncionarioDao;
import modelo.Funcionario;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadFuncionario extends javax.swing.JFrame {
    
    private FuncionarioDao funcDao = new FuncionarioDao();
    private List<Funcionario> funcs;
    private Funcionario funcSelect;

    public CadFuncionario() {
        initComponents();
        atualizarTabela();
        atualizarBotoes(true);
        habilitarForm(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        jl_nomeF = new javax.swing.JLabel();
        jl_cpfF = new javax.swing.JLabel();
        jl_enderecoF = new javax.swing.JLabel();
        jl_cidadeF = new javax.swing.JLabel();
        jl_estadoF = new javax.swing.JLabel();
        jl_telefoneF = new javax.swing.JLabel();
        jl_emailF = new javax.swing.JLabel();
        jl_generoF = new javax.swing.JLabel();
        jl_cargoF = new javax.swing.JLabel();
        jl_dataNascF = new javax.swing.JLabel();
        jl_pesquisaF = new javax.swing.JLabel();
        jtf_nomeF = new javax.swing.JTextField();
        jtf_cpfF = new javax.swing.JTextField();
        jtf_genero = new javax.swing.JTextField();
        jtf_cargo = new javax.swing.JTextField();
        jtf_dataNascF = new javax.swing.JTextField();
        jtf_enderecoF = new javax.swing.JTextField();
        jtf_cidadeF = new javax.swing.JTextField();
        jtf_estadoF = new javax.swing.JTextField();
        jtf_telefone = new javax.swing.JTextField();
        jtf_emailF = new javax.swing.JTextField();
        jtf_pesquisaF = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        funcionarios = new javax.swing.JScrollPane();
        tabela_funcionarios = new javax.swing.JTable();
        btn_anterior2 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        backFuncionario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadstro de funcionários");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        jl_nomeF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_nomeF.setForeground(new java.awt.Color(255, 255, 255));
        jl_nomeF.setText("Nome:");
        getContentPane().add(jl_nomeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 160, 30));

        jl_cpfF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_cpfF.setForeground(new java.awt.Color(255, 255, 255));
        jl_cpfF.setText("CPF:");
        getContentPane().add(jl_cpfF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 30));

        jl_enderecoF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_enderecoF.setForeground(new java.awt.Color(255, 255, 255));
        jl_enderecoF.setText("Endereço:");
        getContentPane().add(jl_enderecoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 160, 30));

        jl_cidadeF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_cidadeF.setForeground(new java.awt.Color(255, 255, 255));
        jl_cidadeF.setText("Cidade:");
        getContentPane().add(jl_cidadeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 160, 30));

        jl_estadoF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_estadoF.setForeground(new java.awt.Color(255, 255, 255));
        jl_estadoF.setText("Estado:");
        getContentPane().add(jl_estadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 160, 30));

        jl_telefoneF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_telefoneF.setForeground(new java.awt.Color(255, 255, 255));
        jl_telefoneF.setText("Telefone:");
        getContentPane().add(jl_telefoneF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 160, 30));

        jl_emailF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_emailF.setForeground(new java.awt.Color(255, 255, 255));
        jl_emailF.setText("E-mail:");
        getContentPane().add(jl_emailF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 160, 30));

        jl_generoF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_generoF.setForeground(new java.awt.Color(255, 255, 255));
        jl_generoF.setText("Gênero:");
        getContentPane().add(jl_generoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 160, 30));

        jl_cargoF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_cargoF.setForeground(new java.awt.Color(255, 255, 255));
        jl_cargoF.setText("Cargo:");
        getContentPane().add(jl_cargoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, 30));

        jl_dataNascF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_dataNascF.setForeground(new java.awt.Color(255, 255, 255));
        jl_dataNascF.setText("Data de nascimento:");
        getContentPane().add(jl_dataNascF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 160, 30));

        jl_pesquisaF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_pesquisaF.setForeground(new java.awt.Color(255, 255, 255));
        jl_pesquisaF.setText("Pesquisa:");
        getContentPane().add(jl_pesquisaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 160, 30));

        jtf_nomeF.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_nomeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 440, 30));
        getContentPane().add(jtf_cpfF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 440, 30));
        getContentPane().add(jtf_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 440, 30));
        getContentPane().add(jtf_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 440, 30));
        getContentPane().add(jtf_dataNascF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 440, 30));

        jtf_enderecoF.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_enderecoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 440, 30));

        jtf_cidadeF.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_cidadeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 440, 30));

        jtf_estadoF.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_estadoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 440, 30));
        getContentPane().add(jtf_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 440, 30));

        jtf_emailF.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_emailF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 440, 30));

        jtf_pesquisaF.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_pesquisaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 440, 30));

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

        tabela_funcionarios.setBackground(new java.awt.Color(204, 204, 255));
        tabela_funcionarios.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tabela_funcionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Gênero", "Cargo", "Data de nascimento", "Endereço", "Cidade", "Estado", "Telefone", "E-mail", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela_funcionarios.setGridColor(new java.awt.Color(0, 0, 0));
        tabela_funcionarios.setSelectionForeground(new java.awt.Color(204, 153, 255));
        funcionarios.setViewportView(tabela_funcionarios);

        getContentPane().add(funcionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1180, 280));

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

        titulo.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CADASTRO DE FUNCIONÁRIO");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 70));

        backFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(backFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior2ActionPerformed

        CadFuncionario.this.dispose();
        
    }//GEN-LAST:event_btn_anterior2ActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
       
        atualizarBotoes(false);
        habilitarForm(true);
        jtf_nomeF.requestFocus();
        funcSelect = null;
        
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        
        atualizarTabela();
        
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        funcSelect = null;
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
       
        int linha = tabela_funcionarios.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        funcSelect = funcs.get(linha);
        
        try {
            funcDao.remover(funcSelect.getCodigo());
            JOptionPane.showMessageDialog(null, "Cadastro removido!");
            atualizarTabela();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        
        int linha = tabela_funcionarios.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        atualizarBotoes(false);
        habilitarForm(true);
        funcSelect = funcs.get(linha);
        
        jtf_nomeF.setText(funcSelect.getNome());
        jtf_cpfF.setText(funcSelect.getCpf());
        jtf_genero.setText(funcSelect.getGenero());
        jtf_cargo.setText(funcSelect.getCargo());
        jtf_dataNascF.setText(funcSelect.getDataNasc());
        jtf_enderecoF.setText(funcSelect.getEndereco());
        jtf_cidadeF.setText(funcSelect.getCidade());
        jtf_estadoF.setText(funcSelect.getEstado());
        jtf_telefone.setText(funcSelect.getTelefone());
        jtf_emailF.setText(funcSelect.getEmail());
        
        atualizarTabela();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        
        String nome = jtf_nomeF.getText();
        String cpf = jtf_cpfF.getText();
        String genero = jtf_genero.getText();
        String cargo = jtf_cargo.getText();
        String dataNasc = jtf_dataNascF.getText();
        String endereco = jtf_enderecoF.getText();
        String cidade = jtf_cidadeF.getText();
        String estado = jtf_estadoF.getText();
        String telefone = jtf_telefone.getText();
        String email = jtf_emailF.getText();
        
        if (nome.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o nome!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cpf.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o CPF!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (genero.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o genêro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (cargo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o cargo!", "Atenção", JOptionPane.WARNING_MESSAGE);
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
        
        if (funcSelect == null) {
            Funcionario func = new Funcionario(nome, cpf, genero, cargo, dataNasc, endereco, cidade, estado, telefone, email);

            try {
                funcDao.adicionar(func);
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado!");
                
                jtf_nomeF.setText("");
                jtf_cpfF.setText("");
                jtf_genero.setText("");
                jtf_cargo.setText("");
                jtf_dataNascF.setText("");
                jtf_enderecoF.setText("");
                jtf_cidadeF.setText("");
                jtf_estadoF.setText("");
                jtf_telefone.setText("");
                jtf_emailF.setText("");

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no bando de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        
        } else {
            funcSelect.setNome(nome);
            funcSelect.setCpf(cpf);
            funcSelect.setGenero(genero);
            funcSelect.setCargo(cargo);
            funcSelect.setDataNasc(dataNasc);
            funcSelect.setEndereco(endereco);
            funcSelect.setCidade(cidade);
            funcSelect.setEstado(estado);
            funcSelect.setTelefone(telefone);
            funcSelect.setEmail(email);

            try {
                funcDao.alterar(funcSelect);
                JOptionPane.showMessageDialog(null, "Cadastro alterado!");
                atualizarTabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        funcSelect = null;
        atualizarTabela();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void habilitarForm(boolean status) {
        jtf_nomeF.setEnabled(status);
        jtf_cpfF.setEnabled(status);
        jtf_genero.setEnabled(status);
        jtf_cargo.setEnabled(status);
        jtf_dataNascF.setEnabled(status);
        jtf_enderecoF.setEnabled(status);
        jtf_cidadeF.setEnabled(status);
        jtf_estadoF.setEnabled(status);
        jtf_telefone.setEnabled(status);
        jtf_emailF.setEnabled(status);
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
            funcs = funcDao.buscarNome(jtf_pesquisaF.getText());
            
            DefaultTableModel model = (DefaultTableModel) tabela_funcionarios.getModel();
            model.setNumRows(0);
            
            for (int i = 0; i < funcs.size(); i++) {
                Funcionario func = funcs.get(i);
                model.addRow(new Object[] {
                    func.getNome(),
                    func.getCpf(),
                    func.getGenero(),
                    func.getCargo(),
                    func.getDataNasc(),
                    func.getEndereco(),
                    func.getCidade(),
                    func.getEstado(),
                    func.getTelefone(),
                    func.getEmail(),
                    func.getCodigo()
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
    private javax.swing.JScrollPane funcionarios;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jl_cargoF;
    private javax.swing.JLabel jl_cidadeF;
    private javax.swing.JLabel jl_cpfF;
    private javax.swing.JLabel jl_dataNascF;
    private javax.swing.JLabel jl_emailF;
    private javax.swing.JLabel jl_enderecoF;
    private javax.swing.JLabel jl_estadoF;
    private javax.swing.JLabel jl_generoF;
    private javax.swing.JLabel jl_nomeF;
    private javax.swing.JLabel jl_pesquisaF;
    private javax.swing.JLabel jl_telefoneF;
    private javax.swing.JTextField jtf_cargo;
    private javax.swing.JTextField jtf_cidadeF;
    private javax.swing.JTextField jtf_cpfF;
    private javax.swing.JTextField jtf_dataNascF;
    private javax.swing.JTextField jtf_emailF;
    private javax.swing.JTextField jtf_enderecoF;
    private javax.swing.JTextField jtf_estadoF;
    private javax.swing.JTextField jtf_genero;
    private javax.swing.JTextField jtf_nomeF;
    private javax.swing.JTextField jtf_pesquisaF;
    private javax.swing.JTextField jtf_telefone;
    private javax.swing.JTable tabela_funcionarios;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
