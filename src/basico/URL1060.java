/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1060 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double valor;
        int numero = 0;

        for (int i = 0; i < 6; i++) {
            valor = Double.parseDouble(entrada.readLine());
            if(valor > 0){
                numero++;
            }

        }

        System.out.println(numero + " valores positivos");

        System.exit(0);

    }

}
