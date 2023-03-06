package modelo;

import java.util.Objects;

public class Cliente {
    
    private int codigo;
    private String nome;
    private String cpf;
    private String genero;
    private String dataNasc;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;

    public Cliente(String nome, String cpf, String genero, String dataNasc, String endereco, String cidade, String estado, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente(String nome, String cpf, String genero, String dataNasc, String endereco, String cidade, String estado, String telefone, String email, int codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Cliente() {
        
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.cpf);
        hash = 31 * hash + Objects.hashCode(this.genero);
        hash = 31 * hash + Objects.hashCode(this.dataNasc);
        hash = 31 * hash + Objects.hashCode(this.endereco);
        hash = 31 * hash + Objects.hashCode(this.cidade);
        hash = 31 * hash + Objects.hashCode(this.estado);
        hash = 31 * hash + Objects.hashCode(this.telefone);
        hash = 31 * hash + Objects.hashCode(this.email);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.dataNasc, other.dataNasc)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }
}
