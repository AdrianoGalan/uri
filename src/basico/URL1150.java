/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1150 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int soma = 0,x1 = 0, i = 2, y, x = Integer.parseInt(entrada.readLine());

        do {
            y = Integer.parseInt(entrada.readLine());
        } while (x >= y);
        
        soma = x + (x+1);
        x++;
        
       while(soma< y){
           
           i++;
           x++;
           soma+=x;
           
       }
        
        System.out.println(i);
        
    }

}
