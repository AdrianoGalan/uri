/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1133 {
    
      public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n1, n2, aux, soma = 0;

        n1 = Integer.parseInt(entrada.readLine());
        n2 = Integer.parseInt(entrada.readLine());

        if (n1 > n2) {
           
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        
        for (int i = n1+1; i < n2; i++) {
            
            if (i % 5 == 2 || i % 5 == 3){
                
                System.out.println(i);
                soma = soma +i;
            }
            
        }
        
    

    }

    
}
