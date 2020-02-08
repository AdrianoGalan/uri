/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class URL1179 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        int n;

        for (int i = 0; i < 15; i++) {

            n = Integer.parseInt(entrada.readLine());

            if (n % 2 == 0) {

                par.add(n);
                if (par.size() == 5) {

                    imprimeVetor(par);
                    par.clear();
                }
            } else {
                impar.add(n);
                if (impar.size() == 5) {

                    imprimeVetor(impar);
                    impar.clear();
                }
            }

        }
        
        if(impar.size() > 0){
            imprimeVetor(impar);
        }
        if(par.size() > 0){
            imprimeVetor(par);
        }

    }

    public static void imprimeVetor(ArrayList<Integer> vetor) {

        if (vetor.get(0) % 2 == 0) {

            for (int i = 0; i < vetor.size(); i++) {

                System.out.println("par[" + i + "] = " + vetor.get(i));

            }

        } else {

            for (int i = 0; i < vetor.size(); i++) {

                System.out.println("impar[" + i + "] = " + vetor.get(i));

            }

        }

    }
}
