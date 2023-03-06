package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.Conexao;
import modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    
    public void adicionar(Cliente cliente) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "INSERT INTO cliente(nome, cpf, genero, dataNasc, endereco, cidade, estado, telefone, email) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setString(3, cliente.getGenero());
        ps.setString(4, cliente.getDataNasc());
        ps.setString(5, cliente.getEndereco());
        ps.setString(6, cliente.getCidade());
        ps.setString(7, cliente.getEstado());
        ps.setString(8, cliente.getTelefone());
        ps.setString(9, cliente.getEmail());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Cliente> buscarNome(String nome) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "SELECT * FROM cliente WHERE nome LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        
        List<Cliente> clientes = new ArrayList<>();
        while (rs.next()) {
            Cliente cliente = new Cliente(
                    rs.getString("nome"), 
                    rs.getString("cpf"), 
                    rs.getString("genero"), 
                    rs.getString("dataNasc"), 
                    rs.getString("endereco"), 
                    rs.getString("cidade"), 
                    rs.getString("estado"), 
                    rs.getString("telefone"), 
                    rs.getString("email"),
                    rs.getInt("codigo")
            );
            
            clientes.add(cliente);
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return clientes;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql= "DELETE FROM cliente WHERE codigo= ?";
         
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         
         ps.executeUpdate();
         ps.close();
         conexao.close();
    }
    
    public void alterar(Cliente cliente)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql= "UPDATE cliente SET nome=?, cpf=?, genero=?, dataNasc=?, endereco=?, cidade=?, estado=?, telefone=?, email=? WHERE codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getCpf());
        ps.setString(3, cliente.getGenero());
        ps.setString(4, cliente.getDataNasc());
        ps.setString(5, cliente.getEndereco());
        ps.setString(6, cliente.getCidade());
        ps.setString(7, cliente.getEstado());
        ps.setString(8, cliente.getTelefone());
        ps.setString(9, cliente.getEmail());
        ps.setInt(10, cliente.getCodigo());
        
        ps.executeUpdate();
        ps.close();
        conexao.close();
    } 
    
    public List<Cliente> buscar(){
        String sql="SELECT * FROM cliente";
        Connection conexao = new Conexao().getConexao();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            List<Cliente> resultado = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setNome(rs.getString("nome"));
                
                resultado.add(cliente);
            }
            return resultado;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
}
