/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheldon;

import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class Sheldon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Heroi bat = new Heroi();
        bat.setNome("Batman");
        bat.setEditora("Editora DC");
        bat.setDatap("01/01/1990");
        bat.setPoderp("Inteligencia");
        bat.setEgo("Bruce");
        bat.setFavorito(false);
        
        Heroi sm = new Heroi();
        sm.setNome("Superman");
        sm.setEditora("Editora DC");
        sm.setDatap("01/01/1990");
        sm.setPoderp("Super Força");
        sm.setEgo("Clark Can");
        sm.setFavorito(false);
        
        Heroi lv = new Heroi();
        lv.setNome("Lanterna Verde");
        lv.setEditora("Editora DC");
        lv.setDatap("01/01/1990");
        lv.setPoderp("Anel");
        lv.setEgo("Hal Jordan");
        lv.setFavorito(true);
        
        Vilao cor = new Vilao();
        cor.setNome("Coringa");
        cor.setEditora("Editora DC");
        cor.setDatap("01/01/1990");
        cor.setPoderp("Artimanha");
        cor.setInimigo("Batman");
        
        Vilao lex = new Vilao();
        lex.setNome("Lex Lutor");
        lex.setEditora("Editora DC");
        lex.setDatap("01/01/1990");
        lex.setPoderp("Dinheiro");
        lex.setInimigo("Superman");
        
        Heroi h = new Heroi(); 
        h.setNome("Hulk");
        h.setEditora("Editora Marvel");
        h.setDatap("01/01/1990");
        h.setPoderp("Super Força");
        h.setEgo("Bruce Baner");
        h.setFavorito(false);
        
        Heroi ca = new Heroi();
        ca.setNome("Capitão america");
        ca.setEditora("Editora Marvel");
        ca.setDatap("01/01/1990");
        ca.setPoderp("Escudo");
        ca.setEgo("Steve Roger");
        ca.setFavorito(false);
        
        Heroi hf = new Heroi();
        hf.setNome("Homem de Ferro");
        hf.setEditora("Editora Marvel");
        hf.setDatap("01/01/1990");
        hf.setPoderp("Voar");
        hf.setEgo("Tony Stark");
        hf.setFavorito(false);
        
        Vilao lk = new Vilao();
        lk.setNome("Loki");
        lk.setEditora("Editora Marvel");
        lk.setDatap("01/01/1990");
        lk.setPoderp("Magia");
        lk.setInimigo("Thor");
        
        Filme vingadores = new Filme();
        
        vingadores.setNome("Vingadores");
        
        vingadores.personagens.add(h);
        vingadores.personagens.add(ca);
        vingadores.personagens.add(hf);
        vingadores.personagens.add(lk);
        
        Filme superman = new Filme();
        
        superman.setNome("Superman vs Batman");
        
        superman.personagens.add(bat);
        superman.personagens.add(sm);
        superman.personagens.add(lv);
        superman.personagens.add(cor);
        superman.personagens.add(lex);
        
        JOptionPane.showMessageDialog(null, vingadores.listarTodos());
        JOptionPane.showMessageDialog(null, superman.listarTodos());
        
    }
    
}
