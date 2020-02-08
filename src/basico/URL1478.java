/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1478 {

    public static void main(String[] args) throws IOException {

//        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader entrada = new BufferedReader(new FileReader("d:/URL1187.txt"));

        int n = Integer.parseInt(entrada.readLine());

        while (n != 0) {

            int[][] matriz = new int[n][n];

            int k = 1;
            for (int i = 0; i < n; i++) {

                for (int j = i; j < n; j++) {

                    if (j == i) {
                        k = 1;
                    }
                    matriz[i][j] = k;
                    matriz[j][i] = k;
                    k++;

                }

            }
            imprime(matriz, n);

            n = Integer.parseInt(entrada.readLine());

        }

    }

    public static void imprime(int[][] ara, int N) {

        for (int g = 0; g < N; g++) {
            for (int h = 0; h < N; h++) {
                if (h == 0) {
                    System.out.printf("%3d", ara[g][h]);
                } else {
                    System.out.printf(" %3d", ara[g][h]);
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

}
