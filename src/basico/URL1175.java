/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class URL1175 {
    
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> vetor = new ArrayList<>();
        
       int aux;

        for (int i = 0; i < 20; i++) {
            
            vetor.add(Integer.parseInt(entrada.readLine()));            
        }
        
        for (int i = 0, j = 19; i < 10; i++, j--) {
           
            aux = vetor.get(i);
            vetor.set(i, vetor.get(j));
            vetor.set(j, aux);
                        
        }
        
          for (int i = 0; i < vetor.size(); i++) {

            System.out.println("N[" + i + "] = " + vetor.get(i));
        }

    }

    
}
