/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1149 {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String[] ler = entrada.readLine().split(" ");
        int soma = 0, total =0, a, n, i = 2;
        a = Integer.parseInt(ler[0]);
        n = Integer.parseInt(ler[1]);

        while (n < 1) {
            n = Integer.parseInt(ler[i]);
            i++;
        }
        
        for (int j = 0; j < n; j++) {
            soma = a + j;
            total += soma;
        }
        
        System.out.println(total);

    }

}
