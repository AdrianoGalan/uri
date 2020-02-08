/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1113 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String[] ler = entrada.readLine().split(" ");
        int n1 = Integer.parseInt(ler[0]), n2 = Integer.parseInt(ler[1]);

        while (n1 != n2) {

            if (n1 < n2) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }

            ler = entrada.readLine().split(" ");

            n1 = Integer.parseInt(ler[0]);
            n2 = Integer.parseInt(ler[1]);

        }

    }

}
