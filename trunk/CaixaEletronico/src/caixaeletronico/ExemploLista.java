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
public class ExemploLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> jogadores = new ArrayList<String>();
        jogadores.add("Danielzinho");
        jogadores.add("Karielzinho");
        jogadores.add("Andrielzinho");
        jogadores.add("Maydanito");
        jogadores.add("Vitinho");
        jogadores.remove("Maydanito");
        for (String jog : jogadores) {
            System.out.println(jog);
            
        }
        /*for (int i = 0; i < jogadores.size(); i++) {
            System.out.println(jogadores.get(i));
           Danielzinho
           Karielzinho
           Andrielzinho
           Vitinho
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        0
        }*/
    }
    
}
