/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1164 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int i = 1, soma, x, n = Integer.parseInt(entrada.readLine());

        for (int j = 0; j < n; j++) {

            x = Integer.parseInt(entrada.readLine());

            soma = 0;
            i = 1;

            while (i < x) {

                if (x % i == 0) {
                    soma += i;
                    if (soma > x) {
                        break;
                    }
                }
                i++;

            }

            if (soma == x) {

                System.out.println(x + " eh perfeito");

            } else {
                System.out.println(x+ " nao eh perfeito");
            }

        }

    }

}
