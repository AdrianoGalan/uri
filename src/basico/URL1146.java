/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1146 {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int op = -1, i = 1;
        op = Integer.parseInt(entrada.readLine());

        while (op != 0) {

            for (; i < op; i++) {

                System.out.print(i + " ");
            }
            System.out.println(i);
            i = 1;

            op = Integer.parseInt(entrada.readLine());
        }

    }

}
