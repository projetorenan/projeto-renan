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
public class ExemploHerança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArquivoVideo arquivoV = new ArquivoVideo(); 
        
        arquivoV.setNome("renan");
        arquivoV.setTipo("avi");
        arquivoV.setTamanha("120m");
        arquivoV.setDuracao("20minutos");
        arquivoV.setAutor("renan");
        
        Arquivo arquivo = new Arquivo(); 
        
        arquivo.setNome("qualquer um");
        arquivo.setTipo("txt");
        arquivo.setTamanha("1kb");
        
        GerenciadordeArquivos gerenciador = new GerenciadordeArquivos();
        gerenciador.setSistemaoperacional("windos 8");
        
        System.out.println(gerenciador.visualizarArquivo(arquivo));
        
     
    }
    
}
