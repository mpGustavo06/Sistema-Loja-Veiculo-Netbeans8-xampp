package visao;

import dao.CompraDao;
import dao.VendasDao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Compra;
import modelo.Vendas;

public class Relatorio extends javax.swing.JFrame {
    
    private CompraDao compDao = new CompraDao();
    private List<Compra> comps;
    private VendasDao vendaDao = new VendasDao();
    private List<Vendas> vendas;

    public Relatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        btn_anterior4 = new javax.swing.JButton();
        jtf_pesquisa = new javax.swing.JTextField();
        btn_pesquisarComp = new javax.swing.JButton();
        btn_pesquisarVen = new javax.swing.JButton();
        cbox_metodoPesquisaComp = new javax.swing.JComboBox<>();
        cbox_metodoPesquisaVend = new javax.swing.JComboBox<>();
        cbox_tabelaPesquisa = new javax.swing.JComboBox<>();
        titulo = new javax.swing.JLabel();
        JScrollCompras = new javax.swing.JScrollPane();
        tbCompras = new javax.swing.JTable();
        JScrollVendas = new javax.swing.JScrollPane();
        tbVendas = new javax.swing.JTable();
        backRelatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 180, -1));

        btn_anterior4.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        btn_anterior4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/anterior.png"))); // NOI18N
        btn_anterior4.setText("Voltar");
        btn_anterior4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_anterior4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anterior4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_anterior4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 90, 30));
        getContentPane().add(jtf_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 420, 30));

        btn_pesquisarComp.setBackground(new java.awt.Color(255, 255, 255));
        btn_pesquisarComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_pesquisarComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/pesquisar.png"))); // NOI18N
        btn_pesquisarComp.setText("PESQUISAR");
        btn_pesquisarComp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_pesquisarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarCompActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pesquisarComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 110, 30));

        btn_pesquisarVen.setBackground(new java.awt.Color(255, 255, 255));
        btn_pesquisarVen.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_pesquisarVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/pesquisar.png"))); // NOI18N
        btn_pesquisarVen.setText("PESQUISAR");
        btn_pesquisarVen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_pesquisarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarVenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pesquisarVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 110, 30));

        cbox_metodoPesquisaComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        cbox_metodoPesquisaComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o método de pesquisa", "Data", "Comprador" }));
        getContentPane().add(cbox_metodoPesquisaComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 240, 30));

        cbox_metodoPesquisaVend.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        cbox_metodoPesquisaVend.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o método de pesquisa", "Data", "Cliente" }));
        getContentPane().add(cbox_metodoPesquisaVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 240, 30));

        cbox_tabelaPesquisa.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        cbox_tabelaPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a tabela", "Vendas", "Compras" }));
        cbox_tabelaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_tabelaPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_tabelaPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 240, 30));

        titulo.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("RELATÓRIO");
        titulo.setToolTipText("");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 70));

        tbCompras.setBackground(new java.awt.Color(204, 204, 255));
        tbCompras.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tbCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Carros", "Valor Total", "Met. Pagamento", "Comprador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbCompras.setGridColor(new java.awt.Color(0, 0, 0));
        tbCompras.setSelectionForeground(new java.awt.Color(204, 153, 255));
        JScrollCompras.setViewportView(tbCompras);

        getContentPane().add(JScrollCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 1070, 610));

        tbVendas.setBackground(new java.awt.Color(204, 204, 255));
        tbVendas.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tbVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Carros", "Valor Total", "Met. Pagamento", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbVendas.setGridColor(new java.awt.Color(0, 0, 0));
        tbVendas.setSelectionForeground(new java.awt.Color(204, 153, 255));
        JScrollVendas.setViewportView(tbVendas);

        getContentPane().add(JScrollVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 1070, 610));

        backRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(backRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anterior4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior4ActionPerformed

        Relatorio.this.dispose();
    }//GEN-LAST:event_btn_anterior4ActionPerformed

    private void btn_pesquisarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarVenActionPerformed

        String metodoV = cbox_metodoPesquisaVend.getSelectedItem().toString();
        
        if (metodoV == "Data") {
            tableVendData();
        }
        
        if (metodoV == "Cliente") {
            tableVendCliente();
        }

    }//GEN-LAST:event_btn_pesquisarVenActionPerformed

    private void cbox_tabelaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_tabelaPesquisaActionPerformed
        String tbpq = cbox_tabelaPesquisa.getSelectedItem().toString();
        
        if (tbpq == "Compras") {
            cbox_metodoPesquisaComp.show();
            cbox_metodoPesquisaVend.hide();
            
            btn_pesquisarComp.show();
            btn_pesquisarVen.hide();
            
            JScrollCompras.show();
            JScrollVendas.hide();
            
            tableCompData();
        }
        
        if (tbpq == "Vendas") {
            cbox_metodoPesquisaComp.hide();
            cbox_metodoPesquisaVend.show();
            
            btn_pesquisarComp.hide();
            btn_pesquisarVen.show();
            
            JScrollCompras.hide();
            JScrollVendas.show();
            
            tableVendData();
        }
    }//GEN-LAST:event_cbox_tabelaPesquisaActionPerformed

    private void btn_pesquisarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarCompActionPerformed
        
        String metodoC = cbox_metodoPesquisaComp.getSelectedItem().toString();
        
        if (metodoC == "Data") {
            tableCompData();
        }
        
        if (metodoC == "Comprador") {
            tableCompComprador();
        }
        
    }//GEN-LAST:event_btn_pesquisarCompActionPerformed

    private void tableCompData() {
        try {
            comps = compDao.SearchCompData(jtf_pesquisa.getText());
            
            DefaultTableModel model = (DefaultTableModel) tbCompras.getModel();
            model.setNumRows(0);
            
            for (int i = 0; i < comps.size(); i++) {
                Compra comp = comps.get(i);
                int a = comp.getFunc().getCodigo();
                model.addRow(new Object[] {
                    comp.getDataComp(),
                    comp.getCarros(),
                    comp.getValorTotal(),
                    comp.getMetodoPag(),
                    a,
                });
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void tableCompComprador() {
        try {
            comps = compDao.buscarNome(jtf_pesquisa.getText());
            
            DefaultTableModel model = (DefaultTableModel) tbCompras.getModel();
            model.setNumRows(0);
            
            for (int i = 0; i < comps.size(); i++) {
                Compra comp = comps.get(i);
                int a = comp.getFunc().getCodigo();
                model.addRow(new Object[] {
                    comp.getDataComp(),
                    comp.getCarros(),
                    comp.getValorTotal(), 
                    comp.getMetodoPag(),
                    a,
                });
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void tableVendData() {
        try {
            vendas = vendaDao.SearchVendData(jtf_pesquisa.getText());
            
            DefaultTableModel model = (DefaultTableModel) tbVendas.getModel();
            model.setNumRows(0);
            
            for (int i = 0; i < vendas.size(); i++) {
                Vendas venda = vendas.get(i);
                int a = venda.getClient().getCodigo();
                model.addRow(new Object[] {
                    venda.getDataV(),
                    venda.getCarros(),
                    venda.getValorTotal(),
                    venda.getMetodoPag(),
                    a,
                });
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void tableVendCliente() {
        try {
            vendas = vendaDao.buscarData(jtf_pesquisa.getText());
            
            DefaultTableModel model = (DefaultTableModel) tbVendas.getModel();
            model.setNumRows(0);
            
            for (int i = 0; i < vendas.size(); i++) {
                Vendas venda = vendas.get(i);
                int a = venda.getClient().getCodigo();
                model.addRow(new Object[] {
                    venda.getDataV(),
                    venda.getCarros(),
                    venda.getValorTotal(),
                    venda.getMetodoPag(),
                    a,
                });
            }
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollCompras;
    private javax.swing.JScrollPane JScrollVendas;
    private javax.swing.JLabel backRelatorio;
    private javax.swing.JButton btn_anterior4;
    private javax.swing.JButton btn_pesquisarComp;
    private javax.swing.JButton btn_pesquisarVen;
    private javax.swing.JComboBox<String> cbox_metodoPesquisaComp;
    private javax.swing.JComboBox<String> cbox_metodoPesquisaVend;
    private javax.swing.JComboBox<String> cbox_tabelaPesquisa;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField jtf_pesquisa;
    private javax.swing.JTable tbCompras;
    private javax.swing.JTable tbVendas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
