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
public class Correntista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<Cliente> clientes = new ArrayList<Cliente>();
      
      Cliente c = new Cliente(); 
      
      c.setNome("Andriel");
      c.setCpf("0123456");
      c.setData("01/01/1991");
      
      clientes.add(c);
      
      c = new Cliente();
      
      c.setNome("Daniel");
      c.setCpf("0147478");
      c.setData("02/02/1992");
      
      clientes.add(c);
      
      c = new Cliente();
      
      c.setNome("Kariel");
      c.setCpf("0156987");
      c.setData("03/03/1993");
      
      clientes.add(c);
      
      for (Cliente cliente : clientes ){
          System.out.println(cliente.getNome());
          System.out.println(cliente.getCpf());
      }
      
    }
    
}
