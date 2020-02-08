/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1176 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        long x, n = Integer.parseInt(entrada.readLine());
        

        for (int i = 0; i < n; i++) {
            
            x = Integer.parseInt(entrada.readLine());
            
            System.out.println("Fib("+ x +") = " + fib(x));

        }

    }

    public static long fib(long n) {
        long a = 0;

        for (long b = 1, i = 0; i < n; b += a, a = b - a, i++) {
           
        }

        return a;

    }

}
