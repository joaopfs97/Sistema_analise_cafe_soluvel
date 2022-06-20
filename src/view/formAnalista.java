package view;
import dao.AnalistaDAO;
import model.Analista;
import javax.swing.JOptionPane;

public class formAnalista extends javax.swing.JFrame {
    Analista analista = new Analista();
    AnalistaDAO danalista = new AnalistaDAO();
    
    public formAnalista() {
        initComponents();
        preencherCB();
        campoNomeAnalista.grabFocus();
    }
    
    void limpar(){
        campoNomeAnalista.setText(null);
        campoRegistroAnalista.setText(null);
        cbTurnoAnalista.setSelectedIndex(0);
        campoNomeAnalista.grabFocus();
    }
    
    void preencherCB(){
        cbTurnoAnalista.addItem("");
        cbTurnoAnalista.addItem("Turno A");
        cbTurnoAnalista.addItem("Turno B");
        cbTurnoAnalista.addItem("Turno C");
        cbTurnoAnalista.addItem("Turno D");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        campoNomeAnalista = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoRegistroAnalista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbTurnoAnalista = new javax.swing.JComboBox<>();
        botaoSalvarAnalista = new javax.swing.JButton();
        botaoLimparAnalista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Novo Analista");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nome do Analista");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Registro do Analista");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Turno Analista");

        cbTurnoAnalista.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        botaoSalvarAnalista.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        botaoSalvarAnalista.setText("Salvar");
        botaoSalvarAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarAnalistaActionPerformed(evt);
            }
        });

        botaoLimparAnalista.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        botaoLimparAnalista.setText("Limpar");
        botaoLimparAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparAnalistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoNomeAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoRegistroAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTurnoAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(botaoSalvarAnalista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLimparAnalista)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoRegistroAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTurnoAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarAnalista)
                    .addComponent(botaoLimparAnalista))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparAnalistaActionPerformed
        limpar();
    }//GEN-LAST:event_botaoLimparAnalistaActionPerformed

    private void botaoSalvarAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarAnalistaActionPerformed
        if(campoNomeAnalista.getText().equals("") || campoRegistroAnalista.getText().equals("")||
                cbTurnoAnalista.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Favor, preencha todos os campos", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            analista.setNomeAnalista(campoNomeAnalista.getText());
            analista.setRegistroAnalista(Integer.parseInt(campoRegistroAnalista.getText()));
            analista.setTurnoAnalista(cbTurnoAnalista.getSelectedItem().toString());
            danalista.inserirAnalista(analista);
            JOptionPane.showMessageDialog(null, "Analista cadastrado com sucesso");
            limpar();
            dispose();
        }
    }//GEN-LAST:event_botaoSalvarAnalistaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimparAnalista;
    private javax.swing.JButton botaoSalvarAnalista;
    private javax.swing.JTextField campoNomeAnalista;
    private javax.swing.JTextField campoRegistroAnalista;
    private javax.swing.JComboBox<String> cbTurnoAnalista;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
