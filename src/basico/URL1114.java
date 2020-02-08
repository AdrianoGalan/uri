/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1114 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int senha = Integer.parseInt(entrada.readLine());

        while (senha != 2002) {

            System.out.println("Senha Invalida");

            senha = Integer.parseInt(entrada.readLine());
        }

        System.out.println("Acesso Permitido");
    }

}
