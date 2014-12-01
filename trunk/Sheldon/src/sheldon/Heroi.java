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
public class Heroi extends Bonecos {
    
    private String ego;
    private Boolean favorito; 

    public String getEgo() {
        return ego;
    }

    public void setEgo(String ego) {
        this.ego = ego;
    }

    public Boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }
    
    public String descricao()
    {
        String retorno = "";
        
        if(favorito == true)
        {
            retorno = super.descricao() + "(" + this.ego + ")" + "\n" + super.getNome() + " - BAZINGAAAAAAAAAAA"; 
        }
        else 
        {
            retorno = super.descricao() + "(" + this.ego + ")"; 
        }
        return retorno; 
    }
}
