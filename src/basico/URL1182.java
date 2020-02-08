/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1182 {
    
       public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(entrada.readLine());
        String s = entrada.readLine();
        double soma = 0;

        double[][] matriz = new double[12][12];

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = Double.parseDouble(entrada.readLine());
            }

        }

        if ("S".equals(s)) {
            for (int i = 0; i < matriz[0].length; i++) {
                soma += matriz[i][n];
            }
        } else {

            for (int i = 0; i < matriz[0].length; i++) {
                soma += matriz[i][n];
            }
            soma = soma / matriz[0].length;

        }
        
        System.out.printf("%.1f\n", soma);
        
        System.exit(0);

    }

    
}
