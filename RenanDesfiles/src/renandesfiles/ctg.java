/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package renandesfiles;

/**
 *
 * @author Aluno
 */
public class ctg {
    
    private String nome, datafund, cidadee, danca, declamacao, porte, acordo, comp = "S";
    private Double mensalidade, integrantes, rendimento; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatafund() {
        return datafund;
    }

    public void setDatafund(String datafund) {
        this.datafund = datafund;
    }

    public Double getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Double integrantes) {
        this.integrantes = integrantes;
    }

    public String getCidadee() {
        return cidadee;
    }

    public void setCidadee(String cidadee) {
        this.cidadee = cidadee;
    }

    public String getDanca() {
        return danca;
    }

    public void setDanca(String danca) {
        this.danca = danca;
    }

    public String getDeclamacao() {
        return declamacao;
    }

    public void setDeclamacao(String declamacao) {
        this.declamacao = declamacao;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getPorte() {
        if (integrantes < 50)
        {
            porte = "Pequeno Porte";
        }
        else if (integrantes > 80)
        {
            porte = "Grande Porte";
        }
        else
        {
            porte = "Médio Porte";
        }
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Double getRendimento() {
        
        rendimento = integrantes * mensalidade;
        return rendimento;
    }

    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }

    public String getAcordo() {
        if ((danca.equals(comp)) && (declamacao.equals(comp)))
        {
            if (rendimento > 3200)
            {
                acordo = "Está de acordo";
            }
            else
            {
                acordo = "Não está de acordo";
            }
        }
        else if ((!danca.equals(comp)) && (declamacao.equals(comp)))
        {
            if (rendimento > 1700)
            {
                acordo = "Está de acordo";
            }
            else
            {
                acordo = "Não está de acordo";
            }
        }
        else if ((danca.equals(comp)) && (!declamacao.equals(comp)))
        {
            if (rendimento > 2200)
            {
                acordo = "Está de acordo";
            }
            else
            {
                acordo = "Não está de acordo";
            }
        }
        else 
        {
            if (rendimento > 700)
            {
                acordo = "Está de acordo";
            }
            else
            {
                acordo = "Não está de acordo";
            }
        }
        
        return acordo;
    }

    public void setAcordo(String acordo) {
        this.acordo = acordo;
    }
    
    
    
}
