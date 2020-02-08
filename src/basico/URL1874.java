/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1874 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String[] ler = entrada.readLine().split(" ");

        int a = Integer.parseInt(ler[0]);
        int b = Integer.parseInt(ler[1]);
        int c = Integer.parseInt(ler[2]);
        int ab = a - b;
        int bc = b - c;
        int ba = b - a;
        int cb = c - b;

        if (a < b && b >= c) {
            System.out.println(":(");
        } else if (a < b && b < c && ba > cb) {
            System.out.println(":(");
        } else if (a < b && b < c && ba <= cb) {
            System.out.println(":)");//b<=c??
        } else if (a > b && b <= c) {
            System.out.println(":)");
        } else if (a > b && b > c && ab > bc) {
            System.out.println(":)");
        } else if (a > b && b > c && ab <= bc) {
            System.out.println(":(");//b>=c??
        } else if (a == b && b < c) {
            System.out.println(":)");
        } else if (a == b && b > c) {
            System.out.println(":(");
        } else {
            System.out.println(":(");
        }

    }

}
