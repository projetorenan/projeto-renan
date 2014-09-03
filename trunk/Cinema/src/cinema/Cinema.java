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
        
        String nome;
        String genero;
        String nomeator;
        String anonas,ganhou;
        String nacionalidade;
        float durac,cache,ganhos;
        boolean vencedoroscar;
        int classif,idad,totalf,totalfa;
        
        Filme f = new Filme();
        Ator a = new Ator();
       
        //Entrada de dados 
        nome = JOptionPane.showInputDialog("Digite o nome do filme");
        f.atribuirnome(nome);
        
        genero = JOptionPane.showInputDialog("Digite o genero do filme");
        f.atribuirgenero(genero);
        
        durac = Float.parseFloat(JOptionPane.showInputDialog("Digite a duração do filme"));
        f.atribuirduracao(durac);
        
        nomeator = JOptionPane.showInputDialog("Digite o ator do filme");
        f.atribuirator(nomeator);
        
        classif = Integer.parseInt(JOptionPane.showInputDialog("Digite a classificação do filme"));
        f.atribuirclassificacao(classif);
        
        idad = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        f.atribuiridade(idad);
    
        JOptionPane.showMessageDialog(null,"   Dados do filme \n" + " Nome do filme:"+ f.retornarnome() + "\n Duração do filme:" + f.retornarduracao() + " minutos"+ " \n ClassificaÃ§Ã£o do filme: "+ f.retornarclassificacao()+ " anos"+"\n Genero do filme : "+ f.retornargenero());
        
        
        
        nomeator=JOptionPane.showInputDialog("Digite o nome do ator");
        a.AtribuirNome(nomeator);
        
        anonas=JOptionPane.showInputDialog("Digite o ano de nascimnento do ator");
        a.AtribuirDatanas(anonas);
        
        cache=Float.parseFloat(JOptionPane.showInputDialog("Digite o cache do ator"));
        a.AtribuirCache(cache);
        
        nacionalidade=JOptionPane.showInputDialog("Digite a nacionalidade do ator");
        a.AtribuirNacionalidade(nacionalidade);
        
        ganhou = JOptionPane.showInputDialog("Ganhou o oscar(S/N):");
      
        if(ganhou.equals("S"))
       {
           a.atribuirVencedorOscar(true);
       }
       else
       {
           a.atribuirVencedorOscar(false);
       }
       
          
       if(a.retornarVencedorOscar()==true)
       {
           ganhou = "Sim";
       }
       else
       {
           ganhou = "Nao";
       }
        
        totalf=Integer.parseInt(JOptionPane.showInputDialog("Digite o total de filmes do ator:"));
        a.atribuirTotalFimes(totalf);
        
        totalfa=Integer.parseInt(JOptionPane.showInputDialog("Digite o total de filmes do ator no ultimo ano:"));
        a.atribuirTotalFilmesA(totalfa);
        
        JOptionPane.showMessageDialog(null," Nome do ator: "+a.retornarNome()+"\n Ano de nascimento do ator: "+a.retornarDatanas()+"\n Cache do ator: "+a.retornarCache()+"\n Nacionalidade do ator: "+a.retornarNacionalidade()+"\n Total de filmes: "+a.retornarTotalFilmes()+"\n Total de filmes do ultimo ano: "+a.retornarTotalFilmesA()+"\nOs ganhos do ator foi de: "+a.retornarganhosator());
        
    }
    
}
