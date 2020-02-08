/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1117 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double n;
        double[] notas = new double[2];

        for (int i = 0; i < 2; i++) {
            n = Double.parseDouble(entrada.readLine());
            while (n < 0 || n > 10) {
                System.out.println("nota invalida");
                n = Double.parseDouble(entrada.readLine());
            }
            notas[i] = n;

        }

        System.out.printf("media = %.2f\n", (notas[0] + notas[1]) / 2);
    }

}
