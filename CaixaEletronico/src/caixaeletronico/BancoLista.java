/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class BancoLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<Banco>();
        
        Banco b = new Banco();
        
        b.setNome("Brasil");
        b.setNumero("0258213");
        
        bancos.add(b);
        
        b = new Banco();
        
        b.setNome("Banrisul");
        b.setNumero("0258965");
        
        bancos.add(b);
        
        b = new Banco();
        
        b.setNome("Bradesco");
        b.setNumero("0258598");
        
        bancos.add(b);
        
        for(Banco banco : bancos) {
            System.out.println(banco.getNome());
            System.out.println(banco.getNumero());
        }
    }
    
}
