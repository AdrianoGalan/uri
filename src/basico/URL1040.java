/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1040 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        float a, b, c, d, e, media, mediaFinal;

        String[] ler = entrada.readLine().split(" ");
        a = Float.parseFloat(ler[0]);
        b = Float.parseFloat(ler[1]);
        c = Float.parseFloat(ler[2]);
        d = Float.parseFloat(ler[3]);

        media = (a * 2 + b * 3 + c * 4 + d * 1) / (2 + 3 + 4 + 1);

        System.out.printf("Media: %.1f\n", media);

        if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media <= 6.9) {

            System.out.println("Aluno em exame.");

            e = Float.parseFloat(entrada.readLine());

            System.out.printf("Nota do exame: %.1f\n", e);

            mediaFinal = (media + e) / 2;

            if (mediaFinal >= 5) {

                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            } else {

                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);

            }

        } else {
            System.out.println("Aluno aprovado.");
        }

        System.exit(0);

    }

}
