/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1153 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(entrada.readLine());
        
        System.out.println(fatorial(n));

    }

    public static int fatorial(int numero) {
        int resultado = numero;
        if (numero == 0) {
            resultado++;
        }
        while (numero > 1) {
            resultado *= --numero;
        }
        return resultado;
    }

}
