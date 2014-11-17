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
public class GerenciadordeArquivos {
    
    private String sistemaoperacional;

    
    public String getSistemaoperacional() {
        return sistemaoperacional;
    }

    public void setSistemaoperacional(String sistemaoperacional) {
        this.sistemaoperacional = sistemaoperacional;
    }
    
    
    public String visualizarArquivo(Arquivo exibir)
    {
        String retorno;
        retorno = this.sistemaoperacional + " Arquivo:" + exibir.retornarInformacoes();
        return retorno; 
    }
}
