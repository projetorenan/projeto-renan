/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author Aluno
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Criar o objeto da classe calculadora
        Calculadora calc = new Calculadora();
        Integer resultado;
        
        //atribuir valores
        calc.atribuirA(3);
        calc.atribuirB(8);
        //chamar o metodo de soma
        resultado = calc.somar();
        
        System.out.println(resultado);
        
    }
    
}
