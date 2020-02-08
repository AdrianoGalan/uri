/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1759 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(entrada.readLine());

        StringBuilder sb = new StringBuilder();

        String saida;
        
         if (n > 0 && n <= 1000000) {
        
        for (int i = 0; i < n; i++) {

            sb.append("Ho ");

        }

       
            saida = String.valueOf(sb);

            saida = saida.trim();
            saida += "!";
            System.out.println(saida);
        }
    }

}
