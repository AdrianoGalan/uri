/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int i = 1, n = Integer.parseInt(entrada.readLine());

        while (i <= n) {

            if (n % i == 0) {
                System.out.println(i);
            }
            i++;

        }

    }

}
