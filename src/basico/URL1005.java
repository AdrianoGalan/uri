/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1005 {
    
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double x, y;

        x = Double.parseDouble(entrada.readLine());
        y = Double.parseDouble(entrada.readLine());

       

        System.out.printf("MEDIA = %.5f\n", (x*3.5+y*7.5)/(3.5+7.5) );

    }
    
}
