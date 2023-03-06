package visao;

import dao.ClienteDao;
import dao.VendasDao;
import java.io.IOException;
import java.io.RandomAccessFile;
import modelo.Vendas;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class CadVendas extends javax.swing.JFrame {
    
    private ClienteDao clienteDao = new ClienteDao();
    private VendasDao vendaDao = new VendasDao();
    private List<Vendas> vendas;
    private Vendas vendaSelect;

    String carros = "";
    String nf = "";
    float valorTotal = 0;
    
    float entregue = 0;
    float troco = 0;
    
    String boleto = "";
    
    String cartao = "";
    String nomeCt = "";
    String contaCt = "";
    String cvvCt = "";
    String vezes = "";
    float valorX = 0;
     
    public CadVendas() {
        initComponents();
        atualizarTabela();
        atualizarBotoes(true);
        habilitarForm(false);
        carregarClientes();
        atualizarPagamento(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_chrysler = new javax.swing.JLabel();
        jcb_300 = new javax.swing.JCheckBox();
        jcb_crownImp = new javax.swing.JCheckBox();
        jcb_windsor = new javax.swing.JCheckBox();
        jcb_300k = new javax.swing.JCheckBox();
        jcb_stratus = new javax.swing.JCheckBox();
        btn_detalhesChrysler = new javax.swing.JButton();
        jl_dodge = new javax.swing.JLabel();
        jcb_ram = new javax.swing.JCheckBox();
        jcb_magnum = new javax.swing.JCheckBox();
        jcb_challenger = new javax.swing.JCheckBox();
        jcb_charger = new javax.swing.JCheckBox();
        jcb_dart = new javax.swing.JCheckBox();
        btn_detalhesDodge = new javax.swing.JButton();
        jl_ford = new javax.swing.JLabel();
        jcb_hotrod = new javax.swing.JCheckBox();
        jcb_cobra = new javax.swing.JCheckBox();
        jcb_f1 = new javax.swing.JCheckBox();
        jcb_fairlane = new javax.swing.JCheckBox();
        jcb_maverick = new javax.swing.JCheckBox();
        jcb_thunderbird = new javax.swing.JCheckBox();
        btn_detalhesFord = new javax.swing.JButton();
        jl_plymouth = new javax.swing.JLabel();
        jcb_voyager = new javax.swing.JCheckBox();
        jcb_barracuda = new javax.swing.JCheckBox();
        jcb_sportF = new javax.swing.JCheckBox();
        jcb_gtx = new javax.swing.JCheckBox();
        btn_detalhesPlymouth = new javax.swing.JButton();
        jl_buick = new javax.swing.JLabel();
        jcb_lesabre = new javax.swing.JCheckBox();
        jcb_riviera = new javax.swing.JCheckBox();
        jcb_skylark = new javax.swing.JCheckBox();
        jcb_wildcat = new javax.swing.JCheckBox();
        btn_detalhesBuick = new javax.swing.JButton();
        jl_pontiac = new javax.swing.JLabel();
        jcb_grandP = new javax.swing.JCheckBox();
        jcb_starC = new javax.swing.JCheckBox();
        jcb_tempest = new javax.swing.JCheckBox();
        jcb_gto = new javax.swing.JCheckBox();
        jcb_firebird = new javax.swing.JCheckBox();
        btn_detalhesPontiac = new javax.swing.JButton();
        jl_harley = new javax.swing.JLabel();
        jcb_heritage = new javax.swing.JCheckBox();
        jcb_dyna = new javax.swing.JCheckBox();
        jcb_fxr = new javax.swing.JCheckBox();
        jcb_superglide = new javax.swing.JCheckBox();
        jcb_tourglide = new javax.swing.JCheckBox();
        jcb_sportster = new javax.swing.JCheckBox();
        btn_detalhesHarley = new javax.swing.JButton();
        JScrollVendas = new javax.swing.JScrollPane();
        tabela_vendas = new javax.swing.JTable();
        btn_cadastrarVen = new javax.swing.JButton();
        btn_excluirVen = new javax.swing.JButton();
        btn_alterarVen = new javax.swing.JButton();
        btn_salvarVen = new javax.swing.JButton();
        btn_cancelarVen = new javax.swing.JButton();
        btn_pesquisarVen = new javax.swing.JButton();
        btn_anterior2 = new javax.swing.JButton();
        jl_clienteVen = new javax.swing.JLabel();
        cbox_clientes = new javax.swing.JComboBox();
        jtf_pesquisaVen = new javax.swing.JTextField();
        jtf_dataV = new javax.swing.JTextField();
        jl_dataV = new javax.swing.JLabel();
        jl_pesquisaVen = new javax.swing.JLabel();
        jtf_total = new javax.swing.JTextField();
        codBoleto = new javax.swing.JLabel();
        jtf_codBoleto = new javax.swing.JTextField();
        jtf_troco = new javax.swing.JTextField();
        jtf_entregue = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        btn_calcularTroco = new javax.swing.JButton();
        cbox_pagamento = new javax.swing.JComboBox<>();
        cbox_qtdX = new javax.swing.JComboBox<>();
        jtf_numCartao = new javax.swing.JTextField();
        jtf_nomeCartao = new javax.swing.JTextField();
        numCartao = new javax.swing.JLabel();
        nomeCartao = new javax.swing.JLabel();
        conta = new javax.swing.JLabel();
        jtf_conta = new javax.swing.JTextField();
        cvv = new javax.swing.JLabel();
        jtf_cvv = new javax.swing.JTextField();
        btn_realizarVenda = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        backVendas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda de carros");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_chrysler.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_chrysler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_chrysler.setText("CHRYSLER");
        getContentPane().add(jl_chrysler, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 160, 30));

        jcb_300.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_300.setText("300, 1970");
        jcb_300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_300ActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_300, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, 30));

        jcb_crownImp.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_crownImp.setText("Crown Imperial, 1948");
        jcb_crownImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_crownImpActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_crownImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 160, 30));

        jcb_windsor.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_windsor.setText("Windsor, 1960");
        jcb_windsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_windsorActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_windsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 160, 30));

        jcb_300k.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_300k.setText("300 K, 1964");
        jcb_300k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_300kActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_300k, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 160, 30));

        jcb_stratus.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_stratus.setText("Stratus LX Convt., 1998");
        jcb_stratus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_stratusActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_stratus, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 160, 30));

        btn_detalhesChrysler.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_detalhesChrysler.setText("DETALHES");
        btn_detalhesChrysler.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_detalhesChrysler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesChryslerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detalhesChrysler, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 160, 30));

        jl_dodge.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_dodge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_dodge.setText("DODGE");
        getContentPane().add(jl_dodge, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 160, 30));

        jcb_ram.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_ram.setText("Ram 1500 V8, 1995");
        jcb_ram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_ramActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_ram, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 160, 30));

        jcb_magnum.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_magnum.setText("Magnum, 1979");
        jcb_magnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_magnumActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_magnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 160, 30));

        jcb_challenger.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_challenger.setText("Challenger R/T, 1971");
        jcb_challenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_challengerActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_challenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 160, 30));

        jcb_charger.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_charger.setText("Charger, 1972");
        jcb_charger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_chargerActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_charger, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 160, 30));

        jcb_dart.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_dart.setText("Dart V8, 1974");
        jcb_dart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_dartActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_dart, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 160, 30));

        btn_detalhesDodge.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_detalhesDodge.setText("DETALHES");
        btn_detalhesDodge.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_detalhesDodge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesDodgeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detalhesDodge, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 160, 30));

        jl_ford.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_ford.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_ford.setText("FORD");
        getContentPane().add(jl_ford, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, 160, 30));

        jcb_hotrod.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_hotrod.setText("37 Hot Rod, 1937");
        jcb_hotrod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_hotrodActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_hotrod, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, 160, 30));

        jcb_cobra.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_cobra.setText("Cobra, 1968");
        jcb_cobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_cobraActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_cobra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 160, 160, 30));

        jcb_f1.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_f1.setText("F1 Pick Up, 1951");
        jcb_f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_f1ActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 200, 160, 30));

        jcb_fairlane.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_fairlane.setText("Fairlane 500, 1966");
        jcb_fairlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_fairlaneActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_fairlane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 240, 160, 30));

        jcb_maverick.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_maverick.setText("Maverick 302 V8, 1978");
        jcb_maverick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_maverickActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_maverick, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, 160, 30));

        jcb_thunderbird.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_thunderbird.setText("Thunderbird V8, 1955");
        jcb_thunderbird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_thunderbirdActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_thunderbird, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, 160, 30));

        btn_detalhesFord.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_detalhesFord.setText("DETALHES");
        btn_detalhesFord.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_detalhesFord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesFordActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detalhesFord, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, 160, 30));

        jl_plymouth.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_plymouth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_plymouth.setText("PLYMOUTH");
        getContentPane().add(jl_plymouth, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 160, 30));

        jcb_voyager.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_voyager.setText("Voyager, 1983");
        jcb_voyager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_voyagerActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_voyager, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 160, 30));

        jcb_barracuda.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_barracuda.setText("Barracuda AAR, 1974");
        jcb_barracuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_barracudaActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_barracuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 160, 30));

        jcb_sportF.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_sportF.setText("Sport Fury, 1960");
        jcb_sportF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_sportFActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_sportF, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 160, 30));

        jcb_gtx.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_gtx.setText("GTX 440, 1971");
        jcb_gtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_gtxActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_gtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 160, 30));

        btn_detalhesPlymouth.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_detalhesPlymouth.setText("DETALHES");
        btn_detalhesPlymouth.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_detalhesPlymouth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesPlymouthActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detalhesPlymouth, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 160, 30));

        jl_buick.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_buick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_buick.setText("BUICK");
        getContentPane().add(jl_buick, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 30));

        jcb_lesabre.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_lesabre.setText("LeSabre 2D, 1970");
        jcb_lesabre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_lesabreActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_lesabre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 30));

        jcb_riviera.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_riviera.setText("Riviera Stage-1, 1973");
        jcb_riviera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_rivieraActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_riviera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 30));

        jcb_skylark.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_skylark.setText("Skylark Convt, 1964");
        jcb_skylark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_skylarkActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_skylark, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, 30));

        jcb_wildcat.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_wildcat.setText("Wildcat, 1966");
        jcb_wildcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_wildcatActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_wildcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, 30));

        btn_detalhesBuick.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_detalhesBuick.setText("DETALHES");
        btn_detalhesBuick.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_detalhesBuick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesBuickActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detalhesBuick, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, 30));

        jl_pontiac.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_pontiac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_pontiac.setText("PONTIAC");
        getContentPane().add(jl_pontiac, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 160, 30));

        jcb_grandP.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_grandP.setText("Grand Prix, 1966");
        jcb_grandP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_grandPActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_grandP, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 160, 30));

        jcb_starC.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_starC.setText("Star Chief, 1958");
        jcb_starC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_starCActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_starC, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 160, 30));

        jcb_tempest.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_tempest.setText("Tempest Le Mans, 1965");
        jcb_tempest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_tempestActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_tempest, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 160, 30));

        jcb_gto.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_gto.setText("GTO \"The Judge\", 1968");
        jcb_gto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_gtoActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_gto, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 160, 30));

        jcb_firebird.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_firebird.setText("Firebird TransAm, 1979");
        jcb_firebird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_firebirdActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_firebird, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 160, 30));

        btn_detalhesPontiac.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_detalhesPontiac.setText("DETALHES");
        btn_detalhesPontiac.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_detalhesPontiac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesPontiacActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detalhesPontiac, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 160, 30));

        jl_harley.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        jl_harley.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_harley.setText("HARLEY-DAVIDSON");
        getContentPane().add(jl_harley, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 180, 30));

        jcb_heritage.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_heritage.setText("Heritage Springer, 2000");
        jcb_heritage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_heritageActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_heritage, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 160, 30));

        jcb_dyna.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_dyna.setText("Dyna Convertible, 2000");
        jcb_dyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_dynaActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_dyna, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 160, 30));

        jcb_fxr.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_fxr.setText(" FXR, 1989");
        jcb_fxr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_fxrActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_fxr, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 160, 30));

        jcb_superglide.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_superglide.setText("Super Glide, 1983");
        jcb_superglide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_superglideActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_superglide, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 160, 30));

        jcb_tourglide.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_tourglide.setText("Tour Glide, 1980");
        jcb_tourglide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_tourglideActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_tourglide, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 160, 30));

        jcb_sportster.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jcb_sportster.setText("Sportster, 1975");
        jcb_sportster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_sportsterActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_sportster, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 160, 30));

        btn_detalhesHarley.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        btn_detalhesHarley.setText("DETALHES");
        btn_detalhesHarley.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_detalhesHarley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detalhesHarleyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_detalhesHarley, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 160, 30));

        tabela_vendas.setBackground(new java.awt.Color(204, 204, 255));
        tabela_vendas.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tabela_vendas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabela_vendas.setGridColor(new java.awt.Color(0, 0, 0));
        tabela_vendas.setSelectionForeground(new java.awt.Color(204, 153, 255));
        JScrollVendas.setViewportView(tabela_vendas);

        getContentPane().add(JScrollVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 930, 240));

        btn_cadastrarVen.setBackground(new java.awt.Color(255, 255, 255));
        btn_cadastrarVen.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_cadastrarVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cadastrar.png"))); // NOI18N
        btn_cadastrarVen.setText("CADASTRAR");
        btn_cadastrarVen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_cadastrarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarVenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastrarVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 820, 110, 30));

        btn_excluirVen.setBackground(new java.awt.Color(255, 255, 255));
        btn_excluirVen.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_excluirVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/excluir.png"))); // NOI18N
        btn_excluirVen.setText("EXCLUIR");
        btn_excluirVen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_excluirVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirVenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_excluirVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 820, 110, 30));

        btn_alterarVen.setBackground(new java.awt.Color(255, 255, 255));
        btn_alterarVen.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_alterarVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/editar.png"))); // NOI18N
        btn_alterarVen.setText("ALTERAR");
        btn_alterarVen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_alterarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarVenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_alterarVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 820, 110, 30));

        btn_salvarVen.setBackground(new java.awt.Color(255, 255, 255));
        btn_salvarVen.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_salvarVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/salvar.png"))); // NOI18N
        btn_salvarVen.setText("SALVAR");
        btn_salvarVen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_salvarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarVenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salvarVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 820, 110, 30));

        btn_cancelarVen.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelarVen.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_cancelarVen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cancelar.png"))); // NOI18N
        btn_cancelarVen.setText("CANCELAR");
        btn_cancelarVen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_cancelarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarVenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelarVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 820, 110, 30));

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
        getContentPane().add(btn_pesquisarVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 110, 30));

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

        jl_clienteVen.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_clienteVen.setForeground(new java.awt.Color(255, 255, 255));
        jl_clienteVen.setText("Cliente:");
        getContentPane().add(jl_clienteVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 70, 30));

        cbox_clientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbox_clientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbox_clientesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(cbox_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 370, 30));
        getContentPane().add(jtf_pesquisaVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 370, 30));
        getContentPane().add(jtf_dataV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 370, 30));

        jl_dataV.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_dataV.setForeground(new java.awt.Color(255, 255, 255));
        jl_dataV.setText("Data:");
        getContentPane().add(jl_dataV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 50, 30));

        jl_pesquisaVen.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jl_pesquisaVen.setForeground(new java.awt.Color(255, 255, 255));
        jl_pesquisaVen.setText("Pesquisa:");
        getContentPane().add(jl_pesquisaVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 80, 30));

        jtf_total.setEditable(false);
        jtf_total.setBackground(new java.awt.Color(204, 204, 204));
        jtf_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtf_total.setText("R$ ");
        jtf_total.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Segoe UI Emoji", 2, 14))); // NOI18N
        getContentPane().add(jtf_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, 170, -1));

        codBoleto.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        codBoleto.setForeground(new java.awt.Color(255, 255, 255));
        codBoleto.setText("Código do boleto");
        getContentPane().add(codBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 130, 20));

        jtf_codBoleto.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        getContentPane().add(jtf_codBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 240, 30));

        jtf_troco.setEditable(false);
        jtf_troco.setBackground(new java.awt.Color(204, 204, 204));
        jtf_troco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtf_troco.setText("R$ ");
        jtf_troco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Troco", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Segoe UI Emoji", 2, 14))); // NOI18N
        getContentPane().add(jtf_troco, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 620, 170, 40));

        jtf_entregue.setBackground(new java.awt.Color(204, 204, 204));
        jtf_entregue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtf_entregue.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entregue", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Segoe UI Emoji", 2, 14))); // NOI18N
        getContentPane().add(jtf_entregue, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 570, 170, 40));

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
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, 110, 30));

        btn_calcularTroco.setBackground(new java.awt.Color(255, 255, 255));
        btn_calcularTroco.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_calcularTroco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/valortotal.png"))); // NOI18N
        btn_calcularTroco.setText("CALCULAR TROCO");
        btn_calcularTroco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_calcularTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularTrocoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcularTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 670, 170, 30));

        cbox_pagamento.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        cbox_pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Boleto", "Dinheiro", "Cartão" }));
        cbox_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_pagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_pagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 530, 110, 30));

        cbox_qtdX.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        cbox_qtdX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1X", "3X", "5X", "10X" }));
        getContentPane().add(cbox_qtdX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 530, 50, 30));

        jtf_numCartao.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        getContentPane().add(jtf_numCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 240, 30));

        jtf_nomeCartao.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        getContentPane().add(jtf_nomeCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, 240, 30));

        numCartao.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        numCartao.setForeground(new java.awt.Color(255, 255, 255));
        numCartao.setText("Número do cartão");
        getContentPane().add(numCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, -1, 20));

        nomeCartao.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        nomeCartao.setForeground(new java.awt.Color(255, 255, 255));
        nomeCartao.setText("Nome do cartão");
        getContentPane().add(nomeCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, -1, 20));

        conta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        conta.setForeground(new java.awt.Color(255, 255, 255));
        conta.setText("Conta");
        getContentPane().add(conta, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 700, -1, 20));

        jtf_conta.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        getContentPane().add(jtf_conta, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 720, 240, 30));

        cvv.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        cvv.setForeground(new java.awt.Color(255, 255, 255));
        cvv.setText("CVV");
        getContentPane().add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 760, -1, 20));

        jtf_cvv.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        getContentPane().add(jtf_cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 780, 240, 30));

        btn_realizarVenda.setBackground(new java.awt.Color(255, 255, 255));
        btn_realizarVenda.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        btn_realizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cadastrar.png"))); // NOI18N
        btn_realizarVenda.setText("REALIZAR VENDA");
        btn_realizarVenda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 102, 255), 1, true));
        btn_realizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_realizarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_realizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 820, 180, 30));

        titulo.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CADASTRO DE VENDA");
        titulo.setToolTipText("");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1200, 70));

        backVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(backVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_lesabreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_lesabreActionPerformed
        
        if(jcb_lesabre.isSelected()){
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
        
    }//GEN-LAST:event_jcb_lesabreActionPerformed

/////////////////////////////////////////// BOTÕES //////////////////////////////////////////
    
    private void btn_detalhesBuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesBuickActionPerformed
        
        ZBuick b = new ZBuick();
        b.setVisible(true);
        
    }//GEN-LAST:event_btn_detalhesBuickActionPerformed

    private void btn_detalhesChryslerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesChryslerActionPerformed
        
        ZChrysler c = new ZChrysler();
        c.setVisible(true);
        
    }//GEN-LAST:event_btn_detalhesChryslerActionPerformed

    private void btn_detalhesDodgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesDodgeActionPerformed
        
        ZDodge d = new ZDodge();
        d.setVisible(true);
        
    }//GEN-LAST:event_btn_detalhesDodgeActionPerformed

    private void btn_detalhesFordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesFordActionPerformed
        
        ZFord f = new ZFord();
        f.setVisible(true);
        
    }//GEN-LAST:event_btn_detalhesFordActionPerformed

    private void btn_detalhesPlymouthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesPlymouthActionPerformed
        
        ZPlymouth pl = new ZPlymouth();
        pl.setVisible(true);
                
    }//GEN-LAST:event_btn_detalhesPlymouthActionPerformed

    private void btn_detalhesPontiacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesPontiacActionPerformed
        
        ZPontiac po = new ZPontiac();
        po.setVisible(true);
        
    }//GEN-LAST:event_btn_detalhesPontiacActionPerformed

    private void btn_detalhesHarleyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detalhesHarleyActionPerformed
        
        ZHarley h = new ZHarley();
        h.setVisible(true);
        
    }//GEN-LAST:event_btn_detalhesHarleyActionPerformed

    private void btn_anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior2ActionPerformed

        CadVendas.this.dispose();
        
    }//GEN-LAST:event_btn_anterior2ActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed

        String nome = cbox_clientes.getSelectedItem().toString();
        nf = "";
        nf = "////////////////////////////////////////////// NOTA FISCAL DE COMPRA ////////////////////////////////////////////// \n";
        nf = nf + "|| -> CLIENTE: " + nome + "\n";
        nf = nf + "|| -> DATA DA VENDA: " + jtf_dataV.getText() + "\n";
        nf = nf + "************************************************ VEÍCULOS VENDIDOS ************************************************\n||\n";
        carros = "";
        valorTotal = 0;

        //Harley-Davidson
        if(jcb_heritage.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Heritage Springer, 2000 |> Price = R$108.174,95 \n";
            carros = carros + "HarleyDavidson-HeritageSpringer-2000";
            valorTotal = (float) (valorTotal + 108174.95);
        }
        if(jcb_dyna.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Dyna Convertible, 2000 |> Price = R$40.575,75 \n";
            carros = carros + "HarleyDavidson-Dyna-2000";
            valorTotal = (float) (valorTotal + 40575.75);
        }
        if(jcb_fxr.isSelected()) {
            nf = nf + "|| -> Harley-davidson,  FXR, 1989 |> Price = R$41.116,76 \n";
            carros = carros + "HarleyDavidson-fxr-1989";
            valorTotal = (float) (valorTotal + 41116.76);
        }
        if(jcb_superglide.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Super Glide, 1983 |> Price = R$64.904,97 \n";
            carros = carros + "HarleyDavidson-SuperGlide-1983";
            valorTotal = (float) (valorTotal + 64904.97);
        }
        if(jcb_tourglide.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Tour Glide, 1980 |> Price = R$42.739,79 \n";
            carros = carros + "HarleyDavidson-TourGlide-1980";
            valorTotal = (float) (valorTotal + 42739.79);
        }
        if(jcb_sportster.isSelected()) {
            nf = nf + "|| -> Harley-davidson, Sportster, 1975 |> Price = R$47.608,88 \n";
            carros = carros + "HarleyDavidson-Sportster-1975";
            valorTotal = (float) (valorTotal + 47608.88);
        }

        //Ford
        if(jcb_hotrod.isSelected()) {
            nf = nf + "|| -> Ford, 37 Hot Rod, 1937 |> Price = R$215.051,48 \n";
            carros = carros + "Ford-37HotRod-1937";
            valorTotal = (float) (valorTotal + 215051.48);
        }
        if(jcb_cobra.isSelected()) {
            nf = nf + "|| -> Ford, Cobra, 1968 |> Price = R$513.959,50 \n";
            carros = carros + "Ford-Cobra-1968";
            valorTotal = (float) (valorTotal + 513959.50);
        }
        if(jcb_f1.isSelected()) {
            nf = nf + "|| -> Ford, F1 Pick Up, 1951 |> Price = R$419.990,99 \n";
            carros = carros + "Ford-F1PickUp-1951";
            valorTotal = (float) (valorTotal + 419990.99);
        }
        if(jcb_fairlane.isSelected()) {
            nf = nf + "|| -> Ford, Fairlane 500, 1966 |> Price = R$192.599,56 \n";
            carros = carros + "Ford-Fairlane500-1966";
            valorTotal = (float) (valorTotal + 192599.56);
        }
        if(jcb_maverick.isSelected()) {
            nf = nf + "|| -> Ford, Maverick 302 V8, 1978 |> Price = R$220.000,00 \n";
            carros = carros + "Ford-Maverick302V8-1978";
            valorTotal = (float) (valorTotal + 220000);
        }
        if(jcb_thunderbird.isSelected()) {
            nf = nf + "|| -> Ford, Thunderbird V8, 1955 |> Price = R$208.288,85 \n";
            carros = carros + "Ford-Thunderbird-1955";
            valorTotal = (float) (valorTotal + 208288.85);
        }

        //Dodge
        if(jcb_ram.isSelected()) {
            nf = nf + "|| -> Dodge, Ram 1500 V8, 1995 |> Price = R$152.294,32 \n";
            carros = carros + "Dodge-Ram1500V8-1995";
            valorTotal = (float) (valorTotal + 152294.32);
        }
        if(jcb_magnum.isSelected()) {
            nf = nf + "|| -> Dodge, Magnum, 1979 |> Price = R$108.174,95 \n";
            carros = carros + "Dodge-Magnum-1979";
            valorTotal = (float) (valorTotal + 108174.95);
        }
        if(jcb_challenger.isSelected()) {
            nf = nf + "|| -> Dodge, Challenger R/T, 1971 |> Price = R$270.505,00 \n";
            carros = carros + "Dodge-ChallengerR/T-1971";
            valorTotal = (float) (valorTotal + 270505.00);
        }
        if(jcb_charger.isSelected()) {
            nf = nf + "|| -> Dodge, Charger, 1972 |> Price = R$221.814,10 \n";
            carros = carros + "Dodge-Charger-1972";
            valorTotal = (float) (valorTotal + 221814.10);
        }
        if(jcb_dart.isSelected()) {
            nf = nf + "|| -> Dodge, Dart V8, 1974 |> Price = R$259.820,99 \n";
            carros = carros + "Dodge-DartV8-1974";
            valorTotal = (float) (valorTotal + 259820.99);
        }

        //Chrysler
        if(jcb_300.isSelected()) {
            nf = nf + "|| -> Chrysler, 300, 1970 |> Price = R$141.038,69 \n";
            carros = carros + "Chrysler-300-1970";
            valorTotal = (float) (valorTotal + 141038.69);
        }
        if(jcb_windsor.isSelected()) {
            nf = nf + "|| -> Chrysler, Windsor, 1960 |> Price = R$173.664,21 \n";
            carros = carros + "Chrysler-Windsor-1960";
            valorTotal = (float) (valorTotal + 173664.21);
        }
        if(jcb_crownImp.isSelected()) {
            nf = nf + "|| -> Chrysler, Crown Imperial, 1948 |> Price = R$124.973,31 \n";
            carros = carros + "Chrysler-CrownImperial-1948";
            valorTotal = (float) (valorTotal + 124973.31);
        }
        if(jcb_300k.isSelected()) {
            nf = nf + "|| -> Chrysler, 300 K, 1964 |> Price = R$342.188,83 \n";
            carros = carros + "Chrysler-300K-1964";
            valorTotal = (float) (valorTotal + 342188.83);
        }
        if(jcb_stratus.isSelected()) {
            nf = nf + "|| -> Chrysler, Stratus LX Convertible, 1998 |> Price = R$264.553,89 \n";
            carros = carros + "Chrysler-StratusLXConvertible-1998";
            valorTotal = (float) (valorTotal + 264553.89);
        }

        //Buick
        if(jcb_lesabre.isSelected()) {
            nf = nf + "|| -> Buick, LeSabre 2D, 1970 |> Price = R$135.225,45 \n";
            carros = carros + "Buick-LeSabre2D-1970";
            valorTotal = (float) (valorTotal + 135225.45);
        }
        if(jcb_riviera.isSelected()) {
            nf = nf + "|| -> Buick, Riviera Stage-1, 1973 |> Price = R$113.071,90 \n";
            carros = carros + "Buick-RivieraStage1-1973";
            valorTotal = (float) (valorTotal + 113071.90);
        }
        if(jcb_skylark.isSelected()) {
            nf = nf + "|| -> Buick, Skylark Convertible, 1964 |> Price = R$297.555,50 \n";
            carros = carros + "Buick-SkylarkConvertible-1964";
            valorTotal = (float) (valorTotal + 297555.50);
        }
        if(jcb_wildcat.isSelected()) {
            nf = nf + "|| -> Buick, Wildcat, 1966 |> Price = R$242.372,48 \n";
            carros = carros + "Buick-Wildcat-1966";
            valorTotal = (float) (valorTotal + 242372.48);
        }

        //Plymouth
        if(jcb_voyager.isSelected()) {
            nf = nf + "|| -> Plymouth, Voyager, 1983 |> Price = R$51.877,45 \n";
            carros = carros + "Plymouth-Voyager-1983";
            valorTotal = (float) (valorTotal + 51877.45);
        }
        if(jcb_barracuda.isSelected()) {
            nf = nf + "|| -> Plymouth, Barracuda AAR, 1974 |> Price = R$309.674,20 \n";
            carros = carros + "Plymouth-BarracudaAAR-1974";
            valorTotal = (float) (valorTotal + 309674.20);
        }
        if(jcb_sportF.isSelected()) {
            nf = nf + "|| -> Plymouth, Sport Fury, 1960 |> Price = R$253.596,90 \n";
            carros = carros + "Plymouth-SportFury-1960";
            valorTotal = (float) (valorTotal + 253596.90);
        }
        if(jcb_gtx.isSelected()) {
            nf = nf + "|| -> Plymouth, GTX 440, 1971 |> Price = R$125.784,82 \n";
            carros = carros + "Plymouth-GTX440-1971";
            valorTotal = (float) (valorTotal + 125784.82);
        }

        //Pontiac
        if(jcb_grandP.isSelected()) {
            nf = nf + "|| -> Pontiac, Grand Prix, 1966 |> Price = R$148.777,75 \n";
            carros = carros + "Pontiac-GrandPrix-1966";
            valorTotal = (float) (valorTotal + 148777.75);
        }
        if(jcb_starC.isSelected()) {
            nf = nf + "|| -> Pontiac, Star Chief, 1958 |> Price = R$124.405,25 \n";
            carros = carros + "Pontiac-StarChief-1958";
            valorTotal = (float) (valorTotal + 124405.25);
        }
        if(jcb_tempest.isSelected()) {
            nf = nf + "|| -> Pontiac, Tempest Le Mans, 1965 |> Price = R$149.318,76 \n";
            carros = carros + "Pontiac-TempestLeMans-1965";
            valorTotal = (float) (valorTotal + 149318.76);
        }
        if(jcb_gto.isSelected()) {
            nf = nf + "|| -> Pontiac, GTO 'The Judge', 1968 |> Price = R$195.304,61 \n";
            carros = carros + "Pontiac-GTOTheJudge-1968";
            valorTotal = (float) (valorTotal + 195304.61);
        }
        if(jcb_firebird.isSelected()) {
            nf = nf + "|| -> Pontiac, Firebird TransAm, 1979 |> Price = R$182.861,38 \n";
            carros = carros + "Pontiac-FirebirdTransAm-1979";
            valorTotal = (float) (valorTotal + 182861.38);
        }

        nf = nf + "||\n*******************************************************************************************************************\n";
        nf = nf + "||\n|| -> VALOR TOTAL R$ " + valorTotal;

        jtf_total.setText("R$ " + Float.toString(valorTotal));

    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_cadastrarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarVenActionPerformed
        
        atualizarBotoes(false);
        habilitarForm(true);
        jtf_dataV.requestFocus();
        vendaSelect = null;
        
    }//GEN-LAST:event_btn_cadastrarVenActionPerformed

    private void btn_pesquisarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarVenActionPerformed
        
        atualizarTabela();
        
    }//GEN-LAST:event_btn_pesquisarVenActionPerformed

    private void btn_cancelarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarVenActionPerformed
        
        atualizarBotoes(true);
        habilitarForm(false);
        vendaSelect = null;
        
    }//GEN-LAST:event_btn_cancelarVenActionPerformed

    private void btn_alterarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarVenActionPerformed
        
        int linha = tabela_vendas.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        atualizarBotoes(false);
        habilitarForm(true);
        vendaSelect = vendas.get(linha);
        
        jtf_dataV.setText(vendaSelect.getDataV());
        carros = "";
        valorTotal = 0;
        entregue = 0;
        troco = 0;
        boleto = "";
        cartao = "";
        nomeCt = "";
        contaCt = "";
        cvvCt = "";
        vezes = "";
        valorX = 0;
        
        atualizarTabela();
    }//GEN-LAST:event_btn_alterarVenActionPerformed

    private void btn_excluirVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirVenActionPerformed
        
        int linha = tabela_vendas.getSelectedRow();
        
        if (linha < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        vendaSelect = vendas.get(linha);
        
        try {
            vendaDao.remover(vendaSelect.getCodigo());
            JOptionPane.showMessageDialog(null, "Cadastro removido!");
            atualizarTabela();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btn_excluirVenActionPerformed

    private void btn_salvarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarVenActionPerformed

        atualizarBotoes(true);
        habilitarForm(false);
        
        Vendas comp = new Vendas();
        Cliente clienteobj = new Cliente();
        clienteobj = (Cliente) cbox_clientes.getSelectedItem();
        
        String pagamento = cbox_pagamento.getSelectedItem().toString();
        String nome = cbox_clientes.getSelectedItem().toString();
        String dataV = jtf_dataV.getText();
        
        if (dataV.length() == 0) {
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
        
        comp.setDataV(dataV);
        comp.setCarros(carros);
        comp.setValorTotal(valorTotal);
        comp.setMetodoPag(pagamento);
        comp.setClient(clienteobj);
        
        if (pagamento == "Dinheiro") {
            nf = nf + "\n|| \n" + "|| -> MÉTODO DE PAGAMENTO = " +pagamento+ "\n";
            nf = nf + "|| -> VALOR ENTREGUE PELO CLIENTE = R$" +entregue+ "\n";
            nf = nf + "|| -> VALOR DO TROCO = R$" +troco+ "\n";
        }
        
        if (pagamento == "Boleto") {
            nf = nf + "\n|| \n" + "|| -> MÉTODO DE PAGAMENTO = " +pagamento+ "\n";
            nf = nf + "|| -> CÓDIGO DO BOLETO = " + boleto+ "\n";
        }
        
        if (pagamento == "Cartão") {
            nf = nf + "\n|| \n" + "|| -> MÉTODO DE PAGAMENTO = " +pagamento+ "\n";
            nf = nf + "|| -> NOME DO CARTÃO = " +nomeCt+ "\n";
            nf = nf + "|| -> NÚMERO DO CARTÃO = " +cartao+ "\n";
            nf = nf + "|| -> CONTA DO CARTÃO = " +contaCt+ "\n";
            nf = nf + "|| -> CVV DO CARTÃO = " +cvvCt+ "\n";
            nf = nf + "||\n|| -> PAGAMENTO EM "+vezes+" VEZES \n";
            nf = nf + "|| -> VALOR DA(S) PARCELA(S) = R$" +valorX+ "\n";
        }
        
        if (pagamento == "Selecionar") {
            JOptionPane.showMessageDialog(null, "Informe o método de pagamento!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        nf = nf + "|| \n" + "//////////////////////////////////////////////////////////////////////////////////////////////////////////////////";
        
        if (vendaSelect == null) {
            
            try {
                vendaDao.adicionar(comp);
                byte[] buffer = nf.getBytes();
                Random gerador = new Random();
                
                try{
                    RandomAccessFile raf = new RandomAccessFile("C:\\Users\\mythg\\Documents\\NetBeansProjects\\ProjetoFinalEnd\\notasfiscais\\vendas\\"+gerador.nextInt(999999999)+"-"+nome+".html", "rw");
                    raf.write(buffer);
                } catch(IOException ex) {
                        ex.printStackTrace();
                }
        
                JOptionPane.showMessageDialog(null, "Carro cadastrado!");
                
                jtf_dataV.setText("");
                jtf_total.setText("");
                carros = "";
                valorTotal = 0;
                entregue = 0;
                troco = 0;
                boleto = "";
                cartao = "";
                nomeCt = "";
                contaCt = "";
                cvvCt = "";
                vezes = "";
                valorX = 0;
                

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no bando de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        
        } else {
            vendaSelect.setCarros(carros);
            vendaSelect.setDataV(dataV);
            vendaSelect.setValorTotal(valorTotal);
            vendaSelect.setMetodoPag(pagamento);
            vendaSelect.setClient(clienteobj);

            try {
                vendaDao.alterar(vendaSelect);
                JOptionPane.showMessageDialog(null, "Cadastro alterado!");
                atualizarTabela();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        vendaSelect = null;
        
        atualizarTabela();
        atualizarPagamento(false);
        cbox_pagamento.setSelectedIndex(0);
    }//GEN-LAST:event_btn_salvarVenActionPerformed

    
/////////////////////////////////////////// CHECKBOX //////////////////////////////////////////
    
    private void jcb_rivieraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_rivieraActionPerformed
        
        if(jcb_riviera.isSelected()){
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
            jcb_gto.setSelected(false);
            jcb_gtx.setSelected(false);
            jcb_heritage.setSelected(false);
            jcb_hotrod.setSelected(false);
            jcb_magnum.setSelected(false);
            jcb_maverick.setSelected(false);
            jcb_ram.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_rivieraActionPerformed

    private void jcb_skylarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_skylarkActionPerformed
        
        if(jcb_skylark.isSelected()){
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
            jcb_gto.setSelected(false);
            jcb_gtx.setSelected(false);
            jcb_heritage.setSelected(false);
            jcb_hotrod.setSelected(false);
            jcb_magnum.setSelected(false);
            jcb_maverick.setSelected(false);
            jcb_ram.setSelected(false);
            jcb_riviera.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_skylarkActionPerformed

    private void jcb_wildcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_wildcatActionPerformed
        
        if(jcb_wildcat.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_windsor.setSelected(false);
        }
        
    }//GEN-LAST:event_jcb_wildcatActionPerformed

    private void jcb_300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_300ActionPerformed
        
        if(jcb_300.isSelected()){
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_300ActionPerformed

    private void jcb_crownImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_crownImpActionPerformed
        
        if(jcb_crownImp.isSelected()){
            jcb_300.setSelected(false);
            jcb_300k.setSelected(false);
            jcb_barracuda.setSelected(false);
            jcb_challenger.setSelected(false);
            jcb_charger.setSelected(false);
            jcb_cobra.setSelected(false);
            jcb_lesabre.setSelected(false);
            jcb_dart.setSelected(false);
            jcb_dyna.setSelected(false);
            jcb_f1.setSelected(false);
            jcb_fairlane.setSelected(false);
            jcb_firebird.setSelected(false);
            jcb_fxr.setSelected(false);
            jcb_grandP.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_crownImpActionPerformed

    private void jcb_windsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_windsorActionPerformed
       
        if(jcb_windsor.isSelected()){
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
            jcb_lesabre.setSelected(false);
        }
        
    }//GEN-LAST:event_jcb_windsorActionPerformed

    private void jcb_300kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_300kActionPerformed
        
        if(jcb_300k.isSelected()){
            jcb_300.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_300kActionPerformed

    private void jcb_stratusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_stratusActionPerformed
        
        if(jcb_stratus.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_superglide.setSelected(false);
            jcb_tempest.setSelected(false);
            jcb_thunderbird.setSelected(false);
            jcb_tourglide.setSelected(false);
            jcb_voyager.setSelected(false);
            jcb_wildcat.setSelected(false);
            jcb_windsor.setSelected(false);
        }
        
    }//GEN-LAST:event_jcb_stratusActionPerformed

    private void jcb_ramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_ramActionPerformed
        
        if(jcb_ram.isSelected()){
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
            jcb_gto.setSelected(false);
            jcb_gtx.setSelected(false);
            jcb_heritage.setSelected(false);
            jcb_hotrod.setSelected(false);
            jcb_magnum.setSelected(false);
            jcb_maverick.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_ramActionPerformed

    private void jcb_magnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_magnumActionPerformed
        
        if(jcb_magnum.isSelected()){
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
            jcb_gto.setSelected(false);
            jcb_gtx.setSelected(false);
            jcb_heritage.setSelected(false);
            jcb_hotrod.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_magnumActionPerformed

    private void jcb_challengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_challengerActionPerformed
        
        if(jcb_challenger.isSelected()){
            jcb_300.setSelected(false);
            jcb_300k.setSelected(false);
            jcb_barracuda.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_challengerActionPerformed

    private void jcb_chargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_chargerActionPerformed
        
        if(jcb_charger.isSelected()){
            jcb_300.setSelected(false);
            jcb_300k.setSelected(false);
            jcb_barracuda.setSelected(false);
            jcb_challenger.setSelected(false);
            jcb_lesabre.setSelected(false);
            jcb_cobra.setSelected(false);
            jcb_crownImp.setSelected(false);
            jcb_dart.setSelected(false);
            jcb_dyna.setSelected(false);
            jcb_f1.setSelected(false);
            jcb_fairlane.setSelected(false);
            jcb_firebird.setSelected(false);
            jcb_fxr.setSelected(false);
            jcb_grandP.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_chargerActionPerformed

    private void jcb_dartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_dartActionPerformed
        
        if(jcb_dart.isSelected()){
            jcb_300.setSelected(false);
            jcb_300k.setSelected(false);
            jcb_barracuda.setSelected(false);
            jcb_challenger.setSelected(false);
            jcb_charger.setSelected(false);
            jcb_cobra.setSelected(false);
            jcb_crownImp.setSelected(false);
            jcb_lesabre.setSelected(false);
            jcb_dyna.setSelected(false);
            jcb_f1.setSelected(false);
            jcb_fairlane.setSelected(false);
            jcb_firebird.setSelected(false);
            jcb_fxr.setSelected(false);
            jcb_grandP.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_dartActionPerformed

    private void jcb_heritageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_heritageActionPerformed
        
        if(jcb_heritage.isSelected()){
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
            jcb_gto.setSelected(false);
            jcb_gtx.setSelected(false);
            jcb_lesabre.setSelected(false);
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
                
    }//GEN-LAST:event_jcb_heritageActionPerformed

    private void jcb_dynaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_dynaActionPerformed
        
        if(jcb_dyna.isSelected()){
            jcb_300.setSelected(false);
            jcb_300k.setSelected(false);
            jcb_barracuda.setSelected(false);
            jcb_challenger.setSelected(false);
            jcb_charger.setSelected(false);
            jcb_cobra.setSelected(false);
            jcb_crownImp.setSelected(false);
            jcb_dart.setSelected(false);
            jcb_lesabre.setSelected(false);
            jcb_f1.setSelected(false);
            jcb_fairlane.setSelected(false);
            jcb_firebird.setSelected(false);
            jcb_fxr.setSelected(false);
            jcb_grandP.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_dynaActionPerformed

    private void jcb_fxrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_fxrActionPerformed
        
            if(jcb_fxr.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_grandP.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_fxrActionPerformed

    private void jcb_superglideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_superglideActionPerformed
        
        if(jcb_superglide.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_tempest.setSelected(false);
            jcb_thunderbird.setSelected(false);
            jcb_tourglide.setSelected(false);
            jcb_voyager.setSelected(false);
            jcb_wildcat.setSelected(false);
            jcb_windsor.setSelected(false);
        }
        
    }//GEN-LAST:event_jcb_superglideActionPerformed

    private void jcb_tourglideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_tourglideActionPerformed
        
        if(jcb_tourglide.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_voyager.setSelected(false);
            jcb_wildcat.setSelected(false);
            jcb_windsor.setSelected(false);
        }
        
    }//GEN-LAST:event_jcb_tourglideActionPerformed

    private void jcb_sportsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_sportsterActionPerformed
        
        if(jcb_sportster.isSelected()){
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
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_sportsterActionPerformed

    private void jcb_voyagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_voyagerActionPerformed
        
        if(jcb_voyager.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_wildcat.setSelected(false);
            jcb_windsor.setSelected(false);
        }
        
    }//GEN-LAST:event_jcb_voyagerActionPerformed

    private void jcb_barracudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_barracudaActionPerformed
        
        if(jcb_barracuda.isSelected()){
            jcb_300.setSelected(false);
            jcb_300k.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_barracudaActionPerformed

    private void jcb_sportFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_sportFActionPerformed
        
        if(jcb_sportF.isSelected()){
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
            jcb_gto.setSelected(false);
            jcb_gtx.setSelected(false);
            jcb_heritage.setSelected(false);
            jcb_hotrod.setSelected(false);
            jcb_magnum.setSelected(false);
            jcb_maverick.setSelected(false);
            jcb_ram.setSelected(false);
            jcb_riviera.setSelected(false);
            jcb_skylark.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_sportFActionPerformed

    private void jcb_gtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_gtxActionPerformed
        
        if(jcb_gtx.isSelected()){
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
            jcb_gto.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_gtxActionPerformed

    private void jcb_grandPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_grandPActionPerformed
        
        if(jcb_grandP.isSelected()){
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
        
    }//GEN-LAST:event_jcb_grandPActionPerformed

    private void jcb_starCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_starCActionPerformed
       
        if(jcb_starC.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_stratus.setSelected(false);
            jcb_superglide.setSelected(false);
            jcb_tempest.setSelected(false);
            jcb_thunderbird.setSelected(false);
            jcb_tourglide.setSelected(false);
            jcb_voyager.setSelected(false);
            jcb_wildcat.setSelected(false);
            jcb_windsor.setSelected(false);
        }
        
    }//GEN-LAST:event_jcb_starCActionPerformed

    private void jcb_tempestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_tempestActionPerformed
        
        if(jcb_tempest.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_thunderbird.setSelected(false);
            jcb_tourglide.setSelected(false);
            jcb_voyager.setSelected(false);
            jcb_wildcat.setSelected(false);
            jcb_windsor.setSelected(false);
        }
        
    }//GEN-LAST:event_jcb_tempestActionPerformed

    private void jcb_gtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_gtoActionPerformed
        
        if(jcb_gto.isSelected()){
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
        
    }//GEN-LAST:event_jcb_gtoActionPerformed

    private void jcb_firebirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_firebirdActionPerformed
        
        if(jcb_firebird.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_fxr.setSelected(false);
            jcb_grandP.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_firebirdActionPerformed

    private void jcb_hotrodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_hotrodActionPerformed
        
        if(jcb_hotrod.isSelected()){
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
            jcb_gto.setSelected(false);
            jcb_gtx.setSelected(false);
            jcb_heritage.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_hotrodActionPerformed

    private void jcb_cobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_cobraActionPerformed
        
        if(jcb_cobra.isSelected()){
            jcb_300.setSelected(false);
            jcb_300k.setSelected(false);
            jcb_barracuda.setSelected(false);
            jcb_challenger.setSelected(false);
            jcb_charger.setSelected(false);
            jcb_lesabre.setSelected(false);
            jcb_crownImp.setSelected(false);
            jcb_dart.setSelected(false);
            jcb_dyna.setSelected(false);
            jcb_f1.setSelected(false);
            jcb_fairlane.setSelected(false);
            jcb_firebird.setSelected(false);
            jcb_fxr.setSelected(false);
            jcb_grandP.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_cobraActionPerformed

    private void jcb_f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_f1ActionPerformed
        
        if(jcb_f1.isSelected()){
            jcb_300.setSelected(false);
            jcb_300k.setSelected(false);
            jcb_barracuda.setSelected(false);
            jcb_challenger.setSelected(false);
            jcb_charger.setSelected(false);
            jcb_cobra.setSelected(false);
            jcb_crownImp.setSelected(false);
            jcb_dart.setSelected(false);
            jcb_dyna.setSelected(false);
            jcb_lesabre.setSelected(false);
            jcb_fairlane.setSelected(false);
            jcb_firebird.setSelected(false);
            jcb_fxr.setSelected(false);
            jcb_grandP.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_f1ActionPerformed

    private void jcb_fairlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_fairlaneActionPerformed
        
        if(jcb_fairlane.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_firebird.setSelected(false);
            jcb_fxr.setSelected(false);
            jcb_grandP.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_fairlaneActionPerformed

    private void jcb_maverickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_maverickActionPerformed
        
        if(jcb_maverick.isSelected()){
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
            jcb_gto.setSelected(false);
            jcb_gtx.setSelected(false);
            jcb_heritage.setSelected(false);
            jcb_hotrod.setSelected(false);
            jcb_magnum.setSelected(false);
            jcb_lesabre.setSelected(false);
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
        
    }//GEN-LAST:event_jcb_maverickActionPerformed

    private void jcb_thunderbirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_thunderbirdActionPerformed
        
        if(jcb_thunderbird.isSelected()){
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
            jcb_lesabre.setSelected(false);
            jcb_tourglide.setSelected(false);
            jcb_voyager.setSelected(false);
            jcb_wildcat.setSelected(false);
            jcb_windsor.setSelected(false);
        }
        
    }//GEN-LAST:event_jcb_thunderbirdActionPerformed

    private void cbox_clientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbox_clientesAncestorAdded
        
    }//GEN-LAST:event_cbox_clientesAncestorAdded

    private void btn_calcularTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularTrocoActionPerformed
        entregue = 0;
        troco = 0;
        
        try{
            entregue = Float.parseFloat(jtf_entregue.getText());
            
        } catch(NumberFormatException ex) {
            ex.printStackTrace();
        }
        
        if (entregue < valorTotal) {
             JOptionPane.showMessageDialog(null, "O valor entregue pelo cliente é menor que o valor total!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        
        } else {
            try {
                troco = entregue - valorTotal;
                jtf_troco.setText("R$ "+String.valueOf(troco));

            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_btn_calcularTrocoActionPerformed

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
            jtf_numCartao.show();
            jtf_nomeCartao.show();
            jtf_conta.show();
            jtf_cvv.show();
            cbox_qtdX.show();
            conta.show();
            cvv.show();
            numCartao.show();
            nomeCartao.show();
            btn_realizarVenda.show();
        }
        
        if (pagamento == "Dinheiro") {
            atualizarPagamento(true);
            jtf_entregue.show();
            jtf_troco.show();
            btn_calcularTroco.show();
        }
    }//GEN-LAST:event_cbox_pagamentoActionPerformed

    private void btn_realizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_realizarVendaActionPerformed
       
        cartao = jtf_numCartao.getText();
        nomeCt = jtf_nomeCartao.getText();
        contaCt = jtf_conta.getText();
        cvvCt = jtf_cvv.getText();
        vezes = cbox_qtdX.getSelectedItem().toString();
        
        if (cartao.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o número do cartão!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (nomeCt.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o nome do cartão!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (contaCt.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a conta do cartão!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (cvvCt.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o CVV do cartão!", "Atenção", JOptionPane.WARNING_MESSAGE);
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
        if (vezes == "...") {
            JOptionPane.showMessageDialog(null, "informe a quantidade de parcelas!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_btn_realizarVendaActionPerformed

    
/////////////////////////////////////////// FUNÇÕES //////////////////////////////////////////
    
    private void habilitarForm(boolean status) {
        jtf_dataV.setEnabled(status);
        jtf_total.setEnabled(status);
        cbox_pagamento.setEnabled(status);
        cbox_clientes.setEnabled(status);
        
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
        btn_cadastrarVen.setEnabled(status);
        btn_excluirVen.setEnabled(status);
        btn_alterarVen.setEnabled(status);
        btn_pesquisarVen.setEnabled(status);
        btn_calcular.setEnabled(!status);
        btn_cancelarVen.setEnabled(!status);
        btn_salvarVen.setEnabled(!status);
    }
    
    private void atualizarPagamento(boolean status) {
        jtf_codBoleto.hide();
        jtf_conta.hide();
        jtf_cvv.hide();
        jtf_entregue.hide();
        jtf_nomeCartao.hide();
        jtf_numCartao.hide();
        jtf_troco.hide();
        cbox_qtdX.hide();
        btn_calcularTroco.hide();
        codBoleto.hide();
        conta.hide();
        cvv.hide();
        numCartao.hide();
        nomeCartao.hide();
        btn_realizarVenda.hide();
    }
    
    private void atualizarTabela() {
        try {
            vendas = vendaDao.buscarData(jtf_pesquisaVen.getText());
            
            DefaultTableModel model = (DefaultTableModel) tabela_vendas.getModel();
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
    
    private void carregarClientes(){
        List<Cliente> clientes2 = clienteDao.buscar();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cbox_clientes.getModel();
        modelo.removeAllElements();
        
            for(Cliente cliente1:clientes2){
                modelo.addElement(cliente1);
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollVendas;
    private javax.swing.JLabel backVendas;
    private javax.swing.JButton btn_alterarVen;
    private javax.swing.JButton btn_anterior2;
    private javax.swing.JButton btn_cadastrarVen;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_calcularTroco;
    private javax.swing.JButton btn_cancelarVen;
    private javax.swing.JButton btn_detalhesBuick;
    private javax.swing.JButton btn_detalhesChrysler;
    private javax.swing.JButton btn_detalhesDodge;
    private javax.swing.JButton btn_detalhesFord;
    private javax.swing.JButton btn_detalhesHarley;
    private javax.swing.JButton btn_detalhesPlymouth;
    private javax.swing.JButton btn_detalhesPontiac;
    private javax.swing.JButton btn_excluirVen;
    private javax.swing.JButton btn_pesquisarVen;
    private javax.swing.JButton btn_realizarVenda;
    private javax.swing.JButton btn_salvarVen;
    private javax.swing.JComboBox cbox_clientes;
    private javax.swing.JComboBox<String> cbox_pagamento;
    private javax.swing.JComboBox<String> cbox_qtdX;
    private javax.swing.JLabel codBoleto;
    private javax.swing.JLabel conta;
    private javax.swing.JLabel cvv;
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
    private javax.swing.JLabel jl_chrysler;
    private javax.swing.JLabel jl_clienteVen;
    private javax.swing.JLabel jl_dataV;
    private javax.swing.JLabel jl_dodge;
    private javax.swing.JLabel jl_ford;
    private javax.swing.JLabel jl_harley;
    private javax.swing.JLabel jl_pesquisaVen;
    private javax.swing.JLabel jl_plymouth;
    private javax.swing.JLabel jl_pontiac;
    private javax.swing.JTextField jtf_codBoleto;
    private javax.swing.JTextField jtf_conta;
    private javax.swing.JTextField jtf_cvv;
    private javax.swing.JTextField jtf_dataV;
    private javax.swing.JTextField jtf_entregue;
    private javax.swing.JTextField jtf_nomeCartao;
    private javax.swing.JTextField jtf_numCartao;
    private javax.swing.JTextField jtf_pesquisaVen;
    private javax.swing.JTextField jtf_total;
    private javax.swing.JTextField jtf_troco;
    private javax.swing.JLabel nomeCartao;
    private javax.swing.JLabel numCartao;
    private javax.swing.JTable tabela_vendas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}