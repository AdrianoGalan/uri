/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1051 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double salario, diferanca, imposto = 0;;

        salario = Double.parseDouble(entrada.readLine());

        if (salario > 2000) {
          
            if (salario > 4500) {
                diferanca = salario - 4500;
                salario = 4500;
                imposto = imposto + (diferanca * 0.28);
            }
            if (salario > 3000) {
                diferanca = salario - 3000;
                salario = 3000;
                imposto = imposto + (diferanca * 0.18);
            }
            if (salario > 2000) {
                diferanca = salario - 2000;
                salario = 2000;
                imposto = imposto + (diferanca * 0.08);
            }
            System.out.printf("R$ %.2f\n", imposto);

        } else {
            System.out.println("Isento");
        }

        System.exit(0);

    }

}
