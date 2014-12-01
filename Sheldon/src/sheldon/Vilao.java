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
public class Vilao extends Bonecos {
    
    private String inimigo; 

    public String getInimigo() {
        return inimigo;
    }

    public void setInimigo(String inimigo) {
        this.inimigo = inimigo;
    }
    
    public String descricao()
    {
        String retorno = ""; 
        
        retorno = super.descricao() + " - arqui-inimigo: " + this.inimigo;
        
        return retorno; 
    }
    
}
