/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1159 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int soma, n = Integer.parseInt(entrada.readLine());

        while (n != 0) {

            soma = 0;

            for (int i = 0; i < 5;) {

                if (n % 2 == 0) {

                    soma += n;
                    i++;
                }
                n++;
            }

            System.out.println(soma);

            n = Integer.parseInt(entrada.readLine());

        }

    }

}
