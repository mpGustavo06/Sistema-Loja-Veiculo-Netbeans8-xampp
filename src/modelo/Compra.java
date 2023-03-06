package modelo;

import java.util.Objects;
import modelo.Funcionario;

public class Compra {
    
    private int codigo;
    private String dataComp;
    private String carros;
    private Float valorTotal;
    private String metodoPag;
    private Funcionario func_codigo;

    public Compra(String dataComp, String carros, Float valorTotal, String metodoPag, Funcionario func_codigo, int codigo) {
        this.codigo = codigo;
        this.dataComp = dataComp;
        this.carros = carros;
        this.valorTotal = valorTotal;
        this.metodoPag = metodoPag;
        this.func_codigo = func_codigo;
    }
    
    public Compra(String dataComp, String carros, Float valorTotal, String metodoPag, Funcionario func_codigo) {
        this.dataComp = dataComp;
        this.carros = carros;
        this.valorTotal = valorTotal;
        this.metodoPag = metodoPag;
        this.func_codigo = func_codigo;
    }
    
    public Compra(String dataComp, String carros, Float valorTotal, String metodoPag, int codigo) {
        this.codigo = codigo;
        this.dataComp = dataComp;
        this.carros = carros;
        this.valorTotal = valorTotal;
        this.metodoPag = metodoPag;
    }

    public Compra(String dataComp, String carros, Float valorTotal, String metodoPag) {
        this.dataComp = dataComp;
        this.carros = carros;
        this.valorTotal = valorTotal;
        this.metodoPag = metodoPag;
    }

    public Compra() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataComp() {
        return dataComp;
    }

    public void setDataComp(String dataComp) {
        this.dataComp = dataComp;
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

    public Funcionario getFunc() {
        return func_codigo;
    }

    public void setFunc(Funcionario func_codigo) {
        this.func_codigo = func_codigo;
    }

    public String getMetodoPag() {
        return metodoPag;
    }

    public void setMetodoPag(String metodoPag) {
        this.metodoPag = metodoPag;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.dataComp);
        hash = 41 * hash + Objects.hashCode(this.carros);
        hash = 41 * hash + Objects.hashCode(this.valorTotal);
        hash = 41 * hash + Objects.hashCode(this.metodoPag);
        hash = 41 * hash + Objects.hashCode(this.func_codigo);
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
        final Compra other = (Compra) obj;
        if (!Objects.equals(this.dataComp, other.dataComp)) {
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
        if (!Objects.equals(this.func_codigo, other.func_codigo)) {
            return false;
        }
        return true;
    }
}
