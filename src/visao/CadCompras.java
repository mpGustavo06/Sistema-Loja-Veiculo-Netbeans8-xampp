package visao;

import dao.CompraDao;
import dao.FuncionarioDao;
import java.io.IOException;
import java.io.RandomAccessFile;
import modelo.Compra;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Funcionario;

public class CadCompras extends javax.swing.JFrame {
    
    private FuncionarioDao funcDao = new FuncionarioDao();
    private CompraDao compDao = new CompraDao();
    private List<Compra> comps;
    private Compra compSelect;
    
    String carros = "";
    String nf = "";
    float valorTotal = 0;
    String car = "";
    float valor = 0;
    
    String boleto = "";
    String vezes = "";
    float valorX = 0;

    public CadCompras() {
        initComponents();
        atualizarTabela();
        atualizarBotoes(true);
        habilitarForm(false);
        carregarfuncs();
        atualizarPagamento(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        jl_chrysler = new javax.swing.JLabel();
        jcb_300 = new javax.swing.JCheckBox();
        jcb_crownImp = new javax.swing.JCheckBox();
        jcb_windsor = new javax.swing.JCheckBox();
        jcb_300k = new javax.swing.JCheckBox();
        jcb_stratus = new javax.swing.JCheckBox();
        jl_dodge = new javax.swing.JLabel();
        jcb_ram = new javax.swing.JCheckBox();
        jcb_magnum = new javax.swing.JCheckBox();
        jcb_challenger = new javax.swing.JCheckBox();
        jcb_charger = new javax.swing.JCheckBox();
        jcb_dart = new javax.swing.JCheckBox();
        jl_ford = new javax.swing.JLabel();
        jcb_hotrod = new javax.swing.JCheckBox();
        jcb_cobra = new javax.swing.JCheckBox();
        jcb_f1 = new javax.swing.JCheckBox();
        jcb_fairlane = new javax.swing.JCheckBox();
        jcb_maverick = new javax.swing.JCheckBox();
        jcb_thunderbird = new javax.swing.JCheckBox();
        jl_plymouth = new javax.swing.JLabel();
        jcb_voyager = new javax.swing.JCheckBox();
        jcb_barracuda = new javax.swing.JCheckBox();
        jcb_sportF = new javax.swing.JCheckBox();
        jcb_gtx = new javax.swing.JCheckBox();
        jl_buick = new javax.swing.JLabel();
        jcb_lesabre = new javax.swing.JCheckBox();
        jcb_riviera = new javax.swing.JCheckBox();
        jcb_skylark = new javax.swing.JCheckBox();
        jcb_wildcat = new javax.swing.JCheckBox();
        jl_pontiac = new javax.swing.JLabel();
        jcb_grandP = new javax.swing.JCheckBox();
        jcb_starC = new javax.swing.JCheckBox();
        jcb_tempest = new javax.swing.JCheckBox();
        jcb_gto = new javax.swing.JCheckBox();
        jcb_firebird = new javax.swing.JCheckBox();
        jl_harley = new javax.swing.JLabel();
        jcb_heritage = new javax.swing.JCheckBox();
        jcb_dyna = new javax.swing.JCheckBox();
        jcb_fxr = new javax.swing.JCheckBox();
        jcb_superglide = new javax.swing.JCheckBox();
        jcb_tourglide = new javax.swing.JCheckBox();
        jcb_sportster = new javax.swing.JCheckBox();
        jl_outro = new javax.swing.JLabel();
        compras = new javax.swing.JScrollPane();
        tabela_compras = new javax.swing.JTable();
        btn_cadastrarComp = new javax.swing.JButton();
        btn_excluirComp = new javax.swing.JButton();
        btn_alterarComp = new javax.swing.JButton();
        btn_salvarComp = new javax.swing.JButton();
        btn_cancelarComp = new javax.swing.JButton();
        btn_pesquisarComp = new javax.swing.JButton();
        btn_anterior2 = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();
        jl_dataComp = new javax.swing.JLabel();
        jtf_dataComp = new javax.swing.JTextField();
        jtf_pesquisaComp = new javax.swing.JTextField();
        jl_pesquisaComp = new javax.swing.JLabel();
        jl_carro = new javax.swing.JLabel();
        jtf_carro = new javax.swing.JTextField();
        jl_valor = new javax.swing.JLabel();
        jtf_valor = new javax.swing.JTextField();
        jtf_total = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        jl_comprador = new javax.swing.JLabel();
        cbox_comprador = new javax.swing.JComboBox();
        cbox_pagamento = new javax.swing.JComboBox<>();
        cbox_qtdX = new javax.swing.JComboBox<>();
        codBoleto = new javax.swing.JLabel();
        jtf_codBoleto = new javax.swing.JTextField();
        backCompras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compra de veículos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icon.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 190, -1));

        jl_chrysler.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_chrysler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_chrysler.setText("CHRYSLER");
        getContentPane().add(jl_chrysler, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 160, 30));

        jcb_300.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_300.setText("300, 1970");
        getContentPane().add(jcb_300, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 160, 30));

        jcb_crownImp.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_crownImp.setText("Crown Imperial, 1948");
        getContentPane().add(jcb_crownImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 160, 30));

        jcb_windsor.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_windsor.setText("Windsor, 1960");
        getContentPane().add(jcb_windsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, 160, 30));

        jcb_300k.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_300k.setText("300 K, 1964");
        getContentPane().add(jcb_300k, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 160, 30));

        jcb_stratus.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_stratus.setText("Stratus LX Convt., 1998");
        getContentPane().add(jcb_stratus, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 160, 30));

        jl_dodge.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_dodge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_dodge.setText("DODGE");
        getContentPane().add(jl_dodge, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 160, 30));

        jcb_ram.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_ram.setText("Ram 1500 V8, 1995");
        getContentPane().add(jcb_ram, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 160, 30));

        jcb_magnum.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_magnum.setText("Magnum, 1979");
        getContentPane().add(jcb_magnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 160, 30));

        jcb_challenger.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_challenger.setText("Challenger R/T, 1971");
        getContentPane().add(jcb_challenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 160, 30));

        jcb_charger.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_charger.setText("Charger, 1972");
        getContentPane().add(jcb_charger, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 160, 30));

        jcb_dart.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_dart.setText("Dart V8, 1974");
        getContentPane().add(jcb_dart, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 160, 30));

        jl_ford.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_ford.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_ford.setText("FORD");
        getContentPane().add(jl_ford, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 160, 30));

        jcb_hotrod.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_hotrod.setText("37 Hot Rod, 1937");
        getContentPane().add(jcb_hotrod, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 160, 30));

        jcb_cobra.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_cobra.setText("Cobra, 1968");
        getContentPane().add(jcb_cobra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 160, 30));

        jcb_f1.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_f1.setText("F1 Pick Up, 1951");
        getContentPane().add(jcb_f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 160, 30));

        jcb_fairlane.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_fairlane.setText("Fairlane 500, 1966");
        getContentPane().add(jcb_fairlane, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 160, 30));

        jcb_maverick.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_maverick.setText("Maverick 302 V8, 1978");
        getContentPane().add(jcb_maverick, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 160, 30));

        jcb_thunderbird.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_thunderbird.setText("Thunderbird V8, 1955");
        getContentPane().add(jcb_thunderbird, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 160, 30));

        jl_plymouth.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_plymouth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_plymouth.setText("PLYMOUTH");
        getContentPane().add(jl_plymouth, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 160, 30));

        jcb_voyager.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_voyager.setText("Voyager, 1983");
        getContentPane().add(jcb_voyager, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 160, 30));

        jcb_barracuda.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_barracuda.setText("Barracuda AAR, 1974");
        getContentPane().add(jcb_barracuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 160, 30));

        jcb_sportF.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_sportF.setText("Sport Fury, 1960");
        getContentPane().add(jcb_sportF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 160, 30));

        jcb_gtx.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_gtx.setText("GTX 440, 1971");
        getContentPane().add(jcb_gtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 160, 30));

        jl_buick.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_buick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_buick.setText("BUICK");
        getContentPane().add(jl_buick, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 160, 30));

        jcb_lesabre.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_lesabre.setText("LeSabre 2D, 1970");
        jcb_lesabre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_lesabreActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_lesabre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 160, 30));

        jcb_riviera.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_riviera.setText("Riviera Stage-1, 1973");
        getContentPane().add(jcb_riviera, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 160, 30));

        jcb_skylark.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_skylark.setText("Skylark Convt, 1964");
        getContentPane().add(jcb_skylark, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 160, 30));

        jcb_wildcat.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_wildcat.setText("Wildcat, 1966");
        getContentPane().add(jcb_wildcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 160, 30));

        jl_pontiac.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_pontiac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_pontiac.setText("PONTIAC");
        getContentPane().add(jl_pontiac, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 160, 30));

        jcb_grandP.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_grandP.setText("Grand Prix, 1966");
        jcb_grandP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_grandPActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_grandP, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 160, 30));

        jcb_starC.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_starC.setText("Star Chief, 1958");
        getContentPane().add(jcb_starC, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 160, 30));

        jcb_tempest.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_tempest.setText("Tempest Le Mans, 1965");
        getContentPane().add(jcb_tempest, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 160, 30));

        jcb_gto.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_gto.setText("GTO \"The Judge\", 1968");
        getContentPane().add(jcb_gto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 160, 30));

        jcb_firebird.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_firebird.setText("Firebird TransAm, 1979");
        getContentPane().add(jcb_firebird, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 160, 30));

        jl_harley.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_harley.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_harley.setText("HARLEY-DAVIDSON");
        getContentPane().add(jl_harley, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, 30));

        jcb_heritage.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_heritage.setText("Heritage Springer, 2000");
        getContentPane().add(jcb_heritage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 160, 30));

        jcb_dyna.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_dyna.setText("Dyna Convertible, 2000");
        getContentPane().add(jcb_dyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 160, 30));

        jcb_fxr.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_fxr.setText(" FXR, 1989");
        getContentPane().add(jcb_fxr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 160, 30));

        jcb_superglide.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_superglide.setText("Super Glide, 1983");
        getContentPane().add(jcb_superglide, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 160, 30));

        jcb_tourglide.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_tourglide.setText("Tour Glide, 1980");
        getContentPane().add(jcb_tourglide, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 160, 30));

        jcb_sportster.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_sportster.setText("Sportster, 1975");
        getContentPane().add(jcb_sportster, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 160, 30));

        jl_outro.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_outro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_outro.setText("OUTRO");
        getContentPane().add(jl_outro, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 160, 30));

        tabela_compras.setBackground(new java.awt.Color(204, 204, 255));
        tabela_compras.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tabela_compras.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela_compras.setGridColor(new java.awt.Color(0, 0, 0));
        tabela_compras.setSelectionForeground(new java.awt.Color(204, 153, 255));
        compras.setViewportView(tabela_compras);

        getContentPane().add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 1170, 120));

        btn_cadastrarComp.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastrarComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_cadastrarComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cadastrar.png"))); // NOI18N
        btn_cadastrarComp.setText("CADASTRAR");
        btn_cadastrarComp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_cadastrarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarCompActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastrarComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, 110, 30));

        btn_excluirComp.setBackground(new java.awt.Color(255, 255, 255));
        btn_excluirComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_excluirComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/excluir.png"))); // NOI18N
        btn_excluirComp.setText("EXCLUIR");
        btn_excluirComp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_excluirComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirCompActionPerformed(evt);
            }
        });
        getContentPane().add(btn_excluirComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 810, 110, 30));

        btn_alterarComp.setBackground(new java.awt.Color(255, 255, 255));
        btn_alterarComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_alterarComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/editar.png"))); // NOI18N
        btn_alterarComp.setText("ALTERAR");
        btn_alterarComp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_alterarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarCompActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alterarComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 810, 110, 30));

        btn_salvarComp.setBackground(new java.awt.Color(255, 255, 255));
        btn_salvarComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_salvarComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/salvar.png"))); // NOI18N
        btn_salvarComp.setText("SALVAR");
        btn_salvarComp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_salvarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarCompActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvarComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 810, 110, 30));

        btn_cancelarComp.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelarComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_cancelarComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cancelar.png"))); // NOI18N
        btn_cancelarComp.setText("CANCELAR");
        btn_cancelarComp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_cancelarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarCompActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelarComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 810, 110, 30));

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
        getContentPane().add(btn_pesquisarComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 110, 30));

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

        btn_calcular.setBackground(new java.awt.Color(255, 255, 255));
        btn_calcular.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/valortotal.png"))); // NOI18N
        btn_calcular.setText("CALCULAR");
        btn_calcular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 580, 120, 30));

        jl_dataComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_dataComp.setForeground(new java.awt.Color(255, 255, 255));
        jl_dataComp.setText("Data:");
        getContentPane().add(jl_dataComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 90, 30));
        getContentPane().add(jtf_dataComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 440, 30));
        getContentPane().add(jtf_pesquisaComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, 440, 30));

        jl_pesquisaComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_pesquisaComp.setForeground(new java.awt.Color(255, 255, 255));
        jl_pesquisaComp.setText("Pesquisa:");
        getContentPane().add(jl_pesquisaComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 90, 30));

        jl_carro.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_carro.setForeground(new java.awt.Color(255, 255, 255));
        jl_carro.setText("Carro:");
        getContentPane().add(jl_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 50, 30));
        getContentPane().add(jtf_carro, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 240, 30));

        jl_valor.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_valor.setForeground(new java.awt.Color(255, 255, 255));
        jl_valor.setText("Valor:");
        getContentPane().add(jl_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 50, 30));

        jtf_valor.setText("000");
        getContentPane().add(jtf_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 240, 30));

        jtf_total.setBackground(new java.awt.Color(204, 204, 204));
        jtf_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtf_total.setText("R$ ");
        jtf_total.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Segoe UI Emoji", 2, 14))); // NOI18N
        getContentPane().add(jtf_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 200, 50));

        titulo.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CADASTRO DE COMPRAS");
        titulo.setToolTipText("");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 40));

        jl_comprador.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_comprador.setForeground(new java.awt.Color(255, 255, 255));
        jl_comprador.setText("Comprador:");
        getContentPane().add(jl_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 90, 30));

        cbox_comprador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbox_comprador.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbox_compradorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(cbox_comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 440, 30));

        cbox_pagamento.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        cbox_pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Boleto", "Cartão" }));
        cbox_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_pagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_pagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 580, 130, 30));

        cbox_qtdX.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        cbox_qtdX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1X", "3X", "5X", "10X" }));
        getContentPane().add(cbox_qtdX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 620, 50, 30));

        codBoleto.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        codBoleto.setForeground(new java.awt.Color(255, 255, 255));
        codBoleto.setText("Código do boleto");
        getContentPane().add(codBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 130, 20));

        jtf_codBoleto.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        getContentPane().add(jtf_codBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 540, 200, 30));

        backCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(backCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_lesabreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_lesabreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_lesabreActionPerformed

    private void btn_anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior2ActionPerformed

        CadCompras.this.dispose();
        
    }//GEN-LAST:event_btn_anterior2ActionPerformed

    private void btn_cadastrarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarCompActionPerformed
        
        atualizarBotoes(false);
        habilitarForm(true);
        jtf_dataComp.requestFocus();
        compSelect = null;
        
    }//GEN-LAST:event_btn_cadastrarCompActionPerformed

    private void btn_pesquisarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarCompActionPerformed
       
        atualizarTabela();
        
    }//GEN-LAST:event_btn_pesquisarCompActionPerformed

    private void btn_cancelarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarCompActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        compSelect = null;
        
    }//GEN-LAST:event_btn_cancelarCompActionPerformed

    private void btn_alterarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarCompActionPerformed
        
        int linha = tabela_compras.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        atualizarBotoes(false);
        habilitarForm(true);
        compSelect = comps.get(linha);
        
        jtf_dataComp.setText(compSelect.getDataComp());
        carros = "";
        valorTotal = 0;
        
        atualizarTabela();
    }//GEN-LAST:event_btn_alterarCompActionPerformed

    private void btn_excluirCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirCompActionPerformed
        
        int linha = tabela_compras.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        compSelect = comps.get(linha);
        
        try {
            compDao.remover(compSelect.getCodigo());
            JOptionPane.showMessageDialog(null, "Cadastro removido!");
            atualizarTabela();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_excluirCompActionPerformed

    private void btn_salvarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarCompActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        
        Compra comp = new Compra();
        Funcionario funcobj = new Funcionario();
        funcobj = (Funcionario) cbox_comprador.getSelectedItem();
        
        String pagamento = cbox_pagamento.getSelectedItem().toString();
        String dataComp = jtf_dataComp.getText();
        vezes = cbox_qtdX.getSelectedItem().toString();
        boleto = jtf_codBoleto.getText();
        
        if (dataComp.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a data!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (carros.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe os carros!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (valorTotal == 0) {
            JOptionPane.showMessageDialog(null, "Erro ao resgatar os valores!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (vezes == "1X") {
            valorX = valorTotal;
        }
        if (vezes == "3X") {
            valorX = valorTotal / 3;
        }
        if (vezes == "5X") {
            valorX = valorTotal / 5;
        }
        if (vezes == "10X") {
            valorX = valorTotal / 10;
        }
        if (pagamento == "Cartão") {
            if (vezes == "...") {
                JOptionPane.showMessageDialog(null, "informe a quantidade de parcelas!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
        comp.setDataComp(dataComp);
        comp.setCarros(carros);
        comp.setValorTotal(valorTotal);
        comp.setMetodoPag(pagamento);
        comp.setFunc(funcobj);
        
        if (pagamento == "Boleto") {
            nf = nf + "\n|| \n" + "|| -> MÉTODO DE PAGAMENTO = " +pagamento+ "\n";
            nf = nf + "|| -> CÓDIGO DO BOLETO = " + boleto+ "\n";
        }
        
        if (pagamento == "Cartão") {
            nf = nf + "\n|| \n" + "|| -> MÉTODO DE PAGAMENTO = " +pagamento+ "\n";
            nf = nf + "|| -> NOME DO CARTÃO = Gustavo M Pauvels\n";
            nf = nf + "|| -> NÚMERO DO CARTÃO = 4660 5698 5526 2235\n";
            nf = nf + "|| -> CONTA DO CARTÃO = 455286/3\n";
            nf = nf + "|| -> CVV DO CARTÃO = 155\n";
            nf = nf + "||\n|| -> PAGAMENTO EM "+vezes+" VEZES \n";
            nf = nf + "|| -> VALOR DA(S) PARCELA(S) = R$" +valorX+ "\n";
        }
        
        if (pagamento == "Selecionar") {
            JOptionPane.showMessageDialog(null, "Informe o método de pagamento!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        nf = nf + "|| \n" + "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////";
        
        if (compSelect == null) {

            try {
                compDao.adicionar(comp);
                byte[] buffer = nf.getBytes();
                Random gerador = new Random();

                try{
                RandomAccessFile raf = new RandomAccessFile("C:\\Users\\mythg\\Documents\\NetBeansProjects\\ProjetoFinalEnd\\notasfiscais\\compras\\"+gerador.nextInt(999999999)+"-"+cbox_comprador.getSelectedItem().toString()+".html", "rw");
                    raf.write(buffer);
                } catch(IOException ex) {
                    ex.printStackTrace();
                }
        
                JOptionPane.showMessageDialog(null, "Carro cadastrado!");
                
                jtf_dataComp.setText("");
                jtf_total.setText("");
                carros = "";
                valorTotal = 0;

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no bando de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        
        } else {
            compSelect.setDataComp(dataComp);
            compSelect.setCarros(carros);
            compSelect.setValorTotal(valorTotal);
            compSelect.setMetodoPag(pagamento);

            try {
                compDao.alterar(compSelect);
                JOptionPane.showMessageDialog(null, "Cadastro alterado!");
                atualizarTabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        compSelect = null;
        atualizarTabela();
        atualizarCars();
        atualizarPagamento(false);
        cbox_pagamento.setSelectedIndex(0);
    }//GEN-LAST:event_btn_salvarCompActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        
        nf = "";
        nf = "\"////////////////////////////////////////////// NOTA FISCAL DE COMPRA //////////////////////////////////////////////\"\n";
        nf = nf + "|| -> DATA DA COMPRA: " + jtf_dataComp.getText() + "\n";
        nf = nf + "|| -> NOME DO COMPRADOR: " + cbox_comprador.getSelectedItem().toString() + "\n";
        nf = nf + "************************************************ VEÍCULOS COMPRADOS ************************************************\n||\n";
        carros = "";
        valorTotal = 0;
        
        //Harley-Davidson
        if(jcb_heritage.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Heritage Springer, 2000 |> Price = R$108.174,95 \n";
            carros = carros + "HarleyDavidson-HeritageSpringer-2000, ";
            valorTotal = (float) (valorTotal + 108174.95);
        }
        if(jcb_dyna.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Dyna Convertible, 2000 |> Price = R$40.575,75 \n";
            carros = carros + "HarleyDavidson-Dyna-2000, ";
            valorTotal = (float) (valorTotal + 40575.75);
        }
        if(jcb_fxr.isSelected()) {
            nf = nf + "|| -> Harley-davidson,  FXR, 1989 |> Price = R$41.116,76 \n";
            carros = carros + "HarleyDavidson-fxr-1989, ";
            valorTotal = (float) (valorTotal + 41116.76);
        }
        if(jcb_superglide.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Super Glide, 1983 |> Price = R$64.904,97 \n";
            carros = carros + "HarleyDavidson-SuperGlide-1983, ";
            valorTotal = (float) (valorTotal + 64904.97);
        }
        if(jcb_tourglide.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Tour Glide, 1980 |> Price = R$42.739,79 \n";
            carros = carros + "HarleyDavidson-TourGlide-1980, ";
            valorTotal = (float) (valorTotal + 42739.79);
        }
        if(jcb_sportster.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Sportster, 1975 |> Price = R$47.608,88 \n";
            carros = carros + "HarleyDavidson-Sportster-1975, ";
            valorTotal = (float) (valorTotal + 47608.88);
        }
        
        //Ford
        if(jcb_hotrod.isSelected()) {
            nf = nf + "|| -> Ford, 37 Hot Rod, 1937 |> Price = R$215.051,48 \n";
            carros = carros + "Ford-37HotRod-1937, ";
            valorTotal = (float) (valorTotal + 215051.48);
        }
        if(jcb_cobra.isSelected()) {
            nf = nf + "|| -> Ford, Cobra, 1968 |> Price = R$513.959,50 \n";
            carros = carros + "Ford-Cobra-1968, ";
            valorTotal = (float) (valorTotal + 513959.50);
        }
        if(jcb_f1.isSelected()) {
            nf = nf + "|| -> Ford, F1 Pick Up, 1951 |> Price = R$419.990,99 \n";
            carros = carros + "Ford-F1PickUp-1951, ";
            valorTotal = (float) (valorTotal + 419990.99);
        }
        if(jcb_fairlane.isSelected()) {
            nf = nf + "|| -> Ford, Fairlane 500, 1966 |> Price = R$192.599,56 \n";
            carros = carros + "Ford-Fairlane500-1966, ";
            valorTotal = (float) (valorTotal + 192599.56);
        }
        if(jcb_maverick.isSelected()) {
            nf = nf + "|| -> Ford, Maverick 302 V8, 1978 |> Price = R$220.000,00 \n";
            carros = carros + "Ford-Maverick302V8-1978, ";
            valorTotal = (float) (valorTotal + 220000);
        }
        if(jcb_thunderbird.isSelected()) {
            nf = nf + "|| -> Ford, Thunderbird V8, 1955 |> Price = R$208.288,85 \n";
            carros = carros + "Ford-Thunderbird-1955, ";
            valorTotal = (float) (valorTotal + 208288.85);
        }
        
        //Dodge
        if(jcb_ram.isSelected()) {
            nf = nf + "|| -> Dodge, Ram 1500 V8, 1995 |> Price = R$152.294,32 \n";
            carros = carros + "Dodge-Ram1500V8-1995, ";
            valorTotal = (float) (valorTotal + 152294.32);
        }
        if(jcb_magnum.isSelected()) {
            nf = nf + "|| -> Dodge, Magnum, 1979 |> Price = R$108.174,95 \n";
            carros = carros + "Dodge-Magnum-1979, ";
            valorTotal = (float) (valorTotal + 108174.95);
        }
        if(jcb_challenger.isSelected()) {
            nf = nf + "|| -> Dodge, Challenger R/T, 1971 |> Price = R$270.505,00 \n";
            carros = carros + "Dodge-ChallengerR/T-1971, ";
            valorTotal = (float) (valorTotal + 270505.00);
        }
        if(jcb_charger.isSelected()) {
            nf = nf + "|| -> Dodge, Charger, 1972 |> Price = R$221.814,10 \n";
            carros = carros + "Dodge-Charger-1972, ";
            valorTotal = (float) (valorTotal + 221814.10);
        }
        if(jcb_dart.isSelected()) {
            nf = nf + "|| -> Dodge, Dart V8, 1974 |> Price = R$259.820,99 \n";
            carros = carros + "Dodge-DartV8-1974, ";
            valorTotal = (float) (valorTotal + 259820.99);
        }
        
        //Chrysler
        if(jcb_300.isSelected()) {
            nf = nf + "|| -> Chrysler, 300, 1970 |> Price = R$141.038,69 \n";
            carros = carros + "Chrysler-300-1970, ";
            valorTotal = (float) (valorTotal + 141038.69);
        }
        if(jcb_windsor.isSelected()) {
            nf = nf + "|| -> Chrysler, Windsor, 1960 |> Price = R$173.664,21 \n";
            carros = carros + "Chrysler-Windsor-1960, ";
            valorTotal = (float) (valorTotal + 173664.21);
        }
        if(jcb_crownImp.isSelected()) {
            nf = nf + "|| -> Chrysler, Crown Imperial, 1948 |> Price = R$124.973,31 \n";
            carros = carros + "Chrysler-CrownImperial-1948, ";
            valorTotal = (float) (valorTotal + 124973.31);
        }
        if(jcb_300k.isSelected()) {
            nf = nf + "|| -> Chrysler, 300 K, 1964 |> Price = R$342.188,83 \n";
            carros = carros + "Chrysler-300K-1964, ";
            valorTotal = (float) (valorTotal + 342188.83);
        }
        if(jcb_stratus.isSelected()) {
            nf = nf + "|| -> Chrysler, Stratus LX Convertible, 1998 |> Price = R$264.553,89 \n";
            carros = carros + "Chrysler-StratusLXConvertible-1998, ";
            valorTotal = (float) (valorTotal + 264553.89);
        }
        
        //Buick
        if(jcb_lesabre.isSelected()) {
            nf = nf + "|| -> Buick, LeSabre 2D, 1970 |> Price = R$135.225,45 \n";
            carros = carros + "Buick-LeSabre2D-1970, ";
            valorTotal = (float) (valorTotal + 135225.45);
        }
        if(jcb_riviera.isSelected()) {
            nf = nf + "|| -> Buick, Riviera Stage-1, 1973 |> Price = R$113.071,90 \n";
            carros = carros + "Buick-RivieraStage1-1973, ";
            valorTotal = (float) (valorTotal + 113071.90);
        }
        if(jcb_skylark.isSelected()) {
            nf = nf + "|| -> Buick, Skylark Convertible, 1964 |> Price = R$297.555,50 \n";
            carros = carros + "Buick-SkylarkConvertible-1964, ";
            valorTotal = (float) (valorTotal + 297555.50);
        }
        if(jcb_wildcat.isSelected()) {
            nf = nf + "|| -> Buick, Wildcat, 1966 |> Price = R$242.372,48 \n";
            carros = carros + "Buick-Wildcat-1966, ";
            valorTotal = (float) (valorTotal + 242372.48);
        }
        
        //Plymouth
        if(jcb_voyager.isSelected()) {
            nf = nf + "|| -> Plymouth, Voyager, 1983 |> Price = R$51.877,45 \n";
            carros = carros + "Plymouth-Voyager-1983, ";
            valorTotal = (float) (valorTotal + 51877.45);
        }
        if(jcb_barracuda.isSelected()) {
            nf = nf + "|| -> Plymouth, Barracuda AAR, 1974 |> Price = R$309.674,20 \n";
            carros = carros + "Plymouth-BarracudaAAR-1974, ";
            valorTotal = (float) (valorTotal + 309674.20);
        }
        if(jcb_sportF.isSelected()) {
            nf = nf + "|| -> Plymouth, Sport Fury, 1960 |> Price = R$253.596,90 \n";
            carros = carros + "Plymouth-SportFury-1960, ";
            valorTotal = (float) (valorTotal + 253596.90);
        }
        if(jcb_gtx.isSelected()) {
            nf = nf + "|| -> Plymouth, GTX 440, 1971 |> Price = R$125.784,82 \n";
            carros = carros + "Plymouth-GTX440-1971, ";
            valorTotal = (float) (valorTotal + 125784.82);
        }
        
        //Pontiac
        if(jcb_grandP.isSelected()) {
            nf = nf + "|| -> Pontiac, Grand Prix, 1966 |> Price = R$148.777,75 \n";
            carros = carros + "Pontiac-GrandPrix-1966, ";
            valorTotal = (float) (valorTotal + 148777.75);
        }
        if(jcb_starC.isSelected()) {
            nf = nf + "|| -> Pontiac, Star Chief, 1958 |> Price = R$124.405,25 \n";
            carros = carros + "Pontiac-StarChief-1958, ";
            valorTotal = (float) (valorTotal + 124405.25);
        }
        if(jcb_tempest.isSelected()) {
            nf = nf + "|| -> Pontiac, Tempest Le Mans, 1965 |> Price = R$149.318,76 \n";
            carros = carros + "Pontiac-TempestLeMans-1965, ";
            valorTotal = (float) (valorTotal + 149318.76);
        }
        if(jcb_gto.isSelected()) {
            nf = nf + "|| -> Pontiac, GTO 'The Judge', 1968 |> Price = R$195.304,61 \n";
            carros = carros + "Pontiac-GTOTheJudge-1968, ";
            valorTotal = (float) (valorTotal + 195304.61);
        }
        if(jcb_firebird.isSelected()) {
            nf = nf + "|| -> Pontiac, Firebird TransAm, 1979 |> Price = R$182.861,38 \n";
            carros = carros + "Pontiac-FirebirdTransAm-1979, ";
            valorTotal = (float) (valorTotal + 182861.38);
        }
        
        //Outro
        car = jtf_carro.getText();
        valor = Float.valueOf(jtf_valor.getText());
        
        if(car.length() > 0 || valor > 0) {
            nf = nf + "|| -> "+car+" |> Price = R$"+valor+" \n";
            carros = carros + car;
            valorTotal = (float) (valorTotal + valor);
        }
        
        nf = nf + "||\n*************************** VALOR TOTAL ***************************\n";
        nf = nf + "||\n|| -> Valor total R$ " + valorTotal;
        
        jtf_total.setText("R$ " + Float.toString(valorTotal));
        
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void jcb_grandPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_grandPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_grandPActionPerformed

    private void cbox_compradorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbox_compradorAncestorAdded
        List<Funcionario> func2 = funcDao.buscar();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cbox_comprador.getModel();
        modelo.removeAllElements();

        for(Funcionario func1:func2){
            modelo.addElement(func1);
        }
    }//GEN-LAST:event_cbox_compradorAncestorAdded

    private void cbox_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_pagamentoActionPerformed

        String pagamento = cbox_pagamento.getSelectedItem().toString();
        int codbol1 = (int) (Math.random() * 999999999) + 1;
        int codbol2 = (int) (Math.random() * 999999999) + 1;

        if (pagamento == "Boleto") {
            atualizarPagamento(true);
            jtf_codBoleto.show();
            jtf_codBoleto.setText(String.valueOf(codbol1+"."+codbol2));
            boleto = codbol1+"."+codbol2;
            codBoleto.show();
        }

        if (pagamento == "Cartão") {
            atualizarPagamento(true);
            cbox_qtdX.show();
        }

    }//GEN-LAST:event_cbox_pagamentoActionPerformed

    private void habilitarForm(boolean status) {
        jtf_dataComp.setEnabled(status);
        jtf_carro.setEnabled(status);
        jtf_valor.setEnabled(status);
        jtf_total.setEnabled(status);
        cbox_comprador.setEnabled(status);
        cbox_pagamento.setEnabled(status);
        
        jcb_300.setEnabled(status);
        jcb_300k.setEnabled(status);
        jcb_barracuda.setEnabled(status); 
        jcb_challenger.setEnabled(status);
        jcb_charger.setEnabled(status);
        jcb_cobra.setEnabled(status);
        jcb_crownImp.setEnabled(status);
        jcb_dart.setEnabled(status);
        jcb_dyna.setEnabled(status);
        jcb_f1.setEnabled(status);
        jcb_fairlane.setEnabled(status);
        jcb_firebird.setEnabled(status);
        jcb_fxr.setEnabled(status);
        jcb_grandP.setEnabled(status);
        jcb_gto.setEnabled(status);
        jcb_gtx.setEnabled(status);
        jcb_heritage.setEnabled(status);
        jcb_hotrod.setEnabled(status);
        jcb_lesabre.setEnabled(status);
        jcb_magnum.setEnabled(status);
        jcb_maverick.setEnabled(status);
        jcb_ram.setEnabled(status);
        jcb_riviera.setEnabled(status);
        jcb_skylark.setEnabled(status);
        jcb_sportF.setEnabled(status);
        jcb_sportster.setEnabled(status);
        jcb_starC.setEnabled(status);
        jcb_stratus.setEnabled(status);
        jcb_superglide.setEnabled(status);
        jcb_tempest.setEnabled(status);
        jcb_thunderbird.setEnabled(status);
        jcb_tourglide.setEnabled(status);
        jcb_voyager.setEnabled(status);
        jcb_wildcat.setEnabled(status); 
        jcb_windsor.setEnabled(status);
   }
    
    private void atualizarBotoes(boolean status) {
        btn_cadastrarComp.setEnabled(status);
        btn_excluirComp.setEnabled(status);
        btn_alterarComp.setEnabled(status);
        btn_pesquisarComp.setEnabled(status);
        btn_calcular.setEnabled(!status);
        btn_cancelarComp.setEnabled(!status);
        btn_salvarComp.setEnabled(!status);
    }
    
    private void atualizarTabela() {
        try {
            comps = compDao.buscarNome(jtf_pesquisaComp.getText());
            
            DefaultTableModel model = (DefaultTableModel) tabela_compras.getModel();
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
    
    private void carregarfuncs(){
        List<Funcionario> clientes2 = funcDao.buscar();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cbox_comprador.getModel();
        modelo.removeAllElements();
        
            for(Funcionario cliente1:clientes2){
                modelo.addElement(cliente1);
            }
    }
    
    private void atualizarPagamento(boolean status) {
        cbox_qtdX.hide();
        jtf_codBoleto.hide();
        codBoleto.hide();
    }
    
    private void atualizarCars() {
        jcb_300.setSelected(false);
            jcb_300k.setSelected(false);
            jcb_barracuda.setSelected(false);
            jcb_challenger.setSelected(false);
            jcb_charger.setSelected(false);
            jcb_cobra.setSelected(false);
            jcb_crownImp.setSelected(false);
            jcb_dart.setSelected(false);
            jcb_dyna.setSelected(false);
            jcb_f1.setSelected(false);
            jcb_fairlane.setSelected(false);
            jcb_firebird.setSelected(false);
            jcb_fxr.setSelected(false);
            jcb_grandP.setSelected(false);
            jcb_lesabre.setSelected(false);
            jcb_gto.setSelected(false);
            jcb_gtx.setSelected(false);
            jcb_heritage.setSelected(false);
            jcb_hotrod.setSelected(false);
            jcb_magnum.setSelected(false);
            jcb_maverick.setSelected(false);
            jcb_ram.setSelected(false);
            jcb_riviera.setSelected(false);
            jcb_skylark.setSelected(false);
            jcb_sportF.setSelected(false);
            jcb_sportster.setSelected(false);
            jcb_starC.setSelected(false);
            jcb_stratus.setSelected(false);
            jcb_superglide.setSelected(false);
            jcb_tempest.setSelected(false);
            jcb_thunderbird.setSelected(false);
            jcb_tourglide.setSelected(false);
            jcb_voyager.setSelected(false);
            jcb_wildcat.setSelected(false);
            jcb_windsor.setSelected(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backCompras;
    private javax.swing.JButton btn_alterarComp;
    private javax.swing.JButton btn_anterior2;
    private javax.swing.JButton btn_cadastrarComp;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_cancelarComp;
    private javax.swing.JButton btn_excluirComp;
    private javax.swing.JButton btn_pesquisarComp;
    private javax.swing.JButton btn_salvarComp;
    private javax.swing.JComboBox cbox_comprador;
    private javax.swing.JComboBox<String> cbox_pagamento;
    private javax.swing.JComboBox<String> cbox_qtdX;
    private javax.swing.JLabel codBoleto;
    private javax.swing.JScrollPane compras;
    private javax.swing.JLabel icon;
    private javax.swing.JCheckBox jcb_300;
    private javax.swing.JCheckBox jcb_300k;
    private javax.swing.JCheckBox jcb_barracuda;
    private javax.swing.JCheckBox jcb_challenger;
    private javax.swing.JCheckBox jcb_charger;
    private javax.swing.JCheckBox jcb_cobra;
    private javax.swing.JCheckBox jcb_crownImp;
    private javax.swing.JCheckBox jcb_dart;
    private javax.swing.JCheckBox jcb_dyna;
    private javax.swing.JCheckBox jcb_f1;
    private javax.swing.JCheckBox jcb_fairlane;
    private javax.swing.JCheckBox jcb_firebird;
    private javax.swing.JCheckBox jcb_fxr;
    private javax.swing.JCheckBox jcb_grandP;
    private javax.swing.JCheckBox jcb_gto;
    private javax.swing.JCheckBox jcb_gtx;
    private javax.swing.JCheckBox jcb_heritage;
    private javax.swing.JCheckBox jcb_hotrod;
    private javax.swing.JCheckBox jcb_lesabre;
    private javax.swing.JCheckBox jcb_magnum;
    private javax.swing.JCheckBox jcb_maverick;
    private javax.swing.JCheckBox jcb_ram;
    private javax.swing.JCheckBox jcb_riviera;
    private javax.swing.JCheckBox jcb_skylark;
    private javax.swing.JCheckBox jcb_sportF;
    private javax.swing.JCheckBox jcb_sportster;
    private javax.swing.JCheckBox jcb_starC;
    private javax.swing.JCheckBox jcb_stratus;
    private javax.swing.JCheckBox jcb_superglide;
    private javax.swing.JCheckBox jcb_tempest;
    private javax.swing.JCheckBox jcb_thunderbird;
    private javax.swing.JCheckBox jcb_tourglide;
    private javax.swing.JCheckBox jcb_voyager;
    private javax.swing.JCheckBox jcb_wildcat;
    private javax.swing.JCheckBox jcb_windsor;
    private javax.swing.JLabel jl_buick;
    private javax.swing.JLabel jl_carro;
    private javax.swing.JLabel jl_chrysler;
    private javax.swing.JLabel jl_comprador;
    private javax.swing.JLabel jl_dataComp;
    private javax.swing.JLabel jl_dodge;
    private javax.swing.JLabel jl_ford;
    private javax.swing.JLabel jl_harley;
    private javax.swing.JLabel jl_outro;
    private javax.swing.JLabel jl_pesquisaComp;
    private javax.swing.JLabel jl_plymouth;
    private javax.swing.JLabel jl_pontiac;
    private javax.swing.JLabel jl_valor;
    private javax.swing.JTextField jtf_carro;
    private javax.swing.JTextField jtf_codBoleto;
    private javax.swing.JTextField jtf_dataComp;
    private javax.swing.JTextField jtf_pesquisaComp;
    private javax.swing.JTextField jtf_total;
    private javax.swing.JTextField jtf_valor;
    private javax.swing.JTable tabela_compras;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
