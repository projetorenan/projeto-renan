/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Filme {
    
    String nome, genero, ator;
    Float duracao;
    Integer classificacao, idade, midade;
    
    void atribuirnome (String valor)
    {
        nome = valor;
    }
    String retornarnome ()
    {
        return nome;
    }
    
     void atribuirgenero (String valor)
    {
        genero = valor;
    }
    String retornargenero ()
    {
        return genero;
    }
    
     void atribuirator (String valor)
    {
        ator = valor;
    }
    String retornarator ()
    {
        return ator;
    }
    
     void atribuirduracao (Float valor)
    {
        duracao = valor;
    }
    Float retornarduracao ()
    {
        return duracao;
    }
    
     void atribuirclassificacao (Integer valor)
    {
        classificacao = valor;
    }
    Integer retornarclassificacao ()
    {
        return classificacao;
    }
    
    void atribuiridade (Integer valor)
    {
        idade = valor;
        
        boolean midade = classificacao < idade;
        
        if (midade == false){
            JOptionPane.showMessageDialog(null,"Voce pode assistir este filme");
        }
        else{
            JOptionPane.showMessageDialog(null,"Voce nao pode assistir este filme");
        }
    }
    Integer retornaridade ()
    {
        return idade;
    }
}
