package mc.donald;

import java.util.ArrayList;
import java.util.List;

public class Filial 
{ 
    private List <Cozinheiro> cozinheiros;
    private List <Caixa> caixas; 
    private Gerente gerente;
    private String cidade;
    private Double prec_medio_lanche, faturamento;
    private Integer qtde_vendidas;

    
    
    Filial()
    {
        cozinheiros = new ArrayList<Cozinheiro>();
        caixas = new ArrayList<Caixa>(); 
    }

    
    public List<Cozinheiro> getCozinheiros() {
        return cozinheiros;
    }

    public void setCozinheiros(List<Cozinheiro> cozinheiros) {
        this.cozinheiros = cozinheiros;
    }

    public List<Caixa> getCaixas() {
        return caixas;
    }

    public void setCaixas(List<Caixa> caixas) {
        this.caixas = caixas;
    }
    
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getPrec_medio_lanche() {
        return prec_medio_lanche;
    }

    public void setPrec_medio_lanche(Double prec_medio_lanche) {
        this.prec_medio_lanche = prec_medio_lanche;
    }

    public Integer getQtde_vendidas() {
        return qtde_vendidas;
    }

    public void setQtde_vendidas(Integer qtde_vendidas) {
        this.qtde_vendidas = qtde_vendidas;
    }
    
    
    
    public Double faturamento_medio()
    {
        
        faturamento = qtde_vendidas * prec_medio_lanche; 
        return faturamento; 
        
        
    }
    
    
}
