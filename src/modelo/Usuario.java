package modelo;

import java.util.Objects;

public class Usuario {
    
    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private String nivel;

    public Usuario(String nome, String login, String senha, String nivel) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.login);
        hash = 61 * hash + Objects.hashCode(this.senha);
        hash = 61 * hash + Objects.hashCode(this.nivel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.nivel, other.nivel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", login=" + login + ", senha=" + senha + ", nivel=" + nivel + '}';
    }
}


