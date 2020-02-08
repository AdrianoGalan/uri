/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1035 {
    
      public static void main(String[] args) throws IOException {

        int a, b, c ,d;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String[] ler = entrada.readLine().split(" ");
        
        a = Integer.parseInt(ler[0]);
        b = Integer.parseInt(ler[1]);
        c = Integer.parseInt(ler[2]);
        d = Integer.parseInt(ler[3]);

        if(b > c && d > a && (c + d) > (a + b) && c >= 0 && d >=0 && a%2 == 0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
     

        System.exit(0);
    }

    
}
