/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1221 {

    public static void main(String[] args) throws IOException {

//        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader entrada = new BufferedReader(new FileReader(new File("f:/1028.txt")) );

        String ler = entrada.readLine();

        int idFor = Integer.parseInt(ler);

        for (int k = 0; k < idFor; k++) {

            int num = Integer.parseInt(entrada.readLine());

            if (num == 2) {
                System.out.println("Prime");
            } else if (num % 2 == 0) {
                System.out.println("Not Prime");
            } else {

                for (int i = 3; i <= num;) {
                    if (num % i == 0) {
                        if (num == i) {
                            System.out.println("Prime");
                        } else {
                            System.out.println("Not Prime");
                            break;
                        }
                    }

                    i = i + 2;
                }

            }

        }

        System.exit(0);
    }

}
