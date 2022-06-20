package view;
import javax.swing.ImageIcon;
public class formTelaPrincipal extends javax.swing.JFrame {
    
    public formTelaPrincipal() {    
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelImagem1 = new view.painelImagem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastroAnalise = new javax.swing.JMenu();
        menuCadastrarAnalise = new javax.swing.JMenuItem();
        menuAnalista = new javax.swing.JMenu();
        menuCadastrarAnalista = new javax.swing.JMenuItem();
        menuAtualizarAnalista = new javax.swing.JMenuItem();
        menuAmostra = new javax.swing.JMenu();
        menuCadastrarAmostra = new javax.swing.JMenuItem();
        menuAtualizarAmostra = new javax.swing.JMenuItem();
        menuQualidade = new javax.swing.JMenu();
        menuCadastrarQualidade = new javax.swing.JMenuItem();
        menuAtualizarQualidade = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuVisualizarRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Análise Sensorial de Café Solúvel");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        painelImagem1.setImg(new ImageIcon("src/img/cafe.jpg"));

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextPane1.setText("SISTEMA DE ANÁLISES EM CAFÉ SOLÚVEL");
        jTextPane1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextPane1.setDragEnabled(true);
        jTextPane1.setEnabled(false);
        jScrollPane1.setViewportView(jTextPane1);
        jScrollPane1.setViewportBorder(null);
        jScrollPane1.setBorder(null);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout painelImagem1Layout = new javax.swing.GroupLayout(painelImagem1);
        painelImagem1.setLayout(painelImagem1Layout);
        painelImagem1Layout.setHorizontalGroup(
            painelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagem1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        painelImagem1Layout.setVerticalGroup(
            painelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImagem1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportBorder(null);
        jScrollPane2.setBorder(null);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cadastroAnalise.setText("Analise");
        cadastroAnalise.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        menuCadastrarAnalise.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCadastrarAnalise.setText("Cadastrar Analise");
        menuCadastrarAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarAnaliseActionPerformed(evt);
            }
        });
        cadastroAnalise.add(menuCadastrarAnalise);

        jMenuBar1.add(cadastroAnalise);

        menuAnalista.setText("Analista");
        menuAnalista.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        menuCadastrarAnalista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCadastrarAnalista.setText("Cadastrar Analista");
        menuCadastrarAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarAnalistaActionPerformed(evt);
            }
        });
        menuAnalista.add(menuCadastrarAnalista);

        menuAtualizarAnalista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAtualizarAnalista.setText("Atualizar Analista");
        menuAtualizarAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtualizarAnalistaActionPerformed(evt);
            }
        });
        menuAnalista.add(menuAtualizarAnalista);

        jMenuBar1.add(menuAnalista);

        menuAmostra.setText("Amostra");
        menuAmostra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        menuCadastrarAmostra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCadastrarAmostra.setText("Cadastrar Amostra");
        menuCadastrarAmostra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarAmostraActionPerformed(evt);
            }
        });
        menuAmostra.add(menuCadastrarAmostra);

        menuAtualizarAmostra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAtualizarAmostra.setText("Atualizar Amostra");
        menuAtualizarAmostra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtualizarAmostraActionPerformed(evt);
            }
        });
        menuAmostra.add(menuAtualizarAmostra);

        jMenuBar1.add(menuAmostra);

        menuQualidade.setText("Qualidade");
        menuQualidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        menuCadastrarQualidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuCadastrarQualidade.setText("Cadastrar Qualidade");
        menuCadastrarQualidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarQualidadeActionPerformed(evt);
            }
        });
        menuQualidade.add(menuCadastrarQualidade);

        menuAtualizarQualidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuAtualizarQualidade.setText("Atualizar Qualidade");
        menuAtualizarQualidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtualizarQualidadeActionPerformed(evt);
            }
        });
        menuQualidade.add(menuAtualizarQualidade);

        jMenuBar1.add(menuQualidade);

        menuRelatorio.setText("Relatório");
        menuRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        menuVisualizarRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menuVisualizarRelatorio.setText("Visualizar Relatório");
        menuVisualizarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizarRelatorioActionPerformed(evt);
            }
        });
        menuRelatorio.add(menuVisualizarRelatorio);

        jMenuBar1.add(menuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarAnalistaActionPerformed
        formAnalista fmAnalista = new formAnalista();
        fmAnalista.setVisible(true);
    }//GEN-LAST:event_menuCadastrarAnalistaActionPerformed
    
    private void menuCadastrarQualidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarQualidadeActionPerformed
        formQualidade fmQualidade = new formQualidade();
        fmQualidade.setVisible(true);
    }//GEN-LAST:event_menuCadastrarQualidadeActionPerformed

    private void menuCadastrarAmostraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarAmostraActionPerformed
        formAmostra fmAmostra = new formAmostra();
        fmAmostra.setVisible(true);
    }//GEN-LAST:event_menuCadastrarAmostraActionPerformed

    private void menuVisualizarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizarRelatorioActionPerformed
        formRelatorio formRelatorio = new formRelatorio();
        formRelatorio.setVisible(true);
    }//GEN-LAST:event_menuVisualizarRelatorioActionPerformed

    private void menuCadastrarAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarAnaliseActionPerformed
        formAnalise formAnalise = new formAnalise();
        formAnalise.setVisible(true);
    }//GEN-LAST:event_menuCadastrarAnaliseActionPerformed

    private void menuAtualizarAmostraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtualizarAmostraActionPerformed
        formAmostraEditar fmAmostraE = new formAmostraEditar();
        fmAmostraE.setVisible(true);
    }//GEN-LAST:event_menuAtualizarAmostraActionPerformed

    private void menuAtualizarAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtualizarAnalistaActionPerformed
        formAnalistaEditar fmAnalistaE = new formAnalistaEditar();
        fmAnalistaE.setVisible(true);
    }//GEN-LAST:event_menuAtualizarAnalistaActionPerformed

    private void menuAtualizarQualidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtualizarQualidadeActionPerformed
        formQualidadeEditar fmQualidadeE = new formQualidadeEditar();
        fmQualidadeE.setVisible(true);
    }//GEN-LAST:event_menuAtualizarQualidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastroAnalise;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenu menuAmostra;
    private javax.swing.JMenu menuAnalista;
    private javax.swing.JMenuItem menuAtualizarAmostra;
    private javax.swing.JMenuItem menuAtualizarAnalista;
    private javax.swing.JMenuItem menuAtualizarQualidade;
    private javax.swing.JMenuItem menuCadastrarAmostra;
    private javax.swing.JMenuItem menuCadastrarAnalise;
    private javax.swing.JMenuItem menuCadastrarAnalista;
    private javax.swing.JMenuItem menuCadastrarQualidade;
    private javax.swing.JMenu menuQualidade;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem menuVisualizarRelatorio;
    private view.painelImagem painelImagem1;
    // End of variables declaration//GEN-END:variables
}