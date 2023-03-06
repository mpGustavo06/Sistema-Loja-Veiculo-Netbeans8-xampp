package modelo;

import java.util.Objects;

public class Distribuidora {
    
    private int codigo;
    private String empresa;
    private String cnpj;
    private String responsavel;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;

    public Distribuidora(String empresa, String cnpj, String responsavel, String endereco, String cidade, String estado, String telefone, String email) {
        this.empresa = empresa;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }

    public Distribuidora(String empresa, String cnpj, String responsavel, String endereco, String cidade, String estado, String telefone, String email, int codigo) {
        this.codigo = codigo;
        this.empresa = empresa;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }

    public Distribuidora() {
    
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
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
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.empresa);
        hash = 47 * hash + Objects.hashCode(this.cnpj);
        hash = 47 * hash + Objects.hashCode(this.responsavel);
        hash = 47 * hash + Objects.hashCode(this.endereco);
        hash = 47 * hash + Objects.hashCode(this.cidade);
        hash = 47 * hash + Objects.hashCode(this.estado);
        hash = 47 * hash + Objects.hashCode(this.telefone);
        hash = 47 * hash + Objects.hashCode(this.email);
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
        final Distribuidora other = (Distribuidora) obj;
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.responsavel, other.responsavel)) {
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
        return "Distribuidora{" + "empresa=" + empresa + ", cnpj=" + cnpj + ", responsavel=" + responsavel + ", endereco=" + endereco + ", cidade=" + cidade + ", estado=" + estado + ", telefone=" + telefone + ", email=" + email + '}';
    }    
}
