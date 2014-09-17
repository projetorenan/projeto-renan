/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisao;

/**
 *
 * @author Aluno
 */
public class Ator {
    
    private String nome, datadenas, email, nomea, cidade, endereco, bairro, estado, status;
    private Integer quantn;
    private Double salario, cache;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadenas() {
        return datadenas;
    }

    public void setDatadenas(String datadenas) {
        this.datadenas = datadenas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomea() {
        return nomea;
    }

    public void setNomea(String nomea) {
        this.nomea = nomea;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getQuantn() {
        return quantn;
    }

    public void setQuantn(Integer quantn) {
        this.quantn = quantn;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getCache() {
        return cache;
    }

    public void setCache(Double cache) {
        this.cache = cache;
    }

    public String getStatus() {
        
        if ((quantn < 3) && (salario < 5000))
        {
            status = "Calouro";
            
        }
        else if ((quantn < 6) && (salario < 30000))
        {
            status = "Revelação";
        }
        else if ((quantn < 6) && (salario > 30000))
        {
            status = "Joia";
        }
        else if ((quantn > 9) && (salario < 30000))
        {
            status = "Elenco de Apoio";
        }
        else if ((salario > 30000) && (salario < 100000))
        {
            status = "Elenco Principal";
        }
        else if (salario > 100000)
        {
            status = "Estrela";
        }
        
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
