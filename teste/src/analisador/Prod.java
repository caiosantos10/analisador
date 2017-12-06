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
public class Prod {
    private static Map <Integer, String> regras = new HashMap <Integer, String>();
    private static char[] producoes = new char [100];
    private static char[] naoTerminais = new char [10];
    
    public static void getStartSymbol(){ //retorna simbolo inicial
        System.out.println(regras.get(1).charAt(0));
    }
    
    public static void buscaProd(){
        String aux = "";
        for (int i = 0; i < getNaoTerminais().length(); i++){
            for (int j = 1; j <= regras.size(); j++){
                if (getNaoTerminais().charAt(i) != ' '){
                    if (regras.get(j).contains(String.valueOf(getNaoTerminais().charAt(i))))
                        System.out.println("Regras de Produção para "+getNaoTerminais().charAt(i)+":"+" "+""+regras.get(j));
                }
            }                        
        }       
    }
    
    public static void setRegras(Map m){ //atribui regras de produção
        regras = m;    
    }
    
    public static void getRegras(){ //retorna regras de produção
        System.out.println(regras.values());
    }
    
    public static String getNaoTerminais(){ //retorna simbolos não terminais
        String aux = "";
        for (int i =1; i<=regras.size(); i++){        
            aux = aux+" "+regras.get(i).charAt(0)+"";
            //producoes[i-1] = regras.get(i).charAt(0);
        }
        return aux;
    }
    
    
}
