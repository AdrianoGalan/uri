/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1180 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int menor, id = 0, n = Integer.parseInt(entrada.readLine());

        String[] ler = entrada.readLine().split(" ");

        menor = Integer.parseInt(ler[0]);

        for (int i = 1; i < n; i++) {

            if (Integer.parseInt(ler[i]) < menor) {
                menor = Integer.parseInt(ler[i]);
                id = i;
            }

        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + id);

    }

}
