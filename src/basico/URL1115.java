/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1115 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String[] ler = entrada.readLine().split(" ");
        int x = Integer.parseInt(ler[0]), y = Integer.parseInt(ler[1]);

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("primeiro");

            }
            if (x > 0 && y < 0) {
                System.out.println("quarto");

            }
            if (x < 0 && y > 0) {
                System.out.println("segundo");

            }
            if (x < 0 && y < 0) {
                System.out.println("terceiro");

            }

            ler = entrada.readLine().split(" ");
            x = Integer.parseInt(ler[0]);
            y = Integer.parseInt(ler[1]);

        }

    }

}
