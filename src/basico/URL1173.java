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


public class URL1173 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> vetor = new ArrayList<>();

        int n = Integer.parseInt(entrada.readLine());
        vetor.add(n);

        for (int i = 0; i < 9; i++) {
            
            vetor.add(vetor.get(i) * 2);            
        }
        
          for (int i = 0; i < 10; i++) {

            System.out.println("N[" + i + "] = " + vetor.get(i));
        }

    }



}
