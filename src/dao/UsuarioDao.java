package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.Conexao;
import modelo.Usuario;

public class UsuarioDao {
    public Usuario login(String login, String senha) throws SQLException {
        
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM usuario where login =? and senha=?";
        
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        
        Usuario usuario = null;
        
        while (rs.next()) {
            usuario = new Usuario();
            usuario.setCodigo(rs.getInt("codigo"));
            usuario.setNome(rs.getString("nome"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setNivel(rs.getString("nivel"));
        }
        
        rs.close();
        ps.close();
        conexao.close();
                
        return usuario;
    }
    
    public void insert(Usuario usuario) throws SQLException{
        Connection conexao = new Conexao().getConexao();
        
        String sql = "insert into usuario(nome, login, senha, nivel) values(?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getLogin());
        ps.setString(3, usuario.getSenha());
        ps.setString(4, usuario.getNivel());
        
        ps.execute();
        ps.close();
        conexao.close();
    }
}
