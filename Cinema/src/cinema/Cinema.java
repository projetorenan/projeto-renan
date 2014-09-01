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
public class Cinema {
    private static String Duracao;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Joptionpane
        
        Filme f = new Filme(); 
        
        String nome, genero, ator; 
        Float duracao;
        Integer classificacao, idade;
        
        //Entrada de dados 
        nome = JOptionPane.showInputDialog("Digite o nome do filme");
        f.atribuirnome(nome);
        
        genero = JOptionPane.showInputDialog("Digite o genero do filme");
        f.atribuirgenero(genero);
        
        duracao = Float.parseFloat(JOptionPane.showInputDialog("Digite a duração do filme"));
        f.atribuirduracao(duracao);
        
        ator = JOptionPane.showInputDialog("Digite o ator do filme");
        f.atribuirator(ator);
        
        classificacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a classificação do filme"));
        f.atribuirclassificacao(classificacao);
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        f.atribuiridade(idade);
        
        //Saida 
        JOptionPane.showMessageDialog(null, "Filme: " + nome + "\nGenero: " + genero + "\nDuração: " + duracao + " min\nAtor: " + ator + "\nClassificação: " + classificacao);
     
        
    }
    
}
