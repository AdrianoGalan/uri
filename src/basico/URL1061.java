/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1061 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int di, df, hi, hf, mi, mf, si, sf, d, h, m, s;

        String[] ler = entrada.readLine().split(" ");

        di = Integer.parseInt(ler[1]);

        ler = entrada.readLine().split(" ");

        hi = Integer.parseInt(ler[0]);
        mi = Integer.parseInt(ler[2]);
        si = Integer.parseInt(ler[4]);

        ler = entrada.readLine().split(" ");

        df = Integer.parseInt(ler[1]);

        ler = entrada.readLine().split(" ");

        hf = Integer.parseInt(ler[0]);
        mf = Integer.parseInt(ler[2]);
        sf = Integer.parseInt(ler[4]);

        d = df - di;
        h = calcularHora(hi, hf);
        m = calcularMinuto(mi, mf);
        s = calcularSegundo(si, sf);

        if (hf < hi) {
            d = d - 1;

        }
        if (mf < mi) {
            h = h - 1;
        }
        if (sf < si) {
            m = m - 1;
        }

        System.out.println(d + " dia(s)");
        System.out.println(h + " hora(s)");
        System.out.println(m + " minuto(s)");
        System.out.println(s + " segundo(s)");

    }

    public static int calcularHora(int hi, int hf) {
        int h;
        if(hi == hf){
            return 0;
        }
        if (hf > hi) {
            h = hf - hi;
        } else {
            h = (24 - hi) + hf;
        }
        return h;
    }

    public static int calcularMinuto(int mi, int mf) {
        int m;
        if (mi == mf){
            return 0;
        }
        if (mf > mi) {
            m = mf - mi;
        } else {
            m = (60 - mi) + mf;
        }
        return m;
    }

    public static int calcularSegundo(int si, int sf) {
        int s;
        
        if( sf == si){
            return 0;
        }
        
        if (sf > si) {
            s = sf - si;
        } else {
            s = (60 - si) + sf;
        }
        return s;
    }
}
