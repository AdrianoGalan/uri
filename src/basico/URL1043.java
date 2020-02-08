/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1043 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double lado1, lado2, lado3;

        String[] ler = entrada.readLine().split(" ");

        lado1 = Double.parseDouble(ler[0]);
        lado2 = Double.parseDouble(ler[1]);
        lado3 = Double.parseDouble(ler[2]);
        
        if(verifica(lado1, lado2, lado3)){
            System.out.printf("Perimetro = %.1f\n",(lado1 + lado2 + lado3));
            System.exit(0);
        }else{
            System.out.printf("Area = %.1f\n",(((lado1 + lado2)*lado3)/2));
            System.exit(0);
        }

    }

    public static boolean verifica(double a, double b, double c) {

        double aux;

        if (b > a) {
            aux = a;
            a = b;
            b = aux;
        }
        if (c > a) {
            aux = a;
            a = c;
            c = aux;
        }

        return (b + c) > a;
    }

}
