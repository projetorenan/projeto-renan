/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheldon;

/**
 *
 * @author Renan
 */
public class Bonecos {
    
    private String nome, editora, datap, poderp; 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDatap() {
        return datap;
    }

    public void setDatap(String datap) {
        this.datap = datap;
    }

    public String getPoderp() {
        return poderp;
    }

    public void setPoderp(String poderp) {
        this.poderp = poderp;
    }
    
    public String descricao()
    {
        String retorno; 
        
        retorno = "\n" + editora + " - " + nome;
        
        return retorno; 
    }
    
}
