package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.Conexao;
import modelo.Carro;
import java.util.ArrayList;
import java.util.List;

public class CarroDao {
    public void adicionar(Carro carro) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "INSERT INTO carro(marca, modelo, ano, dataComp, placa, numVIN, cidade, estado) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, carro.getMarca());
        ps.setString(2, carro.getModelo());
        ps.setString(3, carro.getAno());
        ps.setString(4, carro.getDataComp());
        ps.setString(5, carro.getPlaca());
        ps.setString(6, carro.getNumVIN());
        ps.setString(7, carro.getCidade());
        ps.setString(8, carro.getEstado());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Carro> buscarNome(String marca) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "SELECT * FROM carro WHERE marca LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, "%" + marca + "%");
        ResultSet rs = ps.executeQuery();
        
        List<Carro> carros = new ArrayList<>();
        while (rs.next()) {
            Carro carro = new Carro(
                    rs.getString("marca"), 
                    rs.getString("modelo"), 
                    rs.getString("ano"), 
                    rs.getString("dataComp"), 
                    rs.getString("placa"), 
                    rs.getString("numVIN"), 
                    rs.getString("cidade"), 
                    rs.getString("estado"), 
                    rs.getInt("codigo")
            );
            
            carros.add(carro);
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return carros;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql= "DELETE FROM carro WHERE codigo= ?";
         
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         
         ps.executeUpdate();
         ps.close();
         conexao.close();
    }
    
    public void alterar(Carro carro)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql= "UPDATE carro SET marca=?, modelo=?, ano=?, dataComp=?, placa=?, numVIN=?, cidade=?, estado=? WHERE codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, carro.getMarca());
        ps.setString(2, carro.getModelo());
        ps.setString(3, carro.getAno());
        ps.setString(4, carro.getDataComp());
        ps.setString(5, carro.getPlaca());
        ps.setString(6, carro.getNumVIN());
        ps.setString(7, carro.getCidade());
        ps.setString(8, carro.getEstado());
        ps.setInt(9, carro.getCodigo());
        
        ps.executeUpdate();
        ps.close();
        conexao.close();
    } 
}
