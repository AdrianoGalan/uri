/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1073 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n, x, in = 0, out = 0;

        n = Integer.parseInt(entrada.readLine());
        
        for (int i = 2; i <= n; i++) {
            
            System.out.println(i+"^2 = " + (int)Math.pow(i, 2));
           i++;
        }
        


    }
    
}
