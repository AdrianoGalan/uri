/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

public class URL1155 {

    public static void main(String[] args) {

        double soma = 0;

        for (int i = 1; i <= 100; i++) {

            soma = soma + 1.0 / i;

        }

        System.out.printf("%.2f\n", soma);
    }

}
