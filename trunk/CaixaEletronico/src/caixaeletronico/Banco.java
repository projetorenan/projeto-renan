package caixaeletronico;

public class Banco {
    
    String nome, numero, sim="Sim", não="Não";
    Boolean empretimoimovel, emprestimocarro; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String isEmpretimoimovel() {
        if (empretimoimovel == true)
        {
            return sim;
        }
        else
        {
            return não;
        }
    }

    public void setEmpretimoimovel(Boolean empretimoimovel) {
        this.empretimoimovel = empretimoimovel;
    }

    public String isEmprestimocarro() {
        if (emprestimocarro == true)
        {
            return sim;
        }
        else
        {
            return não;
        }
    }

    public void setEmprestimocarro(Boolean emprestimocarro) {
        this.emprestimocarro = emprestimocarro;
    }
    
    
}
