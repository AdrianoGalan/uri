/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1079 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(entrada.readLine());
        double n1, n2, n3, media;
        String[] ler;

        for (int i = 0; i < n; i++) {

            ler = entrada.readLine().split(" ");
            n1 = Double.parseDouble(ler[0]);
            n2 = Double.parseDouble(ler[01]);
            n3 = Double.parseDouble(ler[2]);

            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);

            System.out.printf("%.1f\n", media);

        }

    }
}
