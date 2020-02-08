/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1145 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String[] ler = entrada.readLine().split(" ");
        int k = 1, x = Integer.parseInt(ler[0]), y = Integer.parseInt(ler[1]);

        for (int i = 1; i <= y; i++, k++) {

            System.out.print(i);

            if (k == x) {
                System.out.println("");
                k = 0;
            } else {
                System.out.print(" ");
            }

        }
    }
}
