package mc.donald;

public class Cozinheiro 
{
    
    private String nome, data_nasc, cpf, turno_traba; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurno_traba() {
        return turno_traba;
    }

    public void setTurno_traba(String turno_traba) {
        this.turno_traba = turno_traba;
    }
    
    
    
    public Double retornarSalario()
    {
        if (turno_traba.equals("Noturno"))
        {
            return 1700.0;
        }
        else
        {
            return 1300.0;
        }    
    }
}
