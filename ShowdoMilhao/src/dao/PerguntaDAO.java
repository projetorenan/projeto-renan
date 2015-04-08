/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pergunta;

/**
 *
 * @author Aluno
 */
public class PerguntaDAO {
    
    
    public Boolean inserir(Pergunta pergunta)
    {
        Boolean retorno;
                
        String sql = "INSERT INTO pergunta(enunciado,a,b,c,d,certa,nivel)" + 
                  "VALUES(?,?,?,?,?,?,?)";
          
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
          
        try{
            pst.setString(1, pergunta.getEnunciado());
            pst.setString(2, pergunta.getA());
            pst.setString(3, pergunta.getB());
            pst.setString(4, pergunta.getC());
            pst.setString(5, pergunta.getD());
            pst.setString(6, pergunta.getCerta());
            pst.setInt(7, pergunta.getNivel());
              
            pst.executeUpdate();
              
            retorno = true;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
              
            retorno = false;
        }
          

        return retorno; 
    }
    
    public List<Pergunta> listar()
    {
        List<Pergunta> lista = new ArrayList<Pergunta>();
        
        String sql = "SELECT * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try 
        {
            ResultSet res = pst.executeQuery();
            
            while(res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setEnunciado(res.getString("enunciado"));
                pergunta.setA(res.getString("a"));
                pergunta.setB(res.getString("b"));
                pergunta.setC(res.getString("c"));
                pergunta.setD(res.getString("d"));
                pergunta.setCerta(res.getString("certa"));
                pergunta.setNivel(res.getInt("nivel"));
                pergunta.setId(res.getInt("id"));
                lista.add(pergunta);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista; 

    }
}

