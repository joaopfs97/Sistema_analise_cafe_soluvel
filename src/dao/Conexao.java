package dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public Connection getConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/sistema_an_cafe_soluvel", "root","");
        } catch(Exception erro){
            throw new RuntimeException("Erro Conexão: " + erro);
        }
    }
}
