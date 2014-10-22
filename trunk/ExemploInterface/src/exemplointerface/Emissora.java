/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplointerface;

/**
 *
 * @author Aluno
 */
public class Emissora {
    String nomee, enderecoe, exidicao; 
    Boolean Tv;
    public Emissora()
    {
        nomee = null;
        enderecoe = null;
        exidicao = "TV Fechada";
    }

    public String getNomee() {
        return nomee;
    }

    public void setNomee(String nomee) {
        this.nomee = nomee;
    }

    public String getEnderecoe() {
        return enderecoe;
    }

    public void setEnderecoe(String enderecoe) {
        this.enderecoe = enderecoe;
    }

    public String getExidicao() {
        return exidicao;
    }

    public void setExidicao(String exidicao) {
        this.exidicao = exidicao;
    }

    public Boolean isTv() {
        return Tv;
    }

    public void setTv(Boolean Tv) {
        this.Tv = Tv;
    }


    
}
