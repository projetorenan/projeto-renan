/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package renandesfiles;

/**
 *
 * @author Aluno
 */
public class organizacao {
    
    private String data, rua, cidade, estado, completa, horarioI, horarioF;
    
    public organizacao()
    {
        data = "20/09/2014";
        horarioI = "08:00";
        horarioF = "16:30";
        rua = null;
        cidade = null;
        estado = null;
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHorarioI() {
        return horarioI;
    }

    public void setHorarioI(String horarioI) {
        this.horarioI = horarioI;
    }

    public String getHorarioF() {
        return horarioF;
    }

    public void setHorarioF(String horarioF) {
        this.horarioF = horarioF;
    }

    public String getCompleta() {
        
        completa = "Rua " + rua + ", " + cidade + " - " + estado; 
        return completa;
    }

    public void setCompleta(String completa) {
        this.completa = completa;
    }
    
    
    
    
}
