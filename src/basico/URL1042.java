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
import java.util.Collections;


public class URL1042 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> leu = new ArrayList();

        String[] ler = entrada.readLine().split(" ");
        leu.add(Integer.parseInt(ler[0]));
        leu.add(Integer.parseInt(ler[1]));
        leu.add(Integer.parseInt(ler[2]));

        Collections.sort(leu);

        for (int i = 0; i < leu.size(); i++) {
            System.out.println(leu.get(i));

        }

        System.out.println("");

        for (String ler1 : ler) {
            System.out.println(ler1);
        }

        System.exit(0);

    }

}
