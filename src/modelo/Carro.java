package modelo;

import java.util.Objects;

public class Carro {
    
    private int codigo;
    private String marca;
    private String modelo;
    private String ano;
    private String dataComp;
    private String placa;
    private String numVIN;
    private String cidade;
    private String estado;

    public Carro(String marca, String modelo, String ano, String dataComp, String placa, String numVIN, String cidade, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.dataComp = dataComp;
        this.placa = placa;
        this.numVIN = numVIN;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Carro(String marca, String modelo, String ano, String dataComp, String placa, String numVIN, String cidade, String estado, int codigo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.dataComp = dataComp;
        this.placa = placa;
        this.numVIN = numVIN;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Carro() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDataComp() {
        return dataComp;
    }

    public void setDataComp(String dataComp) {
        this.dataComp = dataComp;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumVIN() {
        return numVIN;
    }

    public void setNumVIN(String numVIN) {
        this.numVIN = numVIN;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.marca);
        hash = 37 * hash + Objects.hashCode(this.modelo);
        hash = 37 * hash + Objects.hashCode(this.ano);
        hash = 37 * hash + Objects.hashCode(this.dataComp);
        hash = 37 * hash + Objects.hashCode(this.placa);
        hash = 37 * hash + Objects.hashCode(this.numVIN);
        hash = 37 * hash + Objects.hashCode(this.cidade);
        hash = 37 * hash + Objects.hashCode(this.estado);
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
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.ano, other.ano)) {
            return false;
        }
        if (!Objects.equals(this.dataComp, other.dataComp)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.numVIN, other.numVIN)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", dataComp=" + dataComp + ", placa=" + placa + ", numVIN=" + numVIN + ", cidade=" + cidade + ", estado=" + estado + '}';
    }
}