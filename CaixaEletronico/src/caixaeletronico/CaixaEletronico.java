package caixaeletronico;
import javax.swing.JOptionPane;

public class CaixaEletronico {

    public static void main(String[] args) {
     
        Conta c = new Conta();
        Banco b = new Banco ();
        
        Boolean deucerto, emprestimoimovel, emprestimocarro;
        String nome, numero;
        
        c.abrir("Renan", "123456", "7952000");
        
        deucerto = c.depositar(13.0);
        
        if (deucerto == true)
        {
          JOptionPane.showMessageDialog(null , "Depósito realizado com sucesso ")  ;
        }
        else
        {
          JOptionPane.showMessageDialog(null , "Depósito não realizado ")  ;  
        }
        
      
        deucerto = c.sacar(5.0);
        
        if (deucerto == true)
        {
          JOptionPane.showMessageDialog(null , "Saque realizado com sucesso ")  ;
        }
        else
        {
          JOptionPane.showMessageDialog(null , "Saque não realizado ")  ;  
        }
        
       
       
       nome = JOptionPane.showInputDialog(null , "Digite o nome do banco");
       b.getNome();
               
       numero = JOptionPane.showInputDialog(null , "Digite o numero do banco");
       b.getNumero();
       
       emprestimoimovel = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Oferece emprestimo Imovel (Sim ou Não)"));
       
       if (emprestimoimovel.equals("Sim"))
       {
           b.setEmpretimoimovel(true);
       }
       else
       {
           b.setEmpretimoimovel(false);
       }
       if(b.isEmpretimoimovel()==true)
       {
                       
       }
       else
       {
           
       }
       
       emprestimocarro = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Oferece emprestimo Carro (Sim ou Não)"));
       
       JOptionPane.showMessageDialog(null , "Nome: " + nome + "\nNumero: " + numero + "\nE. Imovel: " + emprestimoimovel + "\nE. Carro: " + emprestimocarro  );
    }
    
}
