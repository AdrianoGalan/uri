/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1041 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        float x, y;

        String[] ler = entrada.readLine().split(" ");
        x = Float.parseFloat(ler[0]);
        y = Float.parseFloat(ler[1]);

        if (x == 0 && y == 0) {
            System.out.println("Origem");
            System.exit(0);
        }

        if (x == 0) {
            System.out.println("Eixo Y");
            System.exit(0);
        }
        if (y == 0) {
            System.out.println("Eixo X");
            System.exit(0);
        }
        
        if (x > 0 && y > 0) {
            System.out.println("Q1");
            System.exit(0);
        }
        if (x > 0 && y < 0) {
            System.out.println("Q4");
            System.exit(0);
        }
        if (x < 0 && y > 0) {
            System.out.println("Q2");
            System.exit(0);
        }
        if (x < 0 && y < 0) {
            System.out.println("Q3");
            System.exit(0);
        }
        

    }

}
