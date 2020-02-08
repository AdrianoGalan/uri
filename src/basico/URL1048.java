/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URL1048 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double salario;

        salario = Double.parseDouble(entrada.readLine());

        if (salario <= 400) {
            calculaSalario(salario, 1.15);

        } else if (salario <= 800) {

            calculaSalario(salario, 1.12);

        } else if (salario <= 1200) {

            calculaSalario(salario, 1.10);

        } else if (salario <= 2000) {

            calculaSalario(salario, 1.07);

        } else {

            calculaSalario(salario, 1.04);
        }

        System.exit(0);

    }

    public static void calculaSalario(double salario, double reajuste) {
        double novo;

        novo = salario * reajuste;

        System.out.printf("Novo salario: %.2f\n", novo);
        System.out.printf("Reajuste ganho: %.2f\n", (novo - salario));
        System.out.println("Em percentual: " + Math.round(((reajuste - 1) * 100)) + " %");

    }

}
