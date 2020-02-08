/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1837 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String[] ler = entrada.readLine().split(" ");
        
        int a = Integer.parseInt(ler[0]);
        int b = Integer.parseInt(ler[1]);
        
        System.out.println(a%b);
       
        
        
        
    }
    
}
