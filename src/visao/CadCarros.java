package visao;

import dao.CarroDao;
import modelo.Carro;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadCarros extends javax.swing.JFrame {
    
    private CarroDao carroDao = new CarroDao();
    private List<Carro> carros;
    private Carro carroSelect;

    public CadCarros() {
        initComponents();
        atualizarTabela();
        atualizarBotoes(true);
        habilitarForm(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        jl_marcaCr = new javax.swing.JLabel();
        jl_modeloCr = new javax.swing.JLabel();
        jl_placaCr = new javax.swing.JLabel();
        jl_numeroVinCr = new javax.swing.JLabel();
        jl_estadoC = new javax.swing.JLabel();
        jl_cidadeCr = new javax.swing.JLabel();
        jl_anoCr = new javax.swing.JLabel();
        jl_dataCompraCr = new javax.swing.JLabel();
        jl_pesquisaCr = new javax.swing.JLabel();
        jtf_marcaCr = new javax.swing.JTextField();
        jtf_modeloCr = new javax.swing.JTextField();
        jtf_anoCr = new javax.swing.JTextField();
        jtf_dataCompraCr = new javax.swing.JTextField();
        jtf_estadoCr = new javax.swing.JTextField();
        jtf_cidadeCr = new javax.swing.JTextField();
        jtf_placaCr = new javax.swing.JTextField();
        jtf_numeroVinCr = new javax.swing.JTextField();
        jtf_pesquisaCr = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_anterior2 = new javax.swing.JButton();
        js_carros = new javax.swing.JScrollPane();
        tabela_carros = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        backCarros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadstro de carros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        jl_marcaCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_marcaCr.setForeground(new java.awt.Color(255, 255, 255));
        jl_marcaCr.setText("Marca:");
        getContentPane().add(jl_marcaCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 160, 30));

        jl_modeloCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_modeloCr.setForeground(new java.awt.Color(255, 255, 255));
        jl_modeloCr.setText("Modelo:");
        getContentPane().add(jl_modeloCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 160, 30));

        jl_placaCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_placaCr.setForeground(new java.awt.Color(255, 255, 255));
        jl_placaCr.setText("Placa:");
        getContentPane().add(jl_placaCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 160, 30));

        jl_numeroVinCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_numeroVinCr.setForeground(new java.awt.Color(255, 255, 255));
        jl_numeroVinCr.setText("Número VIN:");
        getContentPane().add(jl_numeroVinCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 160, 30));

        jl_estadoC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_estadoC.setForeground(new java.awt.Color(255, 255, 255));
        jl_estadoC.setText("Estado:");
        getContentPane().add(jl_estadoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 160, 30));

        jl_cidadeCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_cidadeCr.setForeground(new java.awt.Color(255, 255, 255));
        jl_cidadeCr.setText("Cidade:");
        getContentPane().add(jl_cidadeCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 160, 30));

        jl_anoCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_anoCr.setForeground(new java.awt.Color(255, 255, 255));
        jl_anoCr.setText("Ano:");
        getContentPane().add(jl_anoCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, 30));

        jl_dataCompraCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_dataCompraCr.setForeground(new java.awt.Color(255, 255, 255));
        jl_dataCompraCr.setText("Data de compra:");
        getContentPane().add(jl_dataCompraCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 160, 30));

        jl_pesquisaCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_pesquisaCr.setForeground(new java.awt.Color(255, 255, 255));
        jl_pesquisaCr.setText("Pesquisa:");
        getContentPane().add(jl_pesquisaCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 160, 30));

        jtf_marcaCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_marcaCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 440, 30));

        jtf_modeloCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_modeloCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 440, 30));
        getContentPane().add(jtf_anoCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 440, 30));
        getContentPane().add(jtf_dataCompraCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 440, 30));

        jtf_estadoCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_estadoCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 440, 30));

        jtf_cidadeCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_cidadeCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 440, 30));

        jtf_placaCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_placaCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 440, 30));

        jtf_numeroVinCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_numeroVinCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 440, 30));

        jtf_pesquisaCr.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        getContentPane().add(jtf_pesquisaCr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 440, 30));

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

        tabela_carros.setBackground(new java.awt.Color(204, 204, 255));
        tabela_carros.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tabela_carros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Ano", "Data de compra", "Placa", "Número VIN", "Cidade", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela_carros.setGridColor(new java.awt.Color(0, 0, 0));
        tabela_carros.setSelectionForeground(new java.awt.Color(204, 153, 255));
        js_carros.setViewportView(tabela_carros);

        getContentPane().add(js_carros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1180, 280));

        titulo.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CADASTRO DE CARRO");
        titulo.setToolTipText("");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 70));

        backCarros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(backCarros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior2ActionPerformed

        CadCarros.this.dispose();
        
    }//GEN-LAST:event_btn_anterior2ActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        
        atualizarBotoes(false);
        habilitarForm(true);
        jtf_marcaCr.requestFocus();
        carroSelect = null;
        
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        
        atualizarTabela();
        
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        carroSelect = null;
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        
        int linha = tabela_carros.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        carroSelect = carros.get(linha);
        
        try {
            carroDao.remover(carroSelect.getCodigo());
            JOptionPane.showMessageDialog(null, "Cadastro removido!");
            atualizarTabela();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        
        int linha = tabela_carros.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        atualizarBotoes(false);
        habilitarForm(true);
        carroSelect = carros.get(linha);
        
        jtf_marcaCr.setText(carroSelect.getMarca());
        jtf_modeloCr.setText(carroSelect.getModelo());
        jtf_anoCr.setText(carroSelect.getAno());
        jtf_dataCompraCr.setText(carroSelect.getDataComp());
        jtf_placaCr.setText(carroSelect.getPlaca());
        jtf_numeroVinCr.setText(carroSelect.getNumVIN());
        jtf_cidadeCr.setText(carroSelect.getCidade());
        jtf_estadoCr.setText(carroSelect.getEstado());
        
        atualizarTabela();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
       
        atualizarBotoes(true);
        habilitarForm(false);
        
        String marca = jtf_marcaCr.getText();
        String modelo = jtf_modeloCr.getText();
        String ano = jtf_anoCr.getText();
        String dataComp = jtf_dataCompraCr.getText();
        String placa = jtf_placaCr.getText();
        String numVIN = jtf_numeroVinCr.getText();
        String cidade = jtf_cidadeCr.getText();
        String estado = jtf_estadoCr.getText();
        
        if (marca.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a marca!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (modelo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o modelo!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (ano.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o ano!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (dataComp.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a data de compra!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (placa.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a placa!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (numVIN.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o número VIN!", "Atenção", JOptionPane.WARNING_MESSAGE);
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
        
        if (carroSelect == null) {
            Carro carro = new Carro(marca, modelo, ano, dataComp, placa, numVIN, cidade, estado);

            try {
                carroDao.adicionar(carro);
                JOptionPane.showMessageDialog(null, "Carro cadastrado!");
                
                jtf_marcaCr.setText("");
                jtf_modeloCr.setText("");
                jtf_anoCr.setText("");
                jtf_dataCompraCr.setText("");
                jtf_placaCr.setText("");
                jtf_numeroVinCr.setText("");
                jtf_cidadeCr.setText("");
                jtf_estadoCr.setText("");

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no bando de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        
        } else {
            carroSelect.setMarca(marca);
            carroSelect.setModelo(modelo);
            carroSelect.setAno(ano);
            carroSelect.setDataComp(dataComp);
            carroSelect.setPlaca(placa);
            carroSelect.setNumVIN(numVIN);
            carroSelect.setCidade(cidade);
            carroSelect.setEstado(estado);

            try {
                carroDao.alterar(carroSelect);
                JOptionPane.showMessageDialog(null, "Cadastro alterado!");
                atualizarTabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        carroSelect = null;
        atualizarTabela();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void habilitarForm(boolean status) {
        jtf_marcaCr.setEnabled(status);
        jtf_modeloCr.setEnabled(status);
        jtf_anoCr.setEnabled(status);
        jtf_dataCompraCr.setEnabled(status);
        jtf_placaCr.setEnabled(status);
        jtf_numeroVinCr.setEnabled(status);
        jtf_cidadeCr.setEnabled(status);
        jtf_estadoCr.setEnabled(status);
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
            carros = carroDao.buscarNome(jtf_pesquisaCr.getText());
            
            DefaultTableModel model = (DefaultTableModel) tabela_carros.getModel();
            model.setNumRows(0);
            
            for (int i = 0; i < carros.size(); i++) {
                Carro carro = carros.get(i);
                model.addRow(new Object[] {
                    carro.getMarca(),
                    carro.getModelo(),
                    carro.getAno(),
                    carro.getDataComp(),
                    carro.getPlaca(),
                    carro.getNumVIN(),
                    carro.getCidade(),
                    carro.getEstado(),
                });
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backCarros;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior2;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jl_anoCr;
    private javax.swing.JLabel jl_cidadeCr;
    private javax.swing.JLabel jl_dataCompraCr;
    private javax.swing.JLabel jl_estadoC;
    private javax.swing.JLabel jl_marcaCr;
    private javax.swing.JLabel jl_modeloCr;
    private javax.swing.JLabel jl_numeroVinCr;
    private javax.swing.JLabel jl_pesquisaCr;
    private javax.swing.JLabel jl_placaCr;
    private javax.swing.JScrollPane js_carros;
    private javax.swing.JTextField jtf_anoCr;
    private javax.swing.JTextField jtf_cidadeCr;
    private javax.swing.JTextField jtf_dataCompraCr;
    private javax.swing.JTextField jtf_estadoCr;
    private javax.swing.JTextField jtf_marcaCr;
    private javax.swing.JTextField jtf_modeloCr;
    private javax.swing.JTextField jtf_numeroVinCr;
    private javax.swing.JTextField jtf_pesquisaCr;
    private javax.swing.JTextField jtf_placaCr;
    private javax.swing.JTable tabela_carros;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
