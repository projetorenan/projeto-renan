/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisao;

/**
 *
 * @author Aluno
 */
public class Apresentador {
 
    String nomeA, datanascA, programa, emailA, artistico, cidadeA, enderecoA, bairroA, estadoA;
    Double salarioA, cacheA, merchan, eventosA, ganho;
    
    public Apresentador()
    {
        nomeA = null;
        datanascA = null;
        programa = null;
        emailA = null;
        artistico = null;
        cidadeA = null;
        enderecoA = null;
        bairroA = null;
        estadoA = null;
        
        salarioA = 0.0;
        cacheA = 0.0;
        merchan = 0.0;
    }

    public String getNomeA() {
        return nomeA;
    }

    public void setNomeA(String nomeA) {
        this.nomeA = nomeA;
    }

    public String getDatanascA() {
        return datanascA;
    }

    public void setDatanascA(String datanascA) {
        this.datanascA = datanascA;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getEmailA() {
        return emailA;
    }

    public void setEmailA(String emailA) {
        this.emailA = emailA;
    }

    public String getArtistico() {
        return artistico;
    }

    public void setArtistico(String artistico) {
        this.artistico = artistico;
    }

    public String getCidadeA() {
        return cidadeA;
    }

    public void setCidadeA(String cidadeA) {
        this.cidadeA = cidadeA;
    }

    public String getEnderecoA() {
        return enderecoA;
    }

    public void setEnderecoA(String enderecoA) {
        this.enderecoA = enderecoA;
    }

    public String getBairroA() {
        return bairroA;
    }

    public void setBairroA(String bairroA) {
        this.bairroA = bairroA;
    }

    public String getEstadoA() {
        return estadoA;
    }

    public void setEstadoA(String estadoA) {
        this.estadoA = estadoA;
    }

    public Double getSalarioA() {
        return salarioA;
    }

    public void setSalarioA(Double salarioA) {
        this.salarioA = salarioA;
    }

    public Double getCacheA() {
        return cacheA;
    }

    public void setCacheA(Double cacheA) {
        this.cacheA = cacheA;
    }

    public Double getMerchan() {
        return merchan;
    }

    public void setMerchan(Double merchan) {
        this.merchan = merchan;
    }

    public Double getEventosA() {
        return eventosA;
    }

    public void setEventosA(Double eventosA) {
        this.eventosA = eventosA;
    }

    public Double getGanho() {
        
        ganho = (eventosA * cacheA) + merchan + salarioA;
        return ganho;
    }

    public void setGanho(Double ganho) {
        this.ganho = ganho;
    }
    
    
}
