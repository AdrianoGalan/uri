/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1046 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int hi, hf, h = 0;

        String[] ler = entrada.readLine().split(" ");

        hi = Integer.parseInt(ler[0]);
        hf = Integer.parseInt(ler[1]);

        if (hf != hi) {
            if (hf > hi) {
                h = hf - hi;
            } else {
                h = (24 - hi) + hf;
            }
        } else {
            h = 24;
        }

        System.out.println("O JOGO DUROU " + h + " HORA(S)");
        System.exit(0);
    }

}
