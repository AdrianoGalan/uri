/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1028 {

    public static void main(String[] args) throws IOException {

//        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader entrada = new BufferedReader(new FileReader(new File("f:/1028.txt")));

        String[] ler = entrada.readLine().split(" ");

        int idFor = Integer.parseInt(ler[0]);

        for (int k = 0; k < idFor; k++) {
            ler = entrada.readLine().split(" ");
            int n1 = Integer.parseInt(ler[0]);
            int n2 = Integer.parseInt(ler[1]);

            System.out.println(mdcIterative(n1, n2));

        }

        System.exit(0);
    }

    //Algoritmo de Euclides recursivo
    public static int mdcRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdcRecursive(b, a % b);
    }

    //Algoritmo de Euclides iterativo
    public static int mdcIterative(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
