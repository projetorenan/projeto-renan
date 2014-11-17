/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploherança;

/**
 *
 * @author Aluno
 */
public class Arquivo {
    
    private String nome;
    private String tipo;
    private String tamanha; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanha() {
        return tamanha;
    }

    public void setTamanha(String tamanha) {
        this.tamanha = tamanha;
    }
    
    public String retornarInformacoes()
    {
        String retorno;
        retorno = this.nome + ", " + this.tipo + ", " + this.tamanha; 
        return retorno; 
    }
}
