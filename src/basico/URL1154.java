/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1154 {
    
    public static void main(String[] args) throws IOException{
        
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int i =0, soma = 0, n = Integer.parseInt(entrada.readLine());
        
        double media;
        
        while(n > 0 ){
            i++;
            
            soma = soma + n;
            
            
            n = Integer.parseInt(entrada.readLine());
            
        }
        
        media = (double)soma/i;
        
        System.out.printf("%.2f\n", media);
        
    }
    
}
