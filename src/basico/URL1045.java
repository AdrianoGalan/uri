/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1045 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double a, b, c, aux;

        String[] ler = entrada.readLine().split(" ");

        a = Double.parseDouble(ler[0]);
        b = Double.parseDouble(ler[1]);
        c = Double.parseDouble(ler[2]);

        if (b > a) {
            aux = a;
            a = b;
            b = aux;
        }
        if (c > a) {
            aux = a;
            a = c;
            c = aux;
        }
        if (c > b) {
            aux = b;
            b = c;
            c = aux;
        }

        if (a < (b + c)) {

            if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        } else {
            System.out.println("NAO FORMA TRIANGULO");
        }
        
        System.exit(0);

    }

}
