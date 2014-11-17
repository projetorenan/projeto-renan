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
public class ArquivoVideo extends Arquivo {
    
    private String duracao;
    private String autor; 

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String retornarInformacoes() 
    {
        String retorno; 
        retorno = this.getNome() + ", " + this.getTipo() + ", " + this.getTamanha() + ", " + this.autor + ", " + this.duracao; 
        //ou, da na mesma coisa;
        
        //SUPER -- pega metodos da classe pai
        retorno = super.retornarInformacoes() + " - " + this.autor + " / " + this.duracao; 
        
        return retorno; 
    }
    
    
}
