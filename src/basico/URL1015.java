/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1015 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double[] numero = new double[4];

        for (int i = 0; i < 3; i++) {

            String[] ler = entrada.readLine().split(" ");
            numero[i] = Double.parseDouble(ler[0]);
            numero[i + 1] = Double.parseDouble(ler[1]);
            i++;

        }

        System.out.printf("%.4f\n", (Math.sqrt(Math.pow((numero[2] - numero[0]), 2) + Math.pow((numero[3] - numero[1]), 2))));

    }

}
