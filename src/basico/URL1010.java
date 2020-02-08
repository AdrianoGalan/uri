/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1010 {

    public static void main(String[] args) throws IOException {

        int a, b;
        double c, soma = 0;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 2; i++) {

            String[] ler = entrada.readLine().split(" ");
            a = Integer.parseInt(ler[0]);
            b = Integer.parseInt(ler[1]);
            c = Double.parseDouble(ler[2]);
            
            soma = soma + (b * c);
            
        }
            System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

    }

}
