package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.Conexao;
import modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {
    public void adicionar(Funcionario func) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "INSERT INTO funcionario(nome, cpf, genero, cargo, dataNasc, endereco, cidade, estado, telefone, email) VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, func.getNome());
        ps.setString(2, func.getCpf());
        ps.setString(3, func.getGenero());
        ps.setString(4, func.getCargo());
        ps.setString(5, func.getDataNasc());
        ps.setString(6, func.getEndereco());
        ps.setString(7, func.getCidade());
        ps.setString(8, func.getEstado());
        ps.setString(9, func.getTelefone());
        ps.setString(10, func.getEmail());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Funcionario> buscarNome(String nome) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "SELECT * FROM funcionario WHERE nome LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, "%" + nome + "%");
        ResultSet rs = ps.executeQuery();
        
        List<Funcionario> funcs = new ArrayList<>();
        while (rs.next()) {
            Funcionario func = new Funcionario(
                    rs.getString("nome"), 
                    rs.getString("cpf"), 
                    rs.getString("genero"), 
                    rs.getString("cargo"), 
                    rs.getString("dataNasc"), 
                    rs.getString("endereco"), 
                    rs.getString("cidade"), 
                    rs.getString("estado"), 
                    rs.getString("telefone"), 
                    rs.getString("email"), 
                    rs.getInt("codigo")
            );
            
            funcs.add(func);
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return funcs;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql= "DELETE FROM funcionario WHERE codigo= ?";
         
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         
         ps.executeUpdate();
         ps.close();
         conexao.close();
    }
    
    public void alterar(Funcionario func)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql= "UPDATE funcionario SET nome=?, cpf=?, genero=?, cargo=?, dataNasc=?, endereco=?, cidade=?, estado=?, telefone=?, email=? WHERE codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, func.getNome());
        ps.setString(2, func.getCpf());
        ps.setString(3, func.getGenero());
        ps.setString(4, func.getCargo());
        ps.setString(5, func.getDataNasc());
        ps.setString(6, func.getEndereco());
        ps.setString(7, func.getCidade());
        ps.setString(8, func.getEstado());
        ps.setString(9, func.getTelefone());
        ps.setString(10, func.getEmail());
        ps.setInt(11, func.getCodigo());
        
        ps.executeUpdate();
        ps.close();
        conexao.close();
    } 
    
    public List<Funcionario> buscar(){
        String sql="SELECT * FROM funcionario";
        Connection conexao = new Conexao().getConexao();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            List<Funcionario> resultado = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Funcionario func = new Funcionario();
                func.setCodigo(rs.getInt("codigo"));
                func.setNome(rs.getString("nome"));
                
                resultado.add(func);
            }
            return resultado;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
}
