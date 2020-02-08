/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1099 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int x, y, aux, soma = 0, n = Integer.parseInt(entrada.readLine());
        String[] ler;

        for (int i = 0; i < n; i++) {
            ler = entrada.readLine().split(" ");
            x = Integer.parseInt(ler[0]);
            y = Integer.parseInt(ler[1]);

            if (x > y) {
                aux = x;
                x = y;
                y = aux;
            }
            x++;
            while (x < y) {

                if (x % 2 != 0) {
                    soma = soma + x;
                }
                x++;
            }

            System.out.println(soma);
            soma = 0;

        }

    }

}
