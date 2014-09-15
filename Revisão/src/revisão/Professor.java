/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisão;

/**
 *
 * @author Aluno
 */
public class Professor {
    
    String nome, endereco, escola;
    Boolean aulatec, aulasup;
    Double salario;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public Boolean isAulatec() {
        return aulatec;
    }

    public void setAulatec(Boolean aulatec) {
        this.aulatec = aulatec;
    }

    public Boolean isAulasup() {
        return aulasup;
    }

    public void setAulasup(Boolean aulasup) {
        this.aulasup = aulasup;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
}
