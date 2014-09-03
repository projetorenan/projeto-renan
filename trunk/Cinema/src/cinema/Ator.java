/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema;

/**
 *
 * @author Aluno
 */
public class Ator {
    
    String nome;
    String datanas;
    String nacionalidade;
    Boolean vencedorOscar;
    float cache,ganhos;
    int totalfilmes,totalfilmesa;
    
    void AtribuirNome(String valor)
    {
        nome = valor;    
    }
    
    String retornarNome()
    {
        return nome;
    }
    
    void AtribuirDatanas( String valor){
        datanas = valor;
    }
    
    String retornarDatanas(){
        return datanas;
    }
    
    void AtribuirCache ( float valor){
        cache = valor;
    }
    float retornarCache(){
        return cache;
    }
    
     void AtribuirNacionalidade(String valor)
    {
        nacionalidade = valor;    
    }
    
    String retornarNacionalidade()
    {
        return nacionalidade;
    }
    
    void atribuirVencedorOscar (Boolean valor)
    {
        vencedorOscar = valor;
    }
    
    Boolean retornarVencedorOscar ()
    {
        return vencedorOscar;
    }
    
     void atribuirTotalFimes(int valor)
    {
      totalfilmes = valor;
    }
    
    int retornarTotalFilmes ()
    {
        return totalfilmes;
    }
    
    void atribuirTotalFilmesA (int valor)
    {
        totalfilmesa = valor;
    }
    
    int retornarTotalFilmesA ()
    {
        return totalfilmesa;
    }
    
    float retornarganhosator()
    {
        return totalfilmesa * cache;
        
    }
}
