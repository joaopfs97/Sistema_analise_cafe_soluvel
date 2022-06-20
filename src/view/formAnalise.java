package view;
import model.Analise;
import dao.AnaliseDAO;
import dao.AmostraDAO;
import dao.AnalistaDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class formAnalise extends javax.swing.JFrame {

    Analise analise = new Analise();
    AnaliseDAO danalise = new AnaliseDAO();
    AmostraDAO damostra = new AmostraDAO();
    AnalistaDAO danalista = new AnalistaDAO();
    ArrayList listaNomesAmostras = damostra.listarNomesAmostras();
    ArrayList listaCodigosAmostras = damostra.listarCodigosAmostras();
    ArrayList listaNomesAnalistas = danalista.listarNomesAnalistas();
    ArrayList listaRegistrosAnalistas = danalista.listarCodigosAnalistas();
    
    public formAnalise() {
        initComponents();
        preencheCBAnalista();
        preencheCBAmostra();
        
    }
    
    void limpar(){
        cbNomeAnalista.setSelectedIndex(0);
        cbNomeAmostra.setSelectedIndex(0);
        campoAcidez.setText("");
        campoAdstringencia.setText("");
        campoAmargor.setText("");
        campoAroma.setText("");
        campoCaramelizado.setText("");
        campoCorpo.setText("");
        campoDocura.setText("");
        campoEquilibrio.setText("");
        campoPosProva.setText("");
        campoSabor.setText("");
        campoPontuacaoTotal.setText("");
        campoClassificacaoCafe.setText("");
        chbAcidezAce.setSelected(false);
        chbAcidezCit.setSelected(false);
        chbAcidezMal.setSelected(false);
        chbAcucar.setSelected(false);
        chbAmenCas.setSelected(false);
        chbAspAgre.setSelected(false);
        chbAvel.setSelected(false);
        chbCaram.setSelected(false);
        chbCereais.setSelected(false);
        chbChocAmarg.setSelected(false);
        chbChocLei.setSelected(false);
        chbCouro.setSelected(false);
        chbCozido.setSelected(false);
        chbDelicada.setSelected(false);
        chbDoce.setSelected(false);
        chbEquilibrada.setSelected(false);
        chbEspeci.setSelected(false);
        chbFenol.setSelected(false);
        chbFloral.setSelected(false);
        chbFrut.setSelected(false);
        chbFrutCit.setSelected(false);
        chbFrutSec.setSelected(false);
        chbFrutTrop.setSelected(false);
        chbHerb.setSelected(false);
        chbHidr.setSelected(false);
        chbLic.setSelected(false);
        chbMade.setSelected(false);
        chbMascavo.setSelected(false);
        chbMel.setSelected(false);
        chbNeut.setSelected(false);
        chbOut.setSelected(false);
        chbOxi.setSelected(false);
        chbPipoc.setSelected(false);
        chbProc.setSelected(false);
        chbQuei.setSelected(false);
        chbQuim.setSelected(false);
        chbRem.setSelected(false);
        chbSed.setSelected(false);
        chbTorrado.setSelected(false);
        campoComentarios.setText("");
    }
    
    void preencheCBAnalista(){
        cbNomeAnalista.addItem("");
        for(int i = 0; i < listaNomesAnalistas.size(); i++){
           String nomeAnalista = listaNomesAnalistas.get(i).toString();
           String registroAnalista = String.valueOf(listaRegistrosAnalistas.get(i).toString());
           String nomeFormatado = registroAnalista + " - " + nomeAnalista;
           cbNomeAnalista.addItem(nomeFormatado);
       }
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
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbNomeAnalista = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbNomeAmostra = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        campoAroma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoSabor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoDocura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoAcidez = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoAdstringencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoCaramelizado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoAmargor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoCorpo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoEquilibrio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoPosProva = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoPontuacaoTotal = new javax.swing.JTextField();
        campoClassificacaoCafe = new javax.swing.JTextField();
        chbAcidezAce = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        chbAcidezCit = new javax.swing.JCheckBox();
        chbAcidezMal = new javax.swing.JCheckBox();
        chbAcucar = new javax.swing.JCheckBox();
        chbAmenCas = new javax.swing.JCheckBox();
        chbAspAgre = new javax.swing.JCheckBox();
        chbAvel = new javax.swing.JCheckBox();
        chbCaram = new javax.swing.JCheckBox();
        chbCereais = new javax.swing.JCheckBox();
        chbFenol = new javax.swing.JCheckBox();
        chbChocAmarg = new javax.swing.JCheckBox();
        chbChocLei = new javax.swing.JCheckBox();
        chbCouro = new javax.swing.JCheckBox();
        chbCozido = new javax.swing.JCheckBox();
        chbDelicada = new javax.swing.JCheckBox();
        chbDoce = new javax.swing.JCheckBox();
        chbEquilibrada = new javax.swing.JCheckBox();
        chbEspeci = new javax.swing.JCheckBox();
        chbFloral = new javax.swing.JCheckBox();
        chbFrut = new javax.swing.JCheckBox();
        chbFrutCit = new javax.swing.JCheckBox();
        chbFrutSec = new javax.swing.JCheckBox();
        chbFrutTrop = new javax.swing.JCheckBox();
        chbHerb = new javax.swing.JCheckBox();
        chbHidr = new javax.swing.JCheckBox();
        chbLic = new javax.swing.JCheckBox();
        chbMade = new javax.swing.JCheckBox();
        chbQuim = new javax.swing.JCheckBox();
        chbMascavo = new javax.swing.JCheckBox();
        chbMel = new javax.swing.JCheckBox();
        chbNeut = new javax.swing.JCheckBox();
        chbOut = new javax.swing.JCheckBox();
        chbOxi = new javax.swing.JCheckBox();
        chbPipoc = new javax.swing.JCheckBox();
        chbProc = new javax.swing.JCheckBox();
        chbQuei = new javax.swing.JCheckBox();
        chbSed = new javax.swing.JCheckBox();
        chbTorrado = new javax.swing.JCheckBox();
        chbRem = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoComentarios = new javax.swing.JTextArea();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Análise");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(217, 195, 154));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        super.getContentPane().setBackground(new Color(255,229,158));
        jPanel1.setPreferredSize(new java.awt.Dimension(591, 1000));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Nome do Analista");

        cbNomeAnalista.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nome da Amostra");

        cbNomeAmostra.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Aroma");

        campoAroma.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoAroma.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Sabor");

        campoSabor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoSabor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Doçura");

        campoDocura.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoDocura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Acidez");

        campoAcidez.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoAcidez.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Adstringência");

        campoAdstringencia.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoAdstringencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Caramelizado");

        campoCaramelizado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoCaramelizado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("Amargor");

        campoAmargor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoAmargor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Corpo");

        campoCorpo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoCorpo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setText("Equilíbrio");

        campoEquilibrio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoEquilibrio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setText("Pós-Prova");

        campoPosProva.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoPosProva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoPosProva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoPosProvaFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setText("Pontuação Total");

        campoPontuacaoTotal.setEditable(false);
        campoPontuacaoTotal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoPontuacaoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoClassificacaoCafe.setEditable(false);
        campoClassificacaoCafe.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        campoClassificacaoCafe.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        chbAcidezAce.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbAcidezAce.setText("Acidez Acética");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Perfil da Bebida");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Comentários");

        chbAcidezCit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbAcidezCit.setText("Acidez Cítrica");

        chbAcidezMal.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbAcidezMal.setText("Acidez Málica");

        chbAcucar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbAcucar.setText("Açucar");

        chbAmenCas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbAmenCas.setText("Amêndoas/Castanha");

        chbAspAgre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbAspAgre.setText("Áspero/Agressivo");

        chbAvel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbAvel.setText("Aveludado");

        chbCaram.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbCaram.setText("Caramelo");

        chbCereais.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbCereais.setText("Cereais");

        chbFenol.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbFenol.setText("Fenólico");

        chbChocAmarg.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbChocAmarg.setText("Chocolate amargo");

        chbChocLei.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbChocLei.setText("Chocolate ao leite");

        chbCouro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbCouro.setText("Couro");

        chbCozido.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbCozido.setText("Cozido");

        chbDelicada.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbDelicada.setText("Delicada");

        chbDoce.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbDoce.setText("Doce");

        chbEquilibrada.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbEquilibrada.setText("Equilibrada");

        chbEspeci.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbEspeci.setText("Especiarias");

        chbFloral.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbFloral.setText("Floral");

        chbFrut.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbFrut.setText("Frutal");

        chbFrutCit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbFrutCit.setText("Frutas Cítricas");

        chbFrutSec.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbFrutSec.setText("Frutas Secas");

        chbFrutTrop.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbFrutTrop.setText("Frutas Tropicais");

        chbHerb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbHerb.setText("Herbal");

        chbHidr.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbHidr.setText("Hidrólise");

        chbLic.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbLic.setText("Licoroso");

        chbMade.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbMade.setText("Madeira");

        chbQuim.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbQuim.setText("Químico");

        chbMascavo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbMascavo.setText("Mascavo");

        chbMel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbMel.setText("Mel");

        chbNeut.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbNeut.setText("Neutro/Flat");

        chbOut.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbOut.setText("Outros");

        chbOxi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbOxi.setText("Oxidado");

        chbPipoc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbPipoc.setText("Pipoca");

        chbProc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbProc.setText("Processo");

        chbQuei.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbQuei.setText("Queimado");

        chbSed.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbSed.setText("Sedoso");

        chbTorrado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbTorrado.setText("Torrado");

        chbRem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        chbRem.setText("Remédio");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Características da Bebida");

        campoComentarios.setColumns(20);
        campoComentarios.setRows(5);
        jScrollPane2.setViewportView(campoComentarios);

        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 232, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(campoClassificacaoCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbAcidezCit)
                            .addComponent(chbDelicada)
                            .addComponent(chbChocLei)
                            .addComponent(chbEspeci)
                            .addComponent(chbCaram)
                            .addComponent(chbAmenCas)
                            .addComponent(chbFrut)
                            .addComponent(chbFrutTrop)
                            .addComponent(chbLic)
                            .addComponent(chbMel)
                            .addComponent(chbOxi)
                            .addComponent(chbQuei)
                            .addComponent(chbSed))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbAspAgre)
                            .addComponent(chbAcidezMal)
                            .addComponent(chbCereais)
                            .addComponent(chbCouro)
                            .addComponent(chbDoce)
                            .addComponent(chbFenol)
                            .addComponent(chbFrutCit)
                            .addComponent(chbHerb)
                            .addComponent(chbMade)
                            .addComponent(chbNeut)
                            .addComponent(chbPipoc)
                            .addComponent(chbQuim)
                            .addComponent(chbTorrado))
                        .addGap(24, 24, 24))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbMascavo)
                    .addComponent(chbOut)
                    .addComponent(chbProc)
                    .addComponent(chbFloral)
                    .addComponent(chbFrutSec)
                    .addComponent(chbHidr)
                    .addComponent(chbChocAmarg)
                    .addComponent(chbCozido)
                    .addComponent(chbEquilibrada)
                    .addComponent(chbAcidezAce)
                    .addComponent(chbAcucar)
                    .addComponent(chbAvel)
                    .addComponent(chbRem)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campoAmargor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoPosProva, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoEquilibrio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCaramelizado, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(57, 57, 57))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoPontuacaoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbNomeAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbNomeAmostra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoDocura, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoAcidez, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoAdstringencia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoAroma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator3))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(180, 180, 180)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoClassificacaoCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel16)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chbAspAgre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbCereais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbCouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbDoce)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbFenol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbFrutCit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbHerb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbMade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbNeut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbPipoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbQuim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbTorrado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chbAcidezCit)
                                    .addComponent(chbAcidezMal)
                                    .addComponent(chbAcidezAce))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbAmenCas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbCaram)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbChocLei)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbDelicada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbEspeci)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbFrut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbFrutTrop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbLic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbMel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbOxi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chbQuei)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chbSed))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chbAcucar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbAvel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbChocAmarg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbCozido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbEquilibrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbFloral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbFrutSec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbHidr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbMascavo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chbProc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbRem)))
                .addGap(36, 36, 36)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cbNomeAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbNomeAmostra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoAroma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(campoCaramelizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(campoSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(campoAmargor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(campoDocura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(campoCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(campoAcidez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(campoEquilibrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(campoAdstringencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(campoPosProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(campoPontuacaoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(410, 410, 410)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void atualizaPontuacao(){
    int pontuacao = (int) (Integer.parseInt(campoAroma.getText()) +
            Integer.parseInt(campoSabor.getText()) +
            Integer.parseInt(campoDocura.getText()) +
            Integer.parseInt(campoAcidez.getText()) +
            Integer.parseInt(campoAdstringencia.getText()) +
            Integer.parseInt(campoCaramelizado.getText()) +
            Integer.parseInt(campoAmargor.getText()) +
            Integer.parseInt(campoCorpo.getText()) +
            Integer.parseInt(campoEquilibrio.getText()) +
            Integer.parseInt(campoPosProva.getText()));
        campoPontuacaoTotal.setText(Integer.toString(pontuacao));
        
    if(pontuacao >= 73){
        campoClassificacaoCafe.setText("Café de Excelência");
    } else if(pontuacao >= 60 && pontuacao <= 72){
        campoClassificacaoCafe.setText("Café Diferenciado");
      } else{
          campoClassificacaoCafe.setText("Café Convencional");  
          }
    }
    private void campoPosProvaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPosProvaFocusLost
        atualizaPontuacao();
    }//GEN-LAST:event_campoPosProvaFocusLost

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(cbNomeAnalista.getSelectedItem().toString().equals("") || cbNomeAmostra.getSelectedItem().toString().equals("") 
                || campoAcidez.getText().equals("") || campoAdstringencia.getText().equals("") || campoAmargor.getText().equals("")
                || campoAroma.getText().equals("") || campoCaramelizado.getText().equals("") || campoCorpo.getText().equals("")
                || campoDocura.getText().equals("") || campoEquilibrio.getText().equals("") || campoPosProva.getText().equals("") 
                || campoSabor.getText().equals("")){
         
            JOptionPane.showMessageDialog(null, "Favor, preencha todos os campos", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            int indexAnalistaSelecionado = cbNomeAnalista.getSelectedIndex() - 1;
            int indexAmostraSelecionada = cbNomeAmostra.getSelectedIndex() - 1;
            analise.setRegistroAnalista(Integer.parseInt(listaRegistrosAnalistas.get(indexAnalistaSelecionado).toString()));
            analise.setCodigoAmostra(Integer.parseInt(listaCodigosAmostras.get(indexAmostraSelecionada).toString()));
            analise.setAcidez(Integer.parseInt(campoAcidez.getText()));
            analise.setAdstringencia(Integer.parseInt(campoAdstringencia.getText()));
            analise.setAmargor(Integer.parseInt(campoAmargor.getText()));
            analise.setAroma(Integer.parseInt(campoAroma.getText()));
            analise.setCaramelizado(Integer.parseInt(campoCaramelizado.getText()));
            analise.setCorpo(Integer.parseInt(campoCorpo.getText()));
            analise.setDocura(Integer.parseInt(campoDocura.getText()));
            analise.setEquilibrio(Integer.parseInt(campoEquilibrio.getText()));
            analise.setPosProva(Integer.parseInt(campoPosProva.getText()));
            analise.setSabor(Integer.parseInt(campoSabor.getText()));
            analise.setPontuacaoTotal(Integer.parseInt(campoPontuacaoTotal.getText()));
            analise.setClassificacao(campoClassificacaoCafe.getText());
            
            String CaracteristicasCafe = "";
            if(chbAcidezAce.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Acidez Acetica";}
            if(chbAcidezCit.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Acidez Cítrica";}
            if(chbAcidezMal.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Acidez Málica";}
            if(chbAcucar.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Açucar";}
            if(chbAmenCas.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Amendoas / Castanha";}
            if(chbAspAgre.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Áspero / Agressivo";}
            if(chbAvel.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Aveludado";}
            if(chbCaram.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Caramelo";}
            if(chbCereais.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Cereais";}
            if(chbChocAmarg.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Chocolate Amargo";}
            if(chbChocLei.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Chocolate ao Leite";}
            if(chbCouro.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Couro";}
            if(chbCozido.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Cozido";}
            if(chbDelicada.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Delicada";}
            if(chbDoce.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Doce";}
            if(chbEquilibrada.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Equilibrada";}
            if(chbEspeci.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Especiarias";}
            if(chbFenol.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Fenólico";}
            if(chbFloral.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Floral";}
            if(chbFrut.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Frutal";}
            if(chbFrutCit.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Frutas Cítricas ";}
            if(chbFrutSec.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Frutas Secas";}
            if(chbFrutTrop.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Frutas Tropicais";}
            if(chbHerb.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Herbal";}
            if(chbHidr.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Hidrólise";}
            if(chbLic.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Licoroso";}
            if(chbMade.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Madeira";}
            if(chbMascavo.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Mascavo";}
            if(chbMel.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Mel";}
            if(chbNeut.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Neutro / Flat";}
            if(chbOut.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Outros";}
            if(chbOxi.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Oxidado";}
            if(chbPipoc.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Pipoca";}
            if(chbProc.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Processo";}
            if(chbQuei.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Queimado";}
            if(chbQuim.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Químico";}
            if(chbRem.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Remédio";}
            if(chbSed.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Sedoso";}
            if(chbTorrado.isSelected()){CaracteristicasCafe = CaracteristicasCafe + ", Torrado";}
            CaracteristicasCafe = CaracteristicasCafe.substring(2);
            
            analise.setCaracteristicas(CaracteristicasCafe);
            analise.setComentarios(campoComentarios.getText());
            
            danalise.inserirAnalise(analise);
            JOptionPane.showMessageDialog(null, "Análise cadastrada com sucesso");
            limpar();
            dispose();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField campoAcidez;
    private javax.swing.JTextField campoAdstringencia;
    private javax.swing.JTextField campoAmargor;
    private javax.swing.JTextField campoAroma;
    private javax.swing.JTextField campoCaramelizado;
    private javax.swing.JTextField campoClassificacaoCafe;
    private javax.swing.JTextArea campoComentarios;
    private javax.swing.JTextField campoCorpo;
    private javax.swing.JTextField campoDocura;
    private javax.swing.JTextField campoEquilibrio;
    private javax.swing.JTextField campoPontuacaoTotal;
    private javax.swing.JTextField campoPosProva;
    private javax.swing.JTextField campoSabor;
    private javax.swing.JComboBox<String> cbNomeAmostra;
    private javax.swing.JComboBox<String> cbNomeAnalista;
    private javax.swing.JCheckBox chbAcidezAce;
    private javax.swing.JCheckBox chbAcidezCit;
    private javax.swing.JCheckBox chbAcidezMal;
    private javax.swing.JCheckBox chbAcucar;
    private javax.swing.JCheckBox chbAmenCas;
    private javax.swing.JCheckBox chbAspAgre;
    private javax.swing.JCheckBox chbAvel;
    private javax.swing.JCheckBox chbCaram;
    private javax.swing.JCheckBox chbCereais;
    private javax.swing.JCheckBox chbChocAmarg;
    private javax.swing.JCheckBox chbChocLei;
    private javax.swing.JCheckBox chbCouro;
    private javax.swing.JCheckBox chbCozido;
    private javax.swing.JCheckBox chbDelicada;
    private javax.swing.JCheckBox chbDoce;
    private javax.swing.JCheckBox chbEquilibrada;
    private javax.swing.JCheckBox chbEspeci;
    private javax.swing.JCheckBox chbFenol;
    private javax.swing.JCheckBox chbFloral;
    private javax.swing.JCheckBox chbFrut;
    private javax.swing.JCheckBox chbFrutCit;
    private javax.swing.JCheckBox chbFrutSec;
    private javax.swing.JCheckBox chbFrutTrop;
    private javax.swing.JCheckBox chbHerb;
    private javax.swing.JCheckBox chbHidr;
    private javax.swing.JCheckBox chbLic;
    private javax.swing.JCheckBox chbMade;
    private javax.swing.JCheckBox chbMascavo;
    private javax.swing.JCheckBox chbMel;
    private javax.swing.JCheckBox chbNeut;
    private javax.swing.JCheckBox chbOut;
    private javax.swing.JCheckBox chbOxi;
    private javax.swing.JCheckBox chbPipoc;
    private javax.swing.JCheckBox chbProc;
    private javax.swing.JCheckBox chbQuei;
    private javax.swing.JCheckBox chbQuim;
    private javax.swing.JCheckBox chbRem;
    private javax.swing.JCheckBox chbSed;
    private javax.swing.JCheckBox chbTorrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
