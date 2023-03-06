package modelo;

import java.util.Objects;

public class Funcionario {
    
    private int codigo;
    private String nome;
    private String cpf;
    private String genero;
    private String cargo;
    private String dataNasc;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;

    public Funcionario(String nome, String cpf, String genero, String cargo, String dataNasc, String endereco, String cidade, String estado, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.cargo = cargo;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }

    public Funcionario(String nome, String cpf, String genero, String cargo, String dataNasc, String endereco, String cidade, String estado, String telefone, String email, int codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.cargo = cargo;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }
    
    public Funcionario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Funcionario() {
        
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.cpf);
        hash = 37 * hash + Objects.hashCode(this.genero);
        hash = 37 * hash + Objects.hashCode(this.cargo);
        hash = 37 * hash + Objects.hashCode(this.dataNasc);
        hash = 37 * hash + Objects.hashCode(this.endereco);
        hash = 37 * hash + Objects.hashCode(this.cidade);
        hash = 37 * hash + Objects.hashCode(this.estado);
        hash = 37 * hash + Objects.hashCode(this.telefone);
        hash = 37 * hash + Objects.hashCode(this.email);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
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