package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.Conexao;
import modelo.Distribuidora;
import java.util.ArrayList;
import java.util.List;

public class DistribuidoraDao {
    public void adicionar(Distribuidora dist) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "INSERT INTO distribuidora(empresa, cnpj, responsavel, endereco, cidade, estado, telefone, email) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, dist.getEmpresa());
        ps.setString(2, dist.getCnpj());
        ps.setString(3, dist.getResponsavel());
        ps.setString(4, dist.getEndereco());
        ps.setString(5, dist.getCidade());
        ps.setString(6, dist.getEstado());
        ps.setString(7, dist.getTelefone());
        ps.setString(8, dist.getEmail());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Distribuidora> buscarNome(String empresa) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "SELECT * FROM distribuidora WHERE empresa LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, "%" + empresa + "%");
        ResultSet rs = ps.executeQuery();
        
        List<Distribuidora> dists = new ArrayList<>();
        while (rs.next()) {
            Distribuidora dist = new Distribuidora(
                    rs.getString("empresa"), 
                    rs.getString("cnpj"), 
                    rs.getString("responsavel"), 
                    rs.getString("endereco"), 
                    rs.getString("cidade"), 
                    rs.getString("estado"), 
                    rs.getString("telefone"), 
                    rs.getString("email"), 
                    rs.getInt("codigo")
            );
            
            dists.add(dist);
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return dists;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql= "DELETE FROM distribuidora WHERE codigo= ?";
         
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         
         ps.executeUpdate();
         ps.close();
         conexao.close();
    }
    
    public void alterar(Distribuidora dist)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql= "UPDATE distribuidora SET empresa=?, cnpj=?, responsavel=?, endereco=?, cidade=?, estado=?, telefone=?, email=? WHERE codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, dist.getEmpresa());
        ps.setString(2, dist.getCnpj());
        ps.setString(3, dist.getResponsavel());
        ps.setString(4, dist.getEndereco());
        ps.setString(5, dist.getCidade());
        ps.setString(6, dist.getEstado());
        ps.setString(7, dist.getTelefone());
        ps.setString(8, dist.getEmail());
        ps.setInt(9, dist.getCodigo());
        
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
}
