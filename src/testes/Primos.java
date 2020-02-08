/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.ArrayList;

/**
 *
 * @author Adriano
 */
public class Primos {

    public static void main(String[] args) {
        int num;

        int cont = 1;
        num = 100000;

        ArrayList<Integer> primos = new ArrayList<>();
        primos.add(2);
        System.out.print("2 ");
        for (int j = 3; j <= num;) {
            for (int i = 0; i < primos.size(); i++) {
                if (j % primos.get(i) == 0) {


                    break;
                }
                if (i == (primos.size() - 1)) {
                    System.out.print(j + " ");
                    primos.add(j);
                    cont++;
                    break;
                }

            }
            j = j + 2;

        }

        System.out.println("\n" + cont);

       
        System.exit(0);
    }

}
