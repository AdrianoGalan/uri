/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1037 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double n = Double.parseDouble(entrada.readLine());

        if (n >= 0 && n <= 100) {
            if (n <= 25) {
                System.out.println("Intervalo [0,25]");
            } else {
                if (n <= 50) {
                    System.out.println("Intervalo (25,50]");
                } else {
                    if (n <= 75) {
                        System.out.println("Intervalo (50,75]");
                    }else{
                        System.out.println("Intervalo (75,100]");
                    }
                }
            }

        } else {
            System.out.println("Fora de intervalo");
        }

        

    }

}
