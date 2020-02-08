/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1020 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int valor;
        int[] notas = new int[3];

        valor = Integer.parseInt(entrada.readLine());

        while (valor >= 365) {

            notas[0] = notas[0] + 1;
            valor = valor - 365;
        }

        while (valor >= 30 ) {

            notas[1] = notas[1] + 1;
            valor = valor - 30;
        }

        notas[2] = valor;

        System.out.println(notas[0] + " ano(s)\n"
                + notas[1] + " mes(es)\n"
                + notas[2] + " dia(s)");
    }

}
