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

public class URL1174 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Double> vetor = new ArrayList();

        for (int i = 0; i < 100; i++) {
            vetor.add(Double.parseDouble(entrada.readLine()));
        }

        for (int i = 0; i < vetor.size(); i++) {

            if (vetor.get(i) <= 10) {
                System.out.println("A[" + i + "] = " + vetor.get(i));
            }
        }
    }

}
