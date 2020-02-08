/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1589 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(entrada.readLine());
        
        int r1, r2;
        String ler[];
        
        for (int i = 0; i < n; i++) {
            
            ler = entrada.readLine().split(" ");
            r1 = Integer.parseInt(ler[0]);
            r2 = Integer.parseInt(ler[1]);
            
            System.out.println(r1+r2);
        }

    }
}
