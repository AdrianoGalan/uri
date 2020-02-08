/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class URL1008 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int a;
        double b,c;

        a = Integer.parseInt(entrada.readLine());
        b = Double.parseDouble(entrada.readLine());
        c = Double.parseDouble(entrada.readLine());
    

        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f\n", (b*c));
        

    }
    
    
    
}
