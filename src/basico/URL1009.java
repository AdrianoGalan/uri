/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Adriano
 */
public class URL1009 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String a;
        double b, c;

        a = entrada.readLine();
        b = Double.parseDouble(entrada.readLine());
        c = Double.parseDouble(entrada.readLine());

        System.out.printf("TOTAL = R$ %.2f\n", (b + (c * 0.15)));
    }
}
