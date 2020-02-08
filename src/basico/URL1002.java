/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1002 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double A, R, n = 3.14159;

        R = Double.parseDouble(entrada.readLine());

        A = n * (Math.pow(R, 2));

        System.out.printf("A=%.4f\n", A);

    }

}
