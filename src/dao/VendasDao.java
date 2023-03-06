package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.Conexao;
import modelo.Vendas;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class VendasDao {
    public void adicionar(Vendas venda) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "INSERT INTO venda(dataV, carros, valorTotal, metodoPag, cliente_codigo) VALUES (?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, venda.getDataV());
        ps.setString(2, venda.getCarros());
        ps.setFloat(3, venda.getValorTotal());
        ps.setString(4, venda.getMetodoPag());
        ps.setInt(5, venda.getClient().getCodigo());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
    
    public List<Vendas> buscarData(String cliente_codigo) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "SELECT * FROM venda WHERE cliente_codigo LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, "%" + cliente_codigo + "%");
        ResultSet rs = ps.executeQuery();
        
        List<Vendas> vendas = new ArrayList<>();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setCodigo(rs.getInt("cliente_codigo"));
            Vendas venda = new Vendas(
                    rs.getString("dataV"),
                    rs.getString("carros"),
                    rs.getFloat("valorTotal"),
                    rs.getString("metodoPag"),
                    cliente,
                    rs.getInt("codigo")
            );
            
            vendas.add(venda);
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return vendas;
    }
    
    public void remover(int codigo)throws SQLException{
         Connection conexao = new Conexao().getConexao();
         String sql= "DELETE FROM venda WHERE codigo= ?";
         
         PreparedStatement ps = conexao.prepareStatement(sql);
         ps.setInt(1, codigo);
         
         ps.executeUpdate();
         ps.close();
         conexao.close();
    }
    
    public void alterar(Vendas venda)throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql= "UPDATE venda SET dataV=?, carros=?, valorTotal=?, metodoPag=?, cliente_codigo=? WHERE codigo=?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, venda.getDataV());
        ps.setString(2, venda.getCarros());
        ps.setFloat(3, venda.getValorTotal());
        ps.setString(4, venda.getMetodoPag());
        ps.setInt(5, venda.getClient().getCodigo());
        ps.setInt(6, venda.getCodigo());
        
        ps.executeUpdate();
        ps.close();
        conexao.close();
    } 
    
    public List<Vendas> SearchVendData(String dataV) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "SELECT * FROM venda WHERE dataV LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, "%" + dataV + "%");
        ResultSet rs = ps.executeQuery();
        
        List<Vendas> vendas = new ArrayList<>();
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setCodigo(rs.getInt("cliente_codigo"));
            Vendas venda = new Vendas(
                    rs.getString("dataV"),
                    rs.getString("carros"),
                    rs.getFloat("valorTotal"),
                    rs.getString("metodoPag"),
                    cliente,
                    rs.getInt("codigo")
            );
            
            vendas.add(venda);
        }
        
        rs.close();
        ps.close();
        conexao.close();
        
        return vendas;
    }
}
