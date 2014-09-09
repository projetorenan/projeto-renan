package caixaeletronico;

public class Banco {
    
    String nome, numero;
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

    public Boolean isEmpretimoimovel() {
        return empretimoimovel;
    }

    public void setEmpretimoimovel(Boolean empretimoimovel) {
        this.empretimoimovel = empretimoimovel;
    }

    public Boolean isEmprestimocarro() {
        return emprestimocarro;
    }

    public void setEmprestimocarro(Boolean emprestimocarro) {
        this.emprestimocarro = emprestimocarro;
    }

    
    
}
