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

public class URL1273 {

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int opc, maior = 0, tamanho =0;

        String ler = entrada.readLine();
        opc = Integer.parseInt(ler);

        ArrayList<char[]> vetor = new ArrayList();

        while (opc != 0) {

            for (int i = 0; i < opc; i++) {

                ler = entrada.readLine();
                vetor.add(ler.toCharArray());
                
                if (vetor.get(i).length > maior){
                    maior = vetor.get(i).length;
                }
                
            }
            
            for (int i = 0; i < opc; i++) {
                
                tamanho = maior - vetor.get(i).length;
                
                for (int j = 0; j < tamanho; j++) {
                    char[] espacos = new char[tamanho];
                    String a = " ";
                   
                  //  espacos[j]= a;
                    
                }
                
                
            }
            
            

            ler = entrada.readLine();
            opc = Integer.parseInt(ler);

        }
    }

}
