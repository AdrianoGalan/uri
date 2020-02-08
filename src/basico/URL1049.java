/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1049 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String palavra1, palavra2, palavra3;

        palavra1 = entrada.readLine();
        palavra2 = entrada.readLine();
        palavra3 = entrada.readLine();

        if ("vertebrado".equals(palavra1)) {
            if ("ave".equals(palavra2)) {
                if ("carnivoro".equals(palavra3)) {
                    System.out.println("aguia");
                    System.exit(0);
                } else {
                    System.out.println("pomba");
                    System.exit(0);
                }

            } else if ("onivoro".equals(palavra3)) {
                System.out.println("homem");
                System.exit(0);
            } else {
                System.out.println("vaca");
                System.exit(0);
            }

        } else if ("inseto".equals(palavra2)) {
            if ("hematofago".equals(palavra3)) {
                System.out.println("pulga");
                System.exit(0);
            } else {
                System.out.println("lagarta");
                System.exit(0);
            }
        } else if ("hematofago".equals(palavra3)) {
            System.out.println("sanguessuga");
            System.exit(0);
        } else {
            System.out.println("minhoca");
            System.exit(0);
        }
    }
}
