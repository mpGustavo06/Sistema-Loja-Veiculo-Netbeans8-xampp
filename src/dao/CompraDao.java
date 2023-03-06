package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.Conexao;
import modelo.Compra;
import java.util.ArrayList;
import java.util.List;
import modelo.Funcionario;

public class CompraDao {
    public void adicionar(Compra comp) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "INSERT INTO compra(dataComp, carros, valorTotal, metodoPag, func_codigo) VALUES (?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, comp.getDataComp());
        ps.setString(2, comp.getCarros());
        ps.setFloat(3, comp.getValorTotal());
        ps.setString(4, comp.getMetodoPag());
        ps.setInt(5, comp.getFunc().getCodigo());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Compra> buscarNome(String func_codigo) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "SELECT * FROM compra WHERE func_codigo LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, "%" + func_codigo + "%");
        ResultSet rs = ps.executeQuery();
        
        List<Compra> comps = new ArrayList<>();
        while (rs.next()) {
            Funcionario func = new Funcionario();
            func.setCodigo(rs.getInt("func_codigo"));
            Compra comp = new Compra(
                    rs.getString("dataComp"), 
                    rs.getString("carros"), 
                    rs.getFloat("valorTotal"), 
                    rs.getString("metodoPag"),
                    func,
                    rs.getInt("codigo")
            );
            
            comps.add(comp);
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return comps;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql= "DELETE FROM compra WHERE codigo= ?";
         
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         
         ps.executeUpdate();
         ps.close();
         conexao.close();
    }
    
    public void alterar(Compra comp)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql= "UPDATE compra SET dataComp=?, carros=?, valorTotal=?, metodoPag=?, func_codigo=? WHERE codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, comp.getDataComp());
        ps.setString(2, comp.getCarros());
        ps.setFloat(3, comp.getValorTotal());
        ps.setString(4, comp.getMetodoPag());
        ps.setInt(5, comp.getFunc().getCodigo());
        ps.setInt(6, comp.getCodigo());
        
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
    
    public List<Compra> SearchCompData(String dataComp) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "SELECT * FROM compra WHERE dataComp LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, "%" + dataComp + "%");
        ResultSet rs = ps.executeQuery();
        
        List<Compra> comps = new ArrayList<>();
        while (rs.next()) {
            Funcionario func = new Funcionario();
            func.setCodigo(rs.getInt("func_codigo"));
            Compra comp = new Compra(
                    rs.getString("dataComp"), 
                    rs.getString("carros"), 
                    rs.getFloat("valorTotal"), 
                    rs.getString("metodoPag"),
                    func,
                    rs.getInt("codigo")
            );
            
            comps.add(comp);
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return comps;
    }
}
