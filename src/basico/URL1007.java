/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1007 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int a, b, c, d;

        a = Integer.parseInt(entrada.readLine());
        b = Integer.parseInt(entrada.readLine());
        c = Integer.parseInt(entrada.readLine());
        d = Integer.parseInt(entrada.readLine());

        System.out.println("DIFERENCA = " + ((a * b) - (c * d)));

    }

}
