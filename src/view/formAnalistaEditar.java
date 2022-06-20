package view;
import dao.AnalistaDAO;
import model.Analista;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class formAnalistaEditar extends javax.swing.JFrame {
    Analista analista = new Analista();
    AnalistaDAO danalista = new AnalistaDAO();
    ArrayList listaNomeAnalistas = danalista.listarNomesAnalistas();
    ArrayList listaCodigosAnalistas = danalista.listarCodigosAnalistas();
    
    public formAnalistaEditar() {
        initComponents();
        preencherCB();
        campoNomeAnalista.grabFocus();
    }
    
    void limpar(){
        cbNomeAnalista.setSelectedIndex(0);
        campoNomeAnalista.setText(null);
        cbTurnoAnalista.setSelectedIndex(0);
        campoNomeAnalista.grabFocus();
    }
    
    void preencherCB(){
        cbTurnoAnalista.addItem("");
        cbTurnoAnalista.addItem("Turno A");
        cbTurnoAnalista.addItem("Turno B");
        cbTurnoAnalista.addItem("Turno C");
        cbTurnoAnalista.addItem("Turno D");
        
        cbNomeAnalista.addItem("");
        for(int i = 0; i < listaNomeAnalistas.size(); i++){
           String nomeAnalista = listaNomeAnalistas.get(i).toString();
           String codigoAnalista = String.valueOf(listaCodigosAnalistas.get(i).toString());
           String nomeFormatado = codigoAnalista + " - " + nomeAnalista;
           cbNomeAnalista.addItem(nomeFormatado);
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        campoNomeAnalista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbTurnoAnalista = new javax.swing.JComboBox<>();
        botaoSalvarAnalista = new javax.swing.JButton();
        botaoLimparAnalista = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbNomeAnalista = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Analista");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Novo Nome Analista");

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Nome do Analista");

        cbNomeAnalista.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(botaoSalvarAnalista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLimparAnalista)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(52, 52, 52)
                        .addComponent(cbTurnoAnalista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(157, 157, 157))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoNomeAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbNomeAnalista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbNomeAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTurnoAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
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
        if(campoNomeAnalista.getText().equals("") ||
                cbTurnoAnalista.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Favor, preencha todos os campos", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            int indexAtualizaAnalista = cbNomeAnalista.getSelectedIndex() - 1;
            analista.setRegistroAnalista(Integer.parseInt(listaCodigosAnalistas.get(indexAtualizaAnalista).toString()));
            analista.setNomeAnalista(campoNomeAnalista.getText());
            analista.setTurnoAnalista(cbTurnoAnalista.getSelectedItem().toString());
            danalista.atualizarAnalista(analista);
            JOptionPane.showMessageDialog(null, "Analista atualizado com sucesso");
            limpar();
            dispose();
        }
    }//GEN-LAST:event_botaoSalvarAnalistaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimparAnalista;
    private javax.swing.JButton botaoSalvarAnalista;
    private javax.swing.JTextField campoNomeAnalista;
    private javax.swing.JComboBox<String> cbNomeAnalista;
    private javax.swing.JComboBox<String> cbTurnoAnalista;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
