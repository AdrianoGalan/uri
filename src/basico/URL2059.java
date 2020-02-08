/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL2059 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int p, j1, j2, r, a;


        String[] ler = entrada.readLine().split(" ");

        p = Integer.parseInt(ler[0]);
        j1 = Integer.parseInt(ler[1]);
        j2 = Integer.parseInt(ler[2]);
        r = Integer.parseInt(ler[3]);
        a = Integer.parseInt(ler[4]);

        if (a == 1) {
            if (r == 1) {
                System.out.println("Jogador 2 ganha!");
            } else {
                System.out.println("Jogador 1 ganha!");
            }
        } else if (r == 1) {
            System.out.println("Jogador 1 ganha!");

        } else if (p == 1) {
            if ((j1 + j2) % 2 == 0) {
                System.out.println("Jogador 1 ganha!");
            } else {
                System.out.println("Jogador 2 ganha!");
            }

        } else if ((j1 + j2) % 2 == 0) {
            System.out.println("Jogador 2 ganha!");
        } else {
            System.out.println("Jogador 1 ganha!");
        }
        System.exit(0);

    }

}
