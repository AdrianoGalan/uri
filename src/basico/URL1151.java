/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1151 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(entrada.readLine());

        for (int a = 0, b = 1, i = 0; i < n; b += a, a = b - a, i++) {
            if (i < n - 1) {
                System.out.print(a + " ");
            } else {
                System.out.println(a);
            }
        }

    }

}
