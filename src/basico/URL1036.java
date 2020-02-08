/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1036 {

    public static void main(String[] args) throws IOException {

        double a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String linha = br.readLine();
        String[] quebraLinha = new String[3];

        quebraLinha = linha.split(" ");

        a = Double.parseDouble(quebraLinha[0]);
        b = Double.parseDouble(quebraLinha[1]);
        c = Double.parseDouble(quebraLinha[2]);

        double delta;

        delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0 || a == 0) {
            System.out.println("Impossivel calcular");
        } else if (delta == 0) {

            System.out.print("R1 = ");
            System.out.printf("%.5f\n", (-b / (2 * a)));

        } else {
            System.out.print("R1 = ");
            System.out.printf("%.5f\n", (-b + Math.sqrt(delta)) / (2 * a));
            System.out.print("R2 = ");
            System.out.printf("%.5f\n", (-b - Math.sqrt(delta)) / (2 * a));
        }

        System.exit(0);
    }
}
