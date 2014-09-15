/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisão;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Revisão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Professor p = new Professor();
        
        String nome, endereco, escola, tecnico, etc, superior, sup;
        Double salario;
        
        nome = JOptionPane.showInputDialog("Digite o nome do professor: ");
        p.setNome(nome);
        
        endereco = JOptionPane.showInputDialog("Digite o endereço do professor: ");
        p.setEndereco(endereco);
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do professor: "));
        p.setSalario(salario);
        
        escola = JOptionPane.showInputDialog("Digite a escola do professor: ");
        p.setEscola(escola);
        
        tecnico = JOptionPane.showInputDialog("O professor da aula para o tecnico ?(Sim/Nao) ");
        if (tecnico.equals("Sim"))
        {
            p.setAulatec(true);
        }
        else 
        {
            p.setAulatec(false);
        }
        
        if(p.isAulatec()== true)
        {
            etc = "Sim";
        }
        else 
        {
            etc = "Não";
        }
        
        superior = JOptionPane.showInputDialog("O professor da aula para o superior ?(Sim/Nao) ");
        if (superior.equals("Sim"))
        {
            p.setAulasup(true);
        }
        else 
        {
            p.setAulasup(false);
        }
        
        if(p.isAulasup()== true)
        {
            sup = "Sim";
        }
        else 
        {
            sup = "Não";
        }
        
        JOptionPane.showMessageDialog(null, "Nome: " + p.getNome() + "\nEndereço: " + p.getEndereco() + "\nEscola: " + p.getEscola() + "\nSalario: " + p.getSalario() + "\nAula tecnico: " + etc + "\nAula superior: " + sup);
    }
    
}
