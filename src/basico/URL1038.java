/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1038 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int a, b;

        String[] ler = entrada.readLine().split(" ");
        a = Integer.parseInt(ler[0]);
        b = Integer.parseInt(ler[1]);

        switch (a) {
            case 1:
                System.out.printf("Total: R$ %.2f\n", ((b * 4.0)));
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", ((b * 4.5)));
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", ((b * 5.0)));
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", ((b * 2.0)));
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", ((b * 1.5)));
                break;

        }
        
        System.exit(0);

    }

}
