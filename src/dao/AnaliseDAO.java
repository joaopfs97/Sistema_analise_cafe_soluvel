package dao;
import model.Analise;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.time.LocalDate;

public class AnaliseDAO {
    private Connection conn;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private ArrayList listaAnalise = new ArrayList();
    private ArrayList listaCodigosAnalises = new ArrayList();
    private ArrayList listaDatasAnalises = new ArrayList();
    public AnaliseDAO(){
        conn = new Conexao().getConexao();
    }
    
    public void inserirAnalise(Analise analise){
        String sql = "INSERT INTO tb_analise(registroAnalista,dataAnalise, aroma, sabor,"
                + "docura, acidez, adstringencia, caramelizado, amargor, corpo, equilibrio,"
                + "posProva, pontuacaoTotal, classificacao, caracteristicas,"
            + "comentarios, codigoAmostra) VALUE(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            LocalDate dataResposta = LocalDate.now();
            String dataRespostaSQL = dataResposta.toString().substring(0, 10);
            pst = conn.prepareStatement(sql);
            pst.setInt(1,analise.getRegistroAnalista());
            pst.setString(2, dataRespostaSQL);
            pst.setInt(3, analise.getAroma());
            pst.setInt(4, analise.getSabor());
            pst.setInt(5, analise.getDocura());
            pst.setInt(6, analise.getAcidez());
            pst.setInt(7, analise.getAdstringencia());
            pst.setInt(8, analise.getCaramelizado());
            pst.setInt(9, analise.getAmargor());
            pst.setInt(10, analise.getCorpo());
            pst.setInt(11, analise.getEquilibrio());
            pst.setInt(12, analise.getPosProva());
            pst.setInt(13, analise.getPontuacaoTotal());
            pst.setString(14, analise.getClassificacao());
            pst.setString(15, analise.getCaracteristicas());
            pst.setString(16, analise.getComentarios());
            pst.setInt(17, analise.getCodigoAmostra());
            pst.execute();
            pst.close();
        } catch(Exception erro){
            throw new RuntimeException("Erro inserir analise: " + erro);
        }            
    }
    
    public ArrayList listarCodigoAnalises(){
        String sql = "SELECT codigoAnalise FROM tb_analise";
        
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                listaCodigosAnalises.add(rs.getInt("codigoAnalise"));
            }
        } catch(Exception erro){
            throw new RuntimeException("Erro listar codigos analises: " + erro);
        }
        
        return listaCodigosAnalises;
    }
    
    public ArrayList listarDatasAnalises(){
        String sql = "SELECT dataAnalise FROM tb_analise";
        
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String data = (rs.getDate("dataAnalise").toString());
                String ano = data.substring(0,4);
                String mes = data.substring(5,7);
                String dia = data.substring(8);
                String dataFormatada = dia + "/" + mes + "/" + ano;
                listaDatasAnalises.add(dataFormatada);
                
            }
        } catch(Exception erro){
            throw new RuntimeException("Erro listar datas analises: " + erro);
        }
        
        return listaDatasAnalises;
    }
    
    public ArrayList listarAnalise(int codigoAnalise){
        String sql = "SELECT c.nomeAmostra, b.nomeAnalista, dataAnalise, aroma, sabor,"
                + "docura, acidez, adstringencia, caramelizado, amargor, corpo, equilibrio,"
                + "posProva, pontuacaoTotal, classificacao, caracteristicas, comentarios "
                + "FROM tb_analise as a "
                + "INNER JOIN tb_analista as b ON a.registroAnalista = b.registroAnalista "
                + "INNER JOIN tb_amostra as c ON a.codigoAmostra = c.codigoAmostra "
                + "WHERE codigoAnalise = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setInt(1, codigoAnalise);
            rs = pst.executeQuery();
            while(rs.next()){
                listaAnalise.removeAll(listaAnalise);
                listaAnalise.add(rs.getString("nomeAmostra")); //0
                listaAnalise.add(rs.getString("nomeAnalista")); //1
                listaAnalise.add(rs.getInt("aroma"));//2
                listaAnalise.add(rs.getInt("sabor"));//3
                listaAnalise.add(rs.getInt("docura"));//4
                listaAnalise.add(rs.getInt("acidez"));//5
                listaAnalise.add(rs.getInt("adstringencia"));//6
                listaAnalise.add(rs.getInt("caramelizado"));//7
                listaAnalise.add(rs.getInt("amargor"));//8
                listaAnalise.add(rs.getInt("corpo"));//9
                listaAnalise.add(rs.getInt("equilibrio"));//10
                listaAnalise.add(rs.getInt("posProva"));//11
                listaAnalise.add(rs.getInt("pontuacaoTotal"));//12
                listaAnalise.add(rs.getString("classificacao"));//13
                listaAnalise.add(rs.getString("caracteristicas"));//14
                listaAnalise.add(rs.getString("comentarios"));//15
                
            }
        } catch(Exception erro){
            throw new RuntimeException("Erro listar analise: " + erro);
        }
       return listaAnalise;
    }
    
        
}

