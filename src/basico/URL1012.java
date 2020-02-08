/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1012 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double a, b, c, d;

        String[] ler = entrada.readLine().split(" ");
            a = Double.parseDouble(ler[0]);
            b = Double.parseDouble(ler[1]);
            c = Double.parseDouble(ler[2]);

        System.out.printf("TRIANGULO: %.3f\n", ((a * c) / 2));
        System.out.printf("CIRCULO: %.3f\n", (3.14159 * Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f\n", (((a + b) * c) / 2));
        System.out.printf("QUADRADO: %.3f\n", ((b * b)));
        System.out.printf("RETANGULO: %.3f\n", ((a * b)));

    }

}
