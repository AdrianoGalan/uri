/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1019 {
    
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int valor;
        int[] notas = new int[3];

        valor = Integer.parseInt(entrada.readLine());
       

        while (valor >= 3600) {

            notas[0] = notas[0] + 1;
            valor = valor - 3600;
        }
        while (valor >= 60) {

            notas[1] = notas[1] + 1;
            valor = valor - 60;
        }
       notas[2] = valor;
        

         System.out.println(notas[0] + ":" + notas[1] + ":" + notas[2]);
    }
    
}
