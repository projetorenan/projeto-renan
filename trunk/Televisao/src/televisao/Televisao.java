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
        Integer quantn, quante;
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
        
        quante = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantia de eventos que o ator ja fez:"));
        a.setQuante(quante);
        
        cache = Double.parseDouble(JOptionPane.showInputDialog("Digite o cache do ator: "));
        a.setCache(cache);
        
        JOptionPane.showMessageDialog(null, "Nome: " + a.getNome() + "\nData de nascimento: " + a.getDatadenas() + "\nEmail: " + a.getEmail() + "\nNome artistico: " + a.getNomea() + "\nEstado: " + a.getEstado() + "\nCidade: " + a.getCidade() + "\nBairro: " + a.getBairro() + "\nEndereço: " + a.getEndereco() + "\nQuantia de novelas: " + a.getQuantn() + "\nSalario: " + a.getSalario() + "\nQuantidade de eventos: " + a.getQuante() + "\nCache: " + a.getCache() + "\nGanhos totais: " + a.getGanhos() + "\nStatus: " + a.getStatus());
        
        
        
        Novela n = new Novela(); 
        
        String titulo, autor, emissora, violencia, sexo, drogas, dataini, datater; 
        Double horario, ibope; 
        
        titulo = JOptionPane.showInputDialog("Digite o titulo da novela: ");
        n.setTitulo(titulo);
        
        dataini = JOptionPane.showInputDialog("Digite a data de inicio da novela: ");
        n.setDataini(dataini);
        
        datater = JOptionPane.showInputDialog("Digite a data de termino da novela: ");
        n.setDatater(datater);
        
        autor = JOptionPane.showInputDialog("Digite o autor da novela: ");
        n.setAutor(autor);
        
        emissora = JOptionPane.showInputDialog("Digite a emissora da novela: ");
        n.setEmissora(emissora);
        
        horario = Double.parseDouble (JOptionPane.showInputDialog("Digite o horario da novela: "));
        n.setHorario(horario);
        
        ibope = Double.parseDouble (JOptionPane.showInputDialog("Digite o ibope da novela: "));
        n.setIbope(ibope);
        
        violencia = JOptionPane.showInputDialog("A novela tem cenas de violencia? (S/N)");
        n.setViolencia(violencia);
        
        sexo = JOptionPane.showInputDialog("A novela tem cenas de sexo? (S/N)");
        n.setSexo(sexo);
        
        drogas = JOptionPane.showInputDialog("A novela tem cenas de drogas? (S/N)");
        n.setDrogas(drogas);
        
        JOptionPane.showMessageDialog(null, "Titulo: " + n.getTitulo() + "\nDuração: " + n.getDataini() + " até " + n.getDatater() + "\nAutor: " + n.getAutor() + "\nEmissora: " + n.getEmissora() + "\nHorario: " + n.getHorario() + "h\nIbope: " + n.getIbope() + "\nQuantidade de espectadores: " + n.getNumpes() + "\nClassificação: " + n.getClassifc());
        
        
        Emissora e = new Emissora();        
        
        String nomee, enderecoe, exidicao;
            
        nomee = JOptionPane.showInputDialog("Digite o nome da emissora: ");
        e.setNomee(nomee);
        
        enderecoe = JOptionPane.showInputDialog("Digite o endereço da emissora: ");
        e.setEnderecoe(enderecoe);
        
        exidicao = JOptionPane.showInputDialog("É exibida em TV Aberta ou TV Fechada: ");
        e.setExidicao(exidicao);
        
        JOptionPane.showMessageDialog(null, "Nome: " + e.getNomee() + "\nEndereço: " + e.getEnderecoe() + "\nExibição: " + e.getExidicao());
        
        
        Apresentador A = new Apresentador(); 
        
        String nomeA, datanascA, programa, emailA, artistico, cidadeA, enderecoA, bairroA, estadoA;
        Double salarioA, cacheA, merchan, eventosA, ganho;
        
        nomeA = JOptionPane.showInputDialog("Digite o nome do apresentador: ");
        A.setNomeA(nomeA);
        
        datanascA = JOptionPane.showInputDialog("Digite a data de nascimento do apresentador: ");
        A.setDatanascA(datanascA);
        
        emailA = JOptionPane.showInputDialog("Digite o email do apresentador: ");
        A.setEmailA(emailA);
        
        artistico = JOptionPane.showInputDialog("Digite o nome artistico do apresentador: ");
        A.setArtistico(artistico);
        
        programa = JOptionPane.showInputDialog("Digite o nome do programa que ele(a) apresenta: ");
        A.setPrograma(programa);
        
        estadoA = JOptionPane.showInputDialog("Digite o estado do apresentador: ");
        A.setEstadoA(estadoA);
        
        cidadeA = JOptionPane.showInputDialog("Digite a cidade do apresentador: ");
        A.setCidadeA(cidadeA);
        
        bairroA = JOptionPane.showInputDialog("Digite o bairro do apresentador: ");
        A.setBairroA(bairroA);
        
        enderecoA = JOptionPane.showInputDialog("Digite o endereco do apresentador: "); 
        A.setEnderecoA(enderecoA);
        
        salarioA = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do apresentador: "));
        A.setSalarioA(salarioA);
        
        eventosA = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantia de eventos que o apresentador ja fez:"));
        A.setEventosA(eventosA);
        
        cacheA = Double.parseDouble(JOptionPane.showInputDialog("Digite o cache do apresentador: "));
        A.setCacheA(cacheA);
        
        merchan = Double.parseDouble(JOptionPane.showInputDialog("Digite os ganhos com o merchandising do apresentador: "));
        A.setMerchan(merchan);
        
        JOptionPane.showMessageDialog( null, "Nome: " + A.getNomeA() + 
                "\nData de nascimento: " + A.getDatanascA() + 
                "\nEmail: " + A.getEmailA() + 
                "\nNome artistico: " + A.getArtistico() + 
                "\nPrograma: " + A.getPrograma() + 
                "\nEstado: " + A.getEstadoA() + 
                "\nCidade: " + A.getCidadeA() + 
                "\nBeirro: " + A.getBairroA() + 
                "\nEndereço: " + A.getEnderecoA() +  
                "\nSalario: " + A.getSalarioA() + 
                "\nEventos: " + A.getEventosA() + 
                "\nCache: " + A.getCacheA() + 
                "\nMerchandising: " + A.getMerchan() + 
                "\nGanhos totais: " + A.getGanho() );
        
    }


}