/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1017 {
    
      public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double a , b;

        a = Double.parseDouble(entrada.readLine());
        b = Double.parseDouble(entrada.readLine());
    
         System.out.printf("%.3f\n",((a*b)/12 ));

    }
    
}
