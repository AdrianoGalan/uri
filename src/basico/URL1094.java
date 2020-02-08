/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1094 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int nc, total = 0, sapo = 0, rato = 0, coelho = 0, n = Integer.parseInt(entrada.readLine());
        String[] ler;

        for (int i = 0; i < n; i++) {

            ler = entrada.readLine().split(" ");
            nc = Integer.parseInt(ler[0]);

            total = total + nc;

            if ("C".equals(ler[1])) {
                coelho = coelho + nc;
            }
            if ("R".equals(ler[1])) {
                rato = rato + nc;
            }
            if ("S".equals(ler[1])) {
                sapo = sapo + nc;
            }

        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f", (double) (((double) coelho * 100) / (double) total));
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", (double) (((double) rato * 100) / (double) total));
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", (double) (((double) sapo * 100) / (double) total));
        System.out.println(" %");
    }

}
