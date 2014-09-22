/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisao;

/**
 *
 * @author Aluno
 */
public class Emissora {
    String nomee, enderecoe, exidicao; 
    
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


    
}
