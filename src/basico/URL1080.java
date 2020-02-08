/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1080 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int id = 1, n, maior = Integer.parseInt(entrada.readLine());

        for (int i = 2; i <= 100; i++) {

            n = Integer.parseInt(entrada.readLine());
            
            if(n > maior){
                maior = n;
                id = i;
            }

        }
        
        System.out.println(maior);
        System.out.println(id);

    }

}
