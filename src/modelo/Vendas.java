package modelo;

import java.util.Objects;
import modelo.Cliente;

public class Vendas {
    
    private int codigo;
    private String dataV;
    private String carros;
    private Float valorTotal;
    private String metodoPag;
    private Cliente cliente_codigo;

    public Vendas(String dataV, String carros, Float valorTotal, String metodoPag, Cliente cliente_codigo, int codigo) {
        this.codigo = codigo;
        this.dataV = dataV;
        this.carros = carros;
        this.metodoPag = metodoPag;
        this.valorTotal = valorTotal;
        this.cliente_codigo = cliente_codigo;
    }

    public Vendas(String dataV, String carros, Float valorTotal, String metodoPag, Cliente cliente_codigo) {
        this.dataV = dataV;
        this.carros = carros;
        this.valorTotal = valorTotal;
        this.metodoPag = metodoPag;
        this.cliente_codigo = cliente_codigo;
    }
    
    public Vendas(String carros, String dataV, Float valorTotal, String metodoPag, int codigo) {
        this.codigo = codigo;
        this.dataV = dataV;
        this.carros = carros;
        this.valorTotal = valorTotal;
        this.metodoPag = metodoPag;
    }

    public Vendas(String carros, String dataV, Float valorTotal, String metodoPag) {
        this.dataV = dataV;
        this.carros = carros;
        this.valorTotal = valorTotal;
        this.metodoPag = metodoPag;
    }

    public Vendas() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataV() {
        return dataV;
    }

    public void setDataV(String dataV) {
        this.dataV = dataV;
    }

    public String getCarros() {
        return carros;
    }

    public void setCarros(String carros) {
        this.carros = carros;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getClient() {
        return cliente_codigo;
    }

    public void setClient(Cliente cliente_codigo) {
        this.cliente_codigo = cliente_codigo;
    }

    public String getMetodoPag() {
        return metodoPag;
    }

    public void setMetodoPag(String metodoPag) {
        this.metodoPag = metodoPag;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.dataV);
        hash = 29 * hash + Objects.hashCode(this.carros);
        hash = 29 * hash + Objects.hashCode(this.valorTotal);
        hash = 29 * hash + Objects.hashCode(this.metodoPag);
        hash = 29 * hash + Objects.hashCode(this.cliente_codigo);
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
        final Vendas other = (Vendas) obj;
        if (!Objects.equals(this.dataV, other.dataV)) {
            return false;
        }
        if (!Objects.equals(this.carros, other.carros)) {
            return false;
        }
        if (!Objects.equals(this.metodoPag, other.metodoPag)) {
            return false;
        }
        if (!Objects.equals(this.valorTotal, other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.cliente_codigo, other.cliente_codigo)) {
            return false;
        }
        return true;
    }
}
