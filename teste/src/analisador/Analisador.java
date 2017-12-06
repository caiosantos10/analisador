/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisador;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lufh
 */
public class Analisador {
     private static Map <Integer, String> regras = new HashMap <Integer, String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        regras.put(1, "S -> F");
        regras.put(2, "S ->(S + F)");
        regras.put(3, "F -> a");
        
        Prod.setRegras(regras);
        
        System.out.print("Start Symbol: ");
        Prod.getStartSymbol();
        
        System.out.println("\nGramática:");
        Prod.getRegras();
        
        System.out.print("Não terminais: {");
        System.out.println(Prod.getNaoTerminais()+" }");
        
        Prod.buscaProd();
        
        
        
        
        
        
        
        
        
        
        
       
    }
    
}
