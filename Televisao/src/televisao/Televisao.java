/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisao;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Televisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ator a = new Ator();
        
        String nome, datadenas, email, nomea, cidade, endereco, bairro, estado;
        Integer quantn;
        Double salario, cache;
        
        nome = JOptionPane.showInputDialog("Digite o nome do ator: ");
        a.setNome(nome);
        
        datadenas = JOptionPane.showInputDialog("Digite a data de nascimento do ator: ");
        a.setDatadenas(datadenas);
        
        email = JOptionPane.showInputDialog("Digite o email do ator: ");
        a.setEmail(email);
        
        nomea = JOptionPane.showInputDialog("Digite o nome artistico do ator: ");
        a.setNomea(nomea);
        
        estado = JOptionPane.showInputDialog("Digite o estado do ator: ");
        a.setEstado(estado);
        
        cidade = JOptionPane.showInputDialog("Digite a cidade do ator: ");
        a.setCidade(cidade);
        
        bairro = JOptionPane.showInputDialog("Digite o bairro do ator: ");
        a.setBairro(bairro);
        
        endereco = JOptionPane.showInputDialog("Digite o endereco do ator: "); 
        a.setEndereco(endereco);
        
        quantn = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantia de novelas que o ator ja fez:"));
        a.setQuantn(quantn);
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do ator: "));
        a.setSalario(salario);
        
        cache = Double.parseDouble(JOptionPane.showInputDialog("Digite o cache do ator: "));
        a.setCache(cache);
        
        
        
    }
    
}
