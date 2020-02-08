/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;


public class URL1156 {
    
    public static void main(String[] args) {

        double soma = 1;

        for (int i = 2, j =3; j <= 39;j++) {

            soma = soma + (double)j / i;
            j++;
            i *= 2;
                   
        }

        System.out.printf("%.2f\n", soma);
    }
    
}
