/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1178 {
    
     public static void main(String[] args)throws IOException{
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

     double n = Double.parseDouble(entrada.readLine());
        
        for (int i = 0; i < 100; i++) {
                     
            System.out.printf("N["+ i +"] = %.4f\n", n);
             n = n/2;
           
            
        }
        
    }
    
    
}
