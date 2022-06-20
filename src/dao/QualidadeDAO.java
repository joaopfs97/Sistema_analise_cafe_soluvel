package dao;
import model.Qualidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class QualidadeDAO {
    private Connection conn;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private ArrayList listaNomes = new ArrayList();
    private ArrayList listaCodigos = new ArrayList();
    
    public QualidadeDAO(){
        conn = new Conexao().getConexao();
    }
    
    public void inserirQualidade(Qualidade qualidade){
        String sql = "INSERT INTO tb_qualidade(nomeQualidade, porcentCafeConilon,"
            + "porcentCafeArabica) VALUE(?, ?, ?)";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,qualidade.getNomeQualidade());
            pst.setInt(2, qualidade.getPorcentCafeConilon());
            pst.setInt(3, qualidade.getPorcentCafeArabica());
            pst.execute();
            pst.close();
        } catch(Exception erro){
            throw new RuntimeException("Erro inserir qualidade: " + erro);
        }            
    }
    
    public void atualizarQualidade(Qualidade qualidade){
        String sql = "UPDATE tb_qualidade SET nomeQualidade = ?,"
                + "porcentCafeConilon = ?, porcentCafeArabica = ? "
                + "WHERE codigoQualidade = ?";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,qualidade.getNomeQualidade());
            pst.setInt(2, qualidade.getPorcentCafeConilon());
            pst.setInt(3, qualidade.getPorcentCafeArabica());
            pst.setInt(4,qualidade.getCodigoQualidade());
            pst.execute();
            pst.close();
        } catch(Exception erro){
            throw new RuntimeException("Erro atualizar qualidade: " + erro);
        }
    }

    public ArrayList listarNomesQualidades(){
        String sql = "SELECT nomeQualidade FROM tb_qualidade";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                listaNomes.add(rs.getString("nomeQualidade"));
            }
        } catch(Exception erro){
            throw new RuntimeException("Erro listar nomes qualidades: " + erro);
        }
       return listaNomes;
    }
    
    public ArrayList listarCodigosQualidades(){
        String sql = "SELECT * FROM tb_qualidade";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                listaCodigos.add(rs.getInt("codigoQualidade"));
            }
        } catch(Exception erro){
            throw new RuntimeException("Erro listar codigos qualidades: " + erro);
        }
       return listaCodigos;
    }
    
        
}
