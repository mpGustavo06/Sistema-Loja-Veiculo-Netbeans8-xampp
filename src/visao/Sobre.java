/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author mythg
 */
public class Sobre extends javax.swing.JFrame {

    /**
     * Creates new form Sobre
     */
    public Sobre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_nome = new javax.swing.JLabel();
        jl_ra = new javax.swing.JLabel();
        iconSobre = new javax.swing.JLabel();
        btn_anterior2 = new javax.swing.JButton();
        backSobre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_nome.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jl_nome.setForeground(new java.awt.Color(255, 255, 255));
        jl_nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_nome.setText("Aluno: Gustavo Matheus Pauvels");
        getContentPane().add(jl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 1200, -1));

        jl_ra.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jl_ra.setForeground(new java.awt.Color(255, 255, 255));
        jl_ra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_ra.setText("RA: a2371278");
        getContentPane().add(jl_ra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1200, -1));

        iconSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/sobre.png"))); // NOI18N
        getContentPane().add(iconSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

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

        backSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fundo.png"))); // NOI18N
        getContentPane().add(backSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior2ActionPerformed

        Sobre.this.dispose();
        
    }//GEN-LAST:event_btn_anterior2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backSobre;
    private javax.swing.JButton btn_anterior2;
    private javax.swing.JLabel iconSobre;
    private javax.swing.JLabel jl_nome;
    private javax.swing.JLabel jl_ra;
    // End of variables declaration//GEN-END:variables
}
