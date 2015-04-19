import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Jogador;

public class TesteBancoDeDados {
    
    public static void main(String[] args) {
        
        inserir();
        
        List<Jogador> lista = listar(); 
        for (Jogador jogador : lista) {
            System.out.println(jogador.getLogin() + "\n");
        }
    }
    public static List<Jogador> listar()
    {
        List<Jogador> jogadores = new ArrayList<Jogador>();
        
        try {
        
        String sql = "SELECT * FROM jogador"; 
        PreparedStatement pst 
                = Conexao.getPreparedStatement(sql); 
        
            ResultSet res = pst.executeQuery();
        
        while(res.next())
        {
            Jogador jog = new Jogador(); 
            jog.setLogin(res.getString("login"));
            jog.setSenha(res.getString("senha"));
            jog.setEmail(res.getString("email"));
            
            jogadores.add(jog);
        }
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return jogadores; 
        
    }
    public static void inserir()
    {
        String login;
        login = JOptionPane.showInputDialog("LOGIN:");
        
        String senha;
        senha = JOptionPane.showInputDialog("SENHA:"); 
        
        String email;
        email = JOptionPane.showInputDialog("EMAIL:"); 
        
        
        String sql; 
        sql = "INSERT INTO jogador(login, senha, email)" + 
              "VALUES (?,?,?)";
        
        PreparedStatement pst 
                = Conexao.getPreparedStatement(sql);  
        try {
            pst.setString(1, login);
            pst.setString(2, senha);
            pst.setString(3, email);
            
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(TesteBancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
