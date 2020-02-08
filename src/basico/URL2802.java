/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Adriano
 */
public class URL2802 {
    
    public static void main(String[] args) throws IOException {
        
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

     


        int n = Integer.parseInt(entrada.readLine());

     
        
        int r, l, I = 0;
        
        l = ((n - 1)*n)/2;
        
        for (int i = 1,k = n -3; i < n-2; i++, k--) {
            I+=(k *i);
        }
        I = I*2;
        
        r = 1 + l + I;
        System.out.println(r);        
        
        
    }
    
}
