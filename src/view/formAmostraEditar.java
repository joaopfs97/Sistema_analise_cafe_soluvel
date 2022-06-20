package view;
import model.Amostra;
import dao.AmostraDAO;
import dao.QualidadeDAO;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class formAmostraEditar extends javax.swing.JFrame {
    
    Amostra amostra = new Amostra();
    AmostraDAO damostra = new AmostraDAO();
    QualidadeDAO dqualidade = new QualidadeDAO();
    
    ArrayList listaNomes = dqualidade.listarNomesQualidades();
    ArrayList listaCodigos = dqualidade.listarCodigosQualidades();
    ArrayList listaNomesAmostras = damostra.listarNomesAmostras();
    ArrayList listaCodigosAmostras = damostra.listarCodigosAmostras();
    
    public formAmostraEditar() {
        initComponents();
        preencheCB();
        preencheCBAmostra();
    }
    
    void limpar(){
        cbNomeAmostra.setSelectedIndex(0);
        campoNomeAmostra.setText("");
        cbNomeQualidade.setSelectedIndex(0);
        cbTipoDoCafe.setSelectedIndex(0);
    }
    
    void preencheCBAmostra(){
        cbNomeAmostra.addItem("");
        for(int i = 0; i < listaNomesAmostras.size(); i++){
           String nomeAmostra = listaNomesAmostras.get(i).toString();
           String codigoAmostra = String.valueOf(listaCodigosAmostras.get(i).toString());
           String nomeFormatado = codigoAmostra + " - " + nomeAmostra;
           cbNomeAmostra.addItem(nomeFormatado);
       }
    }
    
    void preencheCB(){
       cbTipoDoCafe.addItem("");
       cbTipoDoCafe.addItem("Freeze Dried");
       cbTipoDoCafe.addItem("Spray Dried");
       cbTipoDoCafe.addItem("Aglomerado"); 
       cbTipoDoCafe.addItem("Óleo de Café");
       cbTipoDoCafe.addItem("Café Verde");
        
       cbNomeQualidade.addItem("");
       for(int i = 0; i < listaNomes.size(); i++){
           String nomeQualidade = listaNomes.get(i).toString();
           String codigoQualidade = String.valueOf(listaCodigos.get(i).toString());
           String nomeFormatado = codigoQualidade + " - " + nomeQualidade;
           cbNomeQualidade.addItem(nomeFormatado);
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbTipoDoCafe = new javax.swing.JComboBox<>();
        botaoSalvarAmostra = new javax.swing.JButton();
        cbNomeAmostra = new javax.swing.JComboBox<>();
        btLimpar = new javax.swing.JButton();
        cbNomeQualidade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        campoNomeAmostra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Amostra");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Nome da Amostra");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nome da Qualidade");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Tipo do Café");

        cbTipoDoCafe.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        botaoSalvarAmostra.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        botaoSalvarAmostra.setText("Salvar");
        botaoSalvarAmostra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarAmostraActionPerformed(evt);
            }
        });

        cbNomeAmostra.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        btLimpar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        cbNomeQualidade.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Novo Nome Amostra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbNomeQualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoDoCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(botaoSalvarAmostra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoNomeAmostra)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbNomeAmostra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(64, 64, 64))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbNomeAmostra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoNomeAmostra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSalvarAmostra)
                            .addComponent(btLimpar))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbNomeQualidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbTipoDoCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(81, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarAmostraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarAmostraActionPerformed
      if(cbNomeAmostra.getSelectedItem().toString().equals("") || cbNomeAmostra.getSelectedItem().toString().equals("")
              || cbTipoDoCafe.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Favor, preencha todos os campos", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            int indexItemSelecionadoQualidade = cbNomeQualidade.getSelectedIndex() - 1;
            int indexAtualizaAmostra = cbNomeAmostra.getSelectedIndex() - 1;
            amostra.setCodigoAmostra(Integer.parseInt(listaCodigosAmostras.get(indexAtualizaAmostra).toString()));
            amostra.setNomeAmostra(campoNomeAmostra.getText());
            amostra.setCodigoQualidade(Integer.parseInt(listaCodigos.get(indexItemSelecionadoQualidade).toString()));
            amostra.setTipoDoCafe(cbTipoDoCafe.getSelectedItem().toString());
            damostra.atualizarAmostra(amostra);
            JOptionPane.showMessageDialog(null, "Amostra atualizada com sucesso");
            limpar();
            dispose();
        }
    }//GEN-LAST:event_botaoSalvarAmostraActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvarAmostra;
    private javax.swing.JButton btLimpar;
    private javax.swing.JTextField campoNomeAmostra;
    private javax.swing.JComboBox<String> cbNomeAmostra;
    private javax.swing.JComboBox<String> cbNomeQualidade;
    private javax.swing.JComboBox<String> cbTipoDoCafe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
