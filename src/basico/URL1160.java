/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1160 {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(entrada.readLine());
        int pa, pb, anos;
        double ga, gb;
        String[] ler;

        for (int i = 0; i < n; i++) {

            anos = 0;

            ler = entrada.readLine().split(" ");

            pa = Integer.parseInt(ler[0]);
            pb = Integer.parseInt(ler[1]);
            ga = Double.parseDouble(ler[2]);
            gb = Double.parseDouble(ler[3]);

            while (pa <= pb) {

                anos++;
                pa += ((pa * ga) / 100);
                pb += ((pb * gb) / 100);

                if (anos > 100) {
                    break;

                }

            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");

            } else {

                System.out.println(anos + " anos.");

            }
        }

    }

}
