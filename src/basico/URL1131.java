/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1131 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String[] ler;

        int golGremio, golInter, inter = 0, gremio = 0, total = 0, empate = 0, op;

        do {

            op = -1;

            ler = entrada.readLine().split(" ");
            golInter = Integer.parseInt(ler[0]);
            golGremio = Integer.parseInt(ler[1]);

            total++;

            if (golInter == golGremio) {

                empate++;
            } else if (golInter > golGremio) {

                inter++;

            } else {

                gremio++;

            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            op = Integer.parseInt(entrada.readLine());

        } while (op != 2);

        System.out.println(total + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empate);

        if (gremio == inter) {
            System.out.println("Nao houve vencedor");
        } else if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }

    }

}
