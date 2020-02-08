/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1144 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int  n1 = 1, n2 = 1, n3 = 1, n = Integer.parseInt(entrada.readLine());

        for (int i = 0; i < n; i++) {
                    
            System.out.println(n1 + " " + n2 + " " + n3);
            n2++;
            n3++;
            System.out.println(n1 + " " + n2 + " " + n3);
            n1++;
            n2 = n1 * n1;
            n3 = n2 * n1;
                                  
        }

    }
}
