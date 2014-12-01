/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheldon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renan
 */
public class Filme {
    
    String nome; 
    
    List <Bonecos> personagens = new ArrayList <Bonecos>(); ; 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
     public String listarTodos()
    {
        String saida = ""; 
        saida = "Filme " + nome + "\nPersonagens:";
        
        for (Bonecos bonecos : personagens) {
            saida = saida + bonecos.descricao();
        }
        
        return saida; 
    }
    
    
}
