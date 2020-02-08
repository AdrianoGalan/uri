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
public class URL1006 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double x, y, z;

        x = Double.parseDouble(entrada.readLine());
        y = Double.parseDouble(entrada.readLine());
        z = Double.parseDouble(entrada.readLine());

        System.out.printf("MEDIA = %.1f\n", (x * 2 + y * 3 + z * 5) / (2 + 3 + 5));

    }

}
