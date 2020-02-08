/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1074 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n, numero;

        String ler = entrada.readLine();

        n = Integer.parseInt(ler);

        for (int i = 0; i < n; i++) {

            ler = entrada.readLine();
            numero = Integer.parseInt(ler);

            if (numero == 0) {
                System.out.println("NULL");
            } else {
                if (numero % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }
                if (numero < 0) {
                    System.out.println("NEGATIVE");
                } else {
                    System.out.println("POSITIVE");
                }
            }
        }
    }
}
