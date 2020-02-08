/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1047 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int hi, hf, mi, mf, h = 0, m = 0;

        String[] ler = entrada.readLine().split(" ");

        hi = Integer.parseInt(ler[0]);
        mi = Integer.parseInt(ler[1]);
        hf = Integer.parseInt(ler[2]);
        mf = Integer.parseInt(ler[3]);

        if (hf != hi) {
            if (hf > hi) {
                h = hf - hi;
                if (mf > mi) {
                    m = mf - mi;
                } else {
                    h = h - 1;
                    m = (60 - mi) + mf;
                }
            } else {
                h = (24 - hi) + hf;
                if (mf > mi) {
                    m = mf - mi;
                } else {
                    h = h - 1;
                    m = (60 - mi) + mf;
                }
            }

        } else {

            if (mf == mi) {
                h = 24;
                m = 0;
            } else {
                if (mf > mi) {
                    h = 0;
                    m = mf - mi;
                } else {
                    h = 23;
                    m = (60 - mi) + mf;
                }

            }
        }

        System.out.println("O JOGO DUROU " + h + " HORA(S) E " + m + " MINUTO(S)");
        System.exit(0);
    }

}
