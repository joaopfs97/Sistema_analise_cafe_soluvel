package dao;
import model.Analista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AnalistaDAO {
    private Connection conn;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private ArrayList listaNomes = new ArrayList();
    private ArrayList listaCodigos = new ArrayList();
    
    public AnalistaDAO(){
        conn = new Conexao().getConexao();
    }
    
    public void inserirAnalista(Analista analista){
        String sql = "INSERT INTO tb_analista(registroAnalista, nomeAnalista, turnoAnalista) VALUE(?, ?, ?)";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setInt(1, analista.getRegistroAnalista());
            pst.setString(2, analista.getNomeAnalista());
            pst.setString(3, analista.getTurnoAnalista());
            pst.execute();
            pst.close();
        } catch(Exception erro){
            throw new RuntimeException("Erro inserir analista: " + erro);
        }            
    }
    
    public void atualizarAnalista(Analista analista){
        String sql = "UPDATE tb_analista SET nomeAnalista = ?,"
                + "turnoAnalista = ? "
                + "WHERE registroAnalista = ?";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,analista.getNomeAnalista());
            pst.setString(2, analista.getTurnoAnalista());
            pst.setInt(3, analista.getRegistroAnalista());
            pst.execute();
            pst.close();
        } catch(Exception erro){
            throw new RuntimeException("Erro atualizar analista: " + erro);
        }
    }
    public ArrayList listarNomesAnalistas(){
        String sql = "SELECT nomeAnalista FROM tb_analista";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                listaNomes.add(rs.getString("nomeAnalista"));
            }
        } catch(Exception erro){
            throw new RuntimeException("Erro listar nomes analistas: " + erro);
        }
       return listaNomes;
    }
    
    public ArrayList listarCodigosAnalistas(){
        String sql = "SELECT * FROM tb_analista";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                listaCodigos.add(rs.getInt("registroAnalista"));
            }
        } catch(Exception erro){
            throw new RuntimeException("Erro listar codigos analistas: " + erro);
        }
       return listaCodigos;
    }
}
