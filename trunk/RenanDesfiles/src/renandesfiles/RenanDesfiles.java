/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package renandesfiles;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class RenanDesfiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ctg c = new ctg();
        
        String nome, datafund, cidadee, danca, declamacao;
        Double mensalidade, integrantes; 
        
        nome = JOptionPane.showInputDialog("Digite o nome do CTG: ");
        c.setNome(nome);;
        
        datafund = JOptionPane.showInputDialog("Digite a data de fundação: ");
        c.setDatafund(datafund);
        
        cidadee = JOptionPane.showInputDialog("Digite a cidade do CTG: ");
        c.setCidadee(cidadee);
        
        integrantes = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de integrantes: "));
        c.setIntegrantes(integrantes);
        
        mensalidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a mensalidade do CTG: "));
        c.setMensalidade(mensalidade);
        
        danca = JOptionPane.showInputDialog("Ele participa de competição de dança? (S/N) ");
        c.setDanca(danca);
        
        declamacao = JOptionPane.showInputDialog("Ele participa de competição de declamação? (S/N) ");
        c.setDeclamacao(declamacao);
        
        JOptionPane.showMessageDialog(null, "Nome: " + c.getNome() + "\nFundação: " + c.getDatafund() + "\nCidade: " + c.getCidadee() + "\nIntegrantes: " + c.getIntegrantes() + "\nMensalidade: " + c.getMensalidade() + "\nRendimento: " + c.getRendimento() + "\nPorte: " + c.getPorte() + "\nParticida de competição de dança: " + c.getDanca() + "\nParticipa de competição de declamção: " + c.getDeclamacao() + "\nO rendimento: " + c.getAcordo());
        
        
        organizacao o = new organizacao();
        
        String data, rua, cidade, estado, completa, horarioI, horarioF;
        
        data = JOptionPane.showInputDialog("Digite a data de realização do desfile: ");
        o.setData(data);
        
        rua = JOptionPane.showInputDialog("Digite o nome da ruan aonde acontecerá o desfile: ");
        o.setRua(rua);
        
        cidade = JOptionPane.showInputDialog("Digite o nome da cidade onde acontecerá o desfile: ");
        o.setCidade(cidade);
        
        estado = JOptionPane.showInputDialog("Digite o estado onde acontecerá o desfile: ");
        o.setEstado(estado);
        
        horarioI = JOptionPane.showInputDialog("Digite o horario inicial do desfile: ");
        o.setHorarioI(horarioI);
        
        horarioF = JOptionPane.showInputDialog("Digite o horario de termino do desfile: ");
        o.setHorarioF(horarioF);
        
        JOptionPane.showMessageDialog(null, "Data do desfile: " + o.getData() + "\nLocal: " + o.getCompleta() + "\nHorario inicial: " + o.getHorarioI() + "\nHorario termino: " + o.getHorarioF());
        
    }
    
}
