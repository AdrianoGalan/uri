/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1078 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(entrada.readLine());
        
        for (int i = 1; i < 11; i++) {
            System.out.println( i + " x " + n + " = "+ (n * i));
        }
        
    }
    
}
