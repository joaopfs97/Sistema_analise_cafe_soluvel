package dao;
import model.Amostra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AmostraDAO {
    private Connection conn;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private ArrayList listaNomes = new ArrayList();
    private ArrayList listaCodigos = new ArrayList();  
    
    public AmostraDAO(){
        conn = new Conexao().getConexao();
    }
    
    public void inserirAmostra(Amostra amostra){
        String sql = "INSERT INTO tb_amostra(codigoQualidade, nomeAmostra,"
            + "tipoDoCafe) VALUE(?, ?, ?)";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setInt(1,amostra.getCodigoQualidade());
            pst.setString(2, amostra.getNomeAmostra());
            pst.setString(3, amostra.getTipoDoCafe());
            pst.execute();
            pst.close();
        } catch(Exception erro){
            throw new RuntimeException("Erro inserir amostra: " + erro);
        }            
    }
    
    public void atualizarAmostra(Amostra amostra){
        String sql = "UPDATE tb_amostra SET codigoQualidade = ?,"
                + "nomeAmostra = ?, tipoDoCafe = ? "
                + "WHERE codigoAmostra = ?";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setInt(1,amostra.getCodigoQualidade());
            pst.setString(2, amostra.getNomeAmostra());
            pst.setString(3, amostra.getTipoDoCafe());
            pst.setInt(4,amostra.getCodigoAmostra());
            pst.execute();
            pst.close();
        } catch(Exception erro){
            throw new RuntimeException("Erro atualizar amostra: " + erro);
        }
    }
    public ArrayList listarNomesAmostras(){
        String sql = "SELECT nomeAmostra FROM tb_amostra";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                listaNomes.add(rs.getString("nomeAmostra"));
            }
        } catch(Exception erro){
            throw new RuntimeException("Erro listar nomes amostras: " + erro);
        }
       return listaNomes;
    }
    
    public ArrayList listarCodigosAmostras(){
        String sql = "SELECT * FROM tb_amostra";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                listaCodigos.add(rs.getInt("codigoAmostra"));
            }
        } catch(Exception erro){
            throw new RuntimeException("Erro listar codigos amostras: " + erro);
        }
       return listaCodigos;
    }
}

