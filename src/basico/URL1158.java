/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1158 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int x, y, soma, n = Integer.parseInt(entrada.readLine());
        String[] ler;

        for (int j = 0; j < n; j++) {

            soma = 0;

            ler = entrada.readLine().split(" ");
            x = Integer.parseInt(ler[0]);
            y = Integer.parseInt(ler[1]);

            for (int i = 0; i < y;) {

                if (x % 2 != 0) {

                    soma = soma + x;
                     i++;
                }

                x++;
            }

            System.out.println(soma);

        }
    }

}
