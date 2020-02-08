/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1011 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double R;

        R = Double.parseDouble(entrada.readLine());

        System.out.printf("VOLUME = %.3f\n", ((4.0 / 3.0) * 3.14159 * Math.pow(R, 3)));

    }

}
