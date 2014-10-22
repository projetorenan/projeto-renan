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
public class Novella {
    
    String titulo, autor, emissora, violencia, sexo, drogas, classifc, clas = "N", dataini, datater; 
    Double horario, ibope, numpes; 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public String getViolencia() {
        return violencia;
    }

    public void setViolencia(String violencia) {
        this.violencia = violencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDrogas() {
        return drogas;
    }

    public void setDrogas(String drogas) {
        this.drogas = drogas;
    }

    public String getDataini() {
        return dataini;
    }

    public void setDataini(String dataini) {
        this.dataini = dataini;
    }

    public String getDatater() {
        return datater;
    }

    public void setDatater(String datater) {
        this.datater = datater;
    }

    public Double getHorario() {
        return horario;
    }

    public void setHorario(Double horario) {
        this.horario = horario;
    }

    public Double getIbope() {
        return ibope;
    }

    public void setIbope(Double ibope) {
        this.ibope = ibope;
    }

    public Double getNumpes() {
        numpes = ibope * 10000;
        return numpes;
    }

    public void setNumpes(Double numpes) {
        this.numpes = numpes;
    }

    public String getClassifc() {
        if ((violencia.equals(clas)) && (sexo.equals(clas)) && (drogas.equals(clas)))
        {
            classifc = "Livre";
        }
        else if ((!violencia.equals(clas)) && (sexo.equals(clas)) && (drogas.equals(clas)))
        {
            classifc = "14 anos";
        }
        else if ((!violencia.equals(clas)) && (!sexo.equals(clas)) && (drogas.equals(clas)))
        {
            classifc = "16 anos";
        }
        else 
        {
            classifc = "18 anos";
        }
        
        return classifc;
    }

    public void setClassifc(String classifc) {
        this.classifc = classifc;
    }
    
    
    
}
