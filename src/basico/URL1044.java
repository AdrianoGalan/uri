/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1044 {
    
        public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n1, n2;

        String[] ler = entrada.readLine().split(" ");

        n1 = Integer.parseInt(ler[0]);
        n2 = Integer.parseInt(ler[1]);

        if(n2 < n1){
            int aux;
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        
        if(n2%n1 ==0){
            System.out.println("Sao Multiplos");
            System.exit(0);
        }else{
            System.out.println("Nao sao Multiplos");
            System.exit(0);
        }
      
        
    }
    
}
