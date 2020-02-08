/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1018 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int valor;
        int[] notas = new int[7];

        valor = Integer.parseInt(entrada.readLine());
        System.out.println(valor);

        while (valor >= 100) {

            notas[0] = notas[0] + 1;
            valor = valor - 100;
        }
        while (valor >= 50) {

            notas[1] = notas[1] + 1;
            valor = valor - 50;
        }
        while (valor >= 20) {

            notas[2] = notas[2] + 1;
            valor = valor - 20;
        }
        while (valor >= 10) {

            notas[3] = notas[3] + 1;
            valor = valor - 10;
        }
        while (valor >= 5) {

            notas[4] = notas[4] + 1;
            valor = valor - 5;
        }
        while (valor >= 2) {

            notas[5] = notas[5] + 1;
            valor = valor - 2;
        }
        while (valor >= 1) {

            notas[6] = notas[6] + 1;
            valor = valor - 1;
        }

        System.out.println(notas[0] + " nota(s) de R$ 100,00\n"
                + notas[1] + " nota(s) de R$ 50,00\n"
                + notas[2] + " nota(s) de R$ 20,00\n"
                + notas[3] + " nota(s) de R$ 10,00\n"
                + notas[4] + " nota(s) de R$ 5,00\n"
                + notas[5] + " nota(s) de R$ 2,00\n"
                + notas[6] + " nota(s) de R$ 1,00");

    }

}
